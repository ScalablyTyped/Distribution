package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AccesstokenAltCallbackFields
import typings.maximMazurokGapiClientDisplayvideo.anon.AltCallbackFieldsKey
import typings.maximMazurokGapiClientDisplayvideo.anon.FilterKeyOauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnersResource extends StObject {
  
  /**
    * Bulk edits targeting options under a single partner. The operation will delete the assigned targeting options provided in
    * BulkEditPartnerAssignedTargetingOptionsRequest.deleteRequests and then create the assigned targeting options provided in
    * BulkEditPartnerAssignedTargetingOptionsRequest.createRequests .
    */
  def bulkEditPartnerAssignedTargetingOptions(request: AccesstokenAltCallbackFields): Request[BulkEditPartnerAssignedTargetingOptionsResponse] = js.native
  def bulkEditPartnerAssignedTargetingOptions(request: AltCallbackFieldsKey, body: BulkEditPartnerAssignedTargetingOptionsRequest): Request[BulkEditPartnerAssignedTargetingOptionsResponse] = js.native
  
  var channels: ChannelsResource = js.native
  
  /** Gets a partner. */
  def get(): Request[Partner] = js.native
  def get(request: AltCallbackFieldsKey): Request[Partner] = js.native
  
  /** Lists partners that are accessible to the current user. The order is defined by the order_by parameter. */
  def list(): Request[ListPartnersResponse] = js.native
  def list(request: FilterKeyOauthtoken): Request[ListPartnersResponse] = js.native
  
  var targetingTypes: TargetingTypesResource = js.native
}
