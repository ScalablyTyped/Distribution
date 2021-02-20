package typings.maximMazurokGapiClientServicedirectory

import typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory.ProjectsResource
import typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.servicedirectory
import typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Service Directory API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: servicedirectory, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: servicedirectory, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      object servicedirectory {
        
        @JSGlobal("gapi.client.servicedirectory.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
