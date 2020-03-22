package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.AnonAlignTickMarks
import typings.oracleOraclejet.AnonAnimationDownColor
import typings.oracleOraclejet.AnonAxisLine
import typings.oracleOraclejet.AnonBackgroundColor
import typings.oracleOraclejet.AnonBaselineScaling
import typings.oracleOraclejet.AnonBorderWidth
import typings.oracleOraclejet.AnonClose
import typings.oracleOraclejet.AnonComponentName
import typings.oracleOraclejet.AnonContent
import typings.oracleOraclejet.AnonConverter
import typings.oracleOraclejet.AnonDrag
import typings.oracleOraclejet.AnonInsert
import typings.oracleOraclejet.AnonPreventDefault
import typings.oracleOraclejet.AnonRenderer
import typings.oracleOraclejet.AnonX
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojchartMod.ojChart.AxisTitleContext
import typings.oracleOraclejet.ojchartMod.ojChart.DataLabelContext
import typings.oracleOraclejet.ojchartMod.ojChart.GroupContext
import typings.oracleOraclejet.ojchartMod.ojChart.ItemContext
import typings.oracleOraclejet.ojchartMod.ojChart.LegendItemContext
import typings.oracleOraclejet.ojchartMod.ojChart.PieCenterLabelContext
import typings.oracleOraclejet.ojchartMod.ojChart.ReferenceObject
import typings.oracleOraclejet.ojchartMod.ojChart.SeriesContext
import typings.oracleOraclejet.ojchartMod.ojChart.ojDrill
import typings.oracleOraclejet.ojchartMod.ojChart.ojSelectInput
import typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChange
import typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChangeInput
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typings.oracleOraclejet.oracleOraclejetStrings.`type`
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.alphaFade
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.area
import typings.oracleOraclejet.oracleOraclejetStrings.as
import typings.oracleOraclejet.oracleOraclejetStrings.asChanged
import typings.oracleOraclejet.oracleOraclejetStrings.ascending
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.boxPlot
import typings.oracleOraclejet.oracleOraclejetStrings.bubble
import typings.oracleOraclejet.oracleOraclejetStrings.cartesian
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.combo
import typings.oracleOraclejet.oracleOraclejetStrings.coordinateSystem
import typings.oracleOraclejet.oracleOraclejetStrings.coordinateSystemChanged
import typings.oracleOraclejet.oracleOraclejetStrings.data
import typings.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dataCursor
import typings.oracleOraclejet.oracleOraclejetStrings.dataCursorBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.dataCursorBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dataCursorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dataCursorPosition
import typings.oracleOraclejet.oracleOraclejetStrings.dataCursorPositionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dataLabelChanged
import typings.oracleOraclejet.oracleOraclejetStrings.delayed
import typings.oracleOraclejet.oracleOraclejetStrings.delayedScrollOnly
import typings.oracleOraclejet.oracleOraclejetStrings.descending
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.dnd
import typings.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dragMode
import typings.oracleOraclejet.oracleOraclejetStrings.dragModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.drilling
import typings.oracleOraclejet.oracleOraclejetStrings.drillingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.first
import typings.oracleOraclejet.oracleOraclejetStrings.funnel
import typings.oracleOraclejet.oracleOraclejetStrings.groupComparator
import typings.oracleOraclejet.oracleOraclejetStrings.groupComparatorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.groupsOnly
import typings.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typings.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hideAndShowBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.hideAndShowBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typings.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typings.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typings.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.initialZooming
import typings.oracleOraclejet.oracleOraclejetStrings.initialZoomingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.last
import typings.oracleOraclejet.oracleOraclejetStrings.legend
import typings.oracleOraclejet.oracleOraclejetStrings.legendChanged
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typings.oracleOraclejet.oracleOraclejetStrings.live
import typings.oracleOraclejet.oracleOraclejetStrings.liveScrollOnly
import typings.oracleOraclejet.oracleOraclejetStrings.mixedFrequency
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.orientation
import typings.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typings.oracleOraclejet.oracleOraclejetStrings.otherThreshold
import typings.oracleOraclejet.oracleOraclejetStrings.otherThresholdChanged
import typings.oracleOraclejet.oracleOraclejetStrings.overview
import typings.oracleOraclejet.oracleOraclejetStrings.overviewChanged
import typings.oracleOraclejet.oracleOraclejetStrings.pan
import typings.oracleOraclejet.oracleOraclejetStrings.pie
import typings.oracleOraclejet.oracleOraclejetStrings.pieCenter
import typings.oracleOraclejet.oracleOraclejetStrings.pieCenterChanged
import typings.oracleOraclejet.oracleOraclejetStrings.plotArea
import typings.oracleOraclejet.oracleOraclejetStrings.plotAreaChanged
import typings.oracleOraclejet.oracleOraclejetStrings.polar
import typings.oracleOraclejet.oracleOraclejetStrings.polarGridShape
import typings.oracleOraclejet.oracleOraclejetStrings.polarGridShapeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.polygon
import typings.oracleOraclejet.oracleOraclejetStrings.pyramid
import typings.oracleOraclejet.oracleOraclejetStrings.scatter
import typings.oracleOraclejet.oracleOraclejetStrings.select
import typings.oracleOraclejet.oracleOraclejetStrings.selection
import typings.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typings.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.seriesComparator
import typings.oracleOraclejet.oracleOraclejetStrings.seriesComparatorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.seriesOnly
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.skipGaps
import typings.oracleOraclejet.oracleOraclejetStrings.slideToLeft
import typings.oracleOraclejet.oracleOraclejetStrings.slideToRight
import typings.oracleOraclejet.oracleOraclejetStrings.smooth
import typings.oracleOraclejet.oracleOraclejetStrings.snap
import typings.oracleOraclejet.oracleOraclejetStrings.sorting
import typings.oracleOraclejet.oracleOraclejetStrings.sortingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.splitDualY
import typings.oracleOraclejet.oracleOraclejetStrings.splitDualYChanged
import typings.oracleOraclejet.oracleOraclejetStrings.splitterPosition
import typings.oracleOraclejet.oracleOraclejetStrings.splitterPositionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.stack
import typings.oracleOraclejet.oracleOraclejetStrings.stackChanged
import typings.oracleOraclejet.oracleOraclejetStrings.stackLabel
import typings.oracleOraclejet.oracleOraclejetStrings.stackLabelChanged
import typings.oracleOraclejet.oracleOraclejetStrings.stock
import typings.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typings.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.timeAxisType
import typings.oracleOraclejet.oracleOraclejetStrings.timeAxisTypeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.tooltip
import typings.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typings.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typings.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.user
import typings.oracleOraclejet.oracleOraclejetStrings.valueFormats
import typings.oracleOraclejet.oracleOraclejetStrings.valueFormatsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import typings.oracleOraclejet.oracleOraclejetStrings.withRescale
import typings.oracleOraclejet.oracleOraclejetStrings.withoutRescale
import typings.oracleOraclejet.oracleOraclejetStrings.x
import typings.oracleOraclejet.oracleOraclejetStrings.xAxis
import typings.oracleOraclejet.oracleOraclejetStrings.xAxisChanged
import typings.oracleOraclejet.oracleOraclejetStrings.y
import typings.oracleOraclejet.oracleOraclejetStrings.y2Axis
import typings.oracleOraclejet.oracleOraclejetStrings.y2AxisChanged
import typings.oracleOraclejet.oracleOraclejetStrings.yAxis
import typings.oracleOraclejet.oracleOraclejetStrings.yAxisChanged
import typings.oracleOraclejet.oracleOraclejetStrings.zoom
import typings.oracleOraclejet.oracleOraclejetStrings.zoomAndScroll
import typings.oracleOraclejet.oracleOraclejetStrings.zoomAndScrollChanged
import typings.oracleOraclejet.oracleOraclejetStrings.zoomDirection
import typings.oracleOraclejet.oracleOraclejetStrings.zoomDirectionChanged
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojChart_[K, D] extends dvtBaseComponent[ojChartSettableProperties[K, D]] {
  var animationOnDataChange: auto | slideToLeft | slideToRight | none = js.native
  var animationOnDisplay: auto | alphaFade | zoom | none = js.native
  var as: String = js.native
  var coordinateSystem: polar | cartesian = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var dataCursor: off | on | auto = js.native
  var dataCursorBehavior: smooth | snap | auto = js.native
  var dataCursorPosition: AnonX = js.native
  var dnd: AnonDrag = js.native
  var dragMode: pan | zoom | select | off | user = js.native
  var drilling: on | seriesOnly | groupsOnly | off = js.native
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var hideAndShowBehavior: withRescale | withoutRescale | none = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var initialZooming: first | last | none = js.native
  var legend: AnonBackgroundColor = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | alphaFade | zoom | none], _]) | Null = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onCoordinateSystemChanged: (js.Function1[/* event */ JetElementCustomEvent[polar | cartesian], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  var onDataCursorBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[smooth | snap | auto], _]) | Null = js.native
  var onDataCursorChanged: (js.Function1[/* event */ JetElementCustomEvent[off | on | auto], _]) | Null = js.native
  var onDataCursorPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonX], _]) | Null = js.native
  var onDataLabelChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, AnonInsert | AnonPreventDefault]], 
    _
  ]) | Null = js.native
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonDrag], _]) | Null = js.native
  var onDragModeChanged: (js.Function1[/* event */ JetElementCustomEvent[pan | zoom | select | off | user], _]) | Null = js.native
  var onDrillingChanged: (js.Function1[/* event */ JetElementCustomEvent[on | seriesOnly | groupsOnly | off], _]) | Null = js.native
  var onGroupComparatorChanged: (js.Function1[
    /* event */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
    _
  ]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], _]) | Null = js.native
  var onHideAndShowBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[withRescale | withoutRescale | none], _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[/* event */ JetElementCustomEvent[any | all], _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[dim | none], _]) | Null = js.native
  var onInitialZoomingChanged: (js.Function1[/* event */ JetElementCustomEvent[first | last | none], _]) | Null = js.native
  var onLegendChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonBackgroundColor], _]) | Null = js.native
  var onOjDrill: (js.Function1[/* event */ ojDrill, _]) | Null = js.native
  var onOjSelectInput: (js.Function1[/* event */ ojSelectInput, _]) | Null = js.native
  var onOjViewportChange: (js.Function1[/* event */ ojViewportChange, _]) | Null = js.native
  var onOjViewportChangeInput: (js.Function1[/* event */ ojViewportChangeInput, _]) | Null = js.native
  var onOrientationChanged: (js.Function1[/* event */ JetElementCustomEvent[horizontal | vertical], _]) | Null = js.native
  var onOtherThresholdChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onOverviewChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonContent], _]) | Null = js.native
  var onPieCenterChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonConverter], _]) | Null = js.native
  var onPlotAreaChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonBorderWidth], _]) | Null = js.native
  var onPolarGridShapeChanged: (js.Function1[/* event */ JetElementCustomEvent[polygon | circle], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[K]], _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[single | multiple | none], _]) | Null = js.native
  var onSeriesComparatorChanged: (js.Function1[
    /* event */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
    _
  ]) | Null = js.native
  var onSortingChanged: (js.Function1[/* event */ JetElementCustomEvent[ascending | descending | off], _]) | Null = js.native
  var onSplitDualYChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off | auto], _]) | Null = js.native
  var onSplitterPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onStackChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off], _]) | Null = js.native
  var onStackLabelChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off], _]) | Null = js.native
  var onStyleDefaultsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonAnimationDownColor], _]) | Null = js.native
  var onTimeAxisTypeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
    _
  ]) | Null = js.native
  var onTooltipChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonRenderer], _]) | Null = js.native
  var onTouchResponseChanged: (js.Function1[/* event */ JetElementCustomEvent[touchStart | auto], _]) | Null = js.native
  var onTypeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ], 
    _
  ]) | Null = js.native
  var onValueFormatsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonClose], _]) | Null = js.native
  var onXAxisChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonAxisLine], _]) | Null = js.native
  var onY2AxisChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonAlignTickMarks], _]) | Null = js.native
  var onYAxisChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonBaselineScaling], _]) | Null = js.native
  var onZoomAndScrollChanged: (js.Function1[
    /* event */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
    _
  ]) | Null = js.native
  var onZoomDirectionChanged: (js.Function1[/* event */ JetElementCustomEvent[x | y | auto], _]) | Null = js.native
  var orientation: horizontal | vertical = js.native
  var otherThreshold: Double = js.native
  var overview: AnonContent = js.native
  var pieCenter: AnonConverter = js.native
  var plotArea: AnonBorderWidth = js.native
  var polarGridShape: polygon | circle = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: single | multiple | none = js.native
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  var sorting: ascending | descending | off = js.native
  var splitDualY: on | off | auto = js.native
  var splitterPosition: Double = js.native
  var stack: on | off = js.native
  var stackLabel: on | off = js.native
  var styleDefaults: AnonAnimationDownColor = js.native
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  var tooltip: AnonRenderer = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojChart_ : AnonComponentName = js.native
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  var valueFormats: AnonClose = js.native
  var xAxis: AnonAxisLine = js.native
  var y2Axis: AnonAlignTickMarks = js.native
  var yAxis: AnonBaselineScaling = js.native
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  var zoomDirection: x | y | auto = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | alphaFade | zoom | none], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | alphaFade | zoom | none], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polar | cartesian], _]
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polar | cartesian], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[smooth | snap | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[smooth | snap | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dragModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[pan | zoom | select | off | user], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: dragModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[pan | zoom | select | off | user], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[on | seriesOnly | groupsOnly | off], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[on | seriesOnly | groupsOnly | off], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[withRescale | withoutRescale | none], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[withRescale | withoutRescale | none], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[first | last | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[first | last | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polygon | circle], _]
  ): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polygon | circle], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[ascending | descending | off], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[ascending | descending | off], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: splitDualYChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: splitDualYChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stackChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: stackChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stackLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: stackLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: timeAxisTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: timeAxisTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: zoomAndScrollChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomAndScrollChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: zoomDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonX], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonX], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, AnonInsert | AnonPreventDefault]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, AnonInsert | AnonPreventDefault]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonDrag], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonDrag], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonBackgroundColor], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonBackgroundColor], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojDrill, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojDrill, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojSelectInput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojSelectInput, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojSelectInput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojSelectInput, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojViewportChange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojViewportChange, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojViewportChange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojViewportChange, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojViewportChangeInput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojViewportChangeInput, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojViewportChangeInput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojViewportChangeInput, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonContent], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonContent], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonConverter], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonConverter], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonBorderWidth], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonBorderWidth], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAnimationDownColor], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAnimationDownColor], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonRenderer], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonRenderer], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonClose], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonClose], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAxisLine], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAxisLine], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAlignTickMarks], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAlignTickMarks], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonBaselineScaling], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonBaselineScaling], _],
    useCapture: Boolean
  ): Unit = js.native
  def dataLabel(context: DataLabelContext): AnonInsert | AnonPreventDefault = js.native
  def getContextByNode(node: Element): PieCenterLabelContext | LegendItemContext | ReferenceObject | GroupContext | AxisTitleContext | ItemContext | SeriesContext = js.native
  def getDataItem(seriesIndex: Double, groupIndex: Double): js.Object | Null = js.native
  def getGroup(groupIndex: String): String = js.native
  def getGroupCount(): Double = js.native
  def getLegend(): js.Object = js.native
  def getPlotArea(): js.Object = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | slideToLeft | slideToRight | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | alphaFade | zoom | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_coordinateSystem(property: coordinateSystem): polar | cartesian = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_dataCursor(property: dataCursor): off | on | auto = js.native
  @JSName("getProperty")
  def getProperty_dataCursorBehavior(property: dataCursorBehavior): smooth | snap | auto = js.native
  @JSName("getProperty")
  def getProperty_dataCursorPosition(property: dataCursorPosition): AnonX = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): AnonDrag = js.native
  @JSName("getProperty")
  def getProperty_dragMode(property: dragMode): pan | zoom | select | off | user = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: drilling): on | seriesOnly | groupsOnly | off = js.native
  @JSName("getProperty")
  def getProperty_groupComparator(property: groupComparator): (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hideAndShowBehavior(property: hideAndShowBehavior): withRescale | withoutRescale | none = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_initialZooming(property: initialZooming): first | last | none = js.native
  @JSName("getProperty")
  def getProperty_legend(property: legend): AnonBackgroundColor = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  @JSName("getProperty")
  def getProperty_otherThreshold(property: otherThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_overview(property: overview): AnonContent = js.native
  @JSName("getProperty")
  def getProperty_pieCenter(property: pieCenter): AnonConverter = js.native
  @JSName("getProperty")
  def getProperty_plotArea(property: plotArea): AnonBorderWidth = js.native
  @JSName("getProperty")
  def getProperty_polarGridShape(property: polarGridShape): polygon | circle = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_seriesComparator(property: seriesComparator): (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  @JSName("getProperty")
  def getProperty_sorting(property: sorting): ascending | descending | off = js.native
  @JSName("getProperty")
  def getProperty_splitDualY(property: splitDualY): on | off | auto = js.native
  @JSName("getProperty")
  def getProperty_splitterPosition(property: splitterPosition): Double = js.native
  @JSName("getProperty")
  def getProperty_stack(property: stack): on | off = js.native
  @JSName("getProperty")
  def getProperty_stackLabel(property: stackLabel): on | off = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): AnonAnimationDownColor = js.native
  @JSName("getProperty")
  def getProperty_timeAxisType(property: timeAxisType): enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): AnonRenderer = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: valueFormats): AnonClose = js.native
  @JSName("getProperty")
  def getProperty_xAxis(property: xAxis): AnonAxisLine = js.native
  @JSName("getProperty")
  def getProperty_y2Axis(property: y2Axis): AnonAlignTickMarks = js.native
  @JSName("getProperty")
  def getProperty_yAxis(property: yAxis): AnonBaselineScaling = js.native
  @JSName("getProperty")
  def getProperty_zoomAndScroll(property: zoomAndScroll): delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  @JSName("getProperty")
  def getProperty_zoomDirection(property: zoomDirection): x | y | auto = js.native
  def getSeries(seriesIndex: String): String = js.native
  def getSeriesCount(): Double = js.native
  def getValuesAt(x: Double, y: Double): js.Object = js.native
  def getXAxis(): js.Object = js.native
  def getY2Axis(): js.Object = js.native
  def getYAxis(): js.Object = js.native
  def setProperties(properties: ojChartSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(
    property: `type`,
    value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  ): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDataChange, value: slideToLeft): Unit = js.native
  def setProperty(property: animationOnDataChange, value: slideToRight): Unit = js.native
  def setProperty(property: animationOnDisplay, value: alphaFade): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: zoom): Unit = js.native
  def setProperty(property: coordinateSystem, value: cartesian): Unit = js.native
  def setProperty(property: coordinateSystem, value: polar): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: auto): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: smooth): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: snap): Unit = js.native
  def setProperty(property: dataCursor, value: auto): Unit = js.native
  def setProperty(property: dataCursor, value: off): Unit = js.native
  def setProperty(property: dataCursor, value: on): Unit = js.native
  def setProperty(property: dragMode, value: off): Unit = js.native
  def setProperty(property: dragMode, value: pan): Unit = js.native
  def setProperty(property: dragMode, value: select): Unit = js.native
  def setProperty(property: dragMode, value: user): Unit = js.native
  def setProperty(property: dragMode, value: zoom): Unit = js.native
  def setProperty(property: drilling, value: groupsOnly): Unit = js.native
  def setProperty(property: drilling, value: off): Unit = js.native
  def setProperty(property: drilling, value: on): Unit = js.native
  def setProperty(property: drilling, value: seriesOnly): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: none): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: withRescale): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: withoutRescale): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: initialZooming, value: first): Unit = js.native
  def setProperty(property: initialZooming, value: last): Unit = js.native
  def setProperty(property: initialZooming, value: none): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  def setProperty(property: polarGridShape, value: circle): Unit = js.native
  def setProperty(property: polarGridShape, value: polygon): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: sorting, value: ascending): Unit = js.native
  def setProperty(property: sorting, value: descending): Unit = js.native
  def setProperty(property: sorting, value: off): Unit = js.native
  def setProperty(property: splitDualY, value: auto): Unit = js.native
  def setProperty(property: splitDualY, value: off): Unit = js.native
  def setProperty(property: splitDualY, value: on): Unit = js.native
  def setProperty(property: stackLabel, value: off): Unit = js.native
  def setProperty(property: stackLabel, value: on): Unit = js.native
  def setProperty(property: stack, value: off): Unit = js.native
  def setProperty(property: stack, value: on): Unit = js.native
  def setProperty(property: timeAxisType, value: auto): Unit = js.native
  def setProperty(property: timeAxisType, value: disabled): Unit = js.native
  def setProperty(property: timeAxisType, value: enabled): Unit = js.native
  def setProperty(property: timeAxisType, value: mixedFrequency): Unit = js.native
  def setProperty(property: timeAxisType, value: skipGaps): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  def setProperty(property: zoomAndScroll, value: delayed): Unit = js.native
  def setProperty(property: zoomAndScroll, value: delayedScrollOnly): Unit = js.native
  def setProperty(property: zoomAndScroll, value: live): Unit = js.native
  def setProperty(property: zoomAndScroll, value: liveScrollOnly): Unit = js.native
  def setProperty(property: zoomAndScroll, value: off): Unit = js.native
  def setProperty(property: zoomDirection, value: auto): Unit = js.native
  def setProperty(property: zoomDirection, value: x): Unit = js.native
  def setProperty(property: zoomDirection, value: y): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dataCursorPosition(property: dataCursorPosition, value: AnonX): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: AnonDrag): Unit = js.native
  @JSName("setProperty")
  def setProperty_groupComparator(property: groupComparator): Unit = js.native
  @JSName("setProperty")
  def setProperty_groupComparator(
    property: groupComparator,
    value: js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_legend(property: legend, value: AnonBackgroundColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_otherThreshold(property: otherThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(property: overview, value: AnonContent): Unit = js.native
  @JSName("setProperty")
  def setProperty_pieCenter(property: pieCenter, value: AnonConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_plotArea(property: plotArea, value: AnonBorderWidth): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesComparator(property: seriesComparator): Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesComparator(
    property: seriesComparator,
    value: js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_splitterPosition(property: splitterPosition, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: AnonAnimationDownColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: AnonRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonComponentName): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(property: valueFormats, value: AnonClose): Unit = js.native
  @JSName("setProperty")
  def setProperty_xAxis(property: xAxis, value: AnonAxisLine): Unit = js.native
  @JSName("setProperty")
  def setProperty_y2Axis(property: y2Axis, value: AnonAlignTickMarks): Unit = js.native
  @JSName("setProperty")
  def setProperty_yAxis(property: yAxis, value: AnonBaselineScaling): Unit = js.native
}

