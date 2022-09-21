package typings.maximMazurokGapiClientRun

import typings.maximMazurokGapiClientRun.gapi.client.run.ProjectsResource
import typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.run
import typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Cloud Run Admin API v2 */
      inline def load(name: run, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: run, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object run {
        
        @JSGlobal("gapi.client.run.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
