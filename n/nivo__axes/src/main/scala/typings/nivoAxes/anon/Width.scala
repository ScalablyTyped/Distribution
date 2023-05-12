package typings.nivoAxes.anon

import typings.nivoScales.distTypesTypesMod.AnyScale
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.nivoScales.distTypesTypesMod.TicksSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width[X /* <: ScaleValue */, Y /* <: ScaleValue */] extends StObject {
  
  var height: Double
  
  var width: Double
  
  var xScale: js.UndefOr[AnyScale | Null] = js.undefined
  
  var xValues: js.UndefOr[TicksSpec[X]] = js.undefined
  
  var yScale: js.UndefOr[AnyScale | Null] = js.undefined
  
  var yValues: js.UndefOr[TicksSpec[Y]] = js.undefined
}
object Width {
  
  inline def apply[X /* <: ScaleValue */, Y /* <: ScaleValue */](height: Double, width: Double): Width[X, Y] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width[X, Y]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Width[?, ?], X /* <: ScaleValue */, Y /* <: ScaleValue */] (val x: Self & (Width[X, Y])) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXScale(value: AnyScale): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setXScaleNull: Self = StObject.set(x, "xScale", null)
    
    inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
    
    inline def setXValues(value: TicksSpec[X]): Self = StObject.set(x, "xValues", value.asInstanceOf[js.Any])
    
    inline def setXValuesUndefined: Self = StObject.set(x, "xValues", js.undefined)
    
    inline def setXValuesVarargs(value: X*): Self = StObject.set(x, "xValues", js.Array(value*))
    
    inline def setYScale(value: AnyScale): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    
    inline def setYScaleNull: Self = StObject.set(x, "yScale", null)
    
    inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
    
    inline def setYValues(value: TicksSpec[Y]): Self = StObject.set(x, "yValues", value.asInstanceOf[js.Any])
    
    inline def setYValuesUndefined: Self = StObject.set(x, "yValues", js.undefined)
    
    inline def setYValuesVarargs(value: Y*): Self = StObject.set(x, "yValues", js.Array(value*))
  }
}
