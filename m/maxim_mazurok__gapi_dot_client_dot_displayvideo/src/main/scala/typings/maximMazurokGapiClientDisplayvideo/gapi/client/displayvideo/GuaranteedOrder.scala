package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuaranteedOrder extends StObject {
  
  /**
    * Output only. The ID of default advertiser of the guaranteed order. The default advertiser is either the read_write_advertiser_id or, if that is not set, the first advertiser listed
    * in read_advertiser_ids. Otherwise, there is no default advertiser.
    */
  var defaultAdvertiserId: js.UndefOr[String] = js.undefined
  
  /** The ID of the default campaign that is assigned to the guaranteed order. The default campaign must belong to the default advertiser. */
  var defaultCampaignId: js.UndefOr[String] = js.undefined
  
  /** Required. The display name of the guaranteed order. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The exchange where the guaranteed order originated. */
  var exchange: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique identifier of the guaranteed order. The guaranteed order IDs have the format `{exchange}-{legacy_guaranteed_order_id}`. */
  var guaranteedOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The legacy ID of the guaranteed order. Assigned by the original exchange. The legacy ID is unique within one exchange, but is not guaranteed to be unique across all
    * guaranteed orders. This ID is used in SDF and UI.
    */
  var legacyGuaranteedOrderId: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the guaranteed order. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. The publisher name of the guaranteed order. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var publisherName: js.UndefOr[String] = js.undefined
  
  /** Whether all advertisers of read_write_partner_id have read access to the guaranteed order. Only applicable if read_write_partner_id is set. If True, overrides read_advertiser_ids. */
  var readAccessInherited: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of advertisers with read access to the guaranteed order. This field must not include the advertiser assigned to read_write_advertiser_id if it is set. All advertisers in
    * this field must belong to read_write_partner_id or the same partner as read_write_advertiser_id.
    */
  var readAdvertiserIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The advertiser with read/write access to the guaranteed order. This is also the default advertiser of the guaranteed order. */
  var readWriteAdvertiserId: js.UndefOr[String] = js.undefined
  
  /** The partner with read/write access to the guaranteed order. */
  var readWritePartnerId: js.UndefOr[String] = js.undefined
  
  /** The status settings of the guaranteed order. */
  var status: js.UndefOr[GuaranteedOrderStatus] = js.undefined
  
  /** Output only. The timestamp when the guaranteed order was last updated. Assigned by the system. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GuaranteedOrder {
  
  inline def apply(): GuaranteedOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuaranteedOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GuaranteedOrder] (val x: Self) extends AnyVal {
    
    inline def setDefaultAdvertiserId(value: String): Self = StObject.set(x, "defaultAdvertiserId", value.asInstanceOf[js.Any])
    
    inline def setDefaultAdvertiserIdUndefined: Self = StObject.set(x, "defaultAdvertiserId", js.undefined)
    
    inline def setDefaultCampaignId(value: String): Self = StObject.set(x, "defaultCampaignId", value.asInstanceOf[js.Any])
    
    inline def setDefaultCampaignIdUndefined: Self = StObject.set(x, "defaultCampaignId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setGuaranteedOrderId(value: String): Self = StObject.set(x, "guaranteedOrderId", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedOrderIdUndefined: Self = StObject.set(x, "guaranteedOrderId", js.undefined)
    
    inline def setLegacyGuaranteedOrderId(value: String): Self = StObject.set(x, "legacyGuaranteedOrderId", value.asInstanceOf[js.Any])
    
    inline def setLegacyGuaranteedOrderIdUndefined: Self = StObject.set(x, "legacyGuaranteedOrderId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
    
    inline def setReadAccessInherited(value: Boolean): Self = StObject.set(x, "readAccessInherited", value.asInstanceOf[js.Any])
    
    inline def setReadAccessInheritedUndefined: Self = StObject.set(x, "readAccessInherited", js.undefined)
    
    inline def setReadAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "readAdvertiserIds", value.asInstanceOf[js.Any])
    
    inline def setReadAdvertiserIdsUndefined: Self = StObject.set(x, "readAdvertiserIds", js.undefined)
    
    inline def setReadAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "readAdvertiserIds", js.Array(value*))
    
    inline def setReadWriteAdvertiserId(value: String): Self = StObject.set(x, "readWriteAdvertiserId", value.asInstanceOf[js.Any])
    
    inline def setReadWriteAdvertiserIdUndefined: Self = StObject.set(x, "readWriteAdvertiserId", js.undefined)
    
    inline def setReadWritePartnerId(value: String): Self = StObject.set(x, "readWritePartnerId", value.asInstanceOf[js.Any])
    
    inline def setReadWritePartnerIdUndefined: Self = StObject.set(x, "readWritePartnerId", js.undefined)
    
    inline def setStatus(value: GuaranteedOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
