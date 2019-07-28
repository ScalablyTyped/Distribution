package typings.atOracleOraclejet.ojchartMod

import typings.atOracleOraclejet.Anon_AboveMarker
import typings.atOracleOraclejet.Anon_AlignTickMarks
import typings.atOracleOraclejet.Anon_AsNeeded
import typings.atOracleOraclejet.Anon_Auto
import typings.atOracleOraclejet.Anon_AutoAxisLine
import typings.atOracleOraclejet.Anon_AxisLine
import typings.atOracleOraclejet.Anon_BackgroundColor
import typings.atOracleOraclejet.Anon_Close
import typings.atOracleOraclejet.Anon_ComponentName
import typings.atOracleOraclejet.Anon_Content
import typings.atOracleOraclejet.Anon_Context
import typings.atOracleOraclejet.Anon_Drag
import typings.atOracleOraclejet.Anon_Insert
import typings.atOracleOraclejet.Anon_PreventDefault
import typings.atOracleOraclejet.Anon_X
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.alphaFade
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.area
import typings.atOracleOraclejet.atOracleOraclejetStrings.ascending
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bar
import typings.atOracleOraclejet.atOracleOraclejetStrings.boxPlot
import typings.atOracleOraclejet.atOracleOraclejetStrings.bubble
import typings.atOracleOraclejet.atOracleOraclejetStrings.cartesian
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.combo
import typings.atOracleOraclejet.atOracleOraclejetStrings.delayed
import typings.atOracleOraclejet.atOracleOraclejetStrings.delayedScrollOnly
import typings.atOracleOraclejet.atOracleOraclejetStrings.descending
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.first
import typings.atOracleOraclejet.atOracleOraclejetStrings.funnel
import typings.atOracleOraclejet.atOracleOraclejetStrings.groupsOnly
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.last
import typings.atOracleOraclejet.atOracleOraclejetStrings.line
import typings.atOracleOraclejet.atOracleOraclejetStrings.lineWithArea
import typings.atOracleOraclejet.atOracleOraclejetStrings.live
import typings.atOracleOraclejet.atOracleOraclejetStrings.liveScrollOnly
import typings.atOracleOraclejet.atOracleOraclejetStrings.mixedFrequency
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.pan
import typings.atOracleOraclejet.atOracleOraclejetStrings.pie
import typings.atOracleOraclejet.atOracleOraclejetStrings.polar
import typings.atOracleOraclejet.atOracleOraclejetStrings.polygon
import typings.atOracleOraclejet.atOracleOraclejetStrings.pyramid
import typings.atOracleOraclejet.atOracleOraclejetStrings.scatter
import typings.atOracleOraclejet.atOracleOraclejetStrings.select
import typings.atOracleOraclejet.atOracleOraclejetStrings.seriesOnly
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.skipGaps
import typings.atOracleOraclejet.atOracleOraclejetStrings.slideToLeft
import typings.atOracleOraclejet.atOracleOraclejetStrings.slideToRight
import typings.atOracleOraclejet.atOracleOraclejetStrings.smooth
import typings.atOracleOraclejet.atOracleOraclejetStrings.snap
import typings.atOracleOraclejet.atOracleOraclejetStrings.stock
import typings.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.user
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.atOracleOraclejetStrings.withRescale
import typings.atOracleOraclejet.atOracleOraclejetStrings.withoutRescale
import typings.atOracleOraclejet.atOracleOraclejetStrings.x
import typings.atOracleOraclejet.atOracleOraclejetStrings.y
import typings.atOracleOraclejet.atOracleOraclejetStrings.zoom
import typings.atOracleOraclejet.ojchartMod.ojChartNs.DataLabelContext
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | slideToLeft | slideToRight | none
  var animationOnDisplay: auto | alphaFade | zoom | none
  var as: String
  var coordinateSystem: polar | cartesian
  var data: (DataProvider[K, D]) | Null
  var dataCursor: off | on | auto
  var dataCursorBehavior: smooth | snap | auto
  var dataCursorPosition: Anon_X
  var dnd: Anon_Drag
  var dragMode: pan | zoom | select | off | user
  var drilling: on | seriesOnly | groupsOnly | off
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  var hiddenCategories: js.Array[String]
  var hideAndShowBehavior: withRescale | withoutRescale | none
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var initialZooming: first | last | none
  var legend: Anon_AsNeeded
  var orientation: horizontal | vertical
  var otherThreshold: Double
  var overview: Anon_Content
  var pieCenter: Anon_Auto
  var plotArea: Anon_BackgroundColor
  var polarGridShape: polygon | circle
  var selection: js.Array[K]
  var selectionMode: single | multiple | none
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  var sorting: ascending | descending | off
  var splitDualY: on | off | auto
  var splitterPosition: Double
  var stack: on | off
  var stackLabel: on | off
  var styleDefaults: Anon_AboveMarker
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto
  var tooltip: Anon_Context
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojChartSettableProperties: Anon_ComponentName
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  var valueFormats: Anon_Close
  var xAxis: Anon_AxisLine
  var y2Axis: Anon_AlignTickMarks
  var yAxis: Anon_AutoAxisLine
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off
  var zoomDirection: x | y | auto
  def dataLabel(context: DataLabelContext): Anon_Insert | Anon_PreventDefault
}

object ojChartSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | slideToLeft | slideToRight | none,
    animationOnDisplay: auto | alphaFade | zoom | none,
    as: String,
    coordinateSystem: polar | cartesian,
    dataCursor: off | on | auto,
    dataCursorBehavior: smooth | snap | auto,
    dataCursorPosition: Anon_X,
    dataLabel: DataLabelContext => Anon_Insert | Anon_PreventDefault,
    dnd: Anon_Drag,
    dragMode: pan | zoom | select | off | user,
    drilling: on | seriesOnly | groupsOnly | off,
    hiddenCategories: js.Array[String],
    hideAndShowBehavior: withRescale | withoutRescale | none,
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    initialZooming: first | last | none,
    legend: Anon_AsNeeded,
    orientation: horizontal | vertical,
    otherThreshold: Double,
    overview: Anon_Content,
    pieCenter: Anon_Auto,
    plotArea: Anon_BackgroundColor,
    polarGridShape: polygon | circle,
    selection: js.Array[K],
    selectionMode: single | multiple | none,
    sorting: ascending | descending | off,
    splitDualY: on | off | auto,
    splitterPosition: Double,
    stack: on | off,
    stackLabel: on | off,
    styleDefaults: Anon_AboveMarker,
    timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto,
    tooltip: Anon_Context,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: Anon_ComponentName,
    `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar,
    valueFormats: Anon_Close,
    xAxis: Anon_AxisLine,
    y2Axis: Anon_AlignTickMarks,
    yAxis: Anon_AutoAxisLine,
    zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off,
    zoomDirection: x | y | auto,
    data: DataProvider[K, D] = null,
    groupComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => Double = null,
    seriesComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => Double = null
  ): ojChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as, coordinateSystem = coordinateSystem.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataCursorBehavior = dataCursorBehavior.asInstanceOf[js.Any], dataCursorPosition = dataCursorPosition, dataLabel = js.Any.fromFunction1(dataLabel), dnd = dnd, dragMode = dragMode.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories, hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories, hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], legend = legend, orientation = orientation.asInstanceOf[js.Any], otherThreshold = otherThreshold, overview = overview, pieCenter = pieCenter, plotArea = plotArea, polarGridShape = polarGridShape.asInstanceOf[js.Any], selection = selection, selectionMode = selectionMode.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], splitDualY = splitDualY.asInstanceOf[js.Any], splitterPosition = splitterPosition, stack = stack.asInstanceOf[js.Any], stackLabel = stackLabel.asInstanceOf[js.Any], styleDefaults = styleDefaults, timeAxisType = timeAxisType.asInstanceOf[js.Any], tooltip = tooltip, touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations, valueFormats = valueFormats, xAxis = xAxis, y2Axis = y2Axis, yAxis = yAxis, zoomAndScroll = zoomAndScroll.asInstanceOf[js.Any], zoomDirection = zoomDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (groupComparator != null) __obj.updateDynamic("groupComparator")(js.Any.fromFunction2(groupComparator))
    if (seriesComparator != null) __obj.updateDynamic("seriesComparator")(js.Any.fromFunction2(seriesComparator))
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
}

