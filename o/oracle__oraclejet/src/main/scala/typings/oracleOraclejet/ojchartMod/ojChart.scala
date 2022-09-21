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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojChart[K, D]
  extends StObject
     with dvtBaseComponent[ojChartSettableProperties[K, D]] {
  
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | alphaFade | zoom | none], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | alphaFade | zoom | none], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polar | cartesian], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polar | cartesian], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[smooth | snap | auto], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[smooth | snap | auto], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on | auto], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on | auto], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dragModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[pan | zoom | select | off | user], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: dragModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[pan | zoom | select | off | user], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[on | seriesOnly | groupsOnly | off], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[on | seriesOnly | groupsOnly | off], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[withRescale | withoutRescale | none], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[withRescale | withoutRescale | none], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[first | last | none], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[first | last | none], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polygon | circle], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polygon | circle], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[single | multiple | none], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[single | multiple | none], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[ascending | descending | off], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[ascending | descending | off], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: splitDualYChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: splitDualYChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stackChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: stackChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stackLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: stackLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: timeAxisTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: timeAxisTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
      ], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
      ], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: zoomAndScrollChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomAndScrollChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: zoomDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[X], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[X], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Drag], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Drag], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BackgroundColor], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BackgroundColor], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojDrill, 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojDrill, 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: ojSelectInput,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojSelectInput, 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: ojSelectInput,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojSelectInput, 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChange, 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChange, 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChangeInput, 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChangeInput, 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Content], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Content], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Converter], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Converter], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BorderWidth], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BorderWidth], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K]], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K]], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnimationDownColor], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnimationDownColor], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Renderer], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Renderer], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Close], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Close], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AxisLine], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AxisLine], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AlignTickMarks], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AlignTickMarks], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BaselineScaling], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[BaselineScaling], Any],
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
  
  var onAnimationOnDataChangeChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], Any]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | alphaFade | zoom | none], Any]) | Null = js.native
  
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], Any]) | Null = js.native
  
  var onCoordinateSystemChanged: (js.Function1[/* event */ JetElementCustomEvent[polar | cartesian], Any]) | Null = js.native
  
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], Any]) | Null = js.native
  
  var onDataCursorBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[smooth | snap | auto], Any]) | Null = js.native
  
  var onDataCursorChanged: (js.Function1[/* event */ JetElementCustomEvent[off | on | auto], Any]) | Null = js.native
  
  var onDataCursorPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[X], Any]) | Null = js.native
  
  var onDataLabelChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]], 
    Any
  ]) | Null = js.native
  
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[Drag], Any]) | Null = js.native
  
  var onDragModeChanged: (js.Function1[/* event */ JetElementCustomEvent[pan | zoom | select | off | user], Any]) | Null = js.native
  
  var onDrillingChanged: (js.Function1[/* event */ JetElementCustomEvent[on | seriesOnly | groupsOnly | off], Any]) | Null = js.native
  
  var onGroupComparatorChanged: (js.Function1[
    /* event */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
    Any
  ]) | Null = js.native
  
  var onHiddenCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], Any]) | Null = js.native
  
  var onHideAndShowBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[withRescale | withoutRescale | none], Any]) | Null = js.native
  
  var onHighlightMatchChanged: (js.Function1[/* event */ JetElementCustomEvent[any | all], Any]) | Null = js.native
  
  var onHighlightedCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], Any]) | Null = js.native
  
  var onHoverBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[dim | none], Any]) | Null = js.native
  
  var onInitialZoomingChanged: (js.Function1[/* event */ JetElementCustomEvent[first | last | none], Any]) | Null = js.native
  
  var onLegendChanged: (js.Function1[/* event */ JetElementCustomEvent[BackgroundColor], Any]) | Null = js.native
  
  var onOjDrill: (js.Function1[/* event */ typings.oracleOraclejet.ojchartMod.ojChart.ojDrill, Any]) | Null = js.native
  
  var onOjSelectInput: (js.Function1[/* event */ typings.oracleOraclejet.ojchartMod.ojChart.ojSelectInput, Any]) | Null = js.native
  
  var onOjViewportChange: (js.Function1[/* event */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChange, Any]) | Null = js.native
  
  var onOjViewportChangeInput: (js.Function1[/* event */ typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChangeInput, Any]) | Null = js.native
  
  var onOrientationChanged: (js.Function1[/* event */ JetElementCustomEvent[horizontal | vertical], Any]) | Null = js.native
  
  var onOtherThresholdChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], Any]) | Null = js.native
  
  var onOverviewChanged: (js.Function1[/* event */ JetElementCustomEvent[Content], Any]) | Null = js.native
  
  var onPieCenterChanged: (js.Function1[/* event */ JetElementCustomEvent[Converter], Any]) | Null = js.native
  
  var onPlotAreaChanged: (js.Function1[/* event */ JetElementCustomEvent[BorderWidth], Any]) | Null = js.native
  
  var onPolarGridShapeChanged: (js.Function1[/* event */ JetElementCustomEvent[polygon | circle], Any]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[K]], Any]) | Null = js.native
  
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[single | multiple | none], Any]) | Null = js.native
  
  var onSeriesComparatorChanged: (js.Function1[
    /* event */ JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null], 
    Any
  ]) | Null = js.native
  
  var onSortingChanged: (js.Function1[/* event */ JetElementCustomEvent[ascending | descending | off], Any]) | Null = js.native
  
  var onSplitDualYChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off | auto], Any]) | Null = js.native
  
  var onSplitterPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], Any]) | Null = js.native
  
  var onStackChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off], Any]) | Null = js.native
  
  var onStackLabelChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off], Any]) | Null = js.native
  
  var onStyleDefaultsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnimationDownColor], Any]) | Null = js.native
  
  var onTimeAxisTypeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
    Any
  ]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[/* event */ JetElementCustomEvent[Renderer], Any]) | Null = js.native
  
  var onTouchResponseChanged: (js.Function1[/* event */ JetElementCustomEvent[touchStart | auto], Any]) | Null = js.native
  
  var onTypeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ], 
    Any
  ]) | Null = js.native
  
  var onValueFormatsChanged: (js.Function1[/* event */ JetElementCustomEvent[Close], Any]) | Null = js.native
  
  var onXAxisChanged: (js.Function1[/* event */ JetElementCustomEvent[AxisLine], Any]) | Null = js.native
  
  var onY2AxisChanged: (js.Function1[/* event */ JetElementCustomEvent[AlignTickMarks], Any]) | Null = js.native
  
  var onYAxisChanged: (js.Function1[/* event */ JetElementCustomEvent[BaselineScaling], Any]) | Null = js.native
  
  var onZoomAndScrollChanged: (js.Function1[
    /* event */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
    Any
  ]) | Null = js.native
  
  var onZoomDirectionChanged: (js.Function1[/* event */ JetElementCustomEvent[x | y | auto], Any]) | Null = js.native
  
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
  
  def setProperty(
    property: `type`,
    value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  ): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto | slideToLeft | slideToRight | none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto | alphaFade | zoom | none): Unit = js.native
  def setProperty(property: coordinateSystem, value: polar | cartesian): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: smooth | snap | auto): Unit = js.native
  def setProperty(property: dataCursor, value: off | on | auto): Unit = js.native
  def setProperty(property: dragMode, value: pan | zoom | select | off | user): Unit = js.native
  def setProperty(property: drilling, value: on | seriesOnly | groupsOnly | off): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: withRescale | withoutRescale | none): Unit = js.native
  def setProperty(property: highlightMatch, value: any | all): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim | none): Unit = js.native
  def setProperty(property: initialZooming, value: first | last | none): Unit = js.native
  def setProperty(property: orientation, value: horizontal | vertical): Unit = js.native
  def setProperty(property: polarGridShape, value: polygon | circle): Unit = js.native
  def setProperty(property: selectionMode, value: single | multiple | none): Unit = js.native
  def setProperty(property: sorting, value: ascending | descending | off): Unit = js.native
  def setProperty(property: splitDualY, value: on | off | auto): Unit = js.native
  def setProperty(property: stackLabel, value: on | off): Unit = js.native
  def setProperty(property: stack, value: on | off): Unit = js.native
  def setProperty(property: timeAxisType, value: enabled | mixedFrequency | skipGaps | disabled | auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart | auto): Unit = js.native
  def setProperty(property: zoomAndScroll, value: delayedScrollOnly | liveScrollOnly | delayed | live | off): Unit = js.native
  def setProperty(property: zoomDirection, value: x | y | auto): Unit = js.native
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
  trait AxisTitleContext extends StObject {
    
    var axis: xAxis | yAxis | y2Axis
    
    var subId: String
  }
  object AxisTitleContext {
    
    inline def apply(axis: xAxis | yAxis | y2Axis, subId: String): AxisTitleContext = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisTitleContext]
    }
    
    extension [Self <: AxisTitleContext](x: Self) {
      
      inline def setAxis(value: xAxis | yAxis | y2Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait DataLabelContext extends StObject {
    
    var close: Double
    
    var componentElement: Element
    
    var data: js.Object | Null
    
    var group: String | js.Array[String]
    
    var groupData: js.Object | Null
    
    var high: Double
    
    var id: Any
    
    var itemData: js.Object | Null
    
    var label: String
    
    var low: Double
    
    var open: Double
    
    var series: String
    
    var seriesData: js.Object | Null
    
    var targetValue: Double
    
    var totalValue: Double
    
    var value: Double
    
    var volume: Double
    
    var x: Double | String
    
    var y: Double
    
    var z: Double
  }
  object DataLabelContext {
    
    inline def apply(
      close: Double,
      componentElement: Element,
      group: String | js.Array[String],
      high: Double,
      id: Any,
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
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], totalValue = totalValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], data = null, groupData = null, itemData = null, seriesData = null)
      __obj.asInstanceOf[DataLabelContext]
    }
    
    extension [Self <: DataLabelContext](x: Self) {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupData(value: js.Object): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
      
      inline def setGroupDataNull: Self = StObject.set(x, "groupData", null)
      
      inline def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value*))
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataNull: Self = StObject.set(x, "itemData", null)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesData(value: js.Object): Self = StObject.set(x, "seriesData", value.asInstanceOf[js.Any])
      
      inline def setSeriesDataNull: Self = StObject.set(x, "seriesData", null)
      
      inline def setTargetValue(value: Double): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
      
      inline def setTotalValue(value: Double): Self = StObject.set(x, "totalValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait GroupContext extends StObject {
    
    var indexPath: js.Array[Any]
    
    var subId: String
  }
  object GroupContext {
    
    inline def apply(indexPath: js.Array[Any], subId: String): GroupContext = {
      val __obj = js.Dynamic.literal(indexPath = indexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupContext]
    }
    
    extension [Self <: GroupContext](x: Self) {
      
      inline def setIndexPath(value: js.Array[Any]): Self = StObject.set(x, "indexPath", value.asInstanceOf[js.Any])
      
      inline def setIndexPathVarargs(value: Any*): Self = StObject.set(x, "indexPath", js.Array(value*))
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait ItemContext extends StObject {
    
    var itemIndex: Double
    
    var seriesIndex: Double
    
    var subId: String
  }
  object ItemContext {
    
    inline def apply(itemIndex: Double, seriesIndex: Double, subId: String): ItemContext = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContext]
    }
    
    extension [Self <: ItemContext](x: Self) {
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setSeriesIndex(value: Double): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait LegendItemContext extends StObject {
    
    var itemIndex: Double
    
    var sectionIndexPath: js.Array[Any]
    
    var subId: String
  }
  object LegendItemContext {
    
    inline def apply(itemIndex: Double, sectionIndexPath: js.Array[Any], subId: String): LegendItemContext = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndexPath = sectionIndexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendItemContext]
    }
    
    extension [Self <: LegendItemContext](x: Self) {
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setSectionIndexPath(value: js.Array[Any]): Self = StObject.set(x, "sectionIndexPath", value.asInstanceOf[js.Any])
      
      inline def setSectionIndexPathVarargs(value: Any*): Self = StObject.set(x, "sectionIndexPath", js.Array(value*))
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait PieCenterContext extends StObject {
    
    var componentElement: Element
    
    var innerBounds: js.Object
    
    var label: String
    
    var outerBounds: js.Object
  }
  object PieCenterContext {
    
    inline def apply(componentElement: Element, innerBounds: js.Object, label: String, outerBounds: js.Object): PieCenterContext = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieCenterContext]
    }
    
    extension [Self <: PieCenterContext](x: Self) {
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setInnerBounds(value: js.Object): Self = StObject.set(x, "innerBounds", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOuterBounds(value: js.Object): Self = StObject.set(x, "outerBounds", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait PieCenterLabelContext extends StObject {
    
    var subId: String
  }
  object PieCenterLabelContext {
    
    inline def apply(subId: String): PieCenterLabelContext = {
      val __obj = js.Dynamic.literal(subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieCenterLabelContext]
    }
    
    extension [Self <: PieCenterLabelContext](x: Self) {
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait ReferenceObject extends StObject {
    
    var axis: xAxis | yAxis | y2Axis
    
    var index: Double
    
    var subId: String
  }
  object ReferenceObject {
    
    inline def apply(axis: xAxis | yAxis | y2Axis, index: Double, subId: String): ReferenceObject = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceObject]
    }
    
    extension [Self <: ReferenceObject](x: Self) {
      
      inline def setAxis(value: xAxis | yAxis | y2Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait SeriesContext extends StObject {
    
    var itemIndex: Double
    
    var subId: String
  }
  object SeriesContext {
    
    inline def apply(itemIndex: Double, subId: String): SeriesContext = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesContext]
    }
    
    extension [Self <: SeriesContext](x: Self) {
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait TooltipContext extends StObject {
    
    var close: Double
    
    var color: String
    
    var componentElement: Element
    
    var data: js.Object | Null
    
    var group: String | js.Array[String]
    
    var groupData: js.Object | Null
    
    var high: Double
    
    var id: Any
    
    var itemData: js.Object | Null
    
    var label: String
    
    var low: Double
    
    var open: Double
    
    var parentElement: Element
    
    var series: String
    
    var seriesData: js.Object | Null
    
    var targetValue: Double
    
    var value: Double
    
    var volume: Double
    
    var x: Double | String
    
    var y: Double
    
    var z: Double
  }
  object TooltipContext {
    
    inline def apply(
      close: Double,
      color: String,
      componentElement: Element,
      group: String | js.Array[String],
      high: Double,
      id: Any,
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
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], data = null, groupData = null, itemData = null, seriesData = null)
      __obj.asInstanceOf[TooltipContext]
    }
    
    extension [Self <: TooltipContext](x: Self) {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupData(value: js.Object): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
      
      inline def setGroupDataNull: Self = StObject.set(x, "groupData", null)
      
      inline def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value*))
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataNull: Self = StObject.set(x, "itemData", null)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesData(value: js.Object): Self = StObject.set(x, "seriesData", value.asInstanceOf[js.Any])
      
      inline def setSeriesDataNull: Self = StObject.set(x, "seriesData", null)
      
      inline def setTargetValue(value: Double): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  type ojDrill = CustomEvent[Data]
  
  type ojSelectInput = CustomEvent[EndGroup]
  
  type ojViewportChange = CustomEvent[StartGroup]
  
  type ojViewportChangeInput = CustomEvent[StartGroup]
}
