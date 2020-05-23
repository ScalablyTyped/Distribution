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
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojchart.ojChartSettableProperties<K, D>> */
trait ojChartSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationOnDataChange: js.UndefOr[auto | slideToLeft | slideToRight | none] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | alphaFade | zoom | none] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var coordinateSystem: js.UndefOr[polar | cartesian] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var dataCursor: js.UndefOr[off | on | auto] = js.undefined
  var dataCursorBehavior: js.UndefOr[smooth | snap | auto] = js.undefined
  var dataCursorPosition: js.UndefOr[X] = js.undefined
  var dataLabel: js.UndefOr[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]] = js.undefined
  var dnd: js.UndefOr[Drag] = js.undefined
  var dragMode: js.UndefOr[pan | zoom | select | off | user] = js.undefined
  var drilling: js.UndefOr[on | seriesOnly | groupsOnly | off] = js.undefined
  var groupComparator: js.UndefOr[js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]] = js.undefined
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
  var seriesComparator: js.UndefOr[js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]] = js.undefined
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
  @scala.inline
  def apply[K, D](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    animationOnDataChange: auto | slideToLeft | slideToRight | none = null,
    animationOnDisplay: auto | alphaFade | zoom | none = null,
    as: String = null,
    coordinateSystem: polar | cartesian = null,
    data: DataProvider[K, D] = null,
    dataCursor: off | on | auto = null,
    dataCursorBehavior: smooth | snap | auto = null,
    dataCursorPosition: X = null,
    dataLabel: /* context */ DataLabelContext => Insert | PreventDefault = null,
    dnd: Drag = null,
    dragMode: pan | zoom | select | off | user = null,
    drilling: on | seriesOnly | groupsOnly | off = null,
    groupComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => Double = null,
    hiddenCategories: js.Array[String] = null,
    hideAndShowBehavior: withRescale | withoutRescale | none = null,
    highlightMatch: any | all = null,
    highlightedCategories: js.Array[String] = null,
    hoverBehavior: dim | none = null,
    initialZooming: first | last | none = null,
    legend: BackgroundColor = null,
    orientation: horizontal | vertical = null,
    otherThreshold: js.UndefOr[Double] = js.undefined,
    overview: Content = null,
    pieCenter: Converter = null,
    plotArea: BorderWidth = null,
    polarGridShape: polygon | circle = null,
    selection: js.Array[K] = null,
    selectionMode: single | multiple | none = null,
    seriesComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => Double = null,
    sorting: ascending | descending | off = null,
    splitDualY: on | off | auto = null,
    splitterPosition: js.UndefOr[Double] = js.undefined,
    stack: on | off = null,
    stackLabel: on | off = null,
    styleDefaults: AnimationDownColor = null,
    timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto = null,
    tooltip: Renderer = null,
    touchResponse: touchStart | auto = null,
    trackResize: on | off = null,
    translations: ComponentName = null,
    `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = null,
    valueFormats: Close = null,
    xAxis: AxisLine = null,
    y2Axis: AlignTickMarks = null,
    yAxis: BaselineScaling = null,
    zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off = null,
    zoomDirection: x | y | auto = null
  ): ojChartSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (coordinateSystem != null) __obj.updateDynamic("coordinateSystem")(coordinateSystem.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataCursor != null) __obj.updateDynamic("dataCursor")(dataCursor.asInstanceOf[js.Any])
    if (dataCursorBehavior != null) __obj.updateDynamic("dataCursorBehavior")(dataCursorBehavior.asInstanceOf[js.Any])
    if (dataCursorPosition != null) __obj.updateDynamic("dataCursorPosition")(dataCursorPosition.asInstanceOf[js.Any])
    if (dataLabel != null) __obj.updateDynamic("dataLabel")(js.Any.fromFunction1(dataLabel))
    if (dnd != null) __obj.updateDynamic("dnd")(dnd.asInstanceOf[js.Any])
    if (dragMode != null) __obj.updateDynamic("dragMode")(dragMode.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (groupComparator != null) __obj.updateDynamic("groupComparator")(js.Any.fromFunction2(groupComparator))
    if (hiddenCategories != null) __obj.updateDynamic("hiddenCategories")(hiddenCategories.asInstanceOf[js.Any])
    if (hideAndShowBehavior != null) __obj.updateDynamic("hideAndShowBehavior")(hideAndShowBehavior.asInstanceOf[js.Any])
    if (highlightMatch != null) __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    if (highlightedCategories != null) __obj.updateDynamic("highlightedCategories")(highlightedCategories.asInstanceOf[js.Any])
    if (hoverBehavior != null) __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    if (initialZooming != null) __obj.updateDynamic("initialZooming")(initialZooming.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(otherThreshold)) __obj.updateDynamic("otherThreshold")(otherThreshold.get.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (pieCenter != null) __obj.updateDynamic("pieCenter")(pieCenter.asInstanceOf[js.Any])
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea.asInstanceOf[js.Any])
    if (polarGridShape != null) __obj.updateDynamic("polarGridShape")(polarGridShape.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (seriesComparator != null) __obj.updateDynamic("seriesComparator")(js.Any.fromFunction2(seriesComparator))
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (splitDualY != null) __obj.updateDynamic("splitDualY")(splitDualY.asInstanceOf[js.Any])
    if (!js.isUndefined(splitterPosition)) __obj.updateDynamic("splitterPosition")(splitterPosition.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (stackLabel != null) __obj.updateDynamic("stackLabel")(stackLabel.asInstanceOf[js.Any])
    if (styleDefaults != null) __obj.updateDynamic("styleDefaults")(styleDefaults.asInstanceOf[js.Any])
    if (timeAxisType != null) __obj.updateDynamic("timeAxisType")(timeAxisType.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (touchResponse != null) __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueFormats != null) __obj.updateDynamic("valueFormats")(valueFormats.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (y2Axis != null) __obj.updateDynamic("y2Axis")(y2Axis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zoomAndScroll != null) __obj.updateDynamic("zoomAndScroll")(zoomAndScroll.asInstanceOf[js.Any])
    if (zoomDirection != null) __obj.updateDynamic("zoomDirection")(zoomDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSettablePropertiesLenient[K, D]]
  }
}

