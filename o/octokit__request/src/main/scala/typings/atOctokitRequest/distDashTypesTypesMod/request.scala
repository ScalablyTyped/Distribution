package typings.atOctokitRequest.distDashTypesTypesMod

import typings.atOctokitEndpoint.distDashTypesTypesMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait request extends js.Object {
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  @JSName("endpoint")
  var endpoint_Original: typings.atOctokitEndpoint.distDashTypesTypesMod.endpoint = js.native
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
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  def endpoint(options: typings.atOctokitEndpoint.distDashTypesTypesMod.Endpoint): RequestOptions = js.native
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  def endpoint[R /* <: typings.atOctokitEndpoint.distDashTypesTypesMod.Route */](route: R): RequestOptions | (/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][1] */ js.Any) = js.native
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  def endpoint[R /* <: typings.atOctokitEndpoint.distDashTypesTypesMod.Route */](
    route: R,
    options: typings.atOctokitEndpoint.distDashTypesTypesMod.Parameters | ((/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][0] */ js.Any) with typings.atOctokitEndpoint.distDashTypesTypesMod.Parameters)
  ): RequestOptions | (/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][1] */ js.Any) = js.native
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  def endpoint[R /* <: typings.atOctokitEndpoint.distDashTypesTypesMod.Route */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 521 */ js.Any): RequestOptions | (/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][1] */ js.Any) = js.native
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  def endpoint[R /* <: typings.atOctokitEndpoint.distDashTypesTypesMod.Route */](
    route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 521 */ js.Any,
    options: typings.atOctokitEndpoint.distDashTypesTypesMod.Parameters | ((/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][0] */ js.Any) with typings.atOctokitEndpoint.distDashTypesTypesMod.Parameters)
  ): RequestOptions | (/* import warning: ImportType.apply Failed type conversion: @octokit/endpoint.@octokit/endpoint/dist-types/generated/routes.Routes[R][1] */ js.Any) = js.native
}

