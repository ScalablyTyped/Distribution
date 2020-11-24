package typings.maximMazurokGapiClientTexttospeech

import typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech.TextResource
import typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech.VoicesResource
import typings.maximMazurokGapiClientTexttospeech.maximMazurokGapiClientTexttospeechStrings.texttospeech
import typings.maximMazurokGapiClientTexttospeech.maximMazurokGapiClientTexttospeechStrings.v1
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
      
      /** Load Cloud Text-to-Speech API v1 */
      def load(name: texttospeech, version: v1): js.Thenable[Unit] = js.native
      def load(name: texttospeech, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object texttospeech extends js.Object {
        
        val text: TextResource = js.native
        
        val voices: VoicesResource = js.native
      }
    }
  }
}
