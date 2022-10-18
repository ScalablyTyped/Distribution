package typings.plotlyJs

import typings.plotlyJs.anon.Align
import typings.plotlyJs.anon.`0`
import typings.plotlyJs.anon.`1`
import typings.plotlyJs.libTracesOhclMod.HoverInfo
import typings.plotlyJs.plotlyJsStrings.candlestick
import typings.plotlyJs.plotlyJsStrings.end
import typings.plotlyJs.plotlyJsStrings.legendonly
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTracesCandlestickMod {
  
  trait CandlestickData extends StObject {
    
    var close: js.Array[Double]
    
    var decreasing: `0`
    
    var high: js.Array[Double]
    
    /**
      * @default "all"
      */
    var hoverinfo: HoverInfo
    
    var hoverlabel: Align
    
    /**
      * @default ""
      */
    var hovertext: String | js.Array[String]
    
    var ids: js.Array[String]
    
    var increasing: `0`
    
    /**
      * @default width=2
      */
    var line: `1`
    
    var low: js.Array[Double]
    
    var meta: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohcl.OhclData['meta'] */ js.Any
    
    var name: String
    
    /**
      * number between 0 and 1
      * @default 1
      */
    var opacity: Double
    
    var open: js.Array[Double]
    
    /**
      * @default true
      */
    var showlegend: Boolean
    
    /**
      * @default ""
      */
    var text: String | js.Array[String]
    
    var `type`: candlestick
    
    /**
      * @default true
      */
    var visible: Boolean | legendonly
    
    /**
      * Number between 0 and 1.
      *
      * Selects the width of the whiskers relative to the box´s width.
      * For example, with 1, the whiskers are as wide as the box(es).
      * @default 0
      */
    var whiskerwidth: Double
    
    var x: js.Array[String]
    
    /**
      * @default "x"
      */
    var xaxis: String
    
    /**
      * @default 0
      */
    var xperiod: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohcl.OhclData['xperiod'] */ js.Any
    
    var xperiod0: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohcl.OhclData['xperiod0'] */ js.Any
    
    /**
      * @default "middle"
      */
    var xperiodalignment: start | middle | end
  }
  object CandlestickData {
    
    inline def apply(
      close: js.Array[Double],
      decreasing: `0`,
      high: js.Array[Double],
      hoverinfo: HoverInfo,
      hoverlabel: Align,
      hovertext: String | js.Array[String],
      ids: js.Array[String],
      increasing: `0`,
      line: `1`,
      low: js.Array[Double],
      meta: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohcl.OhclData['meta'] */ js.Any,
      name: String,
      opacity: Double,
      open: js.Array[Double],
      showlegend: Boolean,
      text: String | js.Array[String],
      visible: Boolean | legendonly,
      whiskerwidth: Double,
      x: js.Array[String],
      xaxis: String,
      xperiod: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohcl.OhclData['xperiod'] */ js.Any,
      xperiod0: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohcl.OhclData['xperiod0'] */ js.Any,
      xperiodalignment: start | middle | end
    ): CandlestickData = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], decreasing = decreasing.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], hoverinfo = hoverinfo.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovertext = hovertext.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], increasing = increasing.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], whiskerwidth = whiskerwidth.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xperiod = xperiod.asInstanceOf[js.Any], xperiod0 = xperiod0.asInstanceOf[js.Any], xperiodalignment = xperiodalignment.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("candlestick")
      __obj.asInstanceOf[CandlestickData]
    }
    
    extension [Self <: CandlestickData](x: Self) {
      
      inline def setClose(value: js.Array[Double]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseVarargs(value: Double*): Self = StObject.set(x, "close", js.Array(value*))
      
      inline def setDecreasing(value: `0`): Self = StObject.set(x, "decreasing", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: js.Array[Double]): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighVarargs(value: Double*): Self = StObject.set(x, "high", js.Array(value*))
      
      inline def setHoverinfo(value: HoverInfo): Self = StObject.set(x, "hoverinfo", value.asInstanceOf[js.Any])
      
      inline def setHoverlabel(value: Align): Self = StObject.set(x, "hoverlabel", value.asInstanceOf[js.Any])
      
      inline def setHovertext(value: String | js.Array[String]): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
      
      inline def setHovertextVarargs(value: String*): Self = StObject.set(x, "hovertext", js.Array(value*))
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
      
      inline def setIncreasing(value: `0`): Self = StObject.set(x, "increasing", value.asInstanceOf[js.Any])
      
      inline def setLine(value: `1`): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLow(value: js.Array[Double]): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowVarargs(value: Double*): Self = StObject.set(x, "low", js.Array(value*))
      
      inline def setMeta(
        value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohcl.OhclData['meta'] */ js.Any
      ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: js.Array[Double]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenVarargs(value: Double*): Self = StObject.set(x, "open", js.Array(value*))
      
      inline def setShowlegend(value: Boolean): Self = StObject.set(x, "showlegend", value.asInstanceOf[js.Any])
      
      inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setType(value: candlestick): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean | legendonly): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setWhiskerwidth(value: Double): Self = StObject.set(x, "whiskerwidth", value.asInstanceOf[js.Any])
      
      inline def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setXaxis(value: String): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
      
      inline def setXperiod(
        value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohcl.OhclData['xperiod'] */ js.Any
      ): Self = StObject.set(x, "xperiod", value.asInstanceOf[js.Any])
      
      inline def setXperiod0(
        value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/ohcl.OhclData['xperiod0'] */ js.Any
      ): Self = StObject.set(x, "xperiod0", value.asInstanceOf[js.Any])
      
      inline def setXperiodalignment(value: start | middle | end): Self = StObject.set(x, "xperiodalignment", value.asInstanceOf[js.Any])
    }
  }
}
