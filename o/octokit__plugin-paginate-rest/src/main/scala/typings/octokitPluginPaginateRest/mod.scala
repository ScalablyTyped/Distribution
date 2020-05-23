package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.anon.Paginate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/plugin-paginate-rest", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object paginateRest extends js.Object {
    var VERSION: String = js.native
    def apply(octokit: Octokit): Paginate = js.native
  }
  
}

