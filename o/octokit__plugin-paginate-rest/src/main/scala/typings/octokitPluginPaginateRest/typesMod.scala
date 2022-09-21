package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.anon.DataGetResultsType
import typings.octokitTypes.endpointOptionsMod.EndpointOptions
import typings.octokitTypes.getResponseTypeFromEndpointMethodMod.GetResponseTypeFromEndpointMethod
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import typings.std.AsyncIterableIterator
import typings.std.Extract
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ComposePaginateInterface extends StObject {
    
    /**
      * Paginate a request using endpoint options
      *
      * @param {object} octokit Octokit instance
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[T](octokit: Octokit, options: EndpointOptions): js.Promise[PaginationResults[T]] = js.native
    /**
      * Paginate a request using an endpoint method and parameters
      *
      * @param {object} octokit Octokit instance
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[R /* <: RequestInterface[js.Object] */](octokit: Octokit, request: R): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/types.NormalizeResponse<@octokit/types.@octokit/types/dist-types/GetResponseTypeFromEndpointMethod.GetResponseTypeFromEndpointMethod<R>>['data'] */ js.Any
      ] = js.native
    def apply[R /* <: RequestInterface[js.Object] */](
      octokit: Octokit,
      request: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/types.NormalizeResponse<@octokit/types.@octokit/types/dist-types/GetResponseTypeFromEndpointMethod.GetResponseTypeFromEndpointMethod<R>>['data'] */ js.Any
      ] = js.native
    /**
      * Paginate a request using endpoint options and map each response to a custom array
      *
      * @param {object} octokit Octokit instance
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    def apply[T, M](
      octokit: Octokit,
      options: EndpointOptions,
      mapFn: MapFunction[OctokitResponse[PaginationResults[T], Double], js.Array[M]]
    ): js.Promise[PaginationResults[M]] = js.native
    /**
      * Paginate a request using an endpoint method and a map function
      *
      * @param {object} octokit Octokit instance
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {function} mapFn? Optional method to map each response to a custom array
      */
    def apply[R /* <: RequestInterface[js.Object] */, M /* <: js.Array[Any] */](
      octokit: Octokit,
      request: R,
      mapFn: MapFunction[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], M]
    ): js.Promise[M] = js.native
    /**
      * Paginate a request using an endpoint method, parameters, and a map function
      *
      * @param {object} octokit Octokit instance
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      * @param {function} mapFn? Optional method to map each response to a custom array
      */
    def apply[R /* <: RequestInterface[js.Object] */, M /* <: js.Array[Any] */](
      octokit: Octokit,
      request: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any,
      mapFn: MapFunction[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], M]
    ): js.Promise[M] = js.native
    
    def iterator[T](octokit: Octokit, options: EndpointOptions): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    def iterator[R /* <: RequestInterface[js.Object] */](octokit: Octokit, request: R): AsyncIterableIterator[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]]] = js.native
    def iterator[T, R /* <: Route */](
      octokit: Octokit,
      route: R,
      parameters: RequestParameters | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any)
    ): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    @JSName("iterator")
    def iterator_0[R /* <: RequestInterface[js.Object] */](
      octokit: Octokit,
      request: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any
    ): AsyncIterableIterator[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]]] = js.native
    @JSName("iterator")
    def iterator_R_Any[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 214 */ Any */](octokit: Octokit, route: R): AsyncIterableIterator[
        OctokitResponse[
          DataType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
          ], 
          Double
        ]
      ] = js.native
    @JSName("iterator")
    def iterator_TR_Route[T, R /* <: Route */](octokit: Octokit, route: R): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    @JSName("iterator")
    def iterator_parameters[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 214 */ Any */](
      octokit: Octokit,
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any
    ): AsyncIterableIterator[
        OctokitResponse[
          DataType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
          ], 
          Double
        ]
      ] = js.native
  }
  
  type DataType[T] = Any | (/* import warning: importer.ImportType#apply Failed type conversion: T['data'] */ js.Any)
  
  type GetResultsType[T] = /* import warning: importer.ImportType#apply Failed type conversion: T['data'][@octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/types.KnownKeysMatching<T['data'], std.Array<any>>] */ js.Any
  
  type KeysMatching[T, V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends V? K : never}[keyof T] */ js.Any
  
  type KnownKeys[T] = Extract[Any, /* keyof T */ String]
  
  type KnownKeysMatching[T, V] = KeysMatching[Pick[T, KnownKeys[T]], V]
  
  type MapFunction[T, M] = js.Function2[/* response */ T, /* done */ js.Function0[Unit], M]
  
  type NormalizeResponse[T] = T & DataGetResultsType[T]
  
  @js.native
  trait PaginateInterface extends StObject {
    
    /**
      * Paginate a request using endpoint options
      *
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[T](options: EndpointOptions): js.Promise[PaginationResults[T]] = js.native
    /**
      * Paginate a request using an endpoint method and parameters
      *
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[R /* <: RequestInterface[js.Object] */](request: R): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/types.NormalizeResponse<@octokit/types.@octokit/types/dist-types/GetResponseTypeFromEndpointMethod.GetResponseTypeFromEndpointMethod<R>>['data'] */ js.Any
      ] = js.native
    def apply[R /* <: RequestInterface[js.Object] */](
      request: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/types.NormalizeResponse<@octokit/types.@octokit/types/dist-types/GetResponseTypeFromEndpointMethod.GetResponseTypeFromEndpointMethod<R>>['data'] */ js.Any
      ] = js.native
    /**
      * Paginate a request using endpoint options and map each response to a custom array
      *
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    def apply[T, M](
      options: EndpointOptions,
      mapFn: MapFunction[OctokitResponse[PaginationResults[T], Double], js.Array[M]]
    ): js.Promise[PaginationResults[M]] = js.native
    /**
      * Paginate a request using an endpoint method and a map function
      *
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {function} mapFn? Optional method to map each response to a custom array
      */
    def apply[R /* <: RequestInterface[js.Object] */, M /* <: js.Array[Any] */](request: R, mapFn: MapFunction[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], M]): js.Promise[M] = js.native
    /**
      * Paginate a request using an endpoint method, parameters, and a map function
      *
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      * @param {function} mapFn? Optional method to map each response to a custom array
      */
    def apply[R /* <: RequestInterface[js.Object] */, M /* <: js.Array[Any] */](
      request: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any,
      mapFn: MapFunction[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], M]
    ): js.Promise[M] = js.native
    
    def iterator[T](options: EndpointOptions): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    def iterator[R /* <: RequestInterface[js.Object] */](request: R): AsyncIterableIterator[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]]] = js.native
    def iterator[T, R /* <: Route */](
      route: R,
      parameters: RequestParameters | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any)
    ): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    @JSName("iterator")
    def iterator_0[R /* <: RequestInterface[js.Object] */](
      request: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any
    ): AsyncIterableIterator[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]]] = js.native
    @JSName("iterator")
    def iterator_R_Any[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 214 */ Any */](route: R): AsyncIterableIterator[
        OctokitResponse[
          DataType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
          ], 
          Double
        ]
      ] = js.native
    @JSName("iterator")
    def iterator_TR_Route[T, R /* <: Route */](route: R): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    @JSName("iterator")
    def iterator_parameters[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 214 */ Any */](
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any
    ): AsyncIterableIterator[
        OctokitResponse[
          DataType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
          ], 
          Double
        ]
      ] = js.native
  }
  
  type PaginationResults[T] = js.Array[T]
}
