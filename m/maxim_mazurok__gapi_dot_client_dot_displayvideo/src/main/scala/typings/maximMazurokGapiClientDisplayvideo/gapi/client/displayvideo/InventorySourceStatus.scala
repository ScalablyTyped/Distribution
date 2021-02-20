package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceStatus extends StObject {
  
  /**
    * Output only. The configuration status of the inventory source. Only applicable for guaranteed inventory sources. Acceptable values are `INVENTORY_SOURCE_CONFIG_STATUS_PENDING` and
    * `INVENTORY_SOURCE_CONFIG_STATUS_COMPLETED`. An inventory source must be configured (fill in the required fields, choose creatives, and select a default campaign) before it can
    * serve.
    */
  var configStatus: js.UndefOr[String] = js.native
  
  /** The user-provided reason for pausing this inventory source. Must not exceed 100 characters. Only applicable when entity_status is set to `ENTITY_STATUS_PAUSED`. */
  var entityPauseReason: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the inventory source is servable. Acceptable values are `ENTITY_STATUS_ACTIVE`, `ENTITY_STATUS_ARCHIVED`, and `ENTITY_STATUS_PAUSED`. Default value is
    * `ENTITY_STATUS_ACTIVE`.
    */
  var entityStatus: js.UndefOr[String] = js.native
  
  /**
    * Output only. The seller-provided reason for pausing this inventory source. Only applicable for inventory sources synced directly from the publishers and when seller_status is set to
    * `ENTITY_STATUS_PAUSED`.
    */
  var sellerPauseReason: js.UndefOr[String] = js.native
  
  /**
    * Output only. The status set by the seller for the inventory source. Only applicable for inventory sources synced directly from the publishers. Acceptable values are
    * `ENTITY_STATUS_ACTIVE` and `ENTITY_STATUS_PAUSED`.
    */
  var sellerStatus: js.UndefOr[String] = js.native
}
object InventorySourceStatus {
  
  @scala.inline
  def apply(): InventorySourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceStatus]
  }
  
  @scala.inline
  implicit class InventorySourceStatusMutableBuilder[Self <: InventorySourceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigStatus(value: String): Self = StObject.set(x, "configStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigStatusUndefined: Self = StObject.set(x, "configStatus", js.undefined)
    
    @scala.inline
    def setEntityPauseReason(value: String): Self = StObject.set(x, "entityPauseReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityPauseReasonUndefined: Self = StObject.set(x, "entityPauseReason", js.undefined)
    
    @scala.inline
    def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    @scala.inline
    def setSellerPauseReason(value: String): Self = StObject.set(x, "sellerPauseReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerPauseReasonUndefined: Self = StObject.set(x, "sellerPauseReason", js.undefined)
    
    @scala.inline
    def setSellerStatus(value: String): Self = StObject.set(x, "sellerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerStatusUndefined: Self = StObject.set(x, "sellerStatus", js.undefined)
  }
}
