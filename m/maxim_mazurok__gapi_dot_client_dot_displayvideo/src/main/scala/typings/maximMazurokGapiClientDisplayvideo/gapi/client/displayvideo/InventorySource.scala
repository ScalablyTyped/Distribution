package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySource extends StObject {
  
  /** Whether the inventory source has a guaranteed or non-guaranteed delivery. */
  var commitment: js.UndefOr[String] = js.undefined
  
  /** The creative requirements of the inventory source. Not applicable for auction packages. */
  var creativeConfigs: js.UndefOr[js.Array[CreativeConfig]] = js.undefined
  
  /** The ID in the exchange space that uniquely identifies the inventory source. Must be unique across buyers within each exchange but not necessarily unique across exchanges. */
  var dealId: js.UndefOr[String] = js.undefined
  
  /**
    * The delivery method of the inventory source. * For non-guaranteed inventory sources, the only acceptable value is `INVENTORY_SOURCE_DELIVERY_METHOD_PROGRAMMATIC`. * For guaranteed
    * inventory sources, acceptable values are `INVENTORY_SOURCE_DELIVERY_METHOD_TAG` and `INVENTORY_SOURCE_DELIVERY_METHOD_PROGRAMMATIC`.
    */
  var deliveryMethod: js.UndefOr[String] = js.undefined
  
  /** The display name of the inventory source. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The exchange to which the inventory source belongs. */
  var exchange: js.UndefOr[String] = js.undefined
  
  /** Immutable. The ID of the guaranteed order that this inventory source belongs to. Only applicable when commitment is `INVENTORY_SOURCE_COMMITMENT_GUARANTEED`. */
  var guaranteedOrderId: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the inventory source. Assigned by the system. */
  var inventorySourceId: js.UndefOr[String] = js.undefined
  
  /** Output only. The product type of the inventory source, denoting the way through which it sells inventory. */
  var inventorySourceProductType: js.UndefOr[String] = js.undefined
  
  /** Denotes the type of the inventory source. */
  var inventorySourceType: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the inventory source. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The publisher/seller name of the inventory source. */
  var publisherName: js.UndefOr[String] = js.undefined
  
  /** Required. The rate details of the inventory source. */
  var rateDetails: js.UndefOr[RateDetails] = js.undefined
  
  /** Output only. The IDs of advertisers with read-only access to the inventory source. */
  var readAdvertiserIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The IDs of partners with read-only access to the inventory source. All advertisers of partners in this field inherit read-only access to the inventory source. */
  var readPartnerIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The partner or advertisers that have read/write access to the inventory source. Output only when commitment is `INVENTORY_SOURCE_COMMITMENT_GUARANTEED`, in which case the read/write
    * accessors are inherited from the parent guaranteed order. Required when commitment is `INVENTORY_SOURCE_COMMITMENT_NON_GUARANTEED`. If commitment is
    * `INVENTORY_SOURCE_COMMITMENT_NON_GUARANTEED` and a partner is set in this field, all advertisers under this partner will automatically have read-only access to the inventory source.
    * These advertisers will not be included in read_advertiser_ids.
    */
  var readWriteAccessors: js.UndefOr[InventorySourceAccessors] = js.undefined
  
  /** The status settings of the inventory source. */
  var status: js.UndefOr[InventorySourceStatus] = js.undefined
  
  /** Immutable. The unique ID of the sub-site property assigned to this inventory source. */
  var subSitePropertyId: js.UndefOr[String] = js.undefined
  
  /** The time range when this inventory source starts and stops serving. */
  var timeRange: js.UndefOr[TimeRange] = js.undefined
  
  /** Output only. The timestamp when the inventory source was last updated. Assigned by the system. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object InventorySource {
  
  inline def apply(): InventorySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventorySource] (val x: Self) extends AnyVal {
    
    inline def setCommitment(value: String): Self = StObject.set(x, "commitment", value.asInstanceOf[js.Any])
    
    inline def setCommitmentUndefined: Self = StObject.set(x, "commitment", js.undefined)
    
    inline def setCreativeConfigs(value: js.Array[CreativeConfig]): Self = StObject.set(x, "creativeConfigs", value.asInstanceOf[js.Any])
    
    inline def setCreativeConfigsUndefined: Self = StObject.set(x, "creativeConfigs", js.undefined)
    
    inline def setCreativeConfigsVarargs(value: CreativeConfig*): Self = StObject.set(x, "creativeConfigs", js.Array(value*))
    
    inline def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    inline def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    inline def setDeliveryMethod(value: String): Self = StObject.set(x, "deliveryMethod", value.asInstanceOf[js.Any])
    
    inline def setDeliveryMethodUndefined: Self = StObject.set(x, "deliveryMethod", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setGuaranteedOrderId(value: String): Self = StObject.set(x, "guaranteedOrderId", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedOrderIdUndefined: Self = StObject.set(x, "guaranteedOrderId", js.undefined)
    
    inline def setInventorySourceId(value: String): Self = StObject.set(x, "inventorySourceId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceIdUndefined: Self = StObject.set(x, "inventorySourceId", js.undefined)
    
    inline def setInventorySourceProductType(value: String): Self = StObject.set(x, "inventorySourceProductType", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceProductTypeUndefined: Self = StObject.set(x, "inventorySourceProductType", js.undefined)
    
    inline def setInventorySourceType(value: String): Self = StObject.set(x, "inventorySourceType", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceTypeUndefined: Self = StObject.set(x, "inventorySourceType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
    
    inline def setRateDetails(value: RateDetails): Self = StObject.set(x, "rateDetails", value.asInstanceOf[js.Any])
    
    inline def setRateDetailsUndefined: Self = StObject.set(x, "rateDetails", js.undefined)
    
    inline def setReadAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "readAdvertiserIds", value.asInstanceOf[js.Any])
    
    inline def setReadAdvertiserIdsUndefined: Self = StObject.set(x, "readAdvertiserIds", js.undefined)
    
    inline def setReadAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "readAdvertiserIds", js.Array(value*))
    
    inline def setReadPartnerIds(value: js.Array[String]): Self = StObject.set(x, "readPartnerIds", value.asInstanceOf[js.Any])
    
    inline def setReadPartnerIdsUndefined: Self = StObject.set(x, "readPartnerIds", js.undefined)
    
    inline def setReadPartnerIdsVarargs(value: String*): Self = StObject.set(x, "readPartnerIds", js.Array(value*))
    
    inline def setReadWriteAccessors(value: InventorySourceAccessors): Self = StObject.set(x, "readWriteAccessors", value.asInstanceOf[js.Any])
    
    inline def setReadWriteAccessorsUndefined: Self = StObject.set(x, "readWriteAccessors", js.undefined)
    
    inline def setStatus(value: InventorySourceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubSitePropertyId(value: String): Self = StObject.set(x, "subSitePropertyId", value.asInstanceOf[js.Any])
    
    inline def setSubSitePropertyIdUndefined: Self = StObject.set(x, "subSitePropertyId", js.undefined)
    
    inline def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
