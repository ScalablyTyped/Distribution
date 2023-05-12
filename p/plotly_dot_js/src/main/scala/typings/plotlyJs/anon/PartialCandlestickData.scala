package typings.plotlyJs.anon

import typings.plotlyJs.libTracesOhlcMod.HoverInfo
import typings.plotlyJs.mod.Data
import typings.plotlyJs.plotlyJsStrings.candlestick
import typings.plotlyJs.plotlyJsStrings.end
import typings.plotlyJs.plotlyJsStrings.legendonly
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/candlestick.CandlestickData> */
trait PartialCandlestickData
  extends StObject
     with Data {
  
  var close: js.UndefOr[js.Array[Double]] = js.undefined
  
  var decreasing: js.UndefOr[`0`] = js.undefined
  
  var high: js.UndefOr[js.Array[Double]] = js.undefined
  
  var hoverinfo: js.UndefOr[HoverInfo] = js.undefined
  
  var hoverlabel: js.UndefOr[Align] = js.undefined
  
  var hovertext: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var increasing: js.UndefOr[`0`] = js.undefined
  
  var line: js.UndefOr[`1`] = js.undefined
  
  var low: js.UndefOr[js.Array[Double]] = js.undefined
  
  var meta: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohlc.OhlcData['meta'] */ js.Any
  ] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var open: js.UndefOr[js.Array[Double]] = js.undefined
  
  var showlegend: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var `type`: js.UndefOr[candlestick] = js.undefined
  
  var visible: js.UndefOr[Boolean | legendonly] = js.undefined
  
  var whiskerwidth: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[js.Array[String]] = js.undefined
  
  var xaxis: js.UndefOr[String] = js.undefined
  
  var xperiod: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohlc.OhlcData['xperiod'] */ js.Any
  ] = js.undefined
  
  var xperiod0: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohlc.OhlcData['xperiod0'] */ js.Any
  ] = js.undefined
  
  var xperiodalignment: js.UndefOr[start | middle | end] = js.undefined
}
object PartialCandlestickData {
  
  inline def apply(): PartialCandlestickData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCandlestickData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCandlestickData] (val x: Self) extends AnyVal {
    
    inline def setClose(value: js.Array[Double]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCloseVarargs(value: Double*): Self = StObject.set(x, "close", js.Array(value*))
    
    inline def setDecreasing(value: `0`): Self = StObject.set(x, "decreasing", value.asInstanceOf[js.Any])
    
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
    
    inline def setIncreasing(value: `0`): Self = StObject.set(x, "increasing", value.asInstanceOf[js.Any])
    
    inline def setIncreasingUndefined: Self = StObject.set(x, "increasing", js.undefined)
    
    inline def setLine(value: `1`): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLow(value: js.Array[Double]): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setLowVarargs(value: Double*): Self = StObject.set(x, "low", js.Array(value*))
    
    inline def setMeta(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohlc.OhlcData['meta'] */ js.Any
    ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpen(value: js.Array[Double]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOpenVarargs(value: Double*): Self = StObject.set(x, "open", js.Array(value*))
    
    inline def setShowlegend(value: Boolean): Self = StObject.set(x, "showlegend", value.asInstanceOf[js.Any])
    
    inline def setShowlegendUndefined: Self = StObject.set(x, "showlegend", js.undefined)
    
    inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setType(value: candlestick): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean | legendonly): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWhiskerwidth(value: Double): Self = StObject.set(x, "whiskerwidth", value.asInstanceOf[js.Any])
    
    inline def setWhiskerwidthUndefined: Self = StObject.set(x, "whiskerwidth", js.undefined)
    
    inline def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setXaxis(value: String): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    inline def setXperiod(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohlc.OhlcData['xperiod'] */ js.Any
    ): Self = StObject.set(x, "xperiod", value.asInstanceOf[js.Any])
    
    inline def setXperiod0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohlc.OhlcData['xperiod0'] */ js.Any
    ): Self = StObject.set(x, "xperiod0", value.asInstanceOf[js.Any])
    
    inline def setXperiod0Undefined: Self = StObject.set(x, "xperiod0", js.undefined)
    
    inline def setXperiodUndefined: Self = StObject.set(x, "xperiod", js.undefined)
    
    inline def setXperiodalignment(value: start | middle | end): Self = StObject.set(x, "xperiodalignment", value.asInstanceOf[js.Any])
    
    inline def setXperiodalignmentUndefined: Self = StObject.set(x, "xperiodalignment", js.undefined)
  }
}
