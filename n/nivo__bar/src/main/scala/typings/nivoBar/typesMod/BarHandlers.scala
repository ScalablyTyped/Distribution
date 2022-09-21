package typings.nivoBar.typesMod

import typings.nivoBar.anon.Color
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarHandlers[RawDatum, Element] extends StObject {
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum] & Color, 
      /* event */ MouseEvent[Element, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ MouseEvent[Element, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ MouseEvent[Element, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
}
object BarHandlers {
  
  inline def apply[RawDatum, Element](): BarHandlers[RawDatum, Element] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarHandlers[RawDatum, Element]]
  }
  
  extension [Self <: BarHandlers[?, ?], RawDatum, Element](x: Self & (BarHandlers[RawDatum, Element])) {
    
    inline def setOnClick(
      value: (/* datum */ ComputedDatum[RawDatum] & Color, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
  }
}
