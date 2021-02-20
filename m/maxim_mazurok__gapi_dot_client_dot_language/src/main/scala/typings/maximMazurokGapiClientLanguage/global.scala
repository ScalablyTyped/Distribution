package typings.maximMazurokGapiClientLanguage

import typings.maximMazurokGapiClientLanguage.gapi.client.language.DocumentsResource
import typings.maximMazurokGapiClientLanguage.maximMazurokGapiClientLanguageStrings.language
import typings.maximMazurokGapiClientLanguage.maximMazurokGapiClientLanguageStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object language {
        
        @JSGlobal("gapi.client.language.documents")
        @js.native
        val documents: DocumentsResource = js.native
      }
      
      /** Load Cloud Natural Language API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: language, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: language, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
