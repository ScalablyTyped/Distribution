package typings.plotlyJs

import typings.plotlyJs.anon.PartialcolorColorwidthnumColor
import typings.plotlyJs.anon.PartialoutliercolorColors
import typings.plotlyJs.anon.Partialvisiblebooleancolo
import typings.plotlyJs.anon.Partialvisiblebooleanwidt
import typings.plotlyJs.mod.Color
import typings.plotlyJs.mod.Datum
import typings.plotlyJs.mod.TypedArray
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsStrings.all
import typings.plotlyJs.plotlyJsStrings.both
import typings.plotlyJs.plotlyJsStrings.count
import typings.plotlyJs.plotlyJsStrings.h
import typings.plotlyJs.plotlyJsStrings.hard
import typings.plotlyJs.plotlyJsStrings.kde
import typings.plotlyJs.plotlyJsStrings.manual
import typings.plotlyJs.plotlyJsStrings.negative
import typings.plotlyJs.plotlyJsStrings.outliers
import typings.plotlyJs.plotlyJsStrings.points
import typings.plotlyJs.plotlyJsStrings.positive
import typings.plotlyJs.plotlyJsStrings.soft
import typings.plotlyJs.plotlyJsStrings.suspectedoutliers
import typings.plotlyJs.plotlyJsStrings.v
import typings.plotlyJs.plotlyJsStrings.violin
import typings.plotlyJs.plotlyJsStrings.violins
import typings.plotlyJs.plotlyJsStrings.width
import typings.plotlyJs.scatterMod.ScatterSelectedMarker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object violinMod {
  
  trait ViolinData extends StObject {
    
    var alignmentgroup: String
    
    var bandwidth: Double
    
    var box: Partialvisiblebooleanwidt
    
    var fillcolor: Color
    
    var hoveron: violins | points | kde | all | String
    
    var hovertemplate: String | js.Array[String]
    
    var hovertext: String | js.Array[String]
    
    var jitter: Double
    
    var line: PartialcolorColorwidthnumColor
    
    var marker: PartialoutliercolorColors
    
    var meanline: Partialvisiblebooleancolo
    
    var name: String
    
    var offsetgroup: String
    
    var opacity: Double
    
    // Missing from the list of attributes
    var orientation: v | h
    
    var pointpos: Double
    
    var points: all | outliers | suspectedoutliers | `false`
    
    var scalegroup: String
    
    var scalemode: width | count
    
    var selected: ScatterSelectedMarker
    
    var side: both | positive | negative
    
    var span: js.Array[js.Any]
    
    var spanmode: soft | hard | manual
    
    var text: String | js.Array[String]
    
    var `type`: violin
    
    var unselected: ScatterSelectedMarker
    
    var width: Double
    
    var x: (js.Array[js.Array[Datum] | Datum]) | TypedArray
    
    var x0: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any
    
    var y: (js.Array[js.Array[Datum] | Datum]) | TypedArray
    
    var y0: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
  }
  object ViolinData {
    
    inline def apply(
      alignmentgroup: String,
      bandwidth: Double,
      box: Partialvisiblebooleanwidt,
      fillcolor: Color,
      hoveron: violins | points | kde | all | String,
      hovertemplate: String | js.Array[String],
      hovertext: String | js.Array[String],
      jitter: Double,
      line: PartialcolorColorwidthnumColor,
      marker: PartialoutliercolorColors,
      meanline: Partialvisiblebooleancolo,
      name: String,
      offsetgroup: String,
      opacity: Double,
      orientation: v | h,
      pointpos: Double,
      points: all | outliers | suspectedoutliers | `false`,
      scalegroup: String,
      scalemode: width | count,
      selected: ScatterSelectedMarker,
      side: both | positive | negative,
      span: js.Array[js.Any],
      spanmode: soft | hard | manual,
      text: String | js.Array[String],
      unselected: ScatterSelectedMarker,
      width: Double,
      x: (js.Array[js.Array[Datum] | Datum]) | TypedArray,
      x0: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any,
      y: (js.Array[js.Array[Datum] | Datum]) | TypedArray,
      y0: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
    ): ViolinData = {
      val __obj = js.Dynamic.literal(alignmentgroup = alignmentgroup.asInstanceOf[js.Any], bandwidth = bandwidth.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], fillcolor = fillcolor.asInstanceOf[js.Any], hoveron = hoveron.asInstanceOf[js.Any], hovertemplate = hovertemplate.asInstanceOf[js.Any], hovertext = hovertext.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], meanline = meanline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetgroup = offsetgroup.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pointpos = pointpos.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], scalegroup = scalegroup.asInstanceOf[js.Any], scalemode = scalemode.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], spanmode = spanmode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], unselected = unselected.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("violin")
      __obj.asInstanceOf[ViolinData]
    }
    
    extension [Self <: ViolinData](x: Self) {
      
      inline def setAlignmentgroup(value: String): Self = StObject.set(x, "alignmentgroup", value.asInstanceOf[js.Any])
      
      inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
      
      inline def setBox(value: Partialvisiblebooleanwidt): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setFillcolor(value: Color): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
      
      inline def setFillcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "fillcolor", js.Array(value :_*))
      
      inline def setHoveron(value: violins | points | kde | all | String): Self = StObject.set(x, "hoveron", value.asInstanceOf[js.Any])
      
      inline def setHovertemplate(value: String | js.Array[String]): Self = StObject.set(x, "hovertemplate", value.asInstanceOf[js.Any])
      
      inline def setHovertemplateVarargs(value: String*): Self = StObject.set(x, "hovertemplate", js.Array(value :_*))
      
      inline def setHovertext(value: String | js.Array[String]): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
      
      inline def setHovertextVarargs(value: String*): Self = StObject.set(x, "hovertext", js.Array(value :_*))
      
      inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      inline def setLine(value: PartialcolorColorwidthnumColor): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: PartialoutliercolorColors): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMeanline(value: Partialvisiblebooleancolo): Self = StObject.set(x, "meanline", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOffsetgroup(value: String): Self = StObject.set(x, "offsetgroup", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setPointpos(value: Double): Self = StObject.set(x, "pointpos", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: all | outliers | suspectedoutliers | `false`): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setScalegroup(value: String): Self = StObject.set(x, "scalegroup", value.asInstanceOf[js.Any])
      
      inline def setScalemode(value: width | count): Self = StObject.set(x, "scalemode", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: ScatterSelectedMarker): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSide(value: both | positive | negative): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: js.Array[js.Any]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanVarargs(value: js.Any*): Self = StObject.set(x, "span", js.Array(value :_*))
      
      inline def setSpanmode(value: soft | hard | manual): Self = StObject.set(x, "spanmode", value.asInstanceOf[js.Any])
      
      inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
      
      inline def setType(value: violin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnselected(value: ScatterSelectedMarker): Self = StObject.set(x, "unselected", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX0(
        value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any
      ): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      inline def setXVarargs(value: (js.Array[Datum] | Datum)*): Self = StObject.set(x, "x", js.Array(value :_*))
      
      inline def setY(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY0(
        value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
      ): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setYVarargs(value: (js.Array[Datum] | Datum)*): Self = StObject.set(x, "y", js.Array(value :_*))
    }
  }
}
