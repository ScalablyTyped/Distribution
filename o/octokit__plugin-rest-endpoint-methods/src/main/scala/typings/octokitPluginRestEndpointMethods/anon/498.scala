package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.body
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.method
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.request
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.url
import typings.octokitTypes.anon.Method
import typings.octokitTypes.anon.UrlString
import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import typings.std.Omit
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `498` extends js.Object {
  @JSName("defaults")
  var defaults_Original: js.Function1[
    /* newDefaults */ RequestParameters, 
    RequestInterface[js.Object with RequestParameters]
  ] = js.native
  @JSName("endpoint")
  var endpoint_Original: EndpointInterface[Url] = js.native
  def apply(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/teams/:team_slug/teams']['response'] */ js.Any
  ] = js.native
  def apply(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/teams/:team_slug/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/teams/:team_slug/teams']['response'] */ js.Any
  ] = js.native
  def defaults[O /* <: RequestParameters */](newDefaults: O): RequestInterface[js.Object with O] = js.native
  def endpoint[R /* <: Route */, P /* <: RequestParameters */](route: R): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  def endpoint[R /* <: Route */, P /* <: RequestParameters */](route: R, parameters: P): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def endpoint[R /* <: Route */, P /* <: RequestParameters */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 631 */ js.Any): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  def endpoint[R /* <: Route */, P /* <: RequestParameters */](
    route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 631 */ js.Any,
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
  @JSName("endpoint")
  def endpoint_url[O /* <: RequestParameters */](options: O with Method with (UrlString | typings.octokitTypes.anon.Url)): RequestOptions with (Pick[
    Url with O, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
}

