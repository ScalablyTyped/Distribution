package typings
package atOracleOraclejetLib.ojchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojChart[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponent[ojChartSettableProperties[K, D]] {
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var as: java.lang.String = js.native
  var coordinateSystem: atOracleOraclejetLib.atOracleOraclejetLibStrings.polar | atOracleOraclejetLib.atOracleOraclejetLibStrings.cartesian = js.native
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  var dataCursor: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  var dataCursorBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.smooth | atOracleOraclejetLib.atOracleOraclejetLibStrings.snap | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  var dataCursorPosition: atOracleOraclejetLib.Anon_X = js.native
  var dnd: atOracleOraclejetLib.Anon_Drag = js.native
  var dragMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.pan | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.user = js.native
  var drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.groupsOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null = js.native
  var hiddenCategories: js.Array[java.lang.String] = js.native
  var hideAndShowBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.withRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.withoutRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all = js.native
  var highlightedCategories: js.Array[java.lang.String] = js.native
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var initialZooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.first | atOracleOraclejetLib.atOracleOraclejetLibStrings.last | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var legend: atOracleOraclejetLib.Anon_AsNeeded = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onAsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onCoordinateSystemChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.polar | atOracleOraclejetLib.atOracleOraclejetLibStrings.cartesian
    ], 
    _
  ]) | scala.Null = js.native
  var onDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onDataCursorBehaviorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.smooth | atOracleOraclejetLib.atOracleOraclejetLibStrings.snap | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var onDataCursorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var onDataCursorPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_X], 
    _
  ]) | scala.Null = js.native
  var onDataLabelChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.Function1[
        /* context */ atOracleOraclejetLib.ojchartMod.ojChartNs.DataLabelContext, 
        atOracleOraclejetLib.Anon_Insert | atOracleOraclejetLib.Anon_PreventDefault
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onDndChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Drag], 
    _
  ]) | scala.Null = js.native
  var onDragModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.pan | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.user
    ], 
    _
  ]) | scala.Null = js.native
  var onDrillingChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.groupsOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ], 
    _
  ]) | scala.Null = js.native
  var onGroupComparatorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onHideAndShowBehaviorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.withRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.withoutRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onHighlightMatchChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
    ], 
    _
  ]) | scala.Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onHoverBehaviorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onInitialZoomingChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.first | atOracleOraclejetLib.atOracleOraclejetLibStrings.last | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onLegendChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AsNeeded], 
    _
  ]) | scala.Null = js.native
  var onOjDrill: (js.Function1[/* event */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojDrill, _]) | scala.Null = js.native
  var onOjSelectInput: (js.Function1[/* event */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojSelectInput, _]) | scala.Null = js.native
  var onOjViewportChange: (js.Function1[/* event */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojViewportChange, _]) | scala.Null = js.native
  var onOjViewportChangeInput: (js.Function1[/* event */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojViewportChangeInput, _]) | scala.Null = js.native
  var onOrientationChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
    ], 
    _
  ]) | scala.Null = js.native
  var onOtherThresholdChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onOverviewChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Content], 
    _
  ]) | scala.Null = js.native
  var onPieCenterChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Auto], 
    _
  ]) | scala.Null = js.native
  var onPlotAreaChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BackgroundColor], 
    _
  ]) | scala.Null = js.native
  var onPolarGridShapeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.polygon | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
    ], 
    _
  ]) | scala.Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]], 
    _
  ]) | scala.Null = js.native
  var onSelectionModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onSeriesComparatorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onSortingChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ], 
    _
  ]) | scala.Null = js.native
  var onSplitDualYChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var onSplitterPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onStackChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ], 
    _
  ]) | scala.Null = js.native
  var onStackLabelChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ], 
    _
  ]) | scala.Null = js.native
  var onStyleDefaultsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AboveMarker], 
    _
  ]) | scala.Null = js.native
  var onTimeAxisTypeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.mixedFrequency | atOracleOraclejetLib.atOracleOraclejetLibStrings.skipGaps | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Context], 
    _
  ]) | scala.Null = js.native
  var onTouchResponseChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var onTypeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.stock | atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot | atOracleOraclejetLib.atOracleOraclejetLibStrings.combo | atOracleOraclejetLib.atOracleOraclejetLibStrings.pie | atOracleOraclejetLib.atOracleOraclejetLibStrings.scatter | atOracleOraclejetLib.atOracleOraclejetLibStrings.bubble | atOracleOraclejetLib.atOracleOraclejetLibStrings.funnel | atOracleOraclejetLib.atOracleOraclejetLibStrings.pyramid | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar
    ], 
    _
  ]) | scala.Null = js.native
  var onValueFormatsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Close], 
    _
  ]) | scala.Null = js.native
  var onXAxisChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AxisLine], 
    _
  ]) | scala.Null = js.native
  var onY2AxisChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AlignTickMarks], 
    _
  ]) | scala.Null = js.native
  var onYAxisChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoAxisLine], 
    _
  ]) | scala.Null = js.native
  var onZoomAndScrollChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.delayedScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.liveScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.delayed | atOracleOraclejetLib.atOracleOraclejetLibStrings.live | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ], 
    _
  ]) | scala.Null = js.native
  var onZoomDirectionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical = js.native
  var otherThreshold: scala.Double = js.native
  var overview: atOracleOraclejetLib.Anon_Content = js.native
  var pieCenter: atOracleOraclejetLib.Anon_Auto = js.native
  var plotArea: atOracleOraclejetLib.Anon_BackgroundColor = js.native
  var polarGridShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.polygon | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null = js.native
  var sorting: atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  var splitDualY: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  var splitterPosition: scala.Double = js.native
  var stack: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  var stackLabel: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  var styleDefaults: atOracleOraclejetLib.Anon_AboveMarker = js.native
  var timeAxisType: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.mixedFrequency | atOracleOraclejetLib.atOracleOraclejetLibStrings.skipGaps | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  var tooltip: atOracleOraclejetLib.Anon_Context = js.native
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("translations")
  var translations_ojChart: atOracleOraclejetLib.Anon_ComponentName = js.native
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.stock | atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot | atOracleOraclejetLib.atOracleOraclejetLibStrings.combo | atOracleOraclejetLib.atOracleOraclejetLibStrings.pie | atOracleOraclejetLib.atOracleOraclejetLibStrings.scatter | atOracleOraclejetLib.atOracleOraclejetLibStrings.bubble | atOracleOraclejetLib.atOracleOraclejetLibStrings.funnel | atOracleOraclejetLib.atOracleOraclejetLibStrings.pyramid | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar = js.native
  var valueFormats: atOracleOraclejetLib.Anon_Close = js.native
  var xAxis: atOracleOraclejetLib.Anon_AxisLine = js.native
  var y2Axis: atOracleOraclejetLib.Anon_AlignTickMarks = js.native
  var yAxis: atOracleOraclejetLib.Anon_AutoAxisLine = js.native
  var zoomAndScroll: atOracleOraclejetLib.atOracleOraclejetLibStrings.delayedScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.liveScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.delayed | atOracleOraclejetLib.atOracleOraclejetLibStrings.live | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  var zoomDirection: atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.coordinateSystemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.polar | atOracleOraclejetLib.atOracleOraclejetLibStrings.cartesian
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.coordinateSystemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.polar | atOracleOraclejetLib.atOracleOraclejetLibStrings.cartesian
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.smooth | atOracleOraclejetLib.atOracleOraclejetLibStrings.snap | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.smooth | atOracleOraclejetLib.atOracleOraclejetLibStrings.snap | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.pan | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.user
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.pan | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.user
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.groupsOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.groupsOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.withRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.withoutRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.withRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.withoutRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatchChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatchChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZoomingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.first | atOracleOraclejetLib.atOracleOraclejetLibStrings.last | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZoomingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.first | atOracleOraclejetLib.atOracleOraclejetLibStrings.last | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.polarGridShapeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.polygon | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.polarGridShapeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.polygon | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sortingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sortingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.splitDualYChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.splitDualYChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stackChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stackChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stackLabelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stackLabelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.timeAxisTypeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.mixedFrequency | atOracleOraclejetLib.atOracleOraclejetLibStrings.skipGaps | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.timeAxisTypeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.mixedFrequency | atOracleOraclejetLib.atOracleOraclejetLibStrings.skipGaps | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponseChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponseChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.typeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.stock | atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot | atOracleOraclejetLib.atOracleOraclejetLibStrings.combo | atOracleOraclejetLib.atOracleOraclejetLibStrings.pie | atOracleOraclejetLib.atOracleOraclejetLibStrings.scatter | atOracleOraclejetLib.atOracleOraclejetLibStrings.bubble | atOracleOraclejetLib.atOracleOraclejetLibStrings.funnel | atOracleOraclejetLib.atOracleOraclejetLibStrings.pyramid | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.typeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.stock | atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot | atOracleOraclejetLib.atOracleOraclejetLibStrings.combo | atOracleOraclejetLib.atOracleOraclejetLibStrings.pie | atOracleOraclejetLib.atOracleOraclejetLibStrings.scatter | atOracleOraclejetLib.atOracleOraclejetLibStrings.bubble | atOracleOraclejetLib.atOracleOraclejetLibStrings.funnel | atOracleOraclejetLib.atOracleOraclejetLibStrings.pyramid | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomAndScrollChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.delayedScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.liveScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.delayed | atOracleOraclejetLib.atOracleOraclejetLibStrings.live | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomAndScrollChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.delayedScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.liveScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.delayed | atOracleOraclejetLib.atOracleOraclejetLibStrings.live | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomDirectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomDirectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_X], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_X], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataLabelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.Function1[
          /* context */ atOracleOraclejetLib.ojchartMod.ojChartNs.DataLabelContext, 
          atOracleOraclejetLib.Anon_Insert | atOracleOraclejetLib.Anon_PreventDefault
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataLabelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.Function1[
          /* context */ atOracleOraclejetLib.ojchartMod.ojChartNs.DataLabelContext, 
          atOracleOraclejetLib.Anon_Insert | atOracleOraclejetLib.Anon_PreventDefault
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Drag], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Drag], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.legendChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AsNeeded], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.legendChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AsNeeded], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojDrill,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojDrill, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojDrill,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojDrill, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojSelectInput,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojSelectInput, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojSelectInput,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojSelectInput, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojViewportChange,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojViewportChange, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojViewportChange,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojViewportChange, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojViewportChangeInput,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojViewportChangeInput, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojViewportChangeInput,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojchartMod.ojChartNs.ojViewportChangeInput, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.otherThresholdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.otherThresholdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.overviewChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Content], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.overviewChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Content], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pieCenterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Auto], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pieCenterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Auto], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.plotAreaChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BackgroundColor], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.plotAreaChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BackgroundColor], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.splitterPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.splitterPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AboveMarker], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AboveMarker], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Context], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Context], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueFormatsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Close], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueFormatsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Close], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.xAxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AxisLine], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.xAxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AxisLine], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.y2AxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AlignTickMarks], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.y2AxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AlignTickMarks], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.yAxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoAxisLine], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.yAxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoAxisLine], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def dataLabel(context: atOracleOraclejetLib.ojchartMod.ojChartNs.DataLabelContext): atOracleOraclejetLib.Anon_Insert | atOracleOraclejetLib.Anon_PreventDefault = js.native
  def getContextByNode(node: stdLib.Element): atOracleOraclejetLib.ojchartMod.ojChartNs.PieCenterLabelContext | atOracleOraclejetLib.ojchartMod.ojChartNs.LegendItemContext | atOracleOraclejetLib.ojchartMod.ojChartNs.ReferenceObject | atOracleOraclejetLib.ojchartMod.ojChartNs.GroupContext | atOracleOraclejetLib.ojchartMod.ojChartNs.AxisTitleContext | atOracleOraclejetLib.ojchartMod.ojChartNs.ItemContext | atOracleOraclejetLib.ojchartMod.ojChartNs.SeriesContext = js.native
  def getDataItem(seriesIndex: scala.Double, groupIndex: scala.Double): js.Object | scala.Null = js.native
  def getGroup(groupIndex: java.lang.String): java.lang.String = js.native
  def getGroupCount(): scala.Double = js.native
  def getLegend(): js.Object = js.native
  def getPlotArea(): js.Object = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_coordinateSystem(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.coordinateSystem): atOracleOraclejetLib.atOracleOraclejetLibStrings.polar | atOracleOraclejetLib.atOracleOraclejetLibStrings.cartesian = js.native
  @JSName("getProperty")
  def getProperty_data(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data): (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_dataCursor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursor): atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("getProperty")
  def getProperty_dataCursorBehavior(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorBehavior): atOracleOraclejetLib.atOracleOraclejetLibStrings.smooth | atOracleOraclejetLib.atOracleOraclejetLibStrings.snap | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("getProperty")
  def getProperty_dataCursorPosition(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorPosition): atOracleOraclejetLib.Anon_X = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd): atOracleOraclejetLib.Anon_Drag = js.native
  @JSName("getProperty")
  def getProperty_dragMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.pan | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.user = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drilling): atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.groupsOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  @JSName("getProperty")
  def getProperty_groupComparator(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupComparator): (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategories): js.Array[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_hideAndShowBehavior(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hideAndShowBehavior): atOracleOraclejetLib.atOracleOraclejetLibStrings.withRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.withoutRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatch): atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategories): js.Array[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehavior): atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_initialZooming(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZooming): atOracleOraclejetLib.atOracleOraclejetLibStrings.first | atOracleOraclejetLib.atOracleOraclejetLibStrings.last | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_legend(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.legend): atOracleOraclejetLib.Anon_AsNeeded = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation): atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical = js.native
  @JSName("getProperty")
  def getProperty_otherThreshold(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.otherThreshold): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_overview(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.overview): atOracleOraclejetLib.Anon_Content = js.native
  @JSName("getProperty")
  def getProperty_pieCenter(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pieCenter): atOracleOraclejetLib.Anon_Auto = js.native
  @JSName("getProperty")
  def getProperty_plotArea(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.plotArea): atOracleOraclejetLib.Anon_BackgroundColor = js.native
  @JSName("getProperty")
  def getProperty_polarGridShape(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.polarGridShape): atOracleOraclejetLib.atOracleOraclejetLibStrings.polygon | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle = js.native
  @JSName("getProperty")
  def getProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_seriesComparator(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesComparator): (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_sorting(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.sorting): atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  @JSName("getProperty")
  def getProperty_splitDualY(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.splitDualY): atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("getProperty")
  def getProperty_splitterPosition(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.splitterPosition): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_stack(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.stack): atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  @JSName("getProperty")
  def getProperty_stackLabel(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.stackLabel): atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaults): atOracleOraclejetLib.Anon_AboveMarker = js.native
  @JSName("getProperty")
  def getProperty_timeAxisType(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.timeAxisType): atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.mixedFrequency | atOracleOraclejetLib.atOracleOraclejetLibStrings.skipGaps | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip): atOracleOraclejetLib.Anon_Context = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponse): atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("getProperty")
  def getProperty_type(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`): atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.stock | atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot | atOracleOraclejetLib.atOracleOraclejetLibStrings.combo | atOracleOraclejetLib.atOracleOraclejetLibStrings.pie | atOracleOraclejetLib.atOracleOraclejetLibStrings.scatter | atOracleOraclejetLib.atOracleOraclejetLibStrings.bubble | atOracleOraclejetLib.atOracleOraclejetLibStrings.funnel | atOracleOraclejetLib.atOracleOraclejetLibStrings.pyramid | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueFormats): atOracleOraclejetLib.Anon_Close = js.native
  @JSName("getProperty")
  def getProperty_xAxis(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.xAxis): atOracleOraclejetLib.Anon_AxisLine = js.native
  @JSName("getProperty")
  def getProperty_y2Axis(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.y2Axis): atOracleOraclejetLib.Anon_AlignTickMarks = js.native
  @JSName("getProperty")
  def getProperty_yAxis(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.yAxis): atOracleOraclejetLib.Anon_AutoAxisLine = js.native
  @JSName("getProperty")
  def getProperty_zoomAndScroll(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomAndScroll): atOracleOraclejetLib.atOracleOraclejetLibStrings.delayedScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.liveScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.delayed | atOracleOraclejetLib.atOracleOraclejetLibStrings.live | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  @JSName("getProperty")
  def getProperty_zoomDirection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomDirection): atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  def getSeries(seriesIndex: java.lang.String): java.lang.String = js.native
  def getSeriesCount(): scala.Double = js.native
  def getValuesAt(x: scala.Double, y: scala.Double): js.Object = js.native
  def getXAxis(): js.Object = js.native
  def getY2Axis(): js.Object = js.native
  def getYAxis(): js.Object = js.native
  def setProperties(properties: ojChartSettablePropertiesLenient[K, D]): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.stock | atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot | atOracleOraclejetLib.atOracleOraclejetLibStrings.combo | atOracleOraclejetLib.atOracleOraclejetLibStrings.pie | atOracleOraclejetLib.atOracleOraclejetLibStrings.scatter | atOracleOraclejetLib.atOracleOraclejetLibStrings.bubble | atOracleOraclejetLib.atOracleOraclejetLibStrings.funnel | atOracleOraclejetLib.atOracleOraclejetLibStrings.pyramid | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToLeft
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToRight
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.coordinateSystem,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.cartesian
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.coordinateSystem,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.polar
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.smooth
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.snap
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursor,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursor,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursor,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.pan
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.select
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.user
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drilling,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupsOnly
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drilling,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drilling,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drilling,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesOnly
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hideAndShowBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hideAndShowBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.withRescale
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hideAndShowBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.withoutRescale
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatch,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatch,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.any
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZooming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.first
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZooming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.last
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZooming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.polarGridShape,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.polarGridShape,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.polygon
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.single
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.sorting,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.sorting,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.descending
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.sorting,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.splitDualY,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.splitDualY,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.splitDualY,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.stackLabel,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.stackLabel,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.stack,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.stack,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.timeAxisType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.timeAxisType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.timeAxisType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.timeAxisType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.mixedFrequency
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.timeAxisType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.skipGaps
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponse,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponse,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomAndScroll,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.delayed
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomAndScroll,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.delayedScrollOnly
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomAndScroll,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.live
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomAndScroll,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.liveScrollOnly
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomAndScroll,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomDirection,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomDirection,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.x
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomDirection,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.y
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_data(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_dataCursorPosition(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataCursorPosition,
    value: atOracleOraclejetLib.Anon_X
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd,
    value: atOracleOraclejetLib.Anon_Drag
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_groupComparator(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupComparator): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_groupComparator(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupComparator,
    value: js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategories,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategories,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_legend(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.legend,
    value: atOracleOraclejetLib.Anon_AsNeeded
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_otherThreshold(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.otherThreshold, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.overview,
    value: atOracleOraclejetLib.Anon_Content
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_pieCenter(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pieCenter,
    value: atOracleOraclejetLib.Anon_Auto
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_plotArea(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.plotArea,
    value: atOracleOraclejetLib.Anon_BackgroundColor
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection, value: js.Array[K]): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesComparator(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesComparator): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesComparator(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesComparator,
    value: js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_splitterPosition(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.splitterPosition, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaults,
    value: atOracleOraclejetLib.Anon_AboveMarker
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip,
    value: atOracleOraclejetLib.Anon_Context
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_ComponentName
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueFormats,
    value: atOracleOraclejetLib.Anon_Close
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_xAxis(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.xAxis,
    value: atOracleOraclejetLib.Anon_AxisLine
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_y2Axis(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.y2Axis,
    value: atOracleOraclejetLib.Anon_AlignTickMarks
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_yAxis(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.yAxis,
    value: atOracleOraclejetLib.Anon_AutoAxisLine
  ): scala.Unit = js.native
}

