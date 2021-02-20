package typings.maximMazurokGapiClientIamcredentials

import typings.maximMazurokGapiClientIamcredentials.gapi.client.iamcredentials.ProjectsResource
import typings.maximMazurokGapiClientIamcredentials.maximMazurokGapiClientIamcredentialsStrings.iamcredentials
import typings.maximMazurokGapiClientIamcredentials.maximMazurokGapiClientIamcredentialsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object iamcredentials {
        
        @JSGlobal("gapi.client.iamcredentials.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load IAM Service Account Credentials API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: iamcredentials, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: iamcredentials, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
