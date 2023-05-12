package typings.nivoAxes.anon

import typings.nivoAxes.nivoAxesStrings.x
import typings.nivoAxes.nivoAxesStrings.y
import typings.nivoScales.distTypesTypesMod.AnyScale
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.nivoScales.distTypesTypesMod.TicksSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height[Value /* <: ScaleValue */] extends StObject {
  
  var axis: x | y
  
  var height: Double
  
  var scale: AnyScale
  
  var values: js.UndefOr[TicksSpec[Value]] = js.undefined
  
  var width: Double
}
object Height {
  
  inline def apply[Value /* <: ScaleValue */](axis: x | y, height: Double, scale: AnyScale, width: Double): Height[Value] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Height[?], Value /* <: ScaleValue */] (val x: Self & Height[Value]) extends AnyVal {
    
    inline def setAxis(value: typings.nivoAxes.nivoAxesStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setScale(value: AnyScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setValues(value: TicksSpec[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
