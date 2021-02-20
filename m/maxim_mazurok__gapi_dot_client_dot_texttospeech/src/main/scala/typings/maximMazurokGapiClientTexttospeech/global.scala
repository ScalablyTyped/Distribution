package typings.maximMazurokGapiClientTexttospeech

import typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech.TextResource
import typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech.VoicesResource
import typings.maximMazurokGapiClientTexttospeech.maximMazurokGapiClientTexttospeechStrings.texttospeech
import typings.maximMazurokGapiClientTexttospeech.maximMazurokGapiClientTexttospeechStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Text-to-Speech API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: texttospeech, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: texttospeech, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object texttospeech {
        
        @JSGlobal("gapi.client.texttospeech.text")
        @js.native
        val text: TextResource = js.native
        
        @JSGlobal("gapi.client.texttospeech.voices")
        @js.native
        val voices: VoicesResource = js.native
      }
    }
  }
}
