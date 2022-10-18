package typings.plotlyJs.anon

import typings.plotlyJs.libTracesPieMod.PieFont
import typings.plotlyJs.libTracesPieMod.PieHoverInfo
import typings.plotlyJs.libTracesPieMod.PieInsideTextOrientation
import typings.plotlyJs.libTracesPieMod.PieTextPosition
import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.Datum
import typings.plotlyJs.plotlyJsStrings.clockwise
import typings.plotlyJs.plotlyJsStrings.counterclockwise
import typings.plotlyJs.plotlyJsStrings.label
import typings.plotlyJs.plotlyJsStrings.labelPlussignpercent
import typings.plotlyJs.plotlyJsStrings.labelPlussigntext
import typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignpercent
import typings.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvalue
import typings.plotlyJs.plotlyJsStrings.labelPlussignvalue
import typings.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignpercent
import typings.plotlyJs.plotlyJsStrings.legendonly
import typings.plotlyJs.plotlyJsStrings.none
import typings.plotlyJs.plotlyJsStrings.percent
import typings.plotlyJs.plotlyJsStrings.pie
import typings.plotlyJs.plotlyJsStrings.text
import typings.plotlyJs.plotlyJsStrings.textPlussignpercent
import typings.plotlyJs.plotlyJsStrings.textPlussignvalue
import typings.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignpercent
import typings.plotlyJs.plotlyJsStrings.value
import typings.plotlyJs.plotlyJsStrings.valuePlussignpercent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/pie.PieData> */
trait PartialPieData
  extends StObject
     with Data {
  
  var automargin: js.UndefOr[Boolean] = js.undefined
  
  var customdata: js.UndefOr[js.Array[Datum]] = js.undefined
  
  var direction: js.UndefOr[clockwise | counterclockwise] = js.undefined
  
  var dlabel: js.UndefOr[Double] = js.undefined
  
  var domain: js.UndefOr[PartialPieDomain] = js.undefined
  
  var hole: js.UndefOr[Double] = js.undefined
  
  var hoverinfo: js.UndefOr[PieHoverInfo] = js.undefined
  
  var hoverlabel: js.UndefOr[PartialPieHoverLabel] = js.undefined
  
  var hovertemplate: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var hovertext: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var insidetextfont: js.UndefOr[PieFont] = js.undefined
  
  var insidetextorientation: js.UndefOr[PieInsideTextOrientation] = js.undefined
  
  var label0: js.UndefOr[Double] = js.undefined
  
  var labels: js.UndefOr[js.Array[Datum]] = js.undefined
  
  var legendgroup: js.UndefOr[String] = js.undefined
  
  var marker: js.UndefOr[PartialPieMarker] = js.undefined
  
  var meta: js.UndefOr[Double | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var outsidetextfont: js.UndefOr[PieFont] = js.undefined
  
  var pull: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var scalegroup: js.UndefOr[String] = js.undefined
  
  var showlegend: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[Datum | js.Array[Datum]] = js.undefined
  
  var textfont: js.UndefOr[PieFont] = js.undefined
  
  var textinfo: js.UndefOr[
    label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none
  ] = js.undefined
  
  var textposition: js.UndefOr[PieTextPosition | js.Array[PieTextPosition]] = js.undefined
  
  var texttemplate: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var title: js.UndefOr[PartialPieDataTitle] = js.undefined
  
  var `type`: js.UndefOr[pie] = js.undefined
  
  var uirevision: js.UndefOr[Double | String] = js.undefined
  
  var values: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  var visible: js.UndefOr[Boolean | legendonly] = js.undefined
}
object PartialPieData {
  
  inline def apply(): PartialPieData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPieData]
  }
  
  extension [Self <: PartialPieData](x: Self) {
    
    inline def setAutomargin(value: Boolean): Self = StObject.set(x, "automargin", value.asInstanceOf[js.Any])
    
    inline def setAutomarginUndefined: Self = StObject.set(x, "automargin", js.undefined)
    
    inline def setCustomdata(value: js.Array[Datum]): Self = StObject.set(x, "customdata", value.asInstanceOf[js.Any])
    
    inline def setCustomdataUndefined: Self = StObject.set(x, "customdata", js.undefined)
    
    inline def setCustomdataVarargs(value: Datum*): Self = StObject.set(x, "customdata", js.Array(value*))
    
    inline def setDirection(value: clockwise | counterclockwise): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDlabel(value: Double): Self = StObject.set(x, "dlabel", value.asInstanceOf[js.Any])
    
    inline def setDlabelUndefined: Self = StObject.set(x, "dlabel", js.undefined)
    
    inline def setDomain(value: PartialPieDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setHole(value: Double): Self = StObject.set(x, "hole", value.asInstanceOf[js.Any])
    
    inline def setHoleUndefined: Self = StObject.set(x, "hole", js.undefined)
    
    inline def setHoverinfo(value: PieHoverInfo): Self = StObject.set(x, "hoverinfo", value.asInstanceOf[js.Any])
    
    inline def setHoverinfoUndefined: Self = StObject.set(x, "hoverinfo", js.undefined)
    
    inline def setHoverlabel(value: PartialPieHoverLabel): Self = StObject.set(x, "hoverlabel", value.asInstanceOf[js.Any])
    
    inline def setHoverlabelUndefined: Self = StObject.set(x, "hoverlabel", js.undefined)
    
    inline def setHovertemplate(value: String | js.Array[String]): Self = StObject.set(x, "hovertemplate", value.asInstanceOf[js.Any])
    
    inline def setHovertemplateUndefined: Self = StObject.set(x, "hovertemplate", js.undefined)
    
    inline def setHovertemplateVarargs(value: String*): Self = StObject.set(x, "hovertemplate", js.Array(value*))
    
    inline def setHovertext(value: String | js.Array[String]): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
    
    inline def setHovertextUndefined: Self = StObject.set(x, "hovertext", js.undefined)
    
    inline def setHovertextVarargs(value: String*): Self = StObject.set(x, "hovertext", js.Array(value*))
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setInsidetextfont(value: PieFont): Self = StObject.set(x, "insidetextfont", value.asInstanceOf[js.Any])
    
    inline def setInsidetextfontUndefined: Self = StObject.set(x, "insidetextfont", js.undefined)
    
    inline def setInsidetextorientation(value: PieInsideTextOrientation): Self = StObject.set(x, "insidetextorientation", value.asInstanceOf[js.Any])
    
    inline def setInsidetextorientationUndefined: Self = StObject.set(x, "insidetextorientation", js.undefined)
    
    inline def setLabel0(value: Double): Self = StObject.set(x, "label0", value.asInstanceOf[js.Any])
    
    inline def setLabel0Undefined: Self = StObject.set(x, "label0", js.undefined)
    
    inline def setLabels(value: js.Array[Datum]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: Datum*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLegendgroup(value: String): Self = StObject.set(x, "legendgroup", value.asInstanceOf[js.Any])
    
    inline def setLegendgroupUndefined: Self = StObject.set(x, "legendgroup", js.undefined)
    
    inline def setMarker(value: PartialPieMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMeta(value: Double | String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOutsidetextfont(value: PieFont): Self = StObject.set(x, "outsidetextfont", value.asInstanceOf[js.Any])
    
    inline def setOutsidetextfontUndefined: Self = StObject.set(x, "outsidetextfont", js.undefined)
    
    inline def setPull(value: Double | js.Array[Double]): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setPullVarargs(value: Double*): Self = StObject.set(x, "pull", js.Array(value*))
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScalegroup(value: String): Self = StObject.set(x, "scalegroup", value.asInstanceOf[js.Any])
    
    inline def setScalegroupUndefined: Self = StObject.set(x, "scalegroup", js.undefined)
    
    inline def setShowlegend(value: Boolean): Self = StObject.set(x, "showlegend", value.asInstanceOf[js.Any])
    
    inline def setShowlegendUndefined: Self = StObject.set(x, "showlegend", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setText(value: Datum | js.Array[Datum]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: Datum*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setTextfont(value: PieFont): Self = StObject.set(x, "textfont", value.asInstanceOf[js.Any])
    
    inline def setTextfontUndefined: Self = StObject.set(x, "textfont", js.undefined)
    
    inline def setTextinfo(
      value: label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none
    ): Self = StObject.set(x, "textinfo", value.asInstanceOf[js.Any])
    
    inline def setTextinfoUndefined: Self = StObject.set(x, "textinfo", js.undefined)
    
    inline def setTextposition(value: PieTextPosition | js.Array[PieTextPosition]): Self = StObject.set(x, "textposition", value.asInstanceOf[js.Any])
    
    inline def setTextpositionUndefined: Self = StObject.set(x, "textposition", js.undefined)
    
    inline def setTextpositionVarargs(value: PieTextPosition*): Self = StObject.set(x, "textposition", js.Array(value*))
    
    inline def setTexttemplate(value: String | js.Array[String]): Self = StObject.set(x, "texttemplate", value.asInstanceOf[js.Any])
    
    inline def setTexttemplateUndefined: Self = StObject.set(x, "texttemplate", js.undefined)
    
    inline def setTexttemplateVarargs(value: String*): Self = StObject.set(x, "texttemplate", js.Array(value*))
    
    inline def setTitle(value: PartialPieDataTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: pie): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    inline def setUirevisionUndefined: Self = StObject.set(x, "uirevision", js.undefined)
    
    inline def setValues(value: js.Array[Double | String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setVisible(value: Boolean | legendonly): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
