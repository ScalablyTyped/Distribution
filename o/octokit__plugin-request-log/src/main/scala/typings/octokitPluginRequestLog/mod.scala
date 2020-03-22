package typings.octokitPluginRequestLog

import typings.octokitCore.mod.Octokit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/plugin-request-log", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object requestLog extends js.Object {
    var VERSION: String = js.native
    def apply(octokit: Octokit): Unit = js.native
  }
  
}

