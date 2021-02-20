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
import typings.oracleOraclejet.anon.Data
import typings.oracleOraclejet.anon.Drag
import typings.oracleOraclejet.anon.EndGroup
import typings.oracleOraclejet.anon.Insert
import typings.oracleOraclejet.anon.PreventDefault
import typings.oracleOraclejet.anon.Renderer
import typings.oracleOraclejet.anon.StartGroup
import typings.oracleOraclejet.anon.X
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojchartMod.ojChart.AxisTitleContext
import typings.oracleOraclejet.ojchartMod.ojChart.DataLabelContext
import typings.oracleOraclejet.ojchartMod.ojChart.GroupContext
import typings.oracleOraclejet.ojchartMod.ojChart.ItemContext
import typings.oracleOraclejet.ojchartMod.ojChart.LegendItemContext
import typings.oracleOraclejet.ojchartMod.ojChart.PieCenterLabelContext
import typings.oracleOraclejet.ojchartMod.ojChart.ReferenceObject
import typings.oracleOraclejet.ojchartMod.ojChart.SeriesContext
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
import typings.oracleOraclejet.oracleOraclejetStrings.ojDrill
import typings.oracleOraclejet.oracleOraclejetStrings.ojSelectInput
import typings.oracleOraclejet.oracleOraclejetStrings.ojViewportChange
import typings.oracleOraclejet.oracleOraclejetStrings.ojViewportChangeInput
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
import typings.std.CustomEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojChart[K, D] extends dvtBaseComponent[ojChartSettableProperties[K, D]] {
  
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[X], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[X], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Drag], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Drag], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BackgroundColor], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BackgroundColor], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojDrill, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojDrill, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: ojSelectInput,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojSelectInput, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: ojSelectInput,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojSelectInput, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChange, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChange, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChangeInput, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChangeInput, 
      _
    ],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Content], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Content], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Converter], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Converter], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BorderWidth], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BorderWidth], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnimationDownColor], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnimationDownColor], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Renderer], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Renderer], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Close], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Close], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AxisLine], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AxisLine], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AlignTickMarks], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AlignTickMarks], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BaselineScaling], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BaselineScaling], _],
    useCapture: Boolean
  ): Unit = js.native
  
  var animationOnDataChange: auto | slideToLeft | slideToRight | none = js.native
  
  var animationOnDisplay: auto | alphaFade | zoom | none = js.native
  
  var as: String = js.native
  
  var coordinateSystem: polar | cartesian = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var dataCursor: off | on | auto = js.native
  
  var dataCursorBehavior: smooth | snap | auto = js.native
  
  var dataCursorPosition: X = js.native
  
  def dataLabel(context: DataLabelContext): Insert | PreventDefault = js.native
  
  var dnd: Drag = js.native
  
  var dragMode: pan | zoom | select | off | user = js.native
  
  var drilling: on | seriesOnly | groupsOnly | off = js.native
  
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
  def getProperty_dataCursorPosition(property: dataCursorPosition): X = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Drag = js.native
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
  def getProperty_legend(property: legend): BackgroundColor = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  @JSName("getProperty")
  def getProperty_otherThreshold(property: otherThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_overview(property: overview): Content = js.native
  @JSName("getProperty")
  def getProperty_pieCenter(property: pieCenter): Converter = js.native
  @JSName("getProperty")
  def getProperty_plotArea(property: plotArea): BorderWidth = js.native
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
  def getProperty_styleDefaults(property: styleDefaults): AnimationDownColor = js.native
  @JSName("getProperty")
  def getProperty_timeAxisType(property: timeAxisType): enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Renderer = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: valueFormats): Close = js.native
  @JSName("getProperty")
  def getProperty_xAxis(property: xAxis): AxisLine = js.native
  @JSName("getProperty")
  def getProperty_y2Axis(property: y2Axis): AlignTickMarks = js.native
  @JSName("getProperty")
  def getProperty_yAxis(property: yAxis): BaselineScaling = js.native
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
  
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var hideAndShowBehavior: withRescale | withoutRescale | none = js.native
  
  var highlightMatch: any | all = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var initialZooming: first | last | none = js.native
  
  var legend: BackgroundColor = js.native
  
  var onAnimationOnDataChangeChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], _]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | alphaFade | zoom | none], _]) | Null = js.native
  
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  
  var onCoordinateSystemChanged: (js.Function1[/* event */ JetElementCustomEvent[polar | cartesian], _]) | Null = js.native
  
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  
  var onDataCursorBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[smooth | snap | auto], _]) | Null = js.native
  
  var onDataCursorChanged: (js.Function1[/* event */ JetElementCustomEvent[off | on | auto], _]) | Null = js.native
  
  var onDataCursorPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[X], _]) | Null = js.native
  
  var onDataLabelChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]], 
    _
  ]) | Null = js.native
  
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[Drag], _]) | Null = js.native
  
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
  
  var onLegendChanged: (js.Function1[/* event */ JetElementCustomEvent[BackgroundColor], _]) | Null = js.native
  
  var onOjDrill: (js.Function1[/* event */ typings.oracleOraclejet.ojchartMod.ojChart.ojDrill, _]) | Null = js.native
  
  var onOjSelectInput: (js.Function1[/* event */ typings.oracleOraclejet.ojchartMod.ojChart.ojSelectInput, _]) | Null = js.native
  
  var onOjViewportChange: (js.Function1[/* event */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChange, _]) | Null = js.native
  
  var onOjViewportChangeInput: (js.Function1[/* event */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChangeInput, _]) | Null = js.native
  
  var onOrientationChanged: (js.Function1[/* event */ JetElementCustomEvent[horizontal | vertical], _]) | Null = js.native
  
  var onOtherThresholdChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  
  var onOverviewChanged: (js.Function1[/* event */ JetElementCustomEvent[Content], _]) | Null = js.native
  
  var onPieCenterChanged: (js.Function1[/* event */ JetElementCustomEvent[Converter], _]) | Null = js.native
  
  var onPlotAreaChanged: (js.Function1[/* event */ JetElementCustomEvent[BorderWidth], _]) | Null = js.native
  
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
  
  var onStyleDefaultsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnimationDownColor], _]) | Null = js.native
  
  var onTimeAxisTypeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
    _
  ]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[/* event */ JetElementCustomEvent[Renderer], _]) | Null = js.native
  
  var onTouchResponseChanged: (js.Function1[/* event */ JetElementCustomEvent[touchStart | auto], _]) | Null = js.native
  
  var onTypeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ], 
    _
  ]) | Null = js.native
  
  var onValueFormatsChanged: (js.Function1[/* event */ JetElementCustomEvent[Close], _]) | Null = js.native
  
  var onXAxisChanged: (js.Function1[/* event */ JetElementCustomEvent[AxisLine], _]) | Null = js.native
  
  var onY2AxisChanged: (js.Function1[/* event */ JetElementCustomEvent[AlignTickMarks], _]) | Null = js.native
  
  var onYAxisChanged: (js.Function1[/* event */ JetElementCustomEvent[BaselineScaling], _]) | Null = js.native
  
  var onZoomAndScrollChanged: (js.Function1[
    /* event */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
    _
  ]) | Null = js.native
  
  var onZoomDirectionChanged: (js.Function1[/* event */ JetElementCustomEvent[x | y | auto], _]) | Null = js.native
  
  var orientation: horizontal | vertical = js.native
  
  var otherThreshold: Double = js.native
  
  var overview: Content = js.native
  
  var pieCenter: Converter = js.native
  
  var plotArea: BorderWidth = js.native
  
  var polarGridShape: polygon | circle = js.native
  
  var selection: js.Array[K] = js.native
  
  var selectionMode: single | multiple | none = js.native
  
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  
  def setProperties(properties: ojChartSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: `type`, value: area): Unit = js.native
  def setProperty(property: `type`, value: bar): Unit = js.native
  def setProperty(property: `type`, value: boxPlot): Unit = js.native
  def setProperty(property: `type`, value: bubble): Unit = js.native
  def setProperty(property: `type`, value: combo): Unit = js.native
  def setProperty(property: `type`, value: funnel): Unit = js.native
  def setProperty(property: `type`, value: line): Unit = js.native
  def setProperty(property: `type`, value: lineWithArea): Unit = js.native
  def setProperty(property: `type`, value: pie): Unit = js.native
  def setProperty(property: `type`, value: pyramid): Unit = js.native
  def setProperty(property: `type`, value: scatter): Unit = js.native
  def setProperty(property: `type`, value: stock): Unit = js.native
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
  def setProperty_dataCursorPosition(property: dataCursorPosition, value: X): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Drag): Unit = js.native
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
  def setProperty_legend(property: legend, value: BackgroundColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_otherThreshold(property: otherThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(property: overview, value: Content): Unit = js.native
  @JSName("setProperty")
  def setProperty_pieCenter(property: pieCenter, value: Converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_plotArea(property: plotArea, value: BorderWidth): Unit = js.native
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
  def setProperty_styleDefaults(property: styleDefaults, value: AnimationDownColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Renderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: ComponentName): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(property: valueFormats, value: Close): Unit = js.native
  @JSName("setProperty")
  def setProperty_xAxis(property: xAxis, value: AxisLine): Unit = js.native
  @JSName("setProperty")
  def setProperty_y2Axis(property: y2Axis, value: AlignTickMarks): Unit = js.native
  @JSName("setProperty")
  def setProperty_yAxis(property: yAxis, value: BaselineScaling): Unit = js.native
  
  var sorting: ascending | descending | off = js.native
  
  var splitDualY: on | off | auto = js.native
  
  var splitterPosition: Double = js.native
  
  var stack: on | off = js.native
  
  var stackLabel: on | off = js.native
  
  var styleDefaults: AnimationDownColor = js.native
  
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  
  var tooltip: Renderer = js.native
  
  var touchResponse: touchStart | auto = js.native
  
  @JSName("translations")
  var translations_ojChart: ComponentName = js.native
  
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  
  var valueFormats: Close = js.native
  
  var xAxis: AxisLine = js.native
  
  var y2Axis: AlignTickMarks = js.native
  
  var yAxis: BaselineScaling = js.native
  
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  
  var zoomDirection: x | y | auto = js.native
}
object ojChart {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait AxisTitleContext extends StObject {
    
    var axis: xAxis | yAxis | y2Axis = js.native
    
    var subId: String = js.native
  }
  object AxisTitleContext {
    
    @scala.inline
    def apply(axis: xAxis | yAxis | y2Axis, subId: String): AxisTitleContext = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisTitleContext]
    }
    
    @scala.inline
    implicit class AxisTitleContextMutableBuilder[Self <: AxisTitleContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: xAxis | yAxis | y2Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait DataLabelContext extends StObject {
    
    var close: Double = js.native
    
    var componentElement: Element = js.native
    
    var data: js.Object | Null = js.native
    
    var group: String | js.Array[String] = js.native
    
    var groupData: js.Object | Null = js.native
    
    var high: Double = js.native
    
    var id: js.Any = js.native
    
    var itemData: js.Object | Null = js.native
    
    var label: String = js.native
    
    var low: Double = js.native
    
    var open: Double = js.native
    
    var series: String = js.native
    
    var seriesData: js.Object | Null = js.native
    
    var targetValue: Double = js.native
    
    var totalValue: Double = js.native
    
    var value: Double = js.native
    
    var volume: Double = js.native
    
    var x: Double | String = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object DataLabelContext {
    
    @scala.inline
    def apply(
      close: Double,
      componentElement: Element,
      group: String | js.Array[String],
      high: Double,
      id: js.Any,
      label: String,
      low: Double,
      open: Double,
      series: String,
      targetValue: Double,
      totalValue: Double,
      value: Double,
      volume: Double,
      x: Double | String,
      y: Double,
      z: Double
    ): DataLabelContext = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], totalValue = totalValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataLabelContext]
    }
    
    @scala.inline
    implicit class DataLabelContextMutableBuilder[Self <: DataLabelContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupData(value: js.Object): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupDataNull: Self = StObject.set(x, "groupData", null)
      
      @scala.inline
      def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDataNull: Self = StObject.set(x, "itemData", null)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesData(value: js.Object): Self = StObject.set(x, "seriesData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesDataNull: Self = StObject.set(x, "seriesData", null)
      
      @scala.inline
      def setTargetValue(value: Double): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalValue(value: Double): Self = StObject.set(x, "totalValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait GroupContext extends StObject {
    
    var indexPath: js.Array[_] = js.native
    
    var subId: String = js.native
  }
  object GroupContext {
    
    @scala.inline
    def apply(indexPath: js.Array[_], subId: String): GroupContext = {
      val __obj = js.Dynamic.literal(indexPath = indexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupContext]
    }
    
    @scala.inline
    implicit class GroupContextMutableBuilder[Self <: GroupContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexPath(value: js.Array[_]): Self = StObject.set(x, "indexPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexPathVarargs(value: js.Any*): Self = StObject.set(x, "indexPath", js.Array(value :_*))
      
      @scala.inline
      def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait ItemContext extends StObject {
    
    var itemIndex: Double = js.native
    
    var seriesIndex: Double = js.native
    
    var subId: String = js.native
  }
  object ItemContext {
    
    @scala.inline
    def apply(itemIndex: Double, seriesIndex: Double, subId: String): ItemContext = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContext]
    }
    
    @scala.inline
    implicit class ItemContextMutableBuilder[Self <: ItemContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesIndex(value: Double): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait LegendItemContext extends StObject {
    
    var itemIndex: Double = js.native
    
    var sectionIndexPath: js.Array[_] = js.native
    
    var subId: String = js.native
  }
  object LegendItemContext {
    
    @scala.inline
    def apply(itemIndex: Double, sectionIndexPath: js.Array[_], subId: String): LegendItemContext = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndexPath = sectionIndexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendItemContext]
    }
    
    @scala.inline
    implicit class LegendItemContextMutableBuilder[Self <: LegendItemContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionIndexPath(value: js.Array[_]): Self = StObject.set(x, "sectionIndexPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionIndexPathVarargs(value: js.Any*): Self = StObject.set(x, "sectionIndexPath", js.Array(value :_*))
      
      @scala.inline
      def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait PieCenterContext extends StObject {
    
    var componentElement: Element = js.native
    
    var innerBounds: js.Object = js.native
    
    var label: String = js.native
    
    var outerBounds: js.Object = js.native
  }
  object PieCenterContext {
    
    @scala.inline
    def apply(componentElement: Element, innerBounds: js.Object, label: String, outerBounds: js.Object): PieCenterContext = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieCenterContext]
    }
    
    @scala.inline
    implicit class PieCenterContextMutableBuilder[Self <: PieCenterContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerBounds(value: js.Object): Self = StObject.set(x, "innerBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterBounds(value: js.Object): Self = StObject.set(x, "outerBounds", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait PieCenterLabelContext extends StObject {
    
    var subId: String = js.native
  }
  object PieCenterLabelContext {
    
    @scala.inline
    def apply(subId: String): PieCenterLabelContext = {
      val __obj = js.Dynamic.literal(subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieCenterLabelContext]
    }
    
    @scala.inline
    implicit class PieCenterLabelContextMutableBuilder[Self <: PieCenterLabelContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait ReferenceObject extends StObject {
    
    var axis: xAxis | yAxis | y2Axis = js.native
    
    var index: Double = js.native
    
    var subId: String = js.native
  }
  object ReferenceObject {
    
    @scala.inline
    def apply(axis: xAxis | yAxis | y2Axis, index: Double, subId: String): ReferenceObject = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceObject]
    }
    
    @scala.inline
    implicit class ReferenceObjectMutableBuilder[Self <: ReferenceObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: xAxis | yAxis | y2Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait SeriesContext extends StObject {
    
    var itemIndex: Double = js.native
    
    var subId: String = js.native
  }
  object SeriesContext {
    
    @scala.inline
    def apply(itemIndex: Double, subId: String): SeriesContext = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesContext]
    }
    
    @scala.inline
    implicit class SeriesContextMutableBuilder[Self <: SeriesContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait TooltipContext extends StObject {
    
    var close: Double = js.native
    
    var color: String = js.native
    
    var componentElement: Element = js.native
    
    var data: js.Object | Null = js.native
    
    var group: String | js.Array[String] = js.native
    
    var groupData: js.Object | Null = js.native
    
    var high: Double = js.native
    
    var id: js.Any = js.native
    
    var itemData: js.Object | Null = js.native
    
    var label: String = js.native
    
    var low: Double = js.native
    
    var open: Double = js.native
    
    var parentElement: Element = js.native
    
    var series: String = js.native
    
    var seriesData: js.Object | Null = js.native
    
    var targetValue: Double = js.native
    
    var value: Double = js.native
    
    var volume: Double = js.native
    
    var x: Double | String = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object TooltipContext {
    
    @scala.inline
    def apply(
      close: Double,
      color: String,
      componentElement: Element,
      group: String | js.Array[String],
      high: Double,
      id: js.Any,
      label: String,
      low: Double,
      open: Double,
      parentElement: Element,
      series: String,
      targetValue: Double,
      value: Double,
      volume: Double,
      x: Double | String,
      y: Double,
      z: Double
    ): TooltipContext = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext]
    }
    
    @scala.inline
    implicit class TooltipContextMutableBuilder[Self <: TooltipContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupData(value: js.Object): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupDataNull: Self = StObject.set(x, "groupData", null)
      
      @scala.inline
      def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDataNull: Self = StObject.set(x, "itemData", null)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesData(value: js.Object): Self = StObject.set(x, "seriesData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesDataNull: Self = StObject.set(x, "seriesData", null)
      
      @scala.inline
      def setTargetValue(value: Double): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  type ojDrill = CustomEvent[Data]
  
  type ojSelectInput = CustomEvent[EndGroup]
  
  type ojViewportChange = CustomEvent[StartGroup]
  
  type ojViewportChangeInput = CustomEvent[StartGroup]
}
