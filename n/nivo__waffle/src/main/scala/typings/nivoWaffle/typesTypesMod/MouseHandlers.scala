package typings.nivoWaffle.typesTypesMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseHandlers[RawDatum /* <: Datum */, ElementType] extends StObject {
  
  var onClick: js.UndefOr[MouseHandler[RawDatum, ElementType]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseHandler[RawDatum, ElementType]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseHandler[RawDatum, ElementType]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseHandler[RawDatum, ElementType]] = js.undefined
}
object MouseHandlers {
  
  inline def apply[RawDatum /* <: Datum */, ElementType](): MouseHandlers[RawDatum, ElementType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseHandlers[RawDatum, ElementType]]
  }
  
  extension [Self <: MouseHandlers[?, ?], RawDatum /* <: Datum */, ElementType](x: Self & (MouseHandlers[RawDatum, ElementType])) {
    
    inline def setOnClick(value: (/* cell */ Cell[RawDatum], /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(value: (/* cell */ Cell[RawDatum], /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: (/* cell */ Cell[RawDatum], /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: (/* cell */ Cell[RawDatum], /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
  }
}
