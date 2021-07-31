package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTranslate.anon.Alt
import typings.maximMazurokGapiClientTranslate.anon.DisplayLanguageCode
import typings.maximMazurokGapiClientTranslate.anon.Parent
import typings.maximMazurokGapiClientTranslate.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  def detectLanguage(request: Alt, body: DetectLanguageRequest): Request[DetectLanguageResponse] = js.native
  /** Detects the language of text within a request. */
  def detectLanguage(request: Parent): Request[DetectLanguageResponse] = js.native
  
  /** Returns a list of supported languages for translation. */
  def getSupportedLanguages(): Request[SupportedLanguages] = js.native
  def getSupportedLanguages(request: DisplayLanguageCode): Request[SupportedLanguages] = js.native
  
  var locations: LocationsResource = js.native
  
  def translateText(request: Alt, body: TranslateTextRequest): Request[TranslateTextResponse] = js.native
  /** Translates input text and returns translated text. */
  def translateText(request: PrettyPrint): Request[TranslateTextResponse] = js.native
}
