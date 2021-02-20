package typings.maximMazurokGapiClientHealthcare

import typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare.ProjectsResource
import typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.healthcare
import typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object healthcare {
        
        @JSGlobal("gapi.client.healthcare.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Healthcare API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: healthcare, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: healthcare, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
