package typings.plotlyJs.anon

import typings.plotlyJs.libTracesOhlcMod.HoverInfo
import typings.plotlyJs.libTracesOhlcMod.XCalendar
import typings.plotlyJs.mod.Data
import typings.plotlyJs.plotlyJsStrings.end
import typings.plotlyJs.plotlyJsStrings.legendonly
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.ohlc
import typings.plotlyJs.plotlyJsStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/ohlc.OhlcData> */
trait PartialOhlcData
  extends StObject
     with Data {
  
  var close: js.UndefOr[js.Array[Double]] = js.undefined
  
  var customdata: js.UndefOr[js.Array[Any]] = js.undefined
  
  var decreasing: js.UndefOr[Line] = js.undefined
  
  var high: js.UndefOr[js.Array[Double]] = js.undefined
  
  var hoverinfo: js.UndefOr[HoverInfo] = js.undefined
  
  var hoverlabel: js.UndefOr[Align] = js.undefined
  
  var hovertext: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var increasing: js.UndefOr[Line] = js.undefined
  
  var legendgroup: js.UndefOr[String] = js.undefined
  
  var line: js.UndefOr[Width] = js.undefined
  
  var low: js.UndefOr[js.Array[Double]] = js.undefined
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var open: js.UndefOr[js.Array[Double]] = js.undefined
  
  var selectedpoints: js.UndefOr[Any] = js.undefined
  
  var showlegend: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var tickwidth: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[ohlc] = js.undefined
  
  var uirevision: js.UndefOr[Any] = js.undefined
  
  var visible: js.UndefOr[Boolean | legendonly] = js.undefined
  
  var x: js.UndefOr[js.Array[String]] = js.undefined
  
  var xaxis: js.UndefOr[String] = js.undefined
  
  var xcalendar: js.UndefOr[XCalendar] = js.undefined
  
  var xperiod: js.UndefOr[Any] = js.undefined
  
  var xperiod0: js.UndefOr[Any] = js.undefined
  
  var xperiodalignment: js.UndefOr[start | middle | end] = js.undefined
  
  var yaxis: js.UndefOr[String] = js.undefined
}
object PartialOhlcData {
  
  inline def apply(): PartialOhlcData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOhlcData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOhlcData] (val x: Self) extends AnyVal {
    
    inline def setClose(value: js.Array[Double]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCloseVarargs(value: Double*): Self = StObject.set(x, "close", js.Array(value*))
    
    inline def setCustomdata(value: js.Array[Any]): Self = StObject.set(x, "customdata", value.asInstanceOf[js.Any])
    
    inline def setCustomdataUndefined: Self = StObject.set(x, "customdata", js.undefined)
    
    inline def setCustomdataVarargs(value: Any*): Self = StObject.set(x, "customdata", js.Array(value*))
    
    inline def setDecreasing(value: Line): Self = StObject.set(x, "decreasing", value.asInstanceOf[js.Any])
    
    inline def setDecreasingUndefined: Self = StObject.set(x, "decreasing", js.undefined)
    
    inline def setHigh(value: js.Array[Double]): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setHighVarargs(value: Double*): Self = StObject.set(x, "high", js.Array(value*))
    
    inline def setHoverinfo(value: HoverInfo): Self = StObject.set(x, "hoverinfo", value.asInstanceOf[js.Any])
    
    inline def setHoverinfoUndefined: Self = StObject.set(x, "hoverinfo", js.undefined)
    
    inline def setHoverlabel(value: Align): Self = StObject.set(x, "hoverlabel", value.asInstanceOf[js.Any])
    
    inline def setHoverlabelUndefined: Self = StObject.set(x, "hoverlabel", js.undefined)
    
    inline def setHovertext(value: String | js.Array[String]): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
    
    inline def setHovertextUndefined: Self = StObject.set(x, "hovertext", js.undefined)
    
    inline def setHovertextVarargs(value: String*): Self = StObject.set(x, "hovertext", js.Array(value*))
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setIncreasing(value: Line): Self = StObject.set(x, "increasing", value.asInstanceOf[js.Any])
    
    inline def setIncreasingUndefined: Self = StObject.set(x, "increasing", js.undefined)
    
    inline def setLegendgroup(value: String): Self = StObject.set(x, "legendgroup", value.asInstanceOf[js.Any])
    
    inline def setLegendgroupUndefined: Self = StObject.set(x, "legendgroup", js.undefined)
    
    inline def setLine(value: Width): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLow(value: js.Array[Double]): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setLowVarargs(value: Double*): Self = StObject.set(x, "low", js.Array(value*))
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpen(value: js.Array[Double]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOpenVarargs(value: Double*): Self = StObject.set(x, "open", js.Array(value*))
    
    inline def setSelectedpoints(value: Any): Self = StObject.set(x, "selectedpoints", value.asInstanceOf[js.Any])
    
    inline def setSelectedpointsUndefined: Self = StObject.set(x, "selectedpoints", js.undefined)
    
    inline def setShowlegend(value: Boolean): Self = StObject.set(x, "showlegend", value.asInstanceOf[js.Any])
    
    inline def setShowlegendUndefined: Self = StObject.set(x, "showlegend", js.undefined)
    
    inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    inline def setTickwidthUndefined: Self = StObject.set(x, "tickwidth", js.undefined)
    
    inline def setType(value: ohlc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUirevision(value: Any): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    inline def setUirevisionUndefined: Self = StObject.set(x, "uirevision", js.undefined)
    
    inline def setVisible(value: Boolean | legendonly): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setXaxis(value: String): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    inline def setXcalendar(value: XCalendar): Self = StObject.set(x, "xcalendar", value.asInstanceOf[js.Any])
    
    inline def setXcalendarUndefined: Self = StObject.set(x, "xcalendar", js.undefined)
    
    inline def setXperiod(value: Any): Self = StObject.set(x, "xperiod", value.asInstanceOf[js.Any])
    
    inline def setXperiod0(value: Any): Self = StObject.set(x, "xperiod0", value.asInstanceOf[js.Any])
    
    inline def setXperiod0Undefined: Self = StObject.set(x, "xperiod0", js.undefined)
    
    inline def setXperiodUndefined: Self = StObject.set(x, "xperiod", js.undefined)
    
    inline def setXperiodalignment(value: start | middle | end): Self = StObject.set(x, "xperiodalignment", value.asInstanceOf[js.Any])
    
    inline def setXperiodalignmentUndefined: Self = StObject.set(x, "xperiodalignment", js.undefined)
    
    inline def setYaxis(value: String): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    inline def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
  }
}
