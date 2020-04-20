package typings.octokitPluginPaginateRest

import typings.octokitPluginPaginateRest.typesMod.MapFunction
import typings.octokitPluginPaginateRest.typesMod.PaginateInterface
import typings.octokitPluginPaginateRest.typesMod.PaginationResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaginate extends js.Object {
  @JSName("paginate")
  var paginate_Original: PaginateInterface = js.native
  /**
    * Paginate a request using endpoint options
    *
    * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def paginate[T](
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.EndpointOptions */ js.Any
  ): js.Promise[PaginationResults[T]] = js.native
  /**
    * Paginate a request using an endpoint route string and parameters
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def paginate[T](
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
  def paginate[T, R](
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
  def paginate[T, R](
    route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.Route */ js.Any,
    parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any,
    mapFn: MapFunction[T, _]
  ): js.Promise[PaginationResults[R]] = js.native
}

