package typings.octokitGraphql.typesMod

import typings.octokitGraphql.octokitGraphqlStrings.body
import typings.octokitGraphql.octokitGraphqlStrings.headers
import typings.octokitGraphql.octokitGraphqlStrings.method
import typings.octokitGraphql.octokitGraphqlStrings.request
import typings.octokitGraphql.octokitGraphqlStrings.url
import typings.octokitTypes.anon.Method
import typings.octokitTypes.anon.Url
import typings.octokitTypes.anon.UrlString
import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.routeMod.Route
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait graphql extends js.Object {
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  @JSName("endpoint")
  var endpoint_Original: EndpointInterface[js.Object] = js.native
  /**
    * Sends a GraphQL query request based on endpoint options
    * The GraphQL query must be specified in `options`.
    *
    * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def apply[ResponseData](options: RequestParameters): GraphQlResponse[ResponseData] = js.native
  /**
    * Sends a GraphQL query request based on endpoint options
    *
    * @param {string} query GraphQL query. Example: `'query { viewer { login } }'`.
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def apply[ResponseData](query: Query): GraphQlResponse[ResponseData] = js.native
  def apply[ResponseData](query: Query, parameters: RequestParameters): GraphQlResponse[ResponseData] = js.native
  /**
    * Returns a new `endpoint` with updated route and parameters
    */
  def defaults(newDefaults: RequestParameters): graphql = js.native
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  def endpoint[R /* <: Route */, P /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](route: R): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  def endpoint[R /* <: Route */, P /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](route: R, parameters: P): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  def endpoint[R /* <: Route */, P /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 611 */ js.Any): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  def endpoint[R /* <: Route */, P /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](
    route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 611 */ js.Any,
    parameters: P
  ): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {object} endpoint Must set `url` unless it's set defaults. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  @JSName("endpoint")
  def endpoint_url[O /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](options: O with Method with (UrlString | Url)): RequestOptions with (Pick[
    js.Object with O, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
}

