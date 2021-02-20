package typings.maximMazurokGapiClientEventarc

import typings.maximMazurokGapiClientEventarc.gapi.client.eventarc.ProjectsResource
import typings.maximMazurokGapiClientEventarc.maximMazurokGapiClientEventarcStrings.eventarc
import typings.maximMazurokGapiClientEventarc.maximMazurokGapiClientEventarcStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object eventarc {
        
        @JSGlobal("gapi.client.eventarc.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Eventarc API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: eventarc, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: eventarc, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
