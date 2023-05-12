package typings.nivoAxes.anon

import typings.nivoAxes.nivoAxesStrings.x
import typings.nivoAxes.nivoAxesStrings.y
import typings.nivoScales.distTypesTypesMod.AnyScale
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.std.MouseEvent
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length[Value /* <: ScaleValue */] extends StObject {
  
  var axis: x | y
  
  var length: Double
  
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ typings.react.mod.MouseEvent[SVGGElement, MouseEvent], 
      /* value */ String | Value, 
      Unit
    ]
  ] = js.undefined
  
  var scale: AnyScale
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object Length {
  
  inline def apply[Value /* <: ScaleValue */](axis: x | y, length: Double, scale: AnyScale): Length[Value] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Length[?], Value /* <: ScaleValue */] (val x: Self & Length[Value]) extends AnyVal {
    
    inline def setAxis(value: typings.nivoAxes.nivoAxesStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: (/* event */ typings.react.mod.MouseEvent[SVGGElement, MouseEvent], /* value */ String | Value) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setScale(value: AnyScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
