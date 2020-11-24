package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typings.maximMazurokGapiClientDisplayvideo.anon.Fields
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsInsertionOrderId
import typings.maximMazurokGapiClientDisplayvideo.anon.InsertionOrderId
import typings.maximMazurokGapiClientDisplayvideo.anon.InsertionOrderIdKey
import typings.maximMazurokGapiClientDisplayvideo.anon.OauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertionOrdersResource extends js.Object {
  
  def create(request: AdvertiserId, body: InsertionOrder): Request[InsertionOrder] = js.native
  /** Creates a new insertion order. Returns the newly created insertion order if successful. */
  def create(request: OauthtokenPrettyPrint): Request[InsertionOrder] = js.native
  
  /**
    * Deletes an insertion order. Returns error code `NOT_FOUND` if the insertion order does not exist. The insertion order should be archived first, i.e. set entity_status to
    * `ENTITY_STATUS_ARCHIVED`, to be able to delete it.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: InsertionOrderId): Request[js.Object] = js.native
  
  /** Gets an insertion order. Returns error code `NOT_FOUND` if the insertion order does not exist. */
  def get(): Request[InsertionOrder] = js.native
  def get(request: InsertionOrderId): Request[InsertionOrder] = js.native
  
  /**
    * Lists insertion orders in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, insertion orders with
    * `ENTITY_STATUS_ARCHIVED` will not be included in the results.
    */
  def list(): Request[ListInsertionOrdersResponse] = js.native
  def list(request: Fields): Request[ListInsertionOrdersResponse] = js.native
  
  /** Updates an existing insertion order. Returns the updated insertion order if successful. */
  def patch(request: FieldsInsertionOrderId): Request[InsertionOrder] = js.native
  def patch(request: InsertionOrderIdKey, body: InsertionOrder): Request[InsertionOrder] = js.native
}
