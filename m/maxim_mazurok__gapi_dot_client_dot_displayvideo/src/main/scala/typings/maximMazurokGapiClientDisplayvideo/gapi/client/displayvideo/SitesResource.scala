package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AccesstokenAlt
import typings.maximMazurokGapiClientDisplayvideo.anon.AdvertiserIdAlt
import typings.maximMazurokGapiClientDisplayvideo.anon.AltCallback
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackChannelId
import typings.maximMazurokGapiClientDisplayvideo.anon.ChannelId
import typings.maximMazurokGapiClientDisplayvideo.anon.ChannelIdFields
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsFilter
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsKey
import typings.maximMazurokGapiClientDisplayvideo.anon.KeyOauthtoken
import typings.maximMazurokGapiClientDisplayvideo.anon.OauthtokenPartnerId
import typings.maximMazurokGapiClientDisplayvideo.anon.PartnerIdPrettyPrint
import typings.maximMazurokGapiClientDisplayvideo.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientDisplayvideo.anon.QuotaUserResource
import typings.maximMazurokGapiClientDisplayvideo.anon.UrlOrAppId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitesResource extends StObject {
  
  /**
    * Bulk edits sites under a single channel. The operation will delete the sites provided in BulkEditSitesRequest.deleted_sites and then create the sites provided in
    * BulkEditSitesRequest.created_sites.
    */
  def bulkEdit(request: AccesstokenAlt): Request[BulkEditSitesResponse] = js.native
  def bulkEdit(request: AdvertiserIdAlt, body: BulkEditSitesRequest): Request[BulkEditSitesResponse] = js.native
  /**
    * Bulk edits sites under a single channel. The operation will delete the sites provided in BulkEditSitesRequest.deleted_sites and then create the sites provided in
    * BulkEditSitesRequest.created_sites.
    */
  def bulkEdit(request: ChannelId): Request[BulkEditSitesResponse] = js.native
  def bulkEdit(request: KeyOauthtoken, body: BulkEditSitesRequest): Request[BulkEditSitesResponse] = js.native
  
  /** Creates a site in a channel. */
  def create(request: AltCallback): Request[Site] = js.native
  def create(request: CallbackChannelId, body: Site): Request[Site] = js.native
  /** Creates a site in a channel. */
  def create(request: OauthtokenPartnerId): Request[Site] = js.native
  def create(request: PartnerIdPrettyPrint, body: Site): Request[Site] = js.native
  
  /** Deletes a site from a channel. */
  def delete(): Request[js.Object] = js.native
  def delete(request: PrettyPrintQuotaUser): Request[js.Object] = js.native
  def delete(request: UrlOrAppId): Request[js.Object] = js.native
  
  /** Lists sites in a channel. */
  def list(): Request[ListSitesResponse] = js.native
  def list(request: ChannelIdFields): Request[ListSitesResponse] = js.native
  def list(request: FieldsFilter): Request[ListSitesResponse] = js.native
  
  def replace(request: AdvertiserIdAlt, body: ReplaceSitesRequest): Request[ReplaceSitesResponse] = js.native
  /** Replaces all of the sites under a single channel. The operation will replace the sites under a channel with the sites provided in ReplaceSitesRequest.new_sites. */
  def replace(request: FieldsKey): Request[ReplaceSitesResponse] = js.native
  def replace(request: KeyOauthtoken, body: ReplaceSitesRequest): Request[ReplaceSitesResponse] = js.native
  /** Replaces all of the sites under a single channel. The operation will replace the sites under a channel with the sites provided in ReplaceSitesRequest.new_sites. */
  def replace(request: QuotaUserResource): Request[ReplaceSitesResponse] = js.native
}
