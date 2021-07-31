package typings.maximMazurokGapiClientGameservices

import typings.maximMazurokGapiClientGameservices.gapi.client.gameservices.ProjectsResource
import typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.gameservices
import typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object gameservices {
        
        @JSGlobal("gapi.client.gameservices.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Game Services API v1 */
      @scala.inline
      def load(name: gameservices, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: gameservices, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
