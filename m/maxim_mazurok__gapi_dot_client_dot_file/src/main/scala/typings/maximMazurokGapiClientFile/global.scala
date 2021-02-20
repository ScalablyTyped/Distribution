package typings.maximMazurokGapiClientFile

import typings.maximMazurokGapiClientFile.gapi.client.file.ProjectsResource
import typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.file
import typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object file {
        
        @JSGlobal("gapi.client.file.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Filestore API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: file, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: file, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
