package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.anon.AsyncIterator
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorMod {
  
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", "iterator")
  @js.native
  def iterator(octokit: Octokit, route: RequestInterface[js.Object]): AsyncIterator = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", "iterator")
  @js.native
  def iterator(octokit: Octokit, route: RequestInterface[js.Object], parameters: RequestParameters): AsyncIterator = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", "iterator")
  @js.native
  def iterator(octokit: Octokit, route: Route): AsyncIterator = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", "iterator")
  @js.native
  def iterator(octokit: Octokit, route: Route, parameters: RequestParameters): AsyncIterator = js.native
}
