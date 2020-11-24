package typings.maximMazurokGapiClientSpeech

import typings.maximMazurokGapiClientSpeech.gapi.client.speech.OperationsResource
import typings.maximMazurokGapiClientSpeech.gapi.client.speech.ProjectsResource
import typings.maximMazurokGapiClientSpeech.gapi.client.speech.SpeechResource
import typings.maximMazurokGapiClientSpeech.maximMazurokGapiClientSpeechStrings.speech
import typings.maximMazurokGapiClientSpeech.maximMazurokGapiClientSpeechStrings.v1
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
      
      /** Load Cloud Speech-to-Text API v1 */
      def load(name: speech, version: v1): js.Thenable[Unit] = js.native
      def load(name: speech, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object speech extends js.Object {
        
        val operations: OperationsResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val speech: SpeechResource = js.native
      }
    }
  }
}
