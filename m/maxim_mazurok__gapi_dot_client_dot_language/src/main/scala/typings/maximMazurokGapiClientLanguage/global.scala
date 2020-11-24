package typings.maximMazurokGapiClientLanguage

import typings.maximMazurokGapiClientLanguage.gapi.client.language.DocumentsResource
import typings.maximMazurokGapiClientLanguage.maximMazurokGapiClientLanguageStrings.language
import typings.maximMazurokGapiClientLanguage.maximMazurokGapiClientLanguageStrings.v1
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
      
      /** Load Cloud Natural Language API v1 */
      def load(name: language, version: v1): js.Thenable[Unit] = js.native
      def load(name: language, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object language extends js.Object {
        
        val documents: DocumentsResource = js.native
      }
    }
  }
}
