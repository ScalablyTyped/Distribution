package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.anon.AsyncIterator
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorMod {
  
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def iterator(octokit: Octokit, route: RequestInterface[js.Object]): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
  @scala.inline
  def iterator(octokit: Octokit, route: RequestInterface[js.Object], parameters: RequestParameters): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
  @scala.inline
  def iterator(octokit: Octokit, route: Route): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
  @scala.inline
  def iterator(octokit: Octokit, route: Route, parameters: RequestParameters): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
}
