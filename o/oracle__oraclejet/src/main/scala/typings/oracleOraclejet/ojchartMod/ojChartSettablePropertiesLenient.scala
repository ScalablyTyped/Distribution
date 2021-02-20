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
import org.scalablytyped.runtime.StObject
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
  implicit class ojChartSettablePropertiesLenientMutableBuilder[Self <: ojChartSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojChartSettablePropertiesLenient[K, D])) extends AnyVal {
    
    @scala.inline
    def setAnimationOnDataChange(value: auto | slideToLeft | slideToRight | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDataChangeUndefined: Self = StObject.set(x, "animationOnDataChange", js.undefined)
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | alphaFade | zoom | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplayUndefined: Self = StObject.set(x, "animationOnDisplay", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setCoordinateSystem(value: polar | cartesian): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinateSystemUndefined: Self = StObject.set(x, "coordinateSystem", js.undefined)
    
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCursor(value: off | on | auto): Self = StObject.set(x, "dataCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCursorBehavior(value: smooth | snap | auto): Self = StObject.set(x, "dataCursorBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCursorBehaviorUndefined: Self = StObject.set(x, "dataCursorBehavior", js.undefined)
    
    @scala.inline
    def setDataCursorPosition(value: X): Self = StObject.set(x, "dataCursorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCursorPositionUndefined: Self = StObject.set(x, "dataCursorPosition", js.undefined)
    
    @scala.inline
    def setDataCursorUndefined: Self = StObject.set(x, "dataCursor", js.undefined)
    
    @scala.inline
    def setDataLabel(value: /* context */ DataLabelContext => Insert | PreventDefault): Self = StObject.set(x, "dataLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDnd(value: Drag): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    @scala.inline
    def setDragMode(value: pan | zoom | select | off | user): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragModeUndefined: Self = StObject.set(x, "dragMode", js.undefined)
    
    @scala.inline
    def setDrilling(value: on | seriesOnly | groupsOnly | off): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillingUndefined: Self = StObject.set(x, "drilling", js.undefined)
    
    @scala.inline
    def setGroupComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = StObject.set(x, "groupComparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupComparatorNull: Self = StObject.set(x, "groupComparator", null)
    
    @scala.inline
    def setGroupComparatorUndefined: Self = StObject.set(x, "groupComparator", js.undefined)
    
    @scala.inline
    def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenCategoriesUndefined: Self = StObject.set(x, "hiddenCategories", js.undefined)
    
    @scala.inline
    def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value :_*))
    
    @scala.inline
    def setHideAndShowBehavior(value: withRescale | withoutRescale | none): Self = StObject.set(x, "hideAndShowBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAndShowBehaviorUndefined: Self = StObject.set(x, "hideAndShowBehavior", js.undefined)
    
    @scala.inline
    def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightMatchUndefined: Self = StObject.set(x, "highlightMatch", js.undefined)
    
    @scala.inline
    def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedCategoriesUndefined: Self = StObject.set(x, "highlightedCategories", js.undefined)
    
    @scala.inline
    def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value :_*))
    
    @scala.inline
    def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorUndefined: Self = StObject.set(x, "hoverBehavior", js.undefined)
    
    @scala.inline
    def setInitialZooming(value: first | last | none): Self = StObject.set(x, "initialZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialZoomingUndefined: Self = StObject.set(x, "initialZooming", js.undefined)
    
    @scala.inline
    def setLegend(value: BackgroundColor): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setOtherThreshold(value: Double): Self = StObject.set(x, "otherThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherThresholdUndefined: Self = StObject.set(x, "otherThreshold", js.undefined)
    
    @scala.inline
    def setOverview(value: Content): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    @scala.inline
    def setPieCenter(value: Converter): Self = StObject.set(x, "pieCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieCenterUndefined: Self = StObject.set(x, "pieCenter", js.undefined)
    
    @scala.inline
    def setPlotArea(value: BorderWidth): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    @scala.inline
    def setPolarGridShape(value: polygon | circle): Self = StObject.set(x, "polarGridShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolarGridShapeUndefined: Self = StObject.set(x, "polarGridShape", js.undefined)
    
    @scala.inline
    def setSelection(value: js.Array[K]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setSelectionVarargs(value: K*): Self = StObject.set(x, "selection", js.Array(value :_*))
    
    @scala.inline
    def setSeriesComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = StObject.set(x, "seriesComparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesComparatorNull: Self = StObject.set(x, "seriesComparator", null)
    
    @scala.inline
    def setSeriesComparatorUndefined: Self = StObject.set(x, "seriesComparator", js.undefined)
    
    @scala.inline
    def setSorting(value: ascending | descending | off): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    @scala.inline
    def setSplitDualY(value: on | off | auto): Self = StObject.set(x, "splitDualY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitDualYUndefined: Self = StObject.set(x, "splitDualY", js.undefined)
    
    @scala.inline
    def setSplitterPosition(value: Double): Self = StObject.set(x, "splitterPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitterPositionUndefined: Self = StObject.set(x, "splitterPosition", js.undefined)
    
    @scala.inline
    def setStack(value: on | off): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackLabel(value: on | off): Self = StObject.set(x, "stackLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackLabelUndefined: Self = StObject.set(x, "stackLabel", js.undefined)
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setStyleDefaults(value: AnimationDownColor): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleDefaultsUndefined: Self = StObject.set(x, "styleDefaults", js.undefined)
    
    @scala.inline
    def setTimeAxisType(value: enabled | mixedFrequency | skipGaps | disabled | auto): Self = StObject.set(x, "timeAxisType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeAxisTypeUndefined: Self = StObject.set(x, "timeAxisType", js.undefined)
    
    @scala.inline
    def setTooltip(value: Renderer): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchResponseUndefined: Self = StObject.set(x, "touchResponse", js.undefined)
    
    @scala.inline
    def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    @scala.inline
    def setTranslations(value: ComponentName): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setType(
      value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValueFormats(value: Close): Self = StObject.set(x, "valueFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFormatsUndefined: Self = StObject.set(x, "valueFormats", js.undefined)
    
    @scala.inline
    def setXAxis(value: AxisLine): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    @scala.inline
    def setY2Axis(value: AlignTickMarks): Self = StObject.set(x, "y2Axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2AxisUndefined: Self = StObject.set(x, "y2Axis", js.undefined)
    
    @scala.inline
    def setYAxis(value: BaselineScaling): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    @scala.inline
    def setZoomAndScroll(value: delayedScrollOnly | liveScrollOnly | delayed | live | off): Self = StObject.set(x, "zoomAndScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAndScrollUndefined: Self = StObject.set(x, "zoomAndScroll", js.undefined)
    
    @scala.inline
    def setZoomDirection(value: typings.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self = StObject.set(x, "zoomDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomDirectionUndefined: Self = StObject.set(x, "zoomDirection", js.undefined)
  }
}
