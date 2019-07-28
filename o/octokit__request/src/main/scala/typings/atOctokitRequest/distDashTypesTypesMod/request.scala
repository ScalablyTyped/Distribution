package typings.atOctokitRequest.distDashTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait request extends js.Object {
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  var endpoint: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@octokit/endpoint/dist-types/types.endpoint */ js.Any = js.native
  /**
    * Sends a request based on endpoint options
    *
    * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def apply[T](options: Endpoint): js.Promise[OctokitResponse[T]] = js.native
  /**
    * Sends a request based on endpoint options
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def apply[T](route: Route): js.Promise[OctokitResponse[T]] = js.native
  def apply[T](route: Route, parameters: Parameters): js.Promise[OctokitResponse[T]] = js.native
  /**
    * Returns a new `endpoint` with updated route and parameters
    */
  def defaults(newDefaults: Parameters): request = js.native
}

