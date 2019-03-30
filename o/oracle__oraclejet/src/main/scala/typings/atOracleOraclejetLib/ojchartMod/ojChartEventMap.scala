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

object ojChartEventMap {
  @scala.inline
  def apply[K, D](
    abort: stdLib.UIEvent,
    animationOnDataChangeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.slideToRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    animationOnDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    animationcancel: stdLib.AnimationEvent,
    animationend: stdLib.AnimationEvent,
    animationiteration: stdLib.AnimationEvent,
    animationstart: stdLib.AnimationEvent,
    asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    auxclick: stdLib.Event,
    blur: stdLib.FocusEvent,
    cancel: stdLib.Event,
    canplay: stdLib.Event,
    canplaythrough: stdLib.Event,
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    contextmenu: stdLib.MouseEvent,
    coordinateSystemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.polar | atOracleOraclejetLib.atOracleOraclejetLibStrings.cartesian
    ],
    copy: stdLib.ClipboardEvent,
    cuechange: stdLib.Event,
    cut: stdLib.ClipboardEvent,
    dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null],
    dataCursorBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.smooth | atOracleOraclejetLib.atOracleOraclejetLibStrings.snap | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ],
    dataCursorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ],
    dataCursorPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_X],
    dataLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.Function1[
        /* context */ atOracleOraclejetLib.ojchartMod.ojChartNs.DataLabelContext, 
        atOracleOraclejetLib.Anon_Insert | atOracleOraclejetLib.Anon_PreventDefault
      ]
    ],
    dblclick: stdLib.MouseEvent,
    dndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Drag],
    drag: stdLib.DragEvent,
    dragModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.pan | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.user
    ],
    dragend: stdLib.DragEvent,
    dragenter: stdLib.DragEvent,
    dragexit: stdLib.Event,
    dragleave: stdLib.DragEvent,
    dragover: stdLib.DragEvent,
    dragstart: stdLib.DragEvent,
    drillingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.groupsOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    drop: stdLib.DragEvent,
    durationchange: stdLib.Event,
    emptied: stdLib.Event,
    ended: stdLib.Event,
    error: stdLib.ErrorEvent,
    focus: stdLib.FocusEvent,
    fullscreenchange: stdLib.Event,
    fullscreenerror: stdLib.Event,
    gotpointercapture: stdLib.PointerEvent,
    groupComparatorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
    ],
    hiddenCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]],
    hideAndShowBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.withRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.withoutRescale | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    highlightMatchChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
    ],
    highlightedCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]],
    hoverBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    initialZoomingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.first | atOracleOraclejetLib.atOracleOraclejetLibStrings.last | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    input: stdLib.Event,
    invalid: stdLib.Event,
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    legendChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AsNeeded],
    load: stdLib.Event,
    loadeddata: stdLib.Event,
    loadedmetadata: stdLib.Event,
    loadend: stdLib.ProgressEvent,
    loadstart: stdLib.Event,
    lostpointercapture: stdLib.PointerEvent,
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    ojDrill: atOracleOraclejetLib.ojchartMod.ojChartNs.ojDrill,
    ojSelectInput: atOracleOraclejetLib.ojchartMod.ojChartNs.ojSelectInput,
    ojViewportChange: atOracleOraclejetLib.ojchartMod.ojChartNs.ojViewportChange,
    ojViewportChangeInput: atOracleOraclejetLib.ojchartMod.ojChartNs.ojViewportChangeInput,
    orientationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
    ],
    otherThresholdChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    overviewChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Content],
    paste: stdLib.ClipboardEvent,
    pause: stdLib.Event,
    pieCenterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Auto],
    play: stdLib.Event,
    playing: stdLib.Event,
    plotAreaChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BackgroundColor],
    pointercancel: stdLib.PointerEvent,
    pointerdown: stdLib.PointerEvent,
    pointerenter: stdLib.PointerEvent,
    pointerleave: stdLib.PointerEvent,
    pointermove: stdLib.PointerEvent,
    pointerout: stdLib.PointerEvent,
    pointerover: stdLib.PointerEvent,
    pointerup: stdLib.PointerEvent,
    polarGridShapeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.polygon | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
    ],
    progress: stdLib.ProgressEvent,
    ratechange: stdLib.Event,
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    scroll: stdLib.Event,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.Event,
    selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]],
    selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    selectionchange: stdLib.Event,
    selectstart: stdLib.Event,
    seriesComparatorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, scala.Double]) | scala.Null
    ],
    sortingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.ascending | atOracleOraclejetLib.atOracleOraclejetLibStrings.descending | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    splitDualYChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ],
    splitterPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    stackChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    stackLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    stalled: stdLib.Event,
    styleDefaultsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AboveMarker],
    submit: stdLib.Event,
    suspend: stdLib.Event,
    timeAxisTypeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.mixedFrequency | atOracleOraclejetLib.atOracleOraclejetLibStrings.skipGaps | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ],
    timeupdate: stdLib.Event,
    toggle: stdLib.Event,
    tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Context],
    touchResponseChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ],
    touchcancel: stdLib.TouchEvent,
    touchend: stdLib.TouchEvent,
    touchmove: stdLib.TouchEvent,
    touchstart: stdLib.TouchEvent,
    trackResizeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    transitioncancel: stdLib.TransitionEvent,
    transitionend: stdLib.TransitionEvent,
    transitionrun: stdLib.TransitionEvent,
    transitionstart: stdLib.TransitionEvent,
    translationsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Object | scala.Null],
    typeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.stock | atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot | atOracleOraclejetLib.atOracleOraclejetLibStrings.combo | atOracleOraclejetLib.atOracleOraclejetLibStrings.pie | atOracleOraclejetLib.atOracleOraclejetLibStrings.scatter | atOracleOraclejetLib.atOracleOraclejetLibStrings.bubble | atOracleOraclejetLib.atOracleOraclejetLibStrings.funnel | atOracleOraclejetLib.atOracleOraclejetLibStrings.pyramid | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar
    ],
    valueFormatsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Close],
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent,
    xAxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AxisLine],
    y2AxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AlignTickMarks],
    yAxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoAxisLine],
    zoomAndScrollChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.delayedScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.liveScrollOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.delayed | atOracleOraclejetLib.atOracleOraclejetLibStrings.live | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    zoomDirectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ]
  ): ojChartEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationOnDataChangeChanged = animationOnDataChangeChanged, animationOnDisplayChanged = animationOnDisplayChanged, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, coordinateSystemChanged = coordinateSystemChanged, copy = copy, cuechange = cuechange, cut = cut, dataChanged = dataChanged, dataCursorBehaviorChanged = dataCursorBehaviorChanged, dataCursorChanged = dataCursorChanged, dataCursorPositionChanged = dataCursorPositionChanged, dataLabelChanged = dataLabelChanged, dblclick = dblclick, dndChanged = dndChanged, drag = drag, dragModeChanged = dragModeChanged, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillingChanged = drillingChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, groupComparatorChanged = groupComparatorChanged, hiddenCategoriesChanged = hiddenCategoriesChanged, hideAndShowBehaviorChanged = hideAndShowBehaviorChanged, highlightMatchChanged = highlightMatchChanged, highlightedCategoriesChanged = highlightedCategoriesChanged, hoverBehaviorChanged = hoverBehaviorChanged, initialZoomingChanged = initialZoomingChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, legendChanged = legendChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojDrill = ojDrill, ojSelectInput = ojSelectInput, ojViewportChange = ojViewportChange, ojViewportChangeInput = ojViewportChangeInput, orientationChanged = orientationChanged, otherThresholdChanged = otherThresholdChanged, overviewChanged = overviewChanged, paste = paste, pause = pause, pieCenterChanged = pieCenterChanged, play = play, playing = playing, plotAreaChanged = plotAreaChanged, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, polarGridShapeChanged = polarGridShapeChanged, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionchange = selectionchange, selectstart = selectstart, seriesComparatorChanged = seriesComparatorChanged, sortingChanged = sortingChanged, splitDualYChanged = splitDualYChanged, splitterPositionChanged = splitterPositionChanged, stackChanged = stackChanged, stackLabelChanged = stackLabelChanged, stalled = stalled, styleDefaultsChanged = styleDefaultsChanged, submit = submit, suspend = suspend, timeAxisTypeChanged = timeAxisTypeChanged, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchResponseChanged = touchResponseChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, typeChanged = typeChanged, valueFormatsChanged = valueFormatsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel, xAxisChanged = xAxisChanged, y2AxisChanged = y2AxisChanged, yAxisChanged = yAxisChanged, zoomAndScrollChanged = zoomAndScrollChanged, zoomDirectionChanged = zoomDirectionChanged)
  
    __obj.asInstanceOf[ojChartEventMap[K, D]]
  }
}

