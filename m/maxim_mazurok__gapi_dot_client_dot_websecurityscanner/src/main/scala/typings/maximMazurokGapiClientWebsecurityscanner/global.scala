package typings.maximMazurokGapiClientWebsecurityscanner

import typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner.ProjectsResource
import typings.maximMazurokGapiClientWebsecurityscanner.maximMazurokGapiClientWebsecurityscannerStrings.v1
import typings.maximMazurokGapiClientWebsecurityscanner.maximMazurokGapiClientWebsecurityscannerStrings.websecurityscanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Web Security Scanner API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: websecurityscanner, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: websecurityscanner, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object websecurityscanner {
        
        @JSGlobal("gapi.client.websecurityscanner.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
