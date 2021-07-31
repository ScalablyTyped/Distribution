package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.typesMod.MapFunction
import typings.octokitPluginPaginateRest.typesMod.PaginationResults
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginateMod {
  
  @JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def paginate(octokit: Octokit, route: RequestInterface[js.Object]): js.Promise[PaginationResults[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[js.Any]]]
  @scala.inline
  def paginate(
    octokit: Octokit,
    route: RequestInterface[js.Object],
    parameters: Unit,
    mapFn: MapFunction[js.Any, js.Any]
  ): js.Promise[PaginationResults[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[js.Any]]]
  @scala.inline
  def paginate(octokit: Octokit, route: RequestInterface[js.Object], parameters: RequestParameters): js.Promise[PaginationResults[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[js.Any]]]
  @scala.inline
  def paginate(
    octokit: Octokit,
    route: RequestInterface[js.Object],
    parameters: RequestParameters,
    mapFn: MapFunction[js.Any, js.Any]
  ): js.Promise[PaginationResults[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[js.Any]]]
  @scala.inline
  def paginate(octokit: Octokit, route: Route): js.Promise[PaginationResults[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[js.Any]]]
  @scala.inline
  def paginate(octokit: Octokit, route: Route, parameters: Unit, mapFn: MapFunction[js.Any, js.Any]): js.Promise[PaginationResults[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[js.Any]]]
  @scala.inline
  def paginate(octokit: Octokit, route: Route, parameters: RequestParameters): js.Promise[PaginationResults[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[js.Any]]]
  @scala.inline
  def paginate(octokit: Octokit, route: Route, parameters: RequestParameters, mapFn: MapFunction[js.Any, js.Any]): js.Promise[PaginationResults[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginate")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PaginationResults[js.Any]]]
}
