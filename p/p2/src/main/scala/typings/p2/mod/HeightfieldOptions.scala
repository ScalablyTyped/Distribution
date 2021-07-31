package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightfieldOptions
  extends StObject
     with SharedShapeOptions {
  
  var elementWidth: js.UndefOr[Double] = js.undefined
  
  var heights: js.UndefOr[js.Array[Double]] = js.undefined
  
  var maxValue: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
}
object HeightfieldOptions {
  
  @scala.inline
  def apply(): HeightfieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightfieldOptions]
  }
  
  @scala.inline
  implicit class HeightfieldOptionsMutableBuilder[Self <: HeightfieldOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementWidth(value: Double): Self = StObject.set(x, "elementWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementWidthUndefined: Self = StObject.set(x, "elementWidth", js.undefined)
    
    @scala.inline
    def setHeights(value: js.Array[Double]): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
    
    @scala.inline
    def setHeightsVarargs(value: Double*): Self = StObject.set(x, "heights", js.Array(value :_*))
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
