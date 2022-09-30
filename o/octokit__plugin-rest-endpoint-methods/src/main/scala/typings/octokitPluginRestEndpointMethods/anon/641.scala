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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `641` extends StObject {
  
  def apply(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/invitations']['response'] */ js.Any
  ] = js.native
  def apply(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/invitations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/invitations']['response'] */ js.Any
  ] = js.native
  
  def defaults[O /* <: RequestParameters */](newDefaults: O): RequestInterface[js.Object & O] = js.native
  @JSName("defaults")
  var defaults_Original: js.Function1[
    /* newDefaults */ RequestParameters, 
    RequestInterface[js.Object & RequestParameters]
  ] = js.native
  
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def endpoint[R /* <: Route */, P /* <: RequestParameters */](
    route: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 693 */ Any) | R
  ): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) & (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  def endpoint[R /* <: Route */, P /* <: RequestParameters */](
    route: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 693 */ Any) | R,
    parameters: P
  ): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) & (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  @JSName("endpoint")
  var endpoint_Original: EndpointInterface[Url] = js.native
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {object} endpoint Must set `url` unless it's set defaults. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  @JSName("endpoint")
  def endpoint_url[O /* <: RequestParameters */](options: O & Method & (UrlString | typings.octokitTypes.anon.Url)): RequestOptions & (Pick[
    Url & O, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
}
