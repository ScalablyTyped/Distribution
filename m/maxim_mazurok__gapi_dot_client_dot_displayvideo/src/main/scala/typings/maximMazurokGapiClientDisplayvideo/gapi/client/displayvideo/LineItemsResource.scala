package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typings.maximMazurokGapiClientDisplayvideo.anon.Fields
import typings.maximMazurokGapiClientDisplayvideo.anon.KeyLineItemId
import typings.maximMazurokGapiClientDisplayvideo.anon.LineItemIdOauthtoken
import typings.maximMazurokGapiClientDisplayvideo.anon.OrderByPageSize
import typings.maximMazurokGapiClientDisplayvideo.anon.QuotaUserResource
import typings.maximMazurokGapiClientDisplayvideo.anon.QuotaUserUpdateMask
import typings.maximMazurokGapiClientDisplayvideo.anon.ResourceUpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineItemsResource extends StObject {
  
  /**
    * Bulk edits targeting options under a single line item. The operation will delete the assigned targeting options provided in
    * BulkEditLineItemAssignedTargetingOptionsRequest.delete_requests and then create the assigned targeting options provided in
    * BulkEditLineItemAssignedTargetingOptionsRequest.create_requests .
    */
  def bulkEditLineItemAssignedTargetingOptions(request: KeyLineItemId): Request[BulkEditLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkEditLineItemAssignedTargetingOptions(request: LineItemIdOauthtoken, body: BulkEditLineItemAssignedTargetingOptionsRequest): Request[BulkEditLineItemAssignedTargetingOptionsResponse] = js.native
  
  /** Lists assigned targeting options of a line item across targeting types. */
  def bulkListLineItemAssignedTargetingOptions(): Request[BulkListLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkListLineItemAssignedTargetingOptions(request: OrderByPageSize): Request[BulkListLineItemAssignedTargetingOptionsResponse] = js.native
  
  def create(request: AdvertiserId, body: LineItem): Request[LineItem] = js.native
  /** Creates a new line item. Returns the newly created line item if successful. */
  def create(request: QuotaUserResource): Request[LineItem] = js.native
  
  /**
    * Deletes a line item. Returns error code `NOT_FOUND` if the line item does not exist. The line item should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, to
    * be able to delete it.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: LineItemIdOauthtoken): Request[js.Object] = js.native
  
  /** Gets a line item. */
  def get(): Request[LineItem] = js.native
  def get(request: LineItemIdOauthtoken): Request[LineItem] = js.native
  
  /**
    * Lists line items in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, line items with `ENTITY_STATUS_ARCHIVED` will not
    * be included in the results.
    */
  def list(): Request[ListLineItemsResponse] = js.native
  def list(request: Fields): Request[ListLineItemsResponse] = js.native
  
  def patch(request: QuotaUserUpdateMask, body: LineItem): Request[LineItem] = js.native
  /** Updates an existing line item. Returns the updated line item if successful. */
  def patch(request: ResourceUpdateMask): Request[LineItem] = js.native
  
  var targetingTypes: TargetingTypesResource = js.native
}
