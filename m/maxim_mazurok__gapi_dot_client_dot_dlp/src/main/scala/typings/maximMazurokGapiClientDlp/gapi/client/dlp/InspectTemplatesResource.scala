package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDlp.anon.Fields
import typings.maximMazurokGapiClientDlp.anon.Key
import typings.maximMazurokGapiClientDlp.anon.LocationId
import typings.maximMazurokGapiClientDlp.anon.Oauthtoken
import typings.maximMazurokGapiClientDlp.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectTemplatesResource extends StObject {
  
  def create(request: Fields, body: GooglePrivacyDlpV2CreateInspectTemplateRequest): Request[GooglePrivacyDlpV2InspectTemplate] = js.native
  /**
    * Creates an InspectTemplate for re-using frequently used configuration for inspecting content, images, and storage. See https://cloud.google.com/dlp/docs/creating-templates to learn
    * more.
    */
  def create(request: Oauthtoken): Request[GooglePrivacyDlpV2InspectTemplate] = js.native
  
  /** Deletes an InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn more. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets an InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn more. */
  def get(): Request[GooglePrivacyDlpV2InspectTemplate] = js.native
  def get(request: Key): Request[GooglePrivacyDlpV2InspectTemplate] = js.native
  
  /** Lists InspectTemplates. See https://cloud.google.com/dlp/docs/creating-templates to learn more. */
  def list(): Request[GooglePrivacyDlpV2ListInspectTemplatesResponse] = js.native
  def list(request: LocationId): Request[GooglePrivacyDlpV2ListInspectTemplatesResponse] = js.native
  
  def patch(request: Key, body: GooglePrivacyDlpV2UpdateInspectTemplateRequest): Request[GooglePrivacyDlpV2InspectTemplate] = js.native
  /** Updates the InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn more. */
  def patch(request: PrettyPrint): Request[GooglePrivacyDlpV2InspectTemplate] = js.native
}
