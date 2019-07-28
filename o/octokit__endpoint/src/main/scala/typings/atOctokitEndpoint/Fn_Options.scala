package typings.atOctokitEndpoint

import typings.atOctokitEndpoint.distDashTypesTypesMod.Defaults
import typings.atOctokitEndpoint.distDashTypesTypesMod.Parameters
import typings.atOctokitEndpoint.distDashTypesTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  /**
    * Returns current default options.
    *
    * @deprecated use endpoint.DEFAULTS instead
    */
  def apply(): Defaults = js.native
  /**
    * Merges current endpoint defaults with passed route and parameters,
    * without transforming them into request options.
    *
    * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def apply(options: Parameters): Defaults = js.native
  /**
    * Merges current endpoint defaults with passed route and parameters,
    * without transforming them into request options.
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    *
    */
  def apply(route: Route): Defaults = js.native
  def apply(route: Route, parameters: Parameters): Defaults = js.native
}

