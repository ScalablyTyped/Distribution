package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySource extends StObject {
  
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
  implicit class InventorySourceMutableBuilder[Self <: InventorySource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitment(value: String): Self = StObject.set(x, "commitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitmentUndefined: Self = StObject.set(x, "commitment", js.undefined)
    
    @scala.inline
    def setCreativeConfigs(value: js.Array[CreativeConfig]): Self = StObject.set(x, "creativeConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeConfigsUndefined: Self = StObject.set(x, "creativeConfigs", js.undefined)
    
    @scala.inline
    def setCreativeConfigsVarargs(value: CreativeConfig*): Self = StObject.set(x, "creativeConfigs", js.Array(value :_*))
    
    @scala.inline
    def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    @scala.inline
    def setDeliveryMethod(value: String): Self = StObject.set(x, "deliveryMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryMethodUndefined: Self = StObject.set(x, "deliveryMethod", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    @scala.inline
    def setInventorySourceId(value: String): Self = StObject.set(x, "inventorySourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourceIdUndefined: Self = StObject.set(x, "inventorySourceId", js.undefined)
    
    @scala.inline
    def setInventorySourceType(value: String): Self = StObject.set(x, "inventorySourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourceTypeUndefined: Self = StObject.set(x, "inventorySourceType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
    
    @scala.inline
    def setRateDetails(value: RateDetails): Self = StObject.set(x, "rateDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateDetailsUndefined: Self = StObject.set(x, "rateDetails", js.undefined)
    
    @scala.inline
    def setStatus(value: InventorySourceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
