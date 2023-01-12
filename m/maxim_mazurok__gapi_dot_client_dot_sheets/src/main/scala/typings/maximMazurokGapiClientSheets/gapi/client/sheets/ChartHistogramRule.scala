package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartHistogramRule extends StObject {
  
  /** The size of the buckets that are created. Must be positive. */
  var intervalSize: js.UndefOr[Double] = js.undefined
  
  /** The maximum value at which items are placed into buckets. Values greater than the maximum are grouped into a single bucket. If omitted, it is determined by the maximum item value. */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum value at which items are placed into buckets. Values that are less than the minimum are grouped into a single bucket. If omitted, it is determined by the minimum item
    * value.
    */
  var minValue: js.UndefOr[Double] = js.undefined
}
object ChartHistogramRule {
  
  inline def apply(): ChartHistogramRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartHistogramRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartHistogramRule] (val x: Self) extends AnyVal {
    
    inline def setIntervalSize(value: Double): Self = StObject.set(x, "intervalSize", value.asInstanceOf[js.Any])
    
    inline def setIntervalSizeUndefined: Self = StObject.set(x, "intervalSize", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
