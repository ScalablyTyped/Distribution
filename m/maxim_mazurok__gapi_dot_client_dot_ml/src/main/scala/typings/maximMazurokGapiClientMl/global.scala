package typings.maximMazurokGapiClientMl

import typings.maximMazurokGapiClientMl.gapi.client.ml.ProjectsResource
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.ml
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load AI Platform Training & Prediction API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: ml, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: ml, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object ml {
        
        @JSGlobal("gapi.client.ml.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
