package typings.maximMazurokGapiClientTranslate

import typings.maximMazurokGapiClientTranslate.gapi.client.translate.ProjectsResource
import typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.translate
import typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Cloud Translation API v3 */
      @scala.inline
      def load(name: translate, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: translate, version: v3, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object translate {
        
        @JSGlobal("gapi.client.translate.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
