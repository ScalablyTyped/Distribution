package typings.octokitPluginPaginateRest

import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/plugin-paginate-rest/dist-types/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @js.native
  trait PaginateInterface extends js.Object {
    /**
      * Paginate a request using endpoint options
      *
      * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[T](
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.EndpointOptions */ js.Any
    ): js.Promise[PaginationResults[T]] = js.native
    /**
      * Paginate a request using an endpoint route string and parameters
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[T](
      route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.Route */ js.Any,
      parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any
    ): js.Promise[PaginationResults[T]] = js.native
    /**
      * Paginate a request using endpoint options and map each response to a custom array
      *
      * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    /**
      * Paginate a request using an endpoint route string and map each response to a custom array
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    def apply[T, R](
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.EndpointOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.Route */ js.Any,
      mapFn: MapFunction[T, _ | R]
    ): js.Promise[PaginationResults[R]] = js.native
    /**
      * Paginate a request using an endpoint route string and parameters, and map each response to a custom array
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    def apply[T, R](
      route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.Route */ js.Any,
      parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any,
      mapFn: MapFunction[T, _]
    ): js.Promise[PaginationResults[R]] = js.native
    def iterator[T](
      EndpointOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.EndpointOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.Route */ js.Any
    ): AsyncIterableIterator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.OctokitResponse<PaginationResults<T>> */ _
      ] = js.native
    def iterator[T](
      route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.Route */ js.Any,
      parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any
    ): AsyncIterableIterator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.OctokitResponse<PaginationResults<T>> */ _
      ] = js.native
  }
  
  type MapFunction[T, R] = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.OctokitResponse<PaginationResults<T>> */ /* response */ js.Any, 
    /* done */ js.Function0[Unit], 
    js.Array[R]
  ]
  type PaginationResults[T] = js.Array[T]
}

