package typings.maximMazurokGapiClientSpeech

import typings.maximMazurokGapiClientSpeech.gapi.client.speech.OperationsResource
import typings.maximMazurokGapiClientSpeech.gapi.client.speech.ProjectsResource
import typings.maximMazurokGapiClientSpeech.gapi.client.speech.SpeechResource
import typings.maximMazurokGapiClientSpeech.maximMazurokGapiClientSpeechStrings.speech
import typings.maximMazurokGapiClientSpeech.maximMazurokGapiClientSpeechStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Speech-to-Text API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: speech, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: speech, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object speech {
        
        @JSGlobal("gapi.client.speech.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.speech.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.speech.speech")
        @js.native
        val speech: SpeechResource = js.native
      }
    }
  }
}
