package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsFilter
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsGuaranteedOrderId
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsGuaranteedOrderId
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsGuaranteedOrderIdKey
import typings.maximMazurokGapiClientDisplayvideo.anon.GuaranteedOrderId
import typings.maximMazurokGapiClientDisplayvideo.anon.GuaranteedOrderIdKey
import typings.maximMazurokGapiClientDisplayvideo.anon.KeyOauthtokenPartnerId
import typings.maximMazurokGapiClientDisplayvideo.anon.OauthtokenPartnerIdPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuaranteedOrdersResource extends StObject {
  
  /** Creates a new guaranteed order. Returns the newly created guaranteed order if successful. */
  def create(request: KeyOauthtokenPartnerId): Request[GuaranteedOrder] = js.native
  def create(request: OauthtokenPartnerIdPrettyPrint, body: GuaranteedOrder): Request[GuaranteedOrder] = js.native
  
  def editGuaranteedOrderReadAccessors(request: FieldsGuaranteedOrderId, body: EditGuaranteedOrderReadAccessorsRequest): Request[EditGuaranteedOrderReadAccessorsResponse] = js.native
  /** Edits read advertisers of a guaranteed order. */
  def editGuaranteedOrderReadAccessors(request: GuaranteedOrderId): Request[EditGuaranteedOrderReadAccessorsResponse] = js.native
  
  /** Gets a guaranteed order. */
  def get(): Request[GuaranteedOrder] = js.native
  def get(request: GuaranteedOrderIdKey): Request[GuaranteedOrder] = js.native
  
  /**
    * Lists guaranteed orders that are accessible to the current user. The order is defined by the order_by parameter. If a filter by entity_status is not specified, guaranteed orders
    * with entity status `ENTITY_STATUS_ARCHIVED` will not be included in the results.
    */
  def list(): Request[ListGuaranteedOrdersResponse] = js.native
  def list(request: CallbackFieldsFilter): Request[ListGuaranteedOrdersResponse] = js.native
  
  /** Updates an existing guaranteed order. Returns the updated guaranteed order if successful. */
  def patch(request: CallbackFieldsGuaranteedOrderId): Request[GuaranteedOrder] = js.native
  def patch(request: FieldsGuaranteedOrderIdKey, body: GuaranteedOrder): Request[GuaranteedOrder] = js.native
}
