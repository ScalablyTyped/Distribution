package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AccesstokenAdvertiserIdAltCallback
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsFilter
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsInventorySourceId
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsInventorySourceId
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsInventorySourceIdKey
import typings.maximMazurokGapiClientDisplayvideo.anon.InventorySourceId
import typings.maximMazurokGapiClientDisplayvideo.anon.InventorySourceIdKey
import typings.maximMazurokGapiClientDisplayvideo.anon.OauthtokenPartnerIdPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourcesResource extends StObject {
  
  /** Creates a new inventory source. Returns the newly created inventory source if successful. */
  def create(request: AccesstokenAdvertiserIdAltCallback): Request[InventorySource] = js.native
  def create(request: OauthtokenPartnerIdPrettyPrint, body: InventorySource): Request[InventorySource] = js.native
  
  def editInventorySourceReadWriteAccessors(request: FieldsInventorySourceId, body: EditInventorySourceReadWriteAccessorsRequest): Request[InventorySourceAccessors] = js.native
  /** Edits read/write accessors of an inventory source. Returns the updated read_write_accessors for the inventory source. */
  def editInventorySourceReadWriteAccessors(request: InventorySourceId): Request[InventorySourceAccessors] = js.native
  
  /** Gets an inventory source. */
  def get(): Request[InventorySource] = js.native
  def get(request: InventorySourceIdKey): Request[InventorySource] = js.native
  
  /**
    * Lists inventory sources that are accessible to the current user. The order is defined by the order_by parameter. If a filter by entity_status is not specified, inventory sources
    * with entity status `ENTITY_STATUS_ARCHIVED` will not be included in the results.
    */
  def list(): Request[ListInventorySourcesResponse] = js.native
  def list(request: CallbackFieldsFilter): Request[ListInventorySourcesResponse] = js.native
  
  /** Updates an existing inventory source. Returns the updated inventory source if successful. */
  def patch(request: CallbackFieldsInventorySourceId): Request[InventorySource] = js.native
  def patch(request: FieldsInventorySourceIdKey, body: InventorySource): Request[InventorySource] = js.native
}
