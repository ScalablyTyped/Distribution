package typings.oracleOraclejet.ojchartMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AlignTickMarks
import typings.oracleOraclejet.anon.AnimationDownColor
import typings.oracleOraclejet.anon.AxisLine
import typings.oracleOraclejet.anon.BackgroundColor
import typings.oracleOraclejet.anon.BaselineScaling
import typings.oracleOraclejet.anon.BorderWidth
import typings.oracleOraclejet.anon.Close
import typings.oracleOraclejet.anon.ComponentName
import typings.oracleOraclejet.anon.Content
import typings.oracleOraclejet.anon.Converter
import typings.oracleOraclejet.anon.Drag
import typings.oracleOraclejet.anon.Insert
import typings.oracleOraclejet.anon.PreventDefault
import typings.oracleOraclejet.anon.Renderer
import typings.oracleOraclejet.anon.X
import typings.oracleOraclejet.ojchartMod.ojChart.DataLabelContext
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.alphaFade
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.area
import typings.oracleOraclejet.oracleOraclejetStrings.ascending
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.boxPlot
import typings.oracleOraclejet.oracleOraclejetStrings.bubble
import typings.oracleOraclejet.oracleOraclejetStrings.cartesian
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.combo
import typings.oracleOraclejet.oracleOraclejetStrings.delayed
import typings.oracleOraclejet.oracleOraclejetStrings.delayedScrollOnly
import typings.oracleOraclejet.oracleOraclejetStrings.descending
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.first
import typings.oracleOraclejet.oracleOraclejetStrings.funnel
import typings.oracleOraclejet.oracleOraclejetStrings.groupsOnly
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.last
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typings.oracleOraclejet.oracleOraclejetStrings.live
import typings.oracleOraclejet.oracleOraclejetStrings.liveScrollOnly
import typings.oracleOraclejet.oracleOraclejetStrings.mixedFrequency
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pan
import typings.oracleOraclejet.oracleOraclejetStrings.pie
import typings.oracleOraclejet.oracleOraclejetStrings.polar
import typings.oracleOraclejet.oracleOraclejetStrings.polygon
import typings.oracleOraclejet.oracleOraclejetStrings.pyramid
import typings.oracleOraclejet.oracleOraclejetStrings.scatter
import typings.oracleOraclejet.oracleOraclejetStrings.select
import typings.oracleOraclejet.oracleOraclejetStrings.seriesOnly
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.skipGaps
import typings.oracleOraclejet.oracleOraclejetStrings.slideToLeft
import typings.oracleOraclejet.oracleOraclejetStrings.slideToRight
import typings.oracleOraclejet.oracleOraclejetStrings.smooth
import typings.oracleOraclejet.oracleOraclejetStrings.snap
import typings.oracleOraclejet.oracleOraclejetStrings.stock
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.user
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import typings.oracleOraclejet.oracleOraclejetStrings.withRescale
import typings.oracleOraclejet.oracleOraclejetStrings.withoutRescale
import typings.oracleOraclejet.oracleOraclejetStrings.x
import typings.oracleOraclejet.oracleOraclejetStrings.y
import typings.oracleOraclejet.oracleOraclejetStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojchart.ojChartSettableProperties<K, D>> */
@js.native
trait ojChartSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  
  var animationOnDataChange: js.UndefOr[auto | slideToLeft | slideToRight | none] = js.native
  
  var animationOnDisplay: js.UndefOr[auto | alphaFade | zoom | none] = js.native
  
  var as: js.UndefOr[String] = js.native
  
  var coordinateSystem: js.UndefOr[polar | cartesian] = js.native
  
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.native
  
  var dataCursor: js.UndefOr[off | on | auto] = js.native
  
  var dataCursorBehavior: js.UndefOr[smooth | snap | auto] = js.native
  
  var dataCursorPosition: js.UndefOr[X] = js.native
  
  var dataLabel: js.UndefOr[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]] = js.native
  
  var dnd: js.UndefOr[Drag] = js.native
  
  var dragMode: js.UndefOr[pan | zoom | select | off | user] = js.native
  
  var drilling: js.UndefOr[on | seriesOnly | groupsOnly | off] = js.native
  
  var groupComparator: js.UndefOr[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null] = js.native
  
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.native
  
  var hideAndShowBehavior: js.UndefOr[withRescale | withoutRescale | none] = js.native
  
  var highlightMatch: js.UndefOr[any | all] = js.native
  
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.native
  
  var hoverBehavior: js.UndefOr[dim | none] = js.native
  
  var initialZooming: js.UndefOr[first | last | none] = js.native
  
  var legend: js.UndefOr[BackgroundColor] = js.native
  
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  
  var otherThreshold: js.UndefOr[Double] = js.native
  
  var overview: js.UndefOr[Content] = js.native
  
  var pieCenter: js.UndefOr[Converter] = js.native
  
  var plotArea: js.UndefOr[BorderWidth] = js.native
  
  var polarGridShape: js.UndefOr[polygon | circle] = js.native
  
  var selection: js.UndefOr[js.Array[K]] = js.native
  
  var selectionMode: js.UndefOr[single | multiple | none] = js.native
  
  var seriesComparator: js.UndefOr[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null] = js.native
  
  var sorting: js.UndefOr[ascending | descending | off] = js.native
  
  var splitDualY: js.UndefOr[on | off | auto] = js.native
  
  var splitterPosition: js.UndefOr[Double] = js.native
  
  var stack: js.UndefOr[on | off] = js.native
  
  var stackLabel: js.UndefOr[on | off] = js.native
  
  var styleDefaults: js.UndefOr[AnimationDownColor] = js.native
  
  var timeAxisType: js.UndefOr[enabled | mixedFrequency | skipGaps | disabled | auto] = js.native
  
  var tooltip: js.UndefOr[Renderer] = js.native
  
  var touchResponse: js.UndefOr[touchStart | auto] = js.native
  
  var trackResize: js.UndefOr[on | off] = js.native
  
  var translations: js.UndefOr[ComponentName] = js.native
  
  var `type`: js.UndefOr[
    line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  ] = js.native
  
  var valueFormats: js.UndefOr[Close] = js.native
  
  var xAxis: js.UndefOr[AxisLine] = js.native
  
  var y2Axis: js.UndefOr[AlignTickMarks] = js.native
  
  var yAxis: js.UndefOr[BaselineScaling] = js.native
  
  var zoomAndScroll: js.UndefOr[delayedScrollOnly | liveScrollOnly | delayed | live | off] = js.native
  
  var zoomDirection: js.UndefOr[x | y | auto] = js.native
}
object ojChartSettablePropertiesLenient {
  
  @scala.inline
  def apply[K, D](): ojChartSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojChartSettablePropertiesLenient[K, D]]
  }
  
  @scala.inline
  implicit class ojChartSettablePropertiesLenientOps[Self <: ojChartSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojChartSettablePropertiesLenient[K, D])) extends AnyVal {
    
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
    def setAnimationOnDataChange(value: auto | slideToLeft | slideToRight | none): Self = this.set("animationOnDataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationOnDataChange: Self = this.set("animationOnDataChange", js.undefined)
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | alphaFade | zoom | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationOnDisplay: Self = this.set("animationOnDisplay", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setCoordinateSystem(value: polar | cartesian): Self = this.set("coordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinateSystem: Self = this.set("coordinateSystem", js.undefined)
    
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setDataCursor(value: off | on | auto): Self = this.set("dataCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCursor: Self = this.set("dataCursor", js.undefined)
    
    @scala.inline
    def setDataCursorBehavior(value: smooth | snap | auto): Self = this.set("dataCursorBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCursorBehavior: Self = this.set("dataCursorBehavior", js.undefined)
    
    @scala.inline
    def setDataCursorPosition(value: X): Self = this.set("dataCursorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCursorPosition: Self = this.set("dataCursorPosition", js.undefined)
    
    @scala.inline
    def setDataLabel(value: /* context */ DataLabelContext => Insert | PreventDefault): Self = this.set("dataLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataLabel: Self = this.set("dataLabel", js.undefined)
    
    @scala.inline
    def setDnd(value: Drag): Self = this.set("dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnd: Self = this.set("dnd", js.undefined)
    
    @scala.inline
    def setDragMode(value: pan | zoom | select | off | user): Self = this.set("dragMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragMode: Self = this.set("dragMode", js.undefined)
    
    @scala.inline
    def setDrilling(value: on | seriesOnly | groupsOnly | off): Self = this.set("drilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrilling: Self = this.set("drilling", js.undefined)
    
    @scala.inline
    def setGroupComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = this.set("groupComparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupComparator: Self = this.set("groupComparator", js.undefined)
    
    @scala.inline
    def setGroupComparatorNull: Self = this.set("groupComparator", null)
    
    @scala.inline
    def setHiddenCategoriesVarargs(value: String*): Self = this.set("hiddenCategories", js.Array(value :_*))
    
    @scala.inline
    def setHiddenCategories(value: js.Array[String]): Self = this.set("hiddenCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenCategories: Self = this.set("hiddenCategories", js.undefined)
    
    @scala.inline
    def setHideAndShowBehavior(value: withRescale | withoutRescale | none): Self = this.set("hideAndShowBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideAndShowBehavior: Self = this.set("hideAndShowBehavior", js.undefined)
    
    @scala.inline
    def setHighlightMatch(value: any | all): Self = this.set("highlightMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightMatch: Self = this.set("highlightMatch", js.undefined)
    
    @scala.inline
    def setHighlightedCategoriesVarargs(value: String*): Self = this.set("highlightedCategories", js.Array(value :_*))
    
    @scala.inline
    def setHighlightedCategories(value: js.Array[String]): Self = this.set("highlightedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightedCategories: Self = this.set("highlightedCategories", js.undefined)
    
    @scala.inline
    def setHoverBehavior(value: dim | none): Self = this.set("hoverBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverBehavior: Self = this.set("hoverBehavior", js.undefined)
    
    @scala.inline
    def setInitialZooming(value: first | last | none): Self = this.set("initialZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialZooming: Self = this.set("initialZooming", js.undefined)
    
    @scala.inline
    def setLegend(value: BackgroundColor): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setOtherThreshold(value: Double): Self = this.set("otherThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherThreshold: Self = this.set("otherThreshold", js.undefined)
    
    @scala.inline
    def setOverview(value: Content): Self = this.set("overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    
    @scala.inline
    def setPieCenter(value: Converter): Self = this.set("pieCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieCenter: Self = this.set("pieCenter", js.undefined)
    
    @scala.inline
    def setPlotArea(value: BorderWidth): Self = this.set("plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlotArea: Self = this.set("plotArea", js.undefined)
    
    @scala.inline
    def setPolarGridShape(value: polygon | circle): Self = this.set("polarGridShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolarGridShape: Self = this.set("polarGridShape", js.undefined)
    
    @scala.inline
    def setSelectionVarargs(value: K*): Self = this.set("selection", js.Array(value :_*))
    
    @scala.inline
    def setSelection(value: js.Array[K]): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: single | multiple | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setSeriesComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = this.set("seriesComparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSeriesComparator: Self = this.set("seriesComparator", js.undefined)
    
    @scala.inline
    def setSeriesComparatorNull: Self = this.set("seriesComparator", null)
    
    @scala.inline
    def setSorting(value: ascending | descending | off): Self = this.set("sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    
    @scala.inline
    def setSplitDualY(value: on | off | auto): Self = this.set("splitDualY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitDualY: Self = this.set("splitDualY", js.undefined)
    
    @scala.inline
    def setSplitterPosition(value: Double): Self = this.set("splitterPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitterPosition: Self = this.set("splitterPosition", js.undefined)
    
    @scala.inline
    def setStack(value: on | off): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setStackLabel(value: on | off): Self = this.set("stackLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackLabel: Self = this.set("stackLabel", js.undefined)
    
    @scala.inline
    def setStyleDefaults(value: AnimationDownColor): Self = this.set("styleDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleDefaults: Self = this.set("styleDefaults", js.undefined)
    
    @scala.inline
    def setTimeAxisType(value: enabled | mixedFrequency | skipGaps | disabled | auto): Self = this.set("timeAxisType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeAxisType: Self = this.set("timeAxisType", js.undefined)
    
    @scala.inline
    def setTooltip(value: Renderer): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTouchResponse(value: touchStart | auto): Self = this.set("touchResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchResponse: Self = this.set("touchResponse", js.undefined)
    
    @scala.inline
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    
    @scala.inline
    def setTranslations(value: ComponentName): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    
    @scala.inline
    def setType(
      value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueFormats(value: Close): Self = this.set("valueFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueFormats: Self = this.set("valueFormats", js.undefined)
    
    @scala.inline
    def setXAxis(value: AxisLine): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    
    @scala.inline
    def setY2Axis(value: AlignTickMarks): Self = this.set("y2Axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2Axis: Self = this.set("y2Axis", js.undefined)
    
    @scala.inline
    def setYAxis(value: BaselineScaling): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
    
    @scala.inline
    def setZoomAndScroll(value: delayedScrollOnly | liveScrollOnly | delayed | live | off): Self = this.set("zoomAndScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomAndScroll: Self = this.set("zoomAndScroll", js.undefined)
    
    @scala.inline
    def setZoomDirection(value: typings.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self = this.set("zoomDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomDirection: Self = this.set("zoomDirection", js.undefined)
  }
}
