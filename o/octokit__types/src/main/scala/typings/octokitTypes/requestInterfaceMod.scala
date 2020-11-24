package typings.octokitTypes

import typings.octokitTypes.anon.Method
import typings.octokitTypes.anon.Url
import typings.octokitTypes.anon.UrlString
import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.octokitTypesStrings.body
import typings.octokitTypes.octokitTypesStrings.headers
import typings.octokitTypes.octokitTypesStrings.method
import typings.octokitTypes.octokitTypesStrings.request
import typings.octokitTypes.octokitTypesStrings.url
import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/types/dist-types/RequestInterface", JSImport.Namespace)
@js.native
object requestInterfaceMod extends js.Object {
  
  @js.native
  trait RequestInterface[D /* <: js.Object */] extends js.Object {
    
    def apply[R /* <: Route */](route: R): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[_]
      ] = js.native
    def apply[R /* <: Route */](
      route: R,
      options: RequestParameters | ((/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['parameters'] */ js.Any) with RequestParameters)
    ): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[_]
      ] = js.native
    /**
      * Sends a request based on endpoint options
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[R /* <: Route */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[_]
      ] = js.native
    def apply[R /* <: Route */](
      route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any,
      options: RequestParameters | ((/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['parameters'] */ js.Any) with RequestParameters)
    ): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[_]
      ] = js.native
    
    /**
      * Returns a new `request` with updated route and parameters
      */
    def defaults[O /* <: RequestParameters */](newDefaults: O): RequestInterface[D with O] = js.native
    
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
    /**
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    def endpoint[R /* <: Route */, P /* <: RequestParameters */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    def endpoint[R /* <: Route */, P /* <: RequestParameters */](
      route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any,
      parameters: P
    ): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    /**
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    @JSName("endpoint")
    var endpoint_Original: EndpointInterface[D] = js.native
    /**
      * Transforms a GitHub REST API endpoint into generic request options
      *
      * @param {object} endpoint Must set `url` unless it's set defaults. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    /**
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    @JSName("endpoint")
    def endpoint_url[O /* <: RequestParameters */](options: O with Method with (UrlString | Url)): RequestOptions with (Pick[
        D with O, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
  }
}
