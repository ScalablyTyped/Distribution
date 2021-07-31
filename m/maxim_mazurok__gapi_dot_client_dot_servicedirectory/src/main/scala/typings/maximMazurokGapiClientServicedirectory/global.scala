package typings.maximMazurokGapiClientServicedirectory

import typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory.ProjectsResource
import typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.servicedirectory
import typings.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Service Directory API v1beta1 */
      @scala.inline
      def load(name: servicedirectory, version: v1beta1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: servicedirectory, version: v1beta1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object servicedirectory {
        
        @JSGlobal("gapi.client.servicedirectory.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
