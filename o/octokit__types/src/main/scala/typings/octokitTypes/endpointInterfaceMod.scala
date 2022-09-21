package typings.octokitTypes

import typings.octokitTypes.anon.Method
import typings.octokitTypes.anon.Url
import typings.octokitTypes.anon.UrlString
import typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typings.octokitTypes.octokitTypesStrings.body
import typings.octokitTypes.octokitTypesStrings.headers
import typings.octokitTypes.octokitTypesStrings.method
import typings.octokitTypes.octokitTypesStrings.request
import typings.octokitTypes.octokitTypesStrings.url
import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointInterfaceMod {
  
  @js.native
  trait EndpointInterface[D /* <: js.Object */] extends StObject {
    
    /**
      * Transforms a GitHub REST API endpoint into generic request options
      *
      * @param {object} endpoint Must set `url` unless it's set defaults. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[O /* <: RequestParameters */](options: O & Method & (UrlString | Url)): RequestOptions & (Pick[
        D & O, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    def apply[R /* <: Route */, P /* <: RequestParameters */](
      route: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 890 */ Any) | R,
      parameters: P
    ): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) & (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    
    /**
      * Object with current default route and parameters
      */
    var DEFAULTS: D & EndpointDefaults = js.native
    
    /**
      * Returns a new `endpoint` interface with new defaults
      */
    def defaults[O /* <: RequestParameters */](newDefaults: O): EndpointInterface[D & O] = js.native
    
    def merge(): D & EndpointDefaults = js.native
    def merge[P /* <: RequestParameters */](options: P): EndpointDefaults & D & P = js.native
    def merge[R /* <: Route */, P /* <: RequestParameters */](
      route: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 890 */ Any) | R,
      parameters: P
    ): D & (EndpointDefaults | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) & P = js.native
    @JSName("merge")
    def merge_R_RouteP_RequestParameters[R /* <: Route */, P /* <: RequestParameters */](
      route: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 890 */ Any) | R
    ): D & (EndpointDefaults | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) & P = js.native
    
    /**
      * Stateless method to turn endpoint options into request options.
      * Calling `endpoint(options)` is the same as calling `endpoint.parse(endpoint.merge(options))`.
      *
      * @param {object} options `method`, `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def parse[O /* <: EndpointDefaults */](options: O): RequestOptions & (Pick[
        O, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
  }
}
