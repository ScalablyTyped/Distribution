package typings.maximMazurokGapiClientWebsecurityscanner

import typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner.ProjectsResource
import typings.maximMazurokGapiClientWebsecurityscanner.maximMazurokGapiClientWebsecurityscannerStrings.v1
import typings.maximMazurokGapiClientWebsecurityscanner.maximMazurokGapiClientWebsecurityscannerStrings.websecurityscanner
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
      
      /** Load Web Security Scanner API v1 */
      def load(name: websecurityscanner, version: v1): js.Thenable[Unit] = js.native
      def load(name: websecurityscanner, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object websecurityscanner extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
