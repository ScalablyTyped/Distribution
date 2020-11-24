package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDlp.anon.Fields
import typings.maximMazurokGapiClientDlp.anon.Key
import typings.maximMazurokGapiClientDlp.anon.LocationId
import typings.maximMazurokGapiClientDlp.anon.Parent
import typings.maximMazurokGapiClientDlp.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoredInfoTypesResource extends js.Object {
  
  def create(request: Fields, body: GooglePrivacyDlpV2CreateStoredInfoTypeRequest): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
  /** Creates a pre-built stored infoType to be used for inspection. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more. */
  def create(request: Parent): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
  
  /** Deletes a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more. */
  def get(): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
  def get(request: Key): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
  
  /** Lists stored infoTypes. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more. */
  def list(): Request[GooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(request: LocationId): Request[GooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  
  def patch(request: Key, body: GooglePrivacyDlpV2UpdateStoredInfoTypeRequest): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
  /**
    * Updates the stored infoType by creating a new version. The existing version will continue to be used until the new version is ready. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
    */
  def patch(request: QuotaUser): Request[GooglePrivacyDlpV2StoredInfoType] = js.native
}
