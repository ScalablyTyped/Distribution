package typings.maximMazurokGapiClientToolresults

import typings.maximMazurokGapiClientToolresults.gapi.client.toolresults.ProjectsResource
import typings.maximMazurokGapiClientToolresults.maximMazurokGapiClientToolresultsStrings.toolresults
import typings.maximMazurokGapiClientToolresults.maximMazurokGapiClientToolresultsStrings.v1beta3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Tool Results API v1beta3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: toolresults, version: v1beta3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: toolresults, version: v1beta3, callback: js.Function0[_]): Unit = js.native
      
      object toolresults {
        
        @JSGlobal("gapi.client.toolresults.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
