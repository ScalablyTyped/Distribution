package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typings.maximMazurokGapiClientDisplayvideo.anon.AltCallbackFields
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsKey
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsKeyLineItemId
import typings.maximMazurokGapiClientDisplayvideo.anon.KeyLineItemId
import typings.maximMazurokGapiClientDisplayvideo.anon.KeyLineItemIdOauthtoken
import typings.maximMazurokGapiClientDisplayvideo.anon.LineItemIdOauthtoken
import typings.maximMazurokGapiClientDisplayvideo.anon.OrderByPageSize
import typings.maximMazurokGapiClientDisplayvideo.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineItemsResource extends StObject {
  
  /**
    * Bulk edits targeting options under a single line item. The operation will delete the assigned targeting options provided in
    * BulkEditLineItemAssignedTargetingOptionsRequest.delete_requests and then create the assigned targeting options provided in
    * BulkEditLineItemAssignedTargetingOptionsRequest.create_requests. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: *
    * BulkEditLineItemAssignedTargetingOptions * UpdateLineItem * CreateLineItemAssignedTargetingOption * DeleteLineItemAssignedTargetingOption
    */
  def bulkEditLineItemAssignedTargetingOptions(request: KeyLineItemId): Request[BulkEditLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkEditLineItemAssignedTargetingOptions(request: LineItemIdOauthtoken, body: BulkEditLineItemAssignedTargetingOptionsRequest): Request[BulkEditLineItemAssignedTargetingOptionsResponse] = js.native
  
  /** Lists assigned targeting options of a line item across targeting types. */
  def bulkListLineItemAssignedTargetingOptions(): Request[BulkListLineItemAssignedTargetingOptionsResponse] = js.native
  def bulkListLineItemAssignedTargetingOptions(request: OrderByPageSize): Request[BulkListLineItemAssignedTargetingOptionsResponse] = js.native
  
  def create(request: AdvertiserId, body: LineItem): Request[LineItem] = js.native
  /** Creates a new line item. Returns the newly created line item if successful. */
  def create(request: AltCallbackFields): Request[LineItem] = js.native
  
  /**
    * Deletes a line item. Returns error code `NOT_FOUND` if the line item does not exist. The line item should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, to
    * be able to delete it.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: LineItemIdOauthtoken): Request[js.Object] = js.native
  
  def generateDefault(request: AdvertiserId, body: GenerateDefaultLineItemRequest): Request[LineItem] = js.native
  /**
    * Creates a new line item with settings (including targeting) inherited from the insertion order and an `ENTITY_STATUS_DRAFT` entity_status. Returns the newly created line item if
    * successful. There are default values based on the three fields: * The insertion order's insertion_order_type * The insertion order's automation_type * The given line_item_type
    */
  def generateDefault(request: CallbackFieldsKey): Request[LineItem] = js.native
  
  /** Gets a line item. */
  def get(): Request[LineItem] = js.native
  def get(request: LineItemIdOauthtoken): Request[LineItem] = js.native
  
  /**
    * Lists line items in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, line items with `ENTITY_STATUS_ARCHIVED` will not
    * be included in the results.
    */
  def list(): Request[ListLineItemsResponse] = js.native
  def list(request: PageToken): Request[ListLineItemsResponse] = js.native
  
  /**
    * Updates an existing line item. Returns the updated line item if successful. Requests to this endpoint cannot be made concurrently with the following requests updating the same line
    * item: * BulkEditLineItemAssignedTargetingOptions * UpdateLineItem * CreateLineItemAssignedTargetingOption * DeleteLineItemAssignedTargetingOption
    */
  def patch(request: FieldsKeyLineItemId): Request[LineItem] = js.native
  def patch(request: KeyLineItemIdOauthtoken, body: LineItem): Request[LineItem] = js.native
  
  var targetingTypes: TargetingTypesResource = js.native
}
