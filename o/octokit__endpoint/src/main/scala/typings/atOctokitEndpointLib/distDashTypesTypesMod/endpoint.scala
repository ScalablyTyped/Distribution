package typings
package atOctokitEndpointLib.distDashTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait endpoint extends js.Object {
  /**
    * Object with current default route and parameters
    */
  var DEFAULTS: Defaults = js.native
  @JSName("merge")
  var merge_Original: atOctokitEndpointLib.Fn_Options = js.native
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def apply(options: Endpoint): RequestOptions = js.native
  def apply[R /* <: Route */](route: R): RequestOptions | (/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][1] */ js.Any) = js.native
  def apply[R /* <: Route */](
    route: R,
    options: Parameters | ((/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][0] */ js.Any) with Parameters)
  ): RequestOptions | (/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][1] */ js.Any) = js.native
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def apply[R /* <: Route */](route: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 516 */ js.Any): RequestOptions | (/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][1] */ js.Any) = js.native
  def apply[R /* <: Route */](
    route: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 516 */ js.Any,
    options: Parameters | ((/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][0] */ js.Any) with Parameters)
  ): RequestOptions | (/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][1] */ js.Any) = js.native
  /**
    * Returns a new `endpoint` with updated route and parameters
    */
  def defaults(newDefaults: Parameters): endpoint = js.native
  /**
    * Returns current default options.
    *
    * @deprecated use endpoint.DEFAULTS instead
    */
  def merge(): Defaults = js.native
  /**
    * Merges current endpoint defaults with passed route and parameters,
    * without transforming them into request options.
    *
    * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def merge(options: Parameters): Defaults = js.native
  /**
    * Merges current endpoint defaults with passed route and parameters,
    * without transforming them into request options.
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    *
    */
  def merge(route: Route): Defaults = js.native
  def merge(route: Route, parameters: Parameters): Defaults = js.native
  /**
    * Stateless method to turn endpoint options into request options.
    * Calling `endpoint(options)` is the same as calling `endpoint.parse(endpoint.merge(options))`.
    *
    * @param {object} options `method`, `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def parse(options: Defaults): RequestOptions = js.native
}

