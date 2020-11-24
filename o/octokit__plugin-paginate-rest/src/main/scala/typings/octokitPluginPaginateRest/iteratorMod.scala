package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.anon.AsyncIterator
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", JSImport.Namespace)
@js.native
object iteratorMod extends js.Object {
  
  def iterator(octokit: Octokit, route: RequestInterface[js.Object]): AsyncIterator = js.native
  def iterator(octokit: Octokit, route: RequestInterface[js.Object], parameters: RequestParameters): AsyncIterator = js.native
  def iterator(octokit: Octokit, route: Route): AsyncIterator = js.native
  def iterator(octokit: Octokit, route: Route, parameters: RequestParameters): AsyncIterator = js.native
}
