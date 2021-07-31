package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.InventorySourceId
import typings.maximMazurokGapiClientDisplayvideo.anon.PartnerIdPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourcesResource extends StObject {
  
  /** Gets an inventory source. */
  def get(): Request[InventorySource] = js.native
  def get(request: InventorySourceId): Request[InventorySource] = js.native
  
  /**
    * Lists inventory sources that are accessible to the current user. The order is defined by the order_by parameter. If a filter by entity_status is not specified, inventory sources
    * with entity status `ENTITY_STATUS_ARCHIVED` will not be included in the results.
    */
  def list(): Request[ListInventorySourcesResponse] = js.native
  def list(request: PartnerIdPrettyPrint): Request[ListInventorySourcesResponse] = js.native
}
