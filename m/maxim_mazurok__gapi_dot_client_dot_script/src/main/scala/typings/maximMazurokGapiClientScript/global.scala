package typings.maximMazurokGapiClientScript

import typings.maximMazurokGapiClientScript.gapi.client.script.ProcessesResource
import typings.maximMazurokGapiClientScript.gapi.client.script.ProjectsResource
import typings.maximMazurokGapiClientScript.gapi.client.script.ScriptsResource
import typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.script
import typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Apps Script API v1 */
      def load(name: script, version: v1): js.Thenable[Unit] = js.native
      def load(name: script, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object script extends js.Object {
        
        val processes: ProcessesResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val scripts: ScriptsResource = js.native
      }
    }
  }
}
