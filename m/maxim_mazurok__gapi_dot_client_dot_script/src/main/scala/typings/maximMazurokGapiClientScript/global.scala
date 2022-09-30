package typings.maximMazurokGapiClientScript

import typings.maximMazurokGapiClientScript.gapi.client.script.ProcessesResource
import typings.maximMazurokGapiClientScript.gapi.client.script.ProjectsResource
import typings.maximMazurokGapiClientScript.gapi.client.script.ScriptsResource
import typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.script
import typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Apps Script API v1 */
      inline def load(name: script, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: script, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object script {
        
        @JSGlobal("gapi.client.script.processes")
        @js.native
        val processes: ProcessesResource = js.native
        
        @JSGlobal("gapi.client.script.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.script.scripts")
        @js.native
        val scripts: ScriptsResource = js.native
      }
    }
  }
}
