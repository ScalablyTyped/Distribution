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
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("coordinateSystem")(coordinateSystem.asInstanceOf[js.Any])
    __obj.updateDynamic("dataCursor")(dataCursor.asInstanceOf[js.Any])
    __obj.updateDynamic("dataCursorBehavior")(dataCursorBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("dataCursorPosition")(dataCursorPosition)
    __obj.updateDynamic("dataLabel")(dataLabel)
    __obj.updateDynamic("dnd")(dnd)
    __obj.updateDynamic("dragMode")(dragMode.asInstanceOf[js.Any])
    __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    __obj.updateDynamic("hiddenCategories")(hiddenCategories)
    __obj.updateDynamic("hideAndShowBehavior")(hideAndShowBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    __obj.updateDynamic("highlightedCategories")(highlightedCategories)
    __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("initialZooming")(initialZooming.asInstanceOf[js.Any])
    __obj.updateDynamic("legend")(legend)
    __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.updateDynamic("otherThreshold")(otherThreshold)
    __obj.updateDynamic("overview")(overview)
    __obj.updateDynamic("pieCenter")(pieCenter)
    __obj.updateDynamic("plotArea")(plotArea)
    __obj.updateDynamic("polarGridShape")(polarGridShape.asInstanceOf[js.Any])
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.updateDynamic("splitDualY")(splitDualY.asInstanceOf[js.Any])
    __obj.updateDynamic("splitterPosition")(splitterPosition)
    __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.updateDynamic("stackLabel")(stackLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("styleDefaults")(styleDefaults)
    __obj.updateDynamic("timeAxisType")(timeAxisType.asInstanceOf[js.Any])
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("valueFormats")(valueFormats)
    __obj.updateDynamic("xAxis")(xAxis)
    __obj.updateDynamic("y2Axis")(y2Axis)
    __obj.updateDynamic("yAxis")(yAxis)
    __obj.updateDynamic("zoomAndScroll")(zoomAndScroll.asInstanceOf[js.Any])
    __obj.updateDynamic("zoomDirection")(zoomDirection.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (groupComparator != null) __obj.updateDynamic("groupComparator")(groupComparator)
    if (seriesComparator != null) __obj.updateDynamic("seriesComparator")(seriesComparator)
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
}

