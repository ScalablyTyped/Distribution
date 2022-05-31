package typings.oracleOraclejet.ojchartMod

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
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
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

trait ojChartSettableProperties[K, D]
  extends StObject
     with dvtBaseComponentSettableProperties {
  
  var animationOnDataChange: auto | slideToLeft | slideToRight | none
  
  var animationOnDisplay: auto | alphaFade | zoom | none
  
  var as: String
  
  var coordinateSystem: polar | cartesian
  
  var data: (DataProvider[K, D]) | Null
  
  var dataCursor: off | on | auto
  
  var dataCursorBehavior: smooth | snap | auto
  
  var dataCursorPosition: X
  
  def dataLabel(context: DataLabelContext): Insert | PreventDefault
  
  var dnd: Drag
  
  var dragMode: pan | zoom | select | off | user
  
  var drilling: on | seriesOnly | groupsOnly | off
  
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  
  var hiddenCategories: js.Array[String]
  
  var hideAndShowBehavior: withRescale | withoutRescale | none
  
  var highlightMatch: any | all
  
  var highlightedCategories: js.Array[String]
  
  var hoverBehavior: dim | none
  
  var initialZooming: first | last | none
  
  var legend: BackgroundColor
  
  var orientation: horizontal | vertical
  
  var otherThreshold: Double
  
  var overview: Content
  
  var pieCenter: Converter
  
  var plotArea: BorderWidth
  
  var polarGridShape: polygon | circle
  
  var selection: js.Array[K]
  
  var selectionMode: single | multiple | none
  
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  
  var sorting: ascending | descending | off
  
  var splitDualY: on | off | auto
  
  var splitterPosition: Double
  
  var stack: on | off
  
  var stackLabel: on | off
  
  var styleDefaults: AnimationDownColor
  
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto
  
  var tooltip: Renderer
  
  var touchResponse: touchStart | auto
  
  @JSName("translations")
  var translations_ojChartSettableProperties: ComponentName
  
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  
  var valueFormats: Close
  
  var xAxis: AxisLine
  
  var y2Axis: AlignTickMarks
  
  var yAxis: BaselineScaling
  
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off
  
  var zoomDirection: x | y | auto
}
object ojChartSettableProperties {
  
  inline def apply[K, D](
    animationOnDataChange: auto | slideToLeft | slideToRight | none,
    animationOnDisplay: auto | alphaFade | zoom | none,
    as: String,
    coordinateSystem: polar | cartesian,
    dataCursor: off | on | auto,
    dataCursorBehavior: smooth | snap | auto,
    dataCursorPosition: X,
    dataLabel: DataLabelContext => Insert | PreventDefault,
    dnd: Drag,
    dragMode: pan | zoom | select | off | user,
    drilling: on | seriesOnly | groupsOnly | off,
    hiddenCategories: js.Array[String],
    hideAndShowBehavior: withRescale | withoutRescale | none,
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    initialZooming: first | last | none,
    legend: BackgroundColor,
    orientation: horizontal | vertical,
    otherThreshold: Double,
    overview: Content,
    pieCenter: Converter,
    plotArea: BorderWidth,
    polarGridShape: polygon | circle,
    selection: js.Array[K],
    selectionMode: single | multiple | none,
    sorting: ascending | descending | off,
    splitDualY: on | off | auto,
    splitterPosition: Double,
    stack: on | off,
    stackLabel: on | off,
    styleDefaults: AnimationDownColor,
    timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto,
    tooltip: Renderer,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: ComponentName,
    `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar,
    valueFormats: Close,
    xAxis: AxisLine,
    y2Axis: AlignTickMarks,
    yAxis: BaselineScaling,
    zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off,
    zoomDirection: x | y | auto
  ): ojChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataCursorBehavior = dataCursorBehavior.asInstanceOf[js.Any], dataCursorPosition = dataCursorPosition.asInstanceOf[js.Any], dataLabel = js.Any.fromFunction1(dataLabel), dnd = dnd.asInstanceOf[js.Any], dragMode = dragMode.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], pieCenter = pieCenter.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], polarGridShape = polarGridShape.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], splitDualY = splitDualY.asInstanceOf[js.Any], splitterPosition = splitterPosition.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stackLabel = stackLabel.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], timeAxisType = timeAxisType.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], zoomAndScroll = zoomAndScroll.asInstanceOf[js.Any], zoomDirection = zoomDirection.asInstanceOf[js.Any], data = null, groupComparator = null, seriesComparator = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
  
  extension [Self <: ojChartSettableProperties[?, ?], K, D](x: Self & (ojChartSettableProperties[K, D])) {
    
    inline def setAnimationOnDataChange(value: auto | slideToLeft | slideToRight | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplay(value: auto | alphaFade | zoom | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setCoordinateSystem(value: polar | cartesian): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
    
    inline def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataCursor(value: off | on | auto): Self = StObject.set(x, "dataCursor", value.asInstanceOf[js.Any])
    
    inline def setDataCursorBehavior(value: smooth | snap | auto): Self = StObject.set(x, "dataCursorBehavior", value.asInstanceOf[js.Any])
    
    inline def setDataCursorPosition(value: X): Self = StObject.set(x, "dataCursorPosition", value.asInstanceOf[js.Any])
    
    inline def setDataLabel(value: DataLabelContext => Insert | PreventDefault): Self = StObject.set(x, "dataLabel", js.Any.fromFunction1(value))
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDnd(value: Drag): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setDragMode(value: pan | zoom | select | off | user): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
    
    inline def setDrilling(value: on | seriesOnly | groupsOnly | off): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    inline def setGroupComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = StObject.set(x, "groupComparator", js.Any.fromFunction2(value))
    
    inline def setGroupComparatorNull: Self = StObject.set(x, "groupComparator", null)
    
    inline def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value :_*))
    
    inline def setHideAndShowBehavior(value: withRescale | withoutRescale | none): Self = StObject.set(x, "hideAndShowBehavior", value.asInstanceOf[js.Any])
    
    inline def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value :_*))
    
    inline def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    inline def setInitialZooming(value: first | last | none): Self = StObject.set(x, "initialZooming", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: BackgroundColor): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOtherThreshold(value: Double): Self = StObject.set(x, "otherThreshold", value.asInstanceOf[js.Any])
    
    inline def setOverview(value: Content): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setPieCenter(value: Converter): Self = StObject.set(x, "pieCenter", value.asInstanceOf[js.Any])
    
    inline def setPlotArea(value: BorderWidth): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setPolarGridShape(value: polygon | circle): Self = StObject.set(x, "polarGridShape", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: js.Array[K]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(value: K*): Self = StObject.set(x, "selection", js.Array(value :_*))
    
    inline def setSeriesComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = StObject.set(x, "seriesComparator", js.Any.fromFunction2(value))
    
    inline def setSeriesComparatorNull: Self = StObject.set(x, "seriesComparator", null)
    
    inline def setSorting(value: ascending | descending | off): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSplitDualY(value: on | off | auto): Self = StObject.set(x, "splitDualY", value.asInstanceOf[js.Any])
    
    inline def setSplitterPosition(value: Double): Self = StObject.set(x, "splitterPosition", value.asInstanceOf[js.Any])
    
    inline def setStack(value: on | off): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackLabel(value: on | off): Self = StObject.set(x, "stackLabel", value.asInstanceOf[js.Any])
    
    inline def setStyleDefaults(value: AnimationDownColor): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    inline def setTimeAxisType(value: enabled | mixedFrequency | skipGaps | disabled | auto): Self = StObject.set(x, "timeAxisType", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Renderer): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    inline def setTranslations(value: ComponentName): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueFormats(value: Close): Self = StObject.set(x, "valueFormats", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: AxisLine): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setY2Axis(value: AlignTickMarks): Self = StObject.set(x, "y2Axis", value.asInstanceOf[js.Any])
    
    inline def setYAxis(value: BaselineScaling): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setZoomAndScroll(value: delayedScrollOnly | liveScrollOnly | delayed | live | off): Self = StObject.set(x, "zoomAndScroll", value.asInstanceOf[js.Any])
    
    inline def setZoomDirection(value: typings.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self = StObject.set(x, "zoomDirection", value.asInstanceOf[js.Any])
  }
}
