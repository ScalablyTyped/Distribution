package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataBars
  extends StObject
     with _StructuralObjectValue {
  
  var axisColor: Fill
  
  var hideText: Boolean
  
  var maxValue: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
  
  var negativeColor: Fill
  
  var positiveColor: Fill
  
  var reverseDirection: Boolean
}
object DataBars {
  
  inline def apply(
    axisColor: Fill,
    hideText: Boolean,
    negativeColor: Fill,
    positiveColor: Fill,
    reverseDirection: Boolean
  ): DataBars = {
    val __obj = js.Dynamic.literal(axisColor = axisColor.asInstanceOf[js.Any], hideText = hideText.asInstanceOf[js.Any], negativeColor = negativeColor.asInstanceOf[js.Any], positiveColor = positiveColor.asInstanceOf[js.Any], reverseDirection = reverseDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBars]
  }
  
  extension [Self <: DataBars](x: Self) {
    
    inline def setAxisColor(value: Fill): Self = StObject.set(x, "axisColor", value.asInstanceOf[js.Any])
    
    inline def setHideText(value: Boolean): Self = StObject.set(x, "hideText", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setNegativeColor(value: Fill): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    inline def setPositiveColor(value: Fill): Self = StObject.set(x, "positiveColor", value.asInstanceOf[js.Any])
    
    inline def setReverseDirection(value: Boolean): Self = StObject.set(x, "reverseDirection", value.asInstanceOf[js.Any])
  }
}
