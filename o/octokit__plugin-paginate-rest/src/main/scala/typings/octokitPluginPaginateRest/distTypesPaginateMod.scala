package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.distTypesTypesMod.MapFunction
import typings.octokitPluginPaginateRest.distTypesTypesMod.PaginationResults
import typings.octokitTypes.distTypesOctokitResponseMod.OctokitResponse
import typings.octokitTypes.distTypesRequestInterfaceMod.RequestInterface
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.octokitTypes.distTypesRouteMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginateMod {
  
  @JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginate(octokit: Octokit, route: RequestInterface[js.Object]): js.Promise[PaginationResults[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[Any]]]
  inline def paginate(
    octokit: Octokit,
    route: RequestInterface[js.Object],
    parameters: Unit,
    mapFn: MapFunction[OctokitResponse[PaginationResults[Any], Double], js.Array[Any]]
  ): js.Promise[PaginationResults[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[Any]]]
  inline def paginate(octokit: Octokit, route: RequestInterface[js.Object], parameters: RequestParameters): js.Promise[PaginationResults[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[Any]]]
  inline def paginate(
    octokit: Octokit,
    route: RequestInterface[js.Object],
    parameters: RequestParameters,
    mapFn: MapFunction[OctokitResponse[PaginationResults[Any], Double], js.Array[Any]]
  ): js.Promise[PaginationResults[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[Any]]]
  inline def paginate(octokit: Octokit, route: Route): js.Promise[PaginationResults[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[Any]]]
  inline def paginate(
    octokit: Octokit,
    route: Route,
    parameters: Unit,
    mapFn: MapFunction[OctokitResponse[PaginationResults[Any], Double], js.Array[Any]]
  ): js.Promise[PaginationResults[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[Any]]]
  inline def paginate(octokit: Octokit, route: Route, parameters: RequestParameters): js.Promise[PaginationResults[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[Any]]]
  inline def paginate(
    octokit: Octokit,
    route: Route,
    parameters: RequestParameters,
    mapFn: MapFunction[OctokitResponse[PaginationResults[Any], Double], js.Array[Any]]
  ): js.Promise[PaginationResults[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[Any]]]
}
