package typings.maximMazurokGapiClientScript

import typings.maximMazurokGapiClientScript.gapi.client.script.ProcessesResource
import typings.maximMazurokGapiClientScript.gapi.client.script.ProjectsResource
import typings.maximMazurokGapiClientScript.gapi.client.script.ScriptsResource
import typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.script
import typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Apps Script API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: script, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: script, version: v1, callback: js.Function0[_]): Unit = js.native
      
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
