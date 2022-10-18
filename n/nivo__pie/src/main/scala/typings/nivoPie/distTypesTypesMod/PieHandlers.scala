package typings.nivoPie.distTypesTypesMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieHandlers[RawDatum, ElementType] extends StObject {
  
  var onClick: js.UndefOr[MouseEventHandler[RawDatum, ElementType]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[RawDatum, ElementType]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[RawDatum, ElementType]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[RawDatum, ElementType]] = js.undefined
}
object PieHandlers {
  
  inline def apply[RawDatum, ElementType](): PieHandlers[RawDatum, ElementType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieHandlers[RawDatum, ElementType]]
  }
  
  extension [Self <: PieHandlers[?, ?], RawDatum, ElementType](x: Self & (PieHandlers[RawDatum, ElementType])) {
    
    inline def setOnClick(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
  }
}
