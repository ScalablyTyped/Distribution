package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBucket extends StObject {
  
  /**
    * A token containing the encoded filter to aggregate search matches by the specific key value. To use the filter, pass
    * the token as part of the aggregationFilter property in a searchRequest object, in the format
    * '{field}:/'{aggregationFilterToken}/''. See an example.
    */
  var aggregationFilterToken: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The approximate number of search matches that share the same value specified in the key property. Note that this number
    * is not the exact number of matches.
    */
  var count: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The discrete value of the field that an aggregation was computed on.
  var key: js.UndefOr[NullableOption[String]] = js.undefined
}
object SearchBucket {
  
  inline def apply(): SearchBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchBucket] (val x: Self) extends AnyVal {
    
    inline def setAggregationFilterToken(value: NullableOption[String]): Self = StObject.set(x, "aggregationFilterToken", value.asInstanceOf[js.Any])
    
    inline def setAggregationFilterTokenNull: Self = StObject.set(x, "aggregationFilterToken", null)
    
    inline def setAggregationFilterTokenUndefined: Self = StObject.set(x, "aggregationFilterToken", js.undefined)
    
    inline def setCount(value: NullableOption[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setKey(value: NullableOption[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
