package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.anon.Paginate
import typings.octokitPluginPaginateRest.typesMod.ComposePaginateInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/plugin-paginate-rest", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val composePaginateRest: ComposePaginateInterface = js.native
  
  @js.native
  object paginateRest extends js.Object {
    
    def apply(octokit: Octokit): Paginate = js.native
    
    var VERSION: String = js.native
  }
}
