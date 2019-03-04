package typings
package atOracleOraclejetLib.ojchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartSettableProperties[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var as: java.lang.String
  var coordinateSystem: atOracleOraclejetLib.atOracleOraclejetLibStrings.polar | atOracleOraclejetLib.atOracleOraclejetLibStrings.cartesian
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var dataCursor: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var dataCursorBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.smooth | atOracleOraclejetLib.atOracleOraclejetLibStrings.snap | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var dataCursorPosition: atOracleOraclejetLib.Anon_X
  var dnd: atOracleOraclejetLib.Anon_Drag
  var dragMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.pan | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.user
  var drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.groupsOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
  var hiddenCategories: js.Array[java.lang.String]
  var hideAndShowBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.withRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.withoutRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var initialZooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.first | atOracleOraclejetLib.atOracleOraclejetLibStrings.last | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var legend: atOracleOraclejetLib.Anon_AsNeeded
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  var otherThreshold: scala.Double
  var overview: atOracleOraclejetLib.Anon_Content
  var pieCenter: atOracleOraclejetLib.Anon_Auto
  var plotArea: atOracleOraclejetLib.Anon_BackgroundColor
  var polarGridShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.polygon | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
  var selection: js.Array[K]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
  var sorting: atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var splitDualY: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var splitterPosition: scala.Double
  var stack: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var stackLabel: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var styleDefaults: atOracleOraclejetLib.Anon_AboveMarker
  var timeAxisType: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.mixedFrequency | atOracleOraclejetLib.atOracleOraclejetLibStrings.skipGaps | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var tooltip: atOracleOraclejetLib.Anon_Context
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  @JSName("translations")
  var translations_ojChartSettableProperties: atOracleOraclejetLib.Anon_ComponentName
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.stock | atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot | atOracleOraclejetLib.atOracleOraclejetLibStrings.combo | atOracleOraclejetLib.atOracleOraclejetLibStrings.pie | atOracleOraclejetLib.atOracleOraclejetLibStrings.scatter | atOracleOraclejetLib.atOracleOraclejetLibStrings.bubble | atOracleOraclejetLib.atOracleOraclejetLibStrings.funnel | atOracleOraclejetLib.atOracleOraclejetLibStrings.pyramid | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar
  var valueFormats: atOracleOraclejetLib.Anon_Close
  var xAxis: atOracleOraclejetLib.Anon_AxisLine
  var y2Axis: atOracleOraclejetLib.Anon_AlignTickMarks
  var yAxis: atOracleOraclejetLib.Anon_AutoAxisLine
  var zoomAndScroll: atOracleOraclejetLib.atOracleOraclejetLibStrings.delayedScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.liveScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.delayed | atOracleOraclejetLib.atOracleOraclejetLibStrings.live | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var zoomDirection: atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  def dataLabel(context: atOracleOraclejetLib.ojchartMod.ojChartNs.DataLabelContext): atOracleOraclejetLib.Anon_Insert | atOracleOraclejetLib.Anon_PreventDefault
}

object ojChartSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    as: java.lang.String,
    coordinateSystem: atOracleOraclejetLib.atOracleOraclejetLibStrings.polar | atOracleOraclejetLib.atOracleOraclejetLibStrings.cartesian,
    dataCursor: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    dataCursorBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.smooth | atOracleOraclejetLib.atOracleOraclejetLibStrings.snap | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    dataCursorPosition: atOracleOraclejetLib.Anon_X,
    dataLabel: js.Function1[
      atOracleOraclejetLib.ojchartMod.ojChartNs.DataLabelContext, 
      atOracleOraclejetLib.Anon_Insert | atOracleOraclejetLib.Anon_PreventDefault
    ],
    dnd: atOracleOraclejetLib.Anon_Drag,
    dragMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.pan | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.user,
    drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.groupsOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    hiddenCategories: js.Array[java.lang.String],
    hideAndShowBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.withRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.withoutRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all,
    highlightedCategories: js.Array[java.lang.String],
    hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    initialZooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.first | atOracleOraclejetLib.atOracleOraclejetLibStrings.last | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    legend: atOracleOraclejetLib.Anon_AsNeeded,
    orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical,
    otherThreshold: scala.Double,
    overview: atOracleOraclejetLib.Anon_Content,
    pieCenter: atOracleOraclejetLib.Anon_Auto,
    plotArea: atOracleOraclejetLib.Anon_BackgroundColor,
    polarGridShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.polygon | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle,
    selection: js.Array[K],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    sorting: atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    splitDualY: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    splitterPosition: scala.Double,
    stack: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    stackLabel: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    styleDefaults: atOracleOraclejetLib.Anon_AboveMarker,
    timeAxisType: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.mixedFrequency | atOracleOraclejetLib.atOracleOraclejetLibStrings.skipGaps | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    tooltip: atOracleOraclejetLib.Anon_Context,
    touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentName,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.stock | atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot | atOracleOraclejetLib.atOracleOraclejetLibStrings.combo | atOracleOraclejetLib.atOracleOraclejetLibStrings.pie | atOracleOraclejetLib.atOracleOraclejetLibStrings.scatter | atOracleOraclejetLib.atOracleOraclejetLibStrings.bubble | atOracleOraclejetLib.atOracleOraclejetLibStrings.funnel | atOracleOraclejetLib.atOracleOraclejetLibStrings.pyramid | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar,
    valueFormats: atOracleOraclejetLib.Anon_Close,
    xAxis: atOracleOraclejetLib.Anon_AxisLine,
    y2Axis: atOracleOraclejetLib.Anon_AlignTickMarks,
    yAxis: atOracleOraclejetLib.Anon_AutoAxisLine,
    zoomAndScroll: atOracleOraclejetLib.atOracleOraclejetLibStrings.delayedScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.liveScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.delayed | atOracleOraclejetLib.atOracleOraclejetLibStrings.live | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    zoomDirection: atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null,
    groupComparator: js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double] = null,
    seriesComparator: js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double] = null
  ): ojChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as, coordinateSystem = coordinateSystem.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataCursorBehavior = dataCursorBehavior.asInstanceOf[js.Any], dataCursorPosition = dataCursorPosition, dataLabel = dataLabel, dnd = dnd, dragMode = dragMode.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories, hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories, hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], legend = legend, orientation = orientation.asInstanceOf[js.Any], otherThreshold = otherThreshold, overview = overview, pieCenter = pieCenter, plotArea = plotArea, polarGridShape = polarGridShape.asInstanceOf[js.Any], selection = selection, selectionMode = selectionMode.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], splitDualY = splitDualY.asInstanceOf[js.Any], splitterPosition = splitterPosition, stack = stack.asInstanceOf[js.Any], stackLabel = stackLabel.asInstanceOf[js.Any], styleDefaults = styleDefaults, timeAxisType = timeAxisType.asInstanceOf[js.Any], tooltip = tooltip, touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations, valueFormats = valueFormats, xAxis = xAxis, y2Axis = y2Axis, yAxis = yAxis, zoomAndScroll = zoomAndScroll.asInstanceOf[js.Any], zoomDirection = zoomDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (groupComparator != null) __obj.updateDynamic("groupComparator")(groupComparator)
    if (seriesComparator != null) __obj.updateDynamic("seriesComparator")(seriesComparator)
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
}

