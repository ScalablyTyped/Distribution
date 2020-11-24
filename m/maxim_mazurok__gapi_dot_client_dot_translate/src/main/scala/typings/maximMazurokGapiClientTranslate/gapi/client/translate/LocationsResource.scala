package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTranslate.anon.Alt
import typings.maximMazurokGapiClientTranslate.anon.Callback
import typings.maximMazurokGapiClientTranslate.anon.DisplayLanguageCode
import typings.maximMazurokGapiClientTranslate.anon.Filter
import typings.maximMazurokGapiClientTranslate.anon.Oauthtoken
import typings.maximMazurokGapiClientTranslate.anon.Parent
import typings.maximMazurokGapiClientTranslate.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  def batchTranslateText(request: Alt, body: BatchTranslateTextRequest): Request[Operation] = js.native
  /**
    * Translates a large volume of text in asynchronous batch mode. This function provides real-time output as the inputs are being processed. If caller cancels a request, the partial
    * results (for an input file, it's all or nothing) may still be available on the specified output location. This call returns immediately and you can use
    * google.longrunning.Operation.name to poll the status of the call.
    */
  def batchTranslateText(request: Oauthtoken): Request[Operation] = js.native
  
  def detectLanguage(request: Alt, body: DetectLanguageRequest): Request[DetectLanguageResponse] = js.native
  /** Detects the language of text within a request. */
  def detectLanguage(request: Parent): Request[DetectLanguageResponse] = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  /** Returns a list of supported languages for translation. */
  def getSupportedLanguages(): Request[SupportedLanguages] = js.native
  def getSupportedLanguages(request: DisplayLanguageCode): Request[SupportedLanguages] = js.native
  
  var glossaries: GlossariesResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Filter): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  def translateText(request: Alt, body: TranslateTextRequest): Request[TranslateTextResponse] = js.native
  /** Translates input text and returns translated text. */
  def translateText(request: PrettyPrint): Request[TranslateTextResponse] = js.native
}
