package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdiscoveryEstimateOperation
  extends StObject
     with CaseOperation {
  
  // The estimated count of items for the search that matched the content query.
  var indexedItemCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The estimated size of items for the search that matched the content query.
  var indexedItemsSize: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of mailboxes that had search hits.
  var mailboxCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // eDiscovery search.
  var search: js.UndefOr[NullableOption[EdiscoverySearch]] = js.undefined
  
  // The number of mailboxes that had search hits.
  var siteCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The estimated count of unindexed items for the collection.
  var unindexedItemCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The estimated size of unindexed items for the collection.
  var unindexedItemsSize: js.UndefOr[NullableOption[Double]] = js.undefined
}
object EdiscoveryEstimateOperation {
  
  inline def apply(): EdiscoveryEstimateOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdiscoveryEstimateOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdiscoveryEstimateOperation] (val x: Self) extends AnyVal {
    
    inline def setIndexedItemCount(value: NullableOption[Double]): Self = StObject.set(x, "indexedItemCount", value.asInstanceOf[js.Any])
    
    inline def setIndexedItemCountNull: Self = StObject.set(x, "indexedItemCount", null)
    
    inline def setIndexedItemCountUndefined: Self = StObject.set(x, "indexedItemCount", js.undefined)
    
    inline def setIndexedItemsSize(value: NullableOption[Double]): Self = StObject.set(x, "indexedItemsSize", value.asInstanceOf[js.Any])
    
    inline def setIndexedItemsSizeNull: Self = StObject.set(x, "indexedItemsSize", null)
    
    inline def setIndexedItemsSizeUndefined: Self = StObject.set(x, "indexedItemsSize", js.undefined)
    
    inline def setMailboxCount(value: NullableOption[Double]): Self = StObject.set(x, "mailboxCount", value.asInstanceOf[js.Any])
    
    inline def setMailboxCountNull: Self = StObject.set(x, "mailboxCount", null)
    
    inline def setMailboxCountUndefined: Self = StObject.set(x, "mailboxCount", js.undefined)
    
    inline def setSearch(value: NullableOption[EdiscoverySearch]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchNull: Self = StObject.set(x, "search", null)
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSiteCount(value: NullableOption[Double]): Self = StObject.set(x, "siteCount", value.asInstanceOf[js.Any])
    
    inline def setSiteCountNull: Self = StObject.set(x, "siteCount", null)
    
    inline def setSiteCountUndefined: Self = StObject.set(x, "siteCount", js.undefined)
    
    inline def setUnindexedItemCount(value: NullableOption[Double]): Self = StObject.set(x, "unindexedItemCount", value.asInstanceOf[js.Any])
    
    inline def setUnindexedItemCountNull: Self = StObject.set(x, "unindexedItemCount", null)
    
    inline def setUnindexedItemCountUndefined: Self = StObject.set(x, "unindexedItemCount", js.undefined)
    
    inline def setUnindexedItemsSize(value: NullableOption[Double]): Self = StObject.set(x, "unindexedItemsSize", value.asInstanceOf[js.Any])
    
    inline def setUnindexedItemsSizeNull: Self = StObject.set(x, "unindexedItemsSize", null)
    
    inline def setUnindexedItemsSizeUndefined: Self = StObject.set(x, "unindexedItemsSize", js.undefined)
  }
}
