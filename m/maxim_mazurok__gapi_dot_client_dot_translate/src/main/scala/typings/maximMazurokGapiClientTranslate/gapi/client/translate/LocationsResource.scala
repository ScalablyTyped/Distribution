package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTranslate.anon.AccesstokenAlt
import typings.maximMazurokGapiClientTranslate.anon.Alt
import typings.maximMazurokGapiClientTranslate.anon.Callback
import typings.maximMazurokGapiClientTranslate.anon.DisplayLanguageCode
import typings.maximMazurokGapiClientTranslate.anon.PageSize
import typings.maximMazurokGapiClientTranslate.anon.Parent
import typings.maximMazurokGapiClientTranslate.anon.UploadType
import typings.maximMazurokGapiClientTranslate.anon.Uploadprotocol
import typings.maximMazurokGapiClientTranslate.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  def batchTranslateDocument(request: Alt, body: BatchTranslateDocumentRequest): Request[Operation] = js.native
  /**
    * Translates a large volume of document in asynchronous batch mode. This function provides real-time output as the inputs are being processed. If caller cancels a request, the partial
    * results (for an input file, it's all or nothing) may still be available on the specified output location. This call returns immediately and you can use
    * google.longrunning.Operation.name to poll the status of the call.
    */
  def batchTranslateDocument(request: Parent): Request[Operation] = js.native
  
  def batchTranslateText(request: Alt, body: BatchTranslateTextRequest): Request[Operation] = js.native
  /**
    * Translates a large volume of text in asynchronous batch mode. This function provides real-time output as the inputs are being processed. If caller cancels a request, the partial
    * results (for an input file, it's all or nothing) may still be available on the specified output location. This call returns immediately and you can use
    * google.longrunning.Operation.name to poll the status of the call.
    */
  def batchTranslateText(request: UploadType): Request[Operation] = js.native
  
  def detectLanguage(request: Alt, body: DetectLanguageRequest): Request[DetectLanguageResponse] = js.native
  /** Detects the language of text within a request. */
  def detectLanguage(request: Uploadprotocol): Request[DetectLanguageResponse] = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  /** Returns a list of supported languages for translation. */
  def getSupportedLanguages(): Request[SupportedLanguages] = js.native
  def getSupportedLanguages(request: DisplayLanguageCode): Request[SupportedLanguages] = js.native
  
  var glossaries: GlossariesResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: PageSize): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  def translateDocument(request: Alt, body: TranslateDocumentRequest): Request[TranslateDocumentResponse] = js.native
  /** Translates documents in synchronous mode. */
  def translateDocument(request: Xgafv): Request[TranslateDocumentResponse] = js.native
  
  /** Translates input text and returns translated text. */
  def translateText(request: AccesstokenAlt): Request[TranslateTextResponse] = js.native
  def translateText(request: Alt, body: TranslateTextRequest): Request[TranslateTextResponse] = js.native
}
