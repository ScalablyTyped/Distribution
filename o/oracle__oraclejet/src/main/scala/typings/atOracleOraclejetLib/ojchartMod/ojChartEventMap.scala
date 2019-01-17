package typings
package atOracleOraclejetLib.ojchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartEventMap[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentEventMap[ojChartSettableProperties[K, D]] {
  var animationOnDataChangeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var animationOnDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var coordinateSystemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.polar | atOracleOraclejetLib.atOracleOraclejetLibStrings.cartesian
  ]
  var dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null]
  var dataCursorBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.smooth | atOracleOraclejetLib.atOracleOraclejetLibStrings.snap | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
  var dataCursorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
  var dataCursorPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_X]
  var dataLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.Function1[
      /* context */ atOracleOraclejetLib.ojchartMod.ojChartNs.DataLabelContext, 
      atOracleOraclejetLib.Anon_Insert | atOracleOraclejetLib.Anon_PreventDefault
    ]
  ]
  var dndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Drag]
  var dragModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.pan | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.user
  ]
  var drillingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.groupsOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ]
  var groupComparatorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
  ]
  var hiddenCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]]
  var hideAndShowBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.withRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.withoutRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var highlightMatchChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  ]
  var highlightedCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]]
  var hoverBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var initialZoomingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.first | atOracleOraclejetLib.atOracleOraclejetLibStrings.last | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var legendChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AsNeeded]
  var ojDrill: atOracleOraclejetLib.ojchartMod.ojChartNs.ojDrill
  var ojSelectInput: atOracleOraclejetLib.ojchartMod.ojChartNs.ojSelectInput
  var ojViewportChange: atOracleOraclejetLib.ojchartMod.ojChartNs.ojViewportChange
  var ojViewportChangeInput: atOracleOraclejetLib.ojchartMod.ojChartNs.ojViewportChangeInput
  var orientationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  ]
  var otherThresholdChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var overviewChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Content]
  var pieCenterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Auto]
  var plotAreaChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BackgroundColor]
  var polarGridShapeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.polygon | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
  ]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]]
  var selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var seriesComparatorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
  ]
  var sortingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ]
  var splitDualYChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
  var splitterPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var stackChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ]
  var stackLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ]
  var styleDefaultsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AboveMarker]
  var timeAxisTypeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.mixedFrequency | atOracleOraclejetLib.atOracleOraclejetLibStrings.skipGaps | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
  var tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Context]
  var touchResponseChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
  var typeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.stock | atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot | atOracleOraclejetLib.atOracleOraclejetLibStrings.combo | atOracleOraclejetLib.atOracleOraclejetLibStrings.pie | atOracleOraclejetLib.atOracleOraclejetLibStrings.scatter | atOracleOraclejetLib.atOracleOraclejetLibStrings.bubble | atOracleOraclejetLib.atOracleOraclejetLibStrings.funnel | atOracleOraclejetLib.atOracleOraclejetLibStrings.pyramid | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar
  ]
  var valueFormatsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Close]
  var xAxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AxisLine]
  var y2AxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AlignTickMarks]
  var yAxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoAxisLine]
  var zoomAndScrollChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.delayedScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.liveScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.delayed | atOracleOraclejetLib.atOracleOraclejetLibStrings.live | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ]
  var zoomDirectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
}

