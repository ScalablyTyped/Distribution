package typings.octokitPluginPaginateRest.anon

import typings.octokitPluginPaginateRest.typesMod.DataType
import typings.octokitPluginPaginateRest.typesMod.MapFunction
import typings.octokitPluginPaginateRest.typesMod.NormalizeResponse
import typings.octokitPluginPaginateRest.typesMod.PaginateInterface
import typings.octokitPluginPaginateRest.typesMod.PaginationResults
import typings.octokitTypes.endpointOptionsMod.EndpointOptions
import typings.octokitTypes.getResponseTypeFromEndpointMethodMod.GetResponseTypeFromEndpointMethod
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paginate extends StObject {
  
  /**
    * Paginate a request using endpoint options
    *
    * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def paginate[T](options: EndpointOptions): js.Promise[PaginationResults[T]]
  /**
    * Paginate a request using an known endpoint route string
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
    * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  /**
    * Paginate a request using an endpoint method and parameters
    *
    * @param {string} request Request method (`octokit.request` or `@octokit/request`)
    * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def paginate[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 188 */ Any */](route: R): js.Promise[
    DataType[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
    ]
  ]
  /**
    * Paginate a request using endpoint options and map each response to a custom array
    *
    * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    * @param {function} mapFn Optional method to map each response to a custom array
    */
  def paginate[T, M](
    options: EndpointOptions,
    mapFn: MapFunction[OctokitResponse[PaginationResults[T], Double], js.Array[M]]
  ): js.Promise[PaginationResults[M]]
  /**
    * Paginate a request using an endpoint method and a map function
    *
    * @param {string} request Request method (`octokit.request` or `@octokit/request`)
    * @param {function} mapFn? Optional method to map each response to a custom array
    */
  def paginate[R /* <: RequestInterface[js.Object] */, M /* <: js.Array[Any] */](request: R, mapFn: MapFunction[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], M]): js.Promise[M]
  def paginate[T, R /* <: Route */](
    route: R,
    parameters: RequestParameters | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any)
  ): js.Promise[js.Array[T]]
  /**
    * Paginate a request using a known endpoint route string and parameters, and map each response to a custom array
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
    * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    * @param {function} mapFn Optional method to map each response to a custom array
    */
  def paginate[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 188 */ Any */, M /* <: js.Array[Any] */](
    route: R,
    parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any,
    mapFn: MapFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any, 
      M
    ]
  ): js.Promise[M]
  @JSName("paginate")
  def paginate_0[R /* <: RequestInterface[js.Object] */](
    request: R,
    parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/types.NormalizeResponse<@octokit/types.@octokit/types/dist-types/GetResponseTypeFromEndpointMethod.GetResponseTypeFromEndpointMethod<R>>['data'] */ js.Any
  ]
  /**
    * Paginate a request using an endpoint method, parameters, and a map function
    *
    * @param {string} request Request method (`octokit.request` or `@octokit/request`)
    * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    * @param {function} mapFn? Optional method to map each response to a custom array
    */
  @JSName("paginate")
  def paginate_0[R /* <: RequestInterface[js.Object] */, M /* <: js.Array[Any] */](
    request: R,
    parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any,
    mapFn: MapFunction[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], M]
  ): js.Promise[M]
  @JSName("paginate")
  var paginate_Original: PaginateInterface
  /**
    * Paginate a request using an unknown endpoint route string
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
    * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  @JSName("paginate")
  def paginate_TR[T, R /* <: Route */](route: R): js.Promise[js.Array[T]]
  @JSName("paginate")
  def paginate_parameters[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 188 */ Any */](
    route: R,
    parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any
  ): js.Promise[
    DataType[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
    ]
  ]
  /**
    * Paginate a request using a known endpoint route string and map each response to a custom array
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
    * @param {function} mapFn Optional method to map each response to a custom array
    */
  @JSName("paginate")
  def paginate_response[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 188 */ Any */, M /* <: js.Array[Any] */](
    route: R,
    mapFn: MapFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any, 
      M
    ]
  ): js.Promise[M]
}
object Paginate {
  
  inline def apply(paginate: PaginateInterface): Paginate = {
    val __obj = js.Dynamic.literal(paginate = paginate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paginate]
  }
  
  extension [Self <: Paginate](x: Self) {
    
    inline def setPaginate(value: PaginateInterface): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
  }
}
