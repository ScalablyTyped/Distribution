package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceStatus extends js.Object {
  
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
  implicit class InventorySourceStatusOps[Self <: InventorySourceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigStatus(value: String): Self = this.set("configStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigStatus: Self = this.set("configStatus", js.undefined)
    
    @scala.inline
    def setEntityPauseReason(value: String): Self = this.set("entityPauseReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityPauseReason: Self = this.set("entityPauseReason", js.undefined)
    
    @scala.inline
    def setEntityStatus(value: String): Self = this.set("entityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityStatus: Self = this.set("entityStatus", js.undefined)
    
    @scala.inline
    def setSellerPauseReason(value: String): Self = this.set("sellerPauseReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerPauseReason: Self = this.set("sellerPauseReason", js.undefined)
    
    @scala.inline
    def setSellerStatus(value: String): Self = this.set("sellerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerStatus: Self = this.set("sellerStatus", js.undefined)
  }
}
