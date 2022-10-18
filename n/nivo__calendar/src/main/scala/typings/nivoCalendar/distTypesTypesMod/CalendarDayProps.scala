package typings.nivoCalendar.distTypesTypesMod

import typings.nivoCalendar.anon.OmitDatumdatavalue
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  data :std.Omit<@nivo/calendar.@nivo/calendar/dist/types/types.Datum, 'data' | 'value'> | @nivo/calendar.@nivo/calendar/dist/types/types.Datum,   x :number,   y :number,   size :number,   color :string,   borderWidth :number,   borderColor :string,   isInteractive :boolean,   tooltip :react.react.FC<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarTooltipProps>, formatValue (value : number): string} & std.Partial<@nivo/calendar.@nivo/calendar/dist/types/types.InteractivityProps<std.Omit<@nivo/calendar.@nivo/calendar/dist/types/types.Datum, 'data' | 'value'> | @nivo/calendar.@nivo/calendar/dist/types/types.Datum, std.SVGRectElement>> */
trait CalendarDayProps extends StObject {
  
  var borderColor: String
  
  var borderWidth: Double
  
  var color: String
  
  var data: OmitDatumdatavalue | Datum
  
  def formatValue(value: Double): String
  
  var isInteractive: Boolean
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ OmitDatumdatavalue | Datum, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ OmitDatumdatavalue | Datum, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ OmitDatumdatavalue | Datum, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* datum */ OmitDatumdatavalue | Datum, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var size: Double
  
  var tooltip: FC[CalendarTooltipProps]
  
  var x: Double
  
  var y: Double
}
object CalendarDayProps {
  
  inline def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    data: OmitDatumdatavalue | Datum,
    formatValue: Double => String,
    isInteractive: Boolean,
    size: Double,
    tooltip: FC[CalendarTooltipProps],
    x: Double,
    y: Double
  ): CalendarDayProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), isInteractive = isInteractive.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayProps]
  }
  
  extension [Self <: CalendarDayProps](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: OmitDatumdatavalue | Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFormatValue(value: Double => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: FC[CalendarTooltipProps]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
