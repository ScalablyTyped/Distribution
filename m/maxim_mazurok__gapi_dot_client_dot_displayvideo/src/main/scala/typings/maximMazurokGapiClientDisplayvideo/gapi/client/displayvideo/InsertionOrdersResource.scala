package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AccesstokenAdvertiserIdAlt
import typings.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typings.maximMazurokGapiClientDisplayvideo.anon.AdvertiserIdAltCallback
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsInsertionOrderId
import typings.maximMazurokGapiClientDisplayvideo.anon.InsertionOrderId
import typings.maximMazurokGapiClientDisplayvideo.anon.InsertionOrderIdKey
import typings.maximMazurokGapiClientDisplayvideo.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertionOrdersResource extends StObject {
  
  /** Lists assigned targeting options of an insertion order across targeting types. */
  def bulkListInsertionOrderAssignedTargetingOptions(): Request[BulkListInsertionOrderAssignedTargetingOptionsResponse] = js.native
  def bulkListInsertionOrderAssignedTargetingOptions(request: InsertionOrderId): Request[BulkListInsertionOrderAssignedTargetingOptionsResponse] = js.native
  
  /** Creates a new insertion order. Returns the newly created insertion order if successful. */
  def create(request: AccesstokenAdvertiserIdAlt): Request[InsertionOrder] = js.native
  def create(request: AdvertiserId, body: InsertionOrder): Request[InsertionOrder] = js.native
  
  /**
    * Deletes an insertion order. Returns error code `NOT_FOUND` if the insertion order does not exist. The insertion order should be archived first, i.e. set entity_status to
    * `ENTITY_STATUS_ARCHIVED`, to be able to delete it.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: FieldsInsertionOrderId): Request[js.Object] = js.native
  
  /** Gets an insertion order. Returns error code `NOT_FOUND` if the insertion order does not exist. */
  def get(): Request[InsertionOrder] = js.native
  def get(request: FieldsInsertionOrderId): Request[InsertionOrder] = js.native
  
  /**
    * Lists insertion orders in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, insertion orders with
    * `ENTITY_STATUS_ARCHIVED` will not be included in the results.
    */
  def list(): Request[ListInsertionOrdersResponse] = js.native
  def list(request: PageToken): Request[ListInsertionOrdersResponse] = js.native
  
  def patch(request: AdvertiserIdAltCallback, body: InsertionOrder): Request[InsertionOrder] = js.native
  /** Updates an existing insertion order. Returns the updated insertion order if successful. */
  def patch(request: InsertionOrderIdKey): Request[InsertionOrder] = js.native
  
  var targetingTypes: TargetingTypesResource = js.native
}
