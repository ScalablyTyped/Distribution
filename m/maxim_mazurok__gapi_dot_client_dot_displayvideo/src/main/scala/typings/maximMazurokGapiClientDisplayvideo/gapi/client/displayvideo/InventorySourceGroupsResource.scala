package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsInventorySourceGroupId
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsInventorySourceGroupIdKey
import typings.maximMazurokGapiClientDisplayvideo.anon.InventorySourceGroupIdKeyOauthtoken
import typings.maximMazurokGapiClientDisplayvideo.anon.KeyOauthtokenPartnerId
import typings.maximMazurokGapiClientDisplayvideo.anon.OauthtokenPartnerIdPrettyPrint
import typings.maximMazurokGapiClientDisplayvideo.anon.PartnerIdPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceGroupsResource extends js.Object {
  
  var assignedInventorySources: AssignedInventorySourcesResource = js.native
  
  /** Creates a new inventory source group. Returns the newly created inventory source group if successful. */
  def create(request: KeyOauthtokenPartnerId): Request[InventorySourceGroup] = js.native
  def create(request: OauthtokenPartnerIdPrettyPrint, body: InventorySourceGroup): Request[InventorySourceGroup] = js.native
  
  /** Deletes an inventory source group. */
  def delete(): Request[js.Object] = js.native
  def delete(request: CallbackFieldsInventorySourceGroupId): Request[js.Object] = js.native
  
  /** Gets an inventory source group. */
  def get(): Request[InventorySourceGroup] = js.native
  def get(request: CallbackFieldsInventorySourceGroupId): Request[InventorySourceGroup] = js.native
  
  /** Lists inventory source groups that are accessible to the current user. The order is defined by the order_by parameter. */
  def list(): Request[ListInventorySourceGroupsResponse] = js.native
  def list(request: PartnerIdPrettyPrint): Request[ListInventorySourceGroupsResponse] = js.native
  
  /** Updates an inventory source group. Returns the updated inventory source group if successful. */
  def patch(request: FieldsInventorySourceGroupIdKey): Request[InventorySourceGroup] = js.native
  def patch(request: InventorySourceGroupIdKeyOauthtoken, body: InventorySourceGroup): Request[InventorySourceGroup] = js.native
}
