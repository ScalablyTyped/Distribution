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

