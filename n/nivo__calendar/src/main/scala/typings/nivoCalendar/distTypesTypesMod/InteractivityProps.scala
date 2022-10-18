package typings.nivoCalendar.distTypesTypesMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<'onClick' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove', (datum : DatumProp, event : react.react.MouseEvent<ElementType, react.react.NativeMouseEvent>): void>> */
trait InteractivityProps[DatumProp, ElementType] extends StObject {
  
  var onClick: js.UndefOr[
    js.Function2[/* datum */ DatumProp, /* event */ MouseEvent[ElementType, NativeMouseEvent], Unit]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[/* datum */ DatumProp, /* event */ MouseEvent[ElementType, NativeMouseEvent], Unit]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[/* datum */ DatumProp, /* event */ MouseEvent[ElementType, NativeMouseEvent], Unit]
  ] = js.undefined
  
  var onMouseMove: js.UndefOr[
    js.Function2[/* datum */ DatumProp, /* event */ MouseEvent[ElementType, NativeMouseEvent], Unit]
  ] = js.undefined
}
object InteractivityProps {
  
  inline def apply[DatumProp, ElementType](): InteractivityProps[DatumProp, ElementType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractivityProps[DatumProp, ElementType]]
  }
  
  extension [Self <: InteractivityProps[?, ?], DatumProp, ElementType](x: Self & (InteractivityProps[DatumProp, ElementType])) {
    
    inline def setOnClick(value: (/* datum */ DatumProp, /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(value: (/* datum */ DatumProp, /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: (/* datum */ DatumProp, /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: (/* datum */ DatumProp, /* event */ MouseEvent[ElementType, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
  }
}
