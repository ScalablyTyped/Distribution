package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAggregation extends StObject {
  
  var buckets: js.UndefOr[NullableOption[js.Array[SearchBucket]]] = js.undefined
  
  var field: js.UndefOr[NullableOption[String]] = js.undefined
}
object SearchAggregation {
  
  inline def apply(): SearchAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAggregation]
  }
  
  extension [Self <: SearchAggregation](x: Self) {
    
    inline def setBuckets(value: NullableOption[js.Array[SearchBucket]]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsNull: Self = StObject.set(x, "buckets", null)
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: SearchBucket*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setField(value: NullableOption[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
