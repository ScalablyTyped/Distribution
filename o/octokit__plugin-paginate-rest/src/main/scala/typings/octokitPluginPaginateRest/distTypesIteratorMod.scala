package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.anon.AsyncIterator
import typings.octokitTypes.distTypesRequestInterfaceMod.RequestInterface
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.octokitTypes.distTypesRouteMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIteratorMod {
  
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iterator(octokit: Octokit, route: RequestInterface[js.Object]): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
  inline def iterator(octokit: Octokit, route: RequestInterface[js.Object], parameters: RequestParameters): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
  inline def iterator(octokit: Octokit, route: Route): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
  inline def iterator(octokit: Octokit, route: Route, parameters: RequestParameters): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
}
