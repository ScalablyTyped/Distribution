package typings.nivoBar.distTypesTypesMod

import typings.nivoBar.anon.ColorString
import typings.nivoBar.anon.DataValue
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/bar.@nivo/bar/dist/types/types.BarItemProps<RawDatum>, 'isInteractive' | 'style' | 'tooltip' | 'isFocusable' | 'ariaLabel' | 'ariaLabelledBy' | 'ariaDescribedBy'> & {  borderColor :string,   labelColor :string} */
trait RenderBarProps[RawDatum /* <: BarDatum */] extends StObject {
  
  var bar: ComputedBarDatum[RawDatum] & DataValue
  
  var borderColor: String
  
  var borderRadius: Double
  
  var borderWidth: Double
  
  var label: String
  
  var labelColor: String
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum] & ColorString, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var shouldRenderLabel: Boolean
}
object RenderBarProps {
  
  inline def apply[RawDatum /* <: BarDatum */](
    bar: ComputedBarDatum[RawDatum] & DataValue,
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    label: String,
    labelColor: String,
    shouldRenderLabel: Boolean
  ): RenderBarProps[RawDatum] = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], shouldRenderLabel = shouldRenderLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderBarProps[RawDatum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderBarProps[?], RawDatum /* <: BarDatum */] (val x: Self & RenderBarProps[RawDatum]) extends AnyVal {
    
    inline def setBar(value: ComputedBarDatum[RawDatum] & DataValue): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: (/* datum */ ComputedDatum[RawDatum] & ColorString, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setShouldRenderLabel(value: Boolean): Self = StObject.set(x, "shouldRenderLabel", value.asInstanceOf[js.Any])
  }
}
