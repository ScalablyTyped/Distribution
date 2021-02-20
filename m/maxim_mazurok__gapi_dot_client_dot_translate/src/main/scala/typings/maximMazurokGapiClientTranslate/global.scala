package typings.maximMazurokGapiClientTranslate

import typings.maximMazurokGapiClientTranslate.gapi.client.translate.ProjectsResource
import typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.translate
import typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Translation API v3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: translate, version: v3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: translate, version: v3, callback: js.Function0[_]): Unit = js.native
      
      object translate {
        
        @JSGlobal("gapi.client.translate.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
