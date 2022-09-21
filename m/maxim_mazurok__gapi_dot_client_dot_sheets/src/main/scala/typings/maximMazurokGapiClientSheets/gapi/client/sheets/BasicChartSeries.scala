package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicChartSeries extends StObject {
  
  /** The color for elements (such as bars, lines, and points) associated with this series. If empty, a default color is used. Deprecated: Use color_style. */
  var color: js.UndefOr[Color] = js.undefined
  
  /** The color for elements (such as bars, lines, and points) associated with this series. If empty, a default color is used. If color is also set, this field takes precedence. */
  var colorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** Information about the data labels for this series. */
  var dataLabel: js.UndefOr[DataLabel] = js.undefined
  
  /** The line style of this series. Valid only if the chartType is AREA, LINE, or SCATTER. COMBO charts are also supported if the series chart type is AREA or LINE. */
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  
  /**
    * The style for points associated with this series. Valid only if the chartType is AREA, LINE, or SCATTER. COMBO charts are also supported if the series chart type is AREA, LINE, or
    * SCATTER. If empty, a default point style is used.
    */
  var pointStyle: js.UndefOr[PointStyle] = js.undefined
  
  /** The data being visualized in this chart series. */
  var series: js.UndefOr[ChartData] = js.undefined
  
  /** Style override settings for series data points. */
  var styleOverrides: js.UndefOr[js.Array[BasicSeriesDataPointStyleOverride]] = js.undefined
  
  /**
    * The minor axis that will specify the range of values for this series. For example, if charting stocks over time, the "Volume" series may want to be pinned to the right with the
    * prices pinned to the left, because the scale of trading volume is different than the scale of prices. It is an error to specify an axis that isn't a valid minor axis for the chart's
    * type.
    */
  var targetAxis: js.UndefOr[String] = js.undefined
  
  /** The type of this series. Valid only if the chartType is COMBO. Different types will change the way the series is visualized. Only LINE, AREA, and COLUMN are supported. */
  var `type`: js.UndefOr[String] = js.undefined
}
object BasicChartSeries {
  
  inline def apply(): BasicChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicChartSeries]
  }
  
  extension [Self <: BasicChartSeries](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorStyle(value: ColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    inline def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDataLabel(value: DataLabel): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
    
    inline def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
    
    inline def setLineStyle(value: LineStyle): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
    
    inline def setSeries(value: ChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setStyleOverrides(value: js.Array[BasicSeriesDataPointStyleOverride]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setStyleOverridesVarargs(value: BasicSeriesDataPointStyleOverride*): Self = StObject.set(x, "styleOverrides", js.Array(value*))
    
    inline def setTargetAxis(value: String): Self = StObject.set(x, "targetAxis", value.asInstanceOf[js.Any])
    
    inline def setTargetAxisUndefined: Self = StObject.set(x, "targetAxis", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
