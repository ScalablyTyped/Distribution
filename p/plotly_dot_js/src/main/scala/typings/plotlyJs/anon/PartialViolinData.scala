package typings.plotlyJs.anon

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
import typings.plotlyJs.scatterMod.ScatterSelectedMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/violin.ViolinData> */
@js.native
trait PartialViolinData extends Data {
  
  var alignmentgroup: js.UndefOr[String] = js.native
  
  var bandwidth: js.UndefOr[Double] = js.native
  
  var box: js.UndefOr[Partialvisiblebooleanwidt] = js.native
  
  var fillcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var hoveron: js.UndefOr[violins | points | kde | all | String] = js.native
  
  var hovertemplate: js.UndefOr[String | js.Array[String]] = js.native
  
  var hovertext: js.UndefOr[String | js.Array[String]] = js.native
  
  var jitter: js.UndefOr[Double] = js.native
  
  var line: js.UndefOr[PartialcolorColorwidthnumColor] = js.native
  
  var marker: js.UndefOr[PartialoutliercolorColors] = js.native
  
  var meanline: js.UndefOr[Partialvisiblebooleancolo] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var offsetgroup: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[v | h] = js.native
  
  var pointpos: js.UndefOr[Double] = js.native
  
  var points: js.UndefOr[all | outliers | suspectedoutliers | `false`] = js.native
  
  var scalegroup: js.UndefOr[String] = js.native
  
  var scalemode: js.UndefOr[width | count] = js.native
  
  var selected: js.UndefOr[ScatterSelectedMarker] = js.native
  
  var side: js.UndefOr[both | positive | negative] = js.native
  
  var span: js.UndefOr[js.Array[_]] = js.native
  
  var spanmode: js.UndefOr[soft | hard | manual] = js.native
  
  var text: js.UndefOr[String | js.Array[String]] = js.native
  
  var `type`: js.UndefOr[violin] = js.native
  
  var unselected: js.UndefOr[ScatterSelectedMarker] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[(js.Array[js.Array[Datum] | Datum]) | TypedArray] = js.native
  
  var x0: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any
  ] = js.native
  
  var y: js.UndefOr[(js.Array[js.Array[Datum] | Datum]) | TypedArray] = js.native
  
  var y0: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
  ] = js.native
}
object PartialViolinData {
  
  @scala.inline
  def apply(): PartialViolinData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialViolinData]
  }
  
  @scala.inline
  implicit class PartialViolinDataOps[Self <: PartialViolinData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignmentgroup(value: String): Self = this.set("alignmentgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentgroup: Self = this.set("alignmentgroup", js.undefined)
    
    @scala.inline
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setBox(value: Partialvisiblebooleanwidt): Self = this.set("box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
    
    @scala.inline
    def setFillcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("fillcolor", js.Array(value :_*))
    
    @scala.inline
    def setFillcolor(value: typings.plotlyJs.mod.Color): Self = this.set("fillcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillcolor: Self = this.set("fillcolor", js.undefined)
    
    @scala.inline
    def setHoveron(value: violins | points | kde | all | String): Self = this.set("hoveron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoveron: Self = this.set("hoveron", js.undefined)
    
    @scala.inline
    def setHovertemplateVarargs(value: String*): Self = this.set("hovertemplate", js.Array(value :_*))
    
    @scala.inline
    def setHovertemplate(value: String | js.Array[String]): Self = this.set("hovertemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHovertemplate: Self = this.set("hovertemplate", js.undefined)
    
    @scala.inline
    def setHovertextVarargs(value: String*): Self = this.set("hovertext", js.Array(value :_*))
    
    @scala.inline
    def setHovertext(value: String | js.Array[String]): Self = this.set("hovertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHovertext: Self = this.set("hovertext", js.undefined)
    
    @scala.inline
    def setJitter(value: Double): Self = this.set("jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJitter: Self = this.set("jitter", js.undefined)
    
    @scala.inline
    def setLine(value: PartialcolorColorwidthnumColor): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setMarker(value: PartialoutliercolorColors): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMeanline(value: Partialvisiblebooleancolo): Self = this.set("meanline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanline: Self = this.set("meanline", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOffsetgroup(value: String): Self = this.set("offsetgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetgroup: Self = this.set("offsetgroup", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOrientation(value: v | h): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPointpos(value: Double): Self = this.set("pointpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointpos: Self = this.set("pointpos", js.undefined)
    
    @scala.inline
    def setPoints(value: all | outliers | suspectedoutliers | `false`): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setScalegroup(value: String): Self = this.set("scalegroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalegroup: Self = this.set("scalegroup", js.undefined)
    
    @scala.inline
    def setScalemode(value: width | count): Self = this.set("scalemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalemode: Self = this.set("scalemode", js.undefined)
    
    @scala.inline
    def setSelected(value: ScatterSelectedMarker): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSide(value: both | positive | negative): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    
    @scala.inline
    def setSpanVarargs(value: js.Any*): Self = this.set("span", js.Array(value :_*))
    
    @scala.inline
    def setSpan(value: js.Array[_]): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
    
    @scala.inline
    def setSpanmode(value: soft | hard | manual): Self = this.set("spanmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpanmode: Self = this.set("spanmode", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String | js.Array[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: violin): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnselected(value: ScatterSelectedMarker): Self = this.set("unselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselected: Self = this.set("unselected", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXVarargs(value: (js.Array[Datum] | Datum)*): Self = this.set("x", js.Array(value :_*))
    
    @scala.inline
    def setX(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setX0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any
    ): Self = this.set("x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX0: Self = this.set("x0", js.undefined)
    
    @scala.inline
    def setYVarargs(value: (js.Array[Datum] | Datum)*): Self = this.set("y", js.Array(value :_*))
    
    @scala.inline
    def setY(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setY0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
    ): Self = this.set("y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY0: Self = this.set("y0", js.undefined)
  }
}
