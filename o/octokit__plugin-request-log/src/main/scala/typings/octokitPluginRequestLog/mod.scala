package typings.octokitPluginRequestLog

import typings.octokitCore.mod.Octokit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/plugin-request-log", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object requestLog extends js.Object {
    
    def apply(octokit: Octokit): Unit = js.native
    
    var VERSION: String = js.native
  }
}
