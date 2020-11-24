package typings.maximMazurokGapiClientFile

import typings.maximMazurokGapiClientFile.gapi.client.file.ProjectsResource
import typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.file
import typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.v1
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
      
      /** Load Cloud Filestore API v1 */
      def load(name: file, version: v1): js.Thenable[Unit] = js.native
      def load(name: file, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object file extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
