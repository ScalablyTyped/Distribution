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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojchart.ojChartSettableProperties<K, D>> */
trait ojChartSettablePropertiesLenient[K, D]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var animationOnDataChange: js.UndefOr[auto | slideToLeft | slideToRight | none] = js.undefined
  
  var animationOnDisplay: js.UndefOr[auto | alphaFade | zoom | none] = js.undefined
  
  var as: js.UndefOr[String] = js.undefined
  
  var coordinateSystem: js.UndefOr[polar | cartesian] = js.undefined
  
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.undefined
  
  var dataCursor: js.UndefOr[off | on | auto] = js.undefined
  
  var dataCursorBehavior: js.UndefOr[smooth | snap | auto] = js.undefined
  
  var dataCursorPosition: js.UndefOr[X] = js.undefined
  
  var dataLabel: js.UndefOr[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]] = js.undefined
  
  var dnd: js.UndefOr[Drag] = js.undefined
  
  var dragMode: js.UndefOr[pan | zoom | select | off | user] = js.undefined
  
  var drilling: js.UndefOr[on | seriesOnly | groupsOnly | off] = js.undefined
  
  var groupComparator: js.UndefOr[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null] = js.undefined
  
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  var hideAndShowBehavior: js.UndefOr[withRescale | withoutRescale | none] = js.undefined
  
  var highlightMatch: js.UndefOr[any | all] = js.undefined
  
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  
  var initialZooming: js.UndefOr[first | last | none] = js.undefined
  
  var legend: js.UndefOr[BackgroundColor] = js.undefined
  
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  var otherThreshold: js.UndefOr[Double] = js.undefined
  
  var overview: js.UndefOr[Content] = js.undefined
  
  var pieCenter: js.UndefOr[Converter] = js.undefined
  
  var plotArea: js.UndefOr[BorderWidth] = js.undefined
  
  var polarGridShape: js.UndefOr[polygon | circle] = js.undefined
  
  var selection: js.UndefOr[js.Array[K]] = js.undefined
  
  var selectionMode: js.UndefOr[single | multiple | none] = js.undefined
  
  var seriesComparator: js.UndefOr[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null] = js.undefined
  
  var sorting: js.UndefOr[ascending | descending | off] = js.undefined
  
  var splitDualY: js.UndefOr[on | off | auto] = js.undefined
  
  var splitterPosition: js.UndefOr[Double] = js.undefined
  
  var stack: js.UndefOr[on | off] = js.undefined
  
  var stackLabel: js.UndefOr[on | off] = js.undefined
  
  var styleDefaults: js.UndefOr[AnimationDownColor] = js.undefined
  
  var timeAxisType: js.UndefOr[enabled | mixedFrequency | skipGaps | disabled | auto] = js.undefined
  
  var tooltip: js.UndefOr[Renderer] = js.undefined
  
  var touchResponse: js.UndefOr[touchStart | auto] = js.undefined
  
  var trackResize: js.UndefOr[on | off] = js.undefined
  
  var translations: js.UndefOr[ComponentName] = js.undefined
  
  var `type`: js.UndefOr[
    line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  ] = js.undefined
  
  var valueFormats: js.UndefOr[Close] = js.undefined
  
  var xAxis: js.UndefOr[AxisLine] = js.undefined
  
  var y2Axis: js.UndefOr[AlignTickMarks] = js.undefined
  
  var yAxis: js.UndefOr[BaselineScaling] = js.undefined
  
  var zoomAndScroll: js.UndefOr[delayedScrollOnly | liveScrollOnly | delayed | live | off] = js.undefined
  
  var zoomDirection: js.UndefOr[x | y | auto] = js.undefined
}
object ojChartSettablePropertiesLenient {
  
  inline def apply[K, D](): ojChartSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojChartSettablePropertiesLenient[K, D]]
  }
  
  extension [Self <: ojChartSettablePropertiesLenient[?, ?], K, D](x: Self & (ojChartSettablePropertiesLenient[K, D])) {
    
    inline def setAnimationOnDataChange(value: auto | slideToLeft | slideToRight | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDataChangeUndefined: Self = StObject.set(x, "animationOnDataChange", js.undefined)
    
    inline def setAnimationOnDisplay(value: auto | alphaFade | zoom | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayUndefined: Self = StObject.set(x, "animationOnDisplay", js.undefined)
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setCoordinateSystem(value: polar | cartesian): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
    
    inline def setCoordinateSystemUndefined: Self = StObject.set(x, "coordinateSystem", js.undefined)
    
    inline def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataCursor(value: off | on | auto): Self = StObject.set(x, "dataCursor", value.asInstanceOf[js.Any])
    
    inline def setDataCursorBehavior(value: smooth | snap | auto): Self = StObject.set(x, "dataCursorBehavior", value.asInstanceOf[js.Any])
    
    inline def setDataCursorBehaviorUndefined: Self = StObject.set(x, "dataCursorBehavior", js.undefined)
    
    inline def setDataCursorPosition(value: X): Self = StObject.set(x, "dataCursorPosition", value.asInstanceOf[js.Any])
    
    inline def setDataCursorPositionUndefined: Self = StObject.set(x, "dataCursorPosition", js.undefined)
    
    inline def setDataCursorUndefined: Self = StObject.set(x, "dataCursor", js.undefined)
    
    inline def setDataLabel(value: /* context */ DataLabelContext => Insert | PreventDefault): Self = StObject.set(x, "dataLabel", js.Any.fromFunction1(value))
    
    inline def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDnd(value: Drag): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    inline def setDragMode(value: pan | zoom | select | off | user): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
    
    inline def setDragModeUndefined: Self = StObject.set(x, "dragMode", js.undefined)
    
    inline def setDrilling(value: on | seriesOnly | groupsOnly | off): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    inline def setDrillingUndefined: Self = StObject.set(x, "drilling", js.undefined)
    
    inline def setGroupComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = StObject.set(x, "groupComparator", js.Any.fromFunction2(value))
    
    inline def setGroupComparatorNull: Self = StObject.set(x, "groupComparator", null)
    
    inline def setGroupComparatorUndefined: Self = StObject.set(x, "groupComparator", js.undefined)
    
    inline def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesUndefined: Self = StObject.set(x, "hiddenCategories", js.undefined)
    
    inline def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value*))
    
    inline def setHideAndShowBehavior(value: withRescale | withoutRescale | none): Self = StObject.set(x, "hideAndShowBehavior", value.asInstanceOf[js.Any])
    
    inline def setHideAndShowBehaviorUndefined: Self = StObject.set(x, "hideAndShowBehavior", js.undefined)
    
    inline def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    inline def setHighlightMatchUndefined: Self = StObject.set(x, "highlightMatch", js.undefined)
    
    inline def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesUndefined: Self = StObject.set(x, "highlightedCategories", js.undefined)
    
    inline def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value*))
    
    inline def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorUndefined: Self = StObject.set(x, "hoverBehavior", js.undefined)
    
    inline def setInitialZooming(value: first | last | none): Self = StObject.set(x, "initialZooming", value.asInstanceOf[js.Any])
    
    inline def setInitialZoomingUndefined: Self = StObject.set(x, "initialZooming", js.undefined)
    
    inline def setLegend(value: BackgroundColor): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOtherThreshold(value: Double): Self = StObject.set(x, "otherThreshold", value.asInstanceOf[js.Any])
    
    inline def setOtherThresholdUndefined: Self = StObject.set(x, "otherThreshold", js.undefined)
    
    inline def setOverview(value: Content): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setPieCenter(value: Converter): Self = StObject.set(x, "pieCenter", value.asInstanceOf[js.Any])
    
    inline def setPieCenterUndefined: Self = StObject.set(x, "pieCenter", js.undefined)
    
    inline def setPlotArea(value: BorderWidth): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    inline def setPolarGridShape(value: polygon | circle): Self = StObject.set(x, "polarGridShape", value.asInstanceOf[js.Any])
    
    inline def setPolarGridShapeUndefined: Self = StObject.set(x, "polarGridShape", js.undefined)
    
    inline def setSelection(value: js.Array[K]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSelectionVarargs(value: K*): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setSeriesComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = StObject.set(x, "seriesComparator", js.Any.fromFunction2(value))
    
    inline def setSeriesComparatorNull: Self = StObject.set(x, "seriesComparator", null)
    
    inline def setSeriesComparatorUndefined: Self = StObject.set(x, "seriesComparator", js.undefined)
    
    inline def setSorting(value: ascending | descending | off): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    inline def setSplitDualY(value: on | off | auto): Self = StObject.set(x, "splitDualY", value.asInstanceOf[js.Any])
    
    inline def setSplitDualYUndefined: Self = StObject.set(x, "splitDualY", js.undefined)
    
    inline def setSplitterPosition(value: Double): Self = StObject.set(x, "splitterPosition", value.asInstanceOf[js.Any])
    
    inline def setSplitterPositionUndefined: Self = StObject.set(x, "splitterPosition", js.undefined)
    
    inline def setStack(value: on | off): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackLabel(value: on | off): Self = StObject.set(x, "stackLabel", value.asInstanceOf[js.Any])
    
    inline def setStackLabelUndefined: Self = StObject.set(x, "stackLabel", js.undefined)
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStyleDefaults(value: AnimationDownColor): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    inline def setStyleDefaultsUndefined: Self = StObject.set(x, "styleDefaults", js.undefined)
    
    inline def setTimeAxisType(value: enabled | mixedFrequency | skipGaps | disabled | auto): Self = StObject.set(x, "timeAxisType", value.asInstanceOf[js.Any])
    
    inline def setTimeAxisTypeUndefined: Self = StObject.set(x, "timeAxisType", js.undefined)
    
    inline def setTooltip(value: Renderer): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    inline def setTouchResponseUndefined: Self = StObject.set(x, "touchResponse", js.undefined)
    
    inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTranslations(value: ComponentName): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setType(
      value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueFormats(value: Close): Self = StObject.set(x, "valueFormats", value.asInstanceOf[js.Any])
    
    inline def setValueFormatsUndefined: Self = StObject.set(x, "valueFormats", js.undefined)
    
    inline def setXAxis(value: AxisLine): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setY2Axis(value: AlignTickMarks): Self = StObject.set(x, "y2Axis", value.asInstanceOf[js.Any])
    
    inline def setY2AxisUndefined: Self = StObject.set(x, "y2Axis", js.undefined)
    
    inline def setYAxis(value: BaselineScaling): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    inline def setZoomAndScroll(value: delayedScrollOnly | liveScrollOnly | delayed | live | off): Self = StObject.set(x, "zoomAndScroll", value.asInstanceOf[js.Any])
    
    inline def setZoomAndScrollUndefined: Self = StObject.set(x, "zoomAndScroll", js.undefined)
    
    inline def setZoomDirection(value: typings.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self = StObject.set(x, "zoomDirection", value.asInstanceOf[js.Any])
    
    inline def setZoomDirectionUndefined: Self = StObject.set(x, "zoomDirection", js.undefined)
  }
}
