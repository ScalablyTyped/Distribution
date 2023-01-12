package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketAggregationDefinition extends StObject {
  
  // True to specify the sort order as descending. The default is false, with the sort order as ascending. Optional.
  var isDescending: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The minimum number of items that should be present in the aggregation to be returned in a bucket. Optional.
  var minimumCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * A filter to define a matching criteria. The key should start with the specified prefix to be returned in the response.
    * Optional.
    */
  var prefixFilter: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the manual ranges to compute the aggregations. This is only valid for non-string refiners of date or numeric
    * type. Optional.
    */
  var ranges: js.UndefOr[NullableOption[js.Array[BucketAggregationRange]]] = js.undefined
  
  /**
    * The possible values are count to sort by the number of matches in the aggregation, keyAsStringto sort alphabeticaly
    * based on the key in the aggregation, keyAsNumber for numerical sorting based on the key in the aggregation. Required.
    */
  var sortBy: js.UndefOr[BucketAggregationSortProperty] = js.undefined
}
object BucketAggregationDefinition {
  
  inline def apply(): BucketAggregationDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketAggregationDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketAggregationDefinition] (val x: Self) extends AnyVal {
    
    inline def setIsDescending(value: NullableOption[Boolean]): Self = StObject.set(x, "isDescending", value.asInstanceOf[js.Any])
    
    inline def setIsDescendingNull: Self = StObject.set(x, "isDescending", null)
    
    inline def setIsDescendingUndefined: Self = StObject.set(x, "isDescending", js.undefined)
    
    inline def setMinimumCount(value: NullableOption[Double]): Self = StObject.set(x, "minimumCount", value.asInstanceOf[js.Any])
    
    inline def setMinimumCountNull: Self = StObject.set(x, "minimumCount", null)
    
    inline def setMinimumCountUndefined: Self = StObject.set(x, "minimumCount", js.undefined)
    
    inline def setPrefixFilter(value: NullableOption[String]): Self = StObject.set(x, "prefixFilter", value.asInstanceOf[js.Any])
    
    inline def setPrefixFilterNull: Self = StObject.set(x, "prefixFilter", null)
    
    inline def setPrefixFilterUndefined: Self = StObject.set(x, "prefixFilter", js.undefined)
    
    inline def setRanges(value: NullableOption[js.Array[BucketAggregationRange]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesNull: Self = StObject.set(x, "ranges", null)
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: BucketAggregationRange*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setSortBy(value: BucketAggregationSortProperty): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
