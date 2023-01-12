package typings.plotlyJs.anon

import typings.plotlyJs.libTracesScatterMod.ScatterSelectedMarker
import typings.plotlyJs.mod.Data
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/violin.ViolinData> */
trait PartialViolinData
  extends StObject
     with Data {
  
  var alignmentgroup: js.UndefOr[String] = js.undefined
  
  var bandwidth: js.UndefOr[Double] = js.undefined
  
  var box: js.UndefOr[Partialvisiblebooleanwidt] = js.undefined
  
  var fillcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var hoveron: js.UndefOr[violins | points | kde | all | String] = js.undefined
  
  var hovertemplate: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var hovertext: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var jitter: js.UndefOr[Double] = js.undefined
  
  var line: js.UndefOr[PartialcolorColorwidthnumColor] = js.undefined
  
  var marker: js.UndefOr[PartialBoxPlotMarkerColor] = js.undefined
  
  var meanline: js.UndefOr[Partialvisiblebooleancolo] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var offsetgroup: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[v | h] = js.undefined
  
  var pointpos: js.UndefOr[Double] = js.undefined
  
  var points: js.UndefOr[all | outliers | suspectedoutliers | `false`] = js.undefined
  
  var scalegroup: js.UndefOr[String] = js.undefined
  
  var scalemode: js.UndefOr[width | count] = js.undefined
  
  var selected: js.UndefOr[ScatterSelectedMarker] = js.undefined
  
  var side: js.UndefOr[both | positive | negative] = js.undefined
  
  var span: js.UndefOr[js.Array[Any]] = js.undefined
  
  var spanmode: js.UndefOr[soft | hard | manual] = js.undefined
  
  var text: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var `type`: js.UndefOr[violin] = js.undefined
  
  var unselected: js.UndefOr[ScatterSelectedMarker] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[(js.Array[js.Array[Datum] | Datum]) | TypedArray] = js.undefined
  
  var x0: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any
  ] = js.undefined
  
  var y: js.UndefOr[(js.Array[js.Array[Datum] | Datum]) | TypedArray] = js.undefined
  
  var y0: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
  ] = js.undefined
}
object PartialViolinData {
  
  inline def apply(): PartialViolinData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialViolinData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialViolinData] (val x: Self) extends AnyVal {
    
    inline def setAlignmentgroup(value: String): Self = StObject.set(x, "alignmentgroup", value.asInstanceOf[js.Any])
    
    inline def setAlignmentgroupUndefined: Self = StObject.set(x, "alignmentgroup", js.undefined)
    
    inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setBox(value: Partialvisiblebooleanwidt): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
    
    inline def setFillcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
    
    inline def setFillcolorUndefined: Self = StObject.set(x, "fillcolor", js.undefined)
    
    inline def setFillcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "fillcolor", js.Array(value*))
    
    inline def setHoveron(value: violins | points | kde | all | String): Self = StObject.set(x, "hoveron", value.asInstanceOf[js.Any])
    
    inline def setHoveronUndefined: Self = StObject.set(x, "hoveron", js.undefined)
    
    inline def setHovertemplate(value: String | js.Array[String]): Self = StObject.set(x, "hovertemplate", value.asInstanceOf[js.Any])
    
    inline def setHovertemplateUndefined: Self = StObject.set(x, "hovertemplate", js.undefined)
    
    inline def setHovertemplateVarargs(value: String*): Self = StObject.set(x, "hovertemplate", js.Array(value*))
    
    inline def setHovertext(value: String | js.Array[String]): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
    
    inline def setHovertextUndefined: Self = StObject.set(x, "hovertext", js.undefined)
    
    inline def setHovertextVarargs(value: String*): Self = StObject.set(x, "hovertext", js.Array(value*))
    
    inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    inline def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    inline def setLine(value: PartialcolorColorwidthnumColor): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMarker(value: PartialBoxPlotMarkerColor): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMeanline(value: Partialvisiblebooleancolo): Self = StObject.set(x, "meanline", value.asInstanceOf[js.Any])
    
    inline def setMeanlineUndefined: Self = StObject.set(x, "meanline", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffsetgroup(value: String): Self = StObject.set(x, "offsetgroup", value.asInstanceOf[js.Any])
    
    inline def setOffsetgroupUndefined: Self = StObject.set(x, "offsetgroup", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPointpos(value: Double): Self = StObject.set(x, "pointpos", value.asInstanceOf[js.Any])
    
    inline def setPointposUndefined: Self = StObject.set(x, "pointpos", js.undefined)
    
    inline def setPoints(value: all | outliers | suspectedoutliers | `false`): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setScalegroup(value: String): Self = StObject.set(x, "scalegroup", value.asInstanceOf[js.Any])
    
    inline def setScalegroupUndefined: Self = StObject.set(x, "scalegroup", js.undefined)
    
    inline def setScalemode(value: width | count): Self = StObject.set(x, "scalemode", value.asInstanceOf[js.Any])
    
    inline def setScalemodeUndefined: Self = StObject.set(x, "scalemode", js.undefined)
    
    inline def setSelected(value: ScatterSelectedMarker): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSide(value: both | positive | negative): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSpan(value: js.Array[Any]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setSpanVarargs(value: Any*): Self = StObject.set(x, "span", js.Array(value*))
    
    inline def setSpanmode(value: soft | hard | manual): Self = StObject.set(x, "spanmode", value.asInstanceOf[js.Any])
    
    inline def setSpanmodeUndefined: Self = StObject.set(x, "spanmode", js.undefined)
    
    inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setType(value: violin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnselected(value: ScatterSelectedMarker): Self = StObject.set(x, "unselected", value.asInstanceOf[js.Any])
    
    inline def setUnselectedUndefined: Self = StObject.set(x, "unselected", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any
    ): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setX0Undefined: Self = StObject.set(x, "x0", js.undefined)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: (js.Array[Datum] | Datum)*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
    ): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: (js.Array[Datum] | Datum)*): Self = StObject.set(x, "y", js.Array(value*))
  }
}
