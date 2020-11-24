package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySource extends js.Object {
  
  /** Whether the inventory source has a guaranteed or non-guaranteed delivery. */
  var commitment: js.UndefOr[String] = js.native
  
  /** The creative requirements of the inventory source. Not applicable for auction packages. */
  var creativeConfigs: js.UndefOr[js.Array[CreativeConfig]] = js.native
  
  /** The ID in the exchange space that uniquely identifies the inventory source. Must be unique across buyers within each exchange but not necessarily unique across exchanges. */
  var dealId: js.UndefOr[String] = js.native
  
  /**
    * The delivery method of the inventory source. * For non-guaranteed inventory sources, the only acceptable value is `INVENTORY_SOURCE_DELIVERY_METHOD_PROGRAMMATIC`. * For guaranteed
    * inventory sources, acceptable values are `INVENTORY_SOURCE_DELIVERY_METHOD_TAG` and `INVENTORY_SOURCE_DELIVERY_METHOD_PROGRAMMATIC`.
    */
  var deliveryMethod: js.UndefOr[String] = js.native
  
  /** The display name of the inventory source. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The exchange to which the inventory source belongs. */
  var exchange: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the inventory source. Assigned by the system. */
  var inventorySourceId: js.UndefOr[String] = js.native
  
  /** Denotes the type of the inventory source. */
  var inventorySourceType: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the inventory source. */
  var name: js.UndefOr[String] = js.native
  
  /** The publisher/seller name of the inventory source. */
  var publisherName: js.UndefOr[String] = js.native
  
  /** Required. The rate details of the inventory source. */
  var rateDetails: js.UndefOr[RateDetails] = js.native
  
  /** The status settings of the inventory source. */
  var status: js.UndefOr[InventorySourceStatus] = js.native
  
  /** The time range when this inventory source starts and stops serving. */
  var timeRange: js.UndefOr[TimeRange] = js.native
  
  /** Output only. The timestamp when the inventory source was last updated. Assigned by the system. */
  var updateTime: js.UndefOr[String] = js.native
}
object InventorySource {
  
  @scala.inline
  def apply(): InventorySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySource]
  }
  
  @scala.inline
  implicit class InventorySourceOps[Self <: InventorySource] (val x: Self) extends AnyVal {
    
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
    def setCommitment(value: String): Self = this.set("commitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitment: Self = this.set("commitment", js.undefined)
    
    @scala.inline
    def setCreativeConfigsVarargs(value: CreativeConfig*): Self = this.set("creativeConfigs", js.Array(value :_*))
    
    @scala.inline
    def setCreativeConfigs(value: js.Array[CreativeConfig]): Self = this.set("creativeConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeConfigs: Self = this.set("creativeConfigs", js.undefined)
    
    @scala.inline
    def setDealId(value: String): Self = this.set("dealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealId: Self = this.set("dealId", js.undefined)
    
    @scala.inline
    def setDeliveryMethod(value: String): Self = this.set("deliveryMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryMethod: Self = this.set("deliveryMethod", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange: Self = this.set("exchange", js.undefined)
    
    @scala.inline
    def setInventorySourceId(value: String): Self = this.set("inventorySourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceId: Self = this.set("inventorySourceId", js.undefined)
    
    @scala.inline
    def setInventorySourceType(value: String): Self = this.set("inventorySourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceType: Self = this.set("inventorySourceType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPublisherName(value: String): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherName: Self = this.set("publisherName", js.undefined)
    
    @scala.inline
    def setRateDetails(value: RateDetails): Self = this.set("rateDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateDetails: Self = this.set("rateDetails", js.undefined)
    
    @scala.inline
    def setStatus(value: InventorySourceStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTimeRange(value: TimeRange): Self = this.set("timeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRange: Self = this.set("timeRange", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
