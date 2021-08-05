package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySourceStatus extends StObject {
  
  /**
    * Output only. The configuration status of the inventory source. Only applicable for guaranteed inventory sources. Acceptable values are `INVENTORY_SOURCE_CONFIG_STATUS_PENDING` and
    * `INVENTORY_SOURCE_CONFIG_STATUS_COMPLETED`. An inventory source must be configured (fill in the required fields, choose creatives, and select a default campaign) before it can
    * serve.
    */
  var configStatus: js.UndefOr[String] = js.undefined
  
  /** The user-provided reason for pausing this inventory source. Must not exceed 100 characters. Only applicable when entity_status is set to `ENTITY_STATUS_PAUSED`. */
  var entityPauseReason: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not the inventory source is servable. Acceptable values are `ENTITY_STATUS_ACTIVE`, `ENTITY_STATUS_ARCHIVED`, and `ENTITY_STATUS_PAUSED`. Default value is
    * `ENTITY_STATUS_ACTIVE`.
    */
  var entityStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The seller-provided reason for pausing this inventory source. Only applicable for inventory sources synced directly from the publishers and when seller_status is set to
    * `ENTITY_STATUS_PAUSED`.
    */
  var sellerPauseReason: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The status set by the seller for the inventory source. Only applicable for inventory sources synced directly from the publishers. Acceptable values are
    * `ENTITY_STATUS_ACTIVE` and `ENTITY_STATUS_PAUSED`.
    */
  var sellerStatus: js.UndefOr[String] = js.undefined
}
object InventorySourceStatus {
  
  inline def apply(): InventorySourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceStatus]
  }
  
  extension [Self <: InventorySourceStatus](x: Self) {
    
    inline def setConfigStatus(value: String): Self = StObject.set(x, "configStatus", value.asInstanceOf[js.Any])
    
    inline def setConfigStatusUndefined: Self = StObject.set(x, "configStatus", js.undefined)
    
    inline def setEntityPauseReason(value: String): Self = StObject.set(x, "entityPauseReason", value.asInstanceOf[js.Any])
    
    inline def setEntityPauseReasonUndefined: Self = StObject.set(x, "entityPauseReason", js.undefined)
    
    inline def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    inline def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    inline def setSellerPauseReason(value: String): Self = StObject.set(x, "sellerPauseReason", value.asInstanceOf[js.Any])
    
    inline def setSellerPauseReasonUndefined: Self = StObject.set(x, "sellerPauseReason", js.undefined)
    
    inline def setSellerStatus(value: String): Self = StObject.set(x, "sellerStatus", value.asInstanceOf[js.Any])
    
    inline def setSellerStatusUndefined: Self = StObject.set(x, "sellerStatus", js.undefined)
  }
}
