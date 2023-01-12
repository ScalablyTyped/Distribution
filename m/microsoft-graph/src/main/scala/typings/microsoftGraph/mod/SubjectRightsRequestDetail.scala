package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectRightsRequestDetail extends StObject {
  
  // Count of items that are excluded from the request.
  var excludedItemCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Count of items per insight.
  var insightCounts: js.UndefOr[NullableOption[js.Array[KeyValuePair]]] = js.undefined
  
  // Count of items found.
  var itemCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Count of item that need review.
  var itemNeedReview: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Count of items per product, such as Exchange, SharePoint, OneDrive, and Teams.
  var productItemCounts: js.UndefOr[NullableOption[js.Array[KeyValuePair]]] = js.undefined
  
  // Count of items signed off by the administrator.
  var signedOffItemCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Total item size in bytes.
  var totalItemSize: js.UndefOr[NullableOption[Double]] = js.undefined
}
object SubjectRightsRequestDetail {
  
  inline def apply(): SubjectRightsRequestDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectRightsRequestDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubjectRightsRequestDetail] (val x: Self) extends AnyVal {
    
    inline def setExcludedItemCount(value: NullableOption[Double]): Self = StObject.set(x, "excludedItemCount", value.asInstanceOf[js.Any])
    
    inline def setExcludedItemCountNull: Self = StObject.set(x, "excludedItemCount", null)
    
    inline def setExcludedItemCountUndefined: Self = StObject.set(x, "excludedItemCount", js.undefined)
    
    inline def setInsightCounts(value: NullableOption[js.Array[KeyValuePair]]): Self = StObject.set(x, "insightCounts", value.asInstanceOf[js.Any])
    
    inline def setInsightCountsNull: Self = StObject.set(x, "insightCounts", null)
    
    inline def setInsightCountsUndefined: Self = StObject.set(x, "insightCounts", js.undefined)
    
    inline def setInsightCountsVarargs(value: KeyValuePair*): Self = StObject.set(x, "insightCounts", js.Array(value*))
    
    inline def setItemCount(value: NullableOption[Double]): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountNull: Self = StObject.set(x, "itemCount", null)
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    inline def setItemNeedReview(value: NullableOption[Double]): Self = StObject.set(x, "itemNeedReview", value.asInstanceOf[js.Any])
    
    inline def setItemNeedReviewNull: Self = StObject.set(x, "itemNeedReview", null)
    
    inline def setItemNeedReviewUndefined: Self = StObject.set(x, "itemNeedReview", js.undefined)
    
    inline def setProductItemCounts(value: NullableOption[js.Array[KeyValuePair]]): Self = StObject.set(x, "productItemCounts", value.asInstanceOf[js.Any])
    
    inline def setProductItemCountsNull: Self = StObject.set(x, "productItemCounts", null)
    
    inline def setProductItemCountsUndefined: Self = StObject.set(x, "productItemCounts", js.undefined)
    
    inline def setProductItemCountsVarargs(value: KeyValuePair*): Self = StObject.set(x, "productItemCounts", js.Array(value*))
    
    inline def setSignedOffItemCount(value: NullableOption[Double]): Self = StObject.set(x, "signedOffItemCount", value.asInstanceOf[js.Any])
    
    inline def setSignedOffItemCountNull: Self = StObject.set(x, "signedOffItemCount", null)
    
    inline def setSignedOffItemCountUndefined: Self = StObject.set(x, "signedOffItemCount", js.undefined)
    
    inline def setTotalItemSize(value: NullableOption[Double]): Self = StObject.set(x, "totalItemSize", value.asInstanceOf[js.Any])
    
    inline def setTotalItemSizeNull: Self = StObject.set(x, "totalItemSize", null)
    
    inline def setTotalItemSizeUndefined: Self = StObject.set(x, "totalItemSize", js.undefined)
  }
}
