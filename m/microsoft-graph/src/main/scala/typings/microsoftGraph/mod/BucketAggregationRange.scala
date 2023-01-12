package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketAggregationRange extends StObject {
  
  /**
    * Defines the lower bound from which to compute the aggregation. This can be a numeric value or a string representation
    * of a date using the YYYY-MM-DDTHH:mm:ss.sssZ format. Required.
    */
  var from: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the upper bound up to which to compute the aggregation. This can be a numeric value or a string representation
    * of a date using the YYYY-MM-DDTHH:mm:ss.sssZ format. Required.
    */
  var to: js.UndefOr[String] = js.undefined
}
object BucketAggregationRange {
  
  inline def apply(): BucketAggregationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketAggregationRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketAggregationRange] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
