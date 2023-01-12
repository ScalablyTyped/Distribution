package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewColumnAggregates extends StObject {
  
  var average: js.UndefOr[PrimitiveValue] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[PrimitiveValue] = js.undefined
  
  /** Client-computed maximum value for a column. */
  var maxLocal: js.UndefOr[PrimitiveValue] = js.undefined
  
  var median: js.UndefOr[PrimitiveValue] = js.undefined
  
  var min: js.UndefOr[PrimitiveValue] = js.undefined
  
  /** Client-computed maximum value for a column. */
  var minLocal: js.UndefOr[PrimitiveValue] = js.undefined
  
  var percentiles: js.UndefOr[js.Array[DataViewColumnPercentileAggregate]] = js.undefined
  
  /** Represents a single value evaluation, similar to a total. */
  var single: js.UndefOr[PrimitiveValue] = js.undefined
  
  var subtotal: js.UndefOr[PrimitiveValue] = js.undefined
}
object DataViewColumnAggregates {
  
  inline def apply(): DataViewColumnAggregates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewColumnAggregates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewColumnAggregates] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: PrimitiveValue): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setMax(value: PrimitiveValue): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLocal(value: PrimitiveValue): Self = StObject.set(x, "maxLocal", value.asInstanceOf[js.Any])
    
    inline def setMaxLocalUndefined: Self = StObject.set(x, "maxLocal", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMedian(value: PrimitiveValue): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    inline def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
    
    inline def setMin(value: PrimitiveValue): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLocal(value: PrimitiveValue): Self = StObject.set(x, "minLocal", value.asInstanceOf[js.Any])
    
    inline def setMinLocalUndefined: Self = StObject.set(x, "minLocal", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPercentiles(value: js.Array[DataViewColumnPercentileAggregate]): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
    
    inline def setPercentilesUndefined: Self = StObject.set(x, "percentiles", js.undefined)
    
    inline def setPercentilesVarargs(value: DataViewColumnPercentileAggregate*): Self = StObject.set(x, "percentiles", js.Array(value*))
    
    inline def setSingle(value: PrimitiveValue): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    inline def setSubtotal(value: PrimitiveValue): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
    
    inline def setSubtotalUndefined: Self = StObject.set(x, "subtotal", js.undefined)
  }
}
