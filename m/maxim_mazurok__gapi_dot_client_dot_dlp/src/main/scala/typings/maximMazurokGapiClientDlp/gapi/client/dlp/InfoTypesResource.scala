package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDlp.anon.Accesstoken
import typings.maximMazurokGapiClientDlp.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoTypesResource extends StObject {
  
  /** Returns a list of the sensitive information types that DLP API supports. See https://cloud.google.com/dlp/docs/infotypes-reference to learn more. */
  def list(): Request[GooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(request: Accesstoken): Request[GooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(request: Alt): Request[GooglePrivacyDlpV2ListInfoTypesResponse] = js.native
}
