package typings.octokitPluginRequestLog

import typings.octokitCore.mod.Octokit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object requestLog {
    
    @JSImport("@octokit/plugin-request-log", "requestLog")
    @js.native
    def apply(octokit: Octokit): Unit = js.native
    @JSImport("@octokit/plugin-request-log", "requestLog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@octokit/plugin-request-log", "requestLog.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}
