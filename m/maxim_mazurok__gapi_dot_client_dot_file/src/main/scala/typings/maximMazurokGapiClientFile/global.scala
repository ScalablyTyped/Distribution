package typings.maximMazurokGapiClientFile

import typings.maximMazurokGapiClientFile.gapi.client.file.ProjectsResource
import typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.file
import typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object file {
        
        @JSGlobal("gapi.client.file.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Filestore API v1 */
      inline def load(name: file, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: file, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
