package typings.octokitPluginRequestLog

import typings.octokitCore.mod.Octokit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object requestLog {
    
    @scala.inline
    def apply(octokit: Octokit): Unit = ^.asInstanceOf[js.Dynamic].apply(octokit.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
