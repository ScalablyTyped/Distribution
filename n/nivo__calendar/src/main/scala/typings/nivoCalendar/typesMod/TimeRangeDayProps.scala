package typings.nivoCalendar.typesMod

import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'x' | 'y' | 'borderWidth' | 'rx' | 'ry' | 'height' | 'width', number> & {  data :@nivo/calendar.@nivo/calendar/dist/types/types.TimeRangeDayData,   color :string,   borderColor :string,   isInteractive :boolean,   tooltip :react.react.FC<@nivo/calendar.@nivo/calendar/dist/types/types.TimeRangeTooltipProps>, formatValue (value : number): string} & std.Partial<@nivo/calendar.@nivo/calendar/dist/types/types.InteractivityProps<@nivo/calendar.@nivo/calendar/dist/types/types.TimeRangeDayData, std.SVGRectElement>> */
trait TimeRangeDayProps extends StObject {
  
  var borderColor: String
  
  var borderWidth: Double
  
  var color: String
  
  var data: TimeRangeDayData
  
  def formatValue(value: Double): String
  
  var height: Double
  
  var isInteractive: Boolean
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ TimeRangeDayData, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ TimeRangeDayData, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ TimeRangeDayData, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* datum */ TimeRangeDayData, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var rx: Double
  
  var ry: Double
  
  var tooltip: FC[TimeRangeTooltipProps]
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object TimeRangeDayProps {
  
  inline def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    data: TimeRangeDayData,
    formatValue: Double => String,
    height: Double,
    isInteractive: Boolean,
    rx: Double,
    ry: Double,
    tooltip: FC[TimeRangeTooltipProps],
    width: Double,
    x: Double,
    y: Double
  ): TimeRangeDayProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), height = height.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRangeDayProps]
  }
  
  extension [Self <: TimeRangeDayProps](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: TimeRangeDayData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFormatValue(value: Double => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: (/* datum */ TimeRangeDayData, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ TimeRangeDayData, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ TimeRangeDayData, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: (/* datum */ TimeRangeDayData, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: FC[TimeRangeTooltipProps]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
