package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdFilter extends StObject {
  
  /** YouTube Ads to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var adGroupAdIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** YouTube Ad Groups to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var adGroupIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Campaigns to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var campaignIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Insertion Orders to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var insertionOrderIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Line Items to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var lineItemIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Media Products to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var mediaProductIds: js.UndefOr[js.Array[String]] = js.undefined
}
object IdFilter {
  
  inline def apply(): IdFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdFilter] (val x: Self) extends AnyVal {
    
    inline def setAdGroupAdIds(value: js.Array[String]): Self = StObject.set(x, "adGroupAdIds", value.asInstanceOf[js.Any])
    
    inline def setAdGroupAdIdsUndefined: Self = StObject.set(x, "adGroupAdIds", js.undefined)
    
    inline def setAdGroupAdIdsVarargs(value: String*): Self = StObject.set(x, "adGroupAdIds", js.Array(value*))
    
    inline def setAdGroupIds(value: js.Array[String]): Self = StObject.set(x, "adGroupIds", value.asInstanceOf[js.Any])
    
    inline def setAdGroupIdsUndefined: Self = StObject.set(x, "adGroupIds", js.undefined)
    
    inline def setAdGroupIdsVarargs(value: String*): Self = StObject.set(x, "adGroupIds", js.Array(value*))
    
    inline def setCampaignIds(value: js.Array[String]): Self = StObject.set(x, "campaignIds", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdsUndefined: Self = StObject.set(x, "campaignIds", js.undefined)
    
    inline def setCampaignIdsVarargs(value: String*): Self = StObject.set(x, "campaignIds", js.Array(value*))
    
    inline def setInsertionOrderIds(value: js.Array[String]): Self = StObject.set(x, "insertionOrderIds", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrderIdsUndefined: Self = StObject.set(x, "insertionOrderIds", js.undefined)
    
    inline def setInsertionOrderIdsVarargs(value: String*): Self = StObject.set(x, "insertionOrderIds", js.Array(value*))
    
    inline def setLineItemIds(value: js.Array[String]): Self = StObject.set(x, "lineItemIds", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdsUndefined: Self = StObject.set(x, "lineItemIds", js.undefined)
    
    inline def setLineItemIdsVarargs(value: String*): Self = StObject.set(x, "lineItemIds", js.Array(value*))
    
    inline def setMediaProductIds(value: js.Array[String]): Self = StObject.set(x, "mediaProductIds", value.asInstanceOf[js.Any])
    
    inline def setMediaProductIdsUndefined: Self = StObject.set(x, "mediaProductIds", js.undefined)
    
    inline def setMediaProductIdsVarargs(value: String*): Self = StObject.set(x, "mediaProductIds", js.Array(value*))
  }
}
