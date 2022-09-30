package typings.maximMazurokGapiClientToolresults

import typings.maximMazurokGapiClientToolresults.gapi.client.toolresults.ProjectsResource
import typings.maximMazurokGapiClientToolresults.maximMazurokGapiClientToolresultsStrings.toolresults
import typings.maximMazurokGapiClientToolresults.maximMazurokGapiClientToolresultsStrings.v1beta3
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
      
      /** Load Cloud Tool Results API v1beta3 */
      inline def load(name: toolresults, version: v1beta3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: toolresults, version: v1beta3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object toolresults {
        
        @JSGlobal("gapi.client.toolresults.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
