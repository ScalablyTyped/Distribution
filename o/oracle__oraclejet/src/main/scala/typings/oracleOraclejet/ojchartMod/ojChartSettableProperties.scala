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
  var dataCursorPosition: X
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
  def dataLabel(context: DataLabelContext): Insert | PreventDefault
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
    zoomDirection: x | y | auto,
    data: DataProvider[K, D] = null,
    groupComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => Double = null,
    seriesComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => Double = null
  ): ojChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataCursorBehavior = dataCursorBehavior.asInstanceOf[js.Any], dataCursorPosition = dataCursorPosition.asInstanceOf[js.Any], dataLabel = js.Any.fromFunction1(dataLabel), dnd = dnd.asInstanceOf[js.Any], dragMode = dragMode.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], pieCenter = pieCenter.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], polarGridShape = polarGridShape.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], splitDualY = splitDualY.asInstanceOf[js.Any], splitterPosition = splitterPosition.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stackLabel = stackLabel.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], timeAxisType = timeAxisType.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], zoomAndScroll = zoomAndScroll.asInstanceOf[js.Any], zoomDirection = zoomDirection.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], groupComparator = js.Any.fromFunction2(groupComparator), seriesComparator = js.Any.fromFunction2(seriesComparator))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
}

