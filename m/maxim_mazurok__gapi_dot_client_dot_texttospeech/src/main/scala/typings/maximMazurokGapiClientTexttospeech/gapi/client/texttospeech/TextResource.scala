package typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTexttospeech.anon.Accesstoken
import typings.maximMazurokGapiClientTexttospeech.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextResource extends js.Object {
  
  /** Synthesizes speech synchronously: receive results after all text input has been processed. */
  def synthesize(request: Accesstoken): Request[SynthesizeSpeechResponse] = js.native
  def synthesize(request: Alt, body: SynthesizeSpeechRequest): Request[SynthesizeSpeechResponse] = js.native
}
