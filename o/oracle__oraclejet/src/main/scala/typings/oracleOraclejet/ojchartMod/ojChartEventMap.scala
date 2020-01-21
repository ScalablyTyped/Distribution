package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.AnonAboveMarker
import typings.oracleOraclejet.AnonAlignTickMarks
import typings.oracleOraclejet.AnonAsNeeded
import typings.oracleOraclejet.AnonAuto
import typings.oracleOraclejet.AnonAutoAxisLine
import typings.oracleOraclejet.AnonAxisLine
import typings.oracleOraclejet.AnonBackgroundColor
import typings.oracleOraclejet.AnonClose
import typings.oracleOraclejet.AnonContent
import typings.oracleOraclejet.AnonContext
import typings.oracleOraclejet.AnonDrag
import typings.oracleOraclejet.AnonInsert
import typings.oracleOraclejet.AnonPreventDefault
import typings.oracleOraclejet.AnonX
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojchartMod.ojChart.DataLabelContext
import typings.oracleOraclejet.ojchartMod.ojChart.ojDrill
import typings.oracleOraclejet.ojchartMod.ojChart.ojSelectInput
import typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChange
import typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChangeInput
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
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
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.Event_
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartEventMap[K, D] extends dvtBaseComponentEventMap[ojChartSettableProperties[K, D]] {
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | slideToLeft | slideToRight | none]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | alphaFade | zoom | none]
  var asChanged: JetElementCustomEvent[String]
  var coordinateSystemChanged: JetElementCustomEvent[polar | cartesian]
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  var dataCursorBehaviorChanged: JetElementCustomEvent[smooth | snap | auto]
  var dataCursorChanged: JetElementCustomEvent[off | on | auto]
  var dataCursorPositionChanged: JetElementCustomEvent[AnonX]
  var dataLabelChanged: JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, AnonInsert | AnonPreventDefault]]
  var dndChanged: JetElementCustomEvent[AnonDrag]
  var dragModeChanged: JetElementCustomEvent[pan | zoom | select | off | user]
  var drillingChanged: JetElementCustomEvent[on | seriesOnly | groupsOnly | off]
  var groupComparatorChanged: JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null]
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var hideAndShowBehaviorChanged: JetElementCustomEvent[withRescale | withoutRescale | none]
  var highlightMatchChanged: JetElementCustomEvent[any | all]
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none]
  var initialZoomingChanged: JetElementCustomEvent[first | last | none]
  var legendChanged: JetElementCustomEvent[AnonAsNeeded]
  var ojDrill: typings.oracleOraclejet.ojchartMod.ojChart.ojDrill
  var ojSelectInput: typings.oracleOraclejet.ojchartMod.ojChart.ojSelectInput
  var ojViewportChange: typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChange
  var ojViewportChangeInput: typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChangeInput
  var orientationChanged: JetElementCustomEvent[horizontal | vertical]
  var otherThresholdChanged: JetElementCustomEvent[Double]
  var overviewChanged: JetElementCustomEvent[AnonContent]
  var pieCenterChanged: JetElementCustomEvent[AnonAuto]
  var plotAreaChanged: JetElementCustomEvent[AnonBackgroundColor]
  var polarGridShapeChanged: JetElementCustomEvent[polygon | circle]
  var selectionChanged: JetElementCustomEvent[js.Array[K]]
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none]
  var seriesComparatorChanged: JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null]
  var sortingChanged: JetElementCustomEvent[ascending | descending | off]
  var splitDualYChanged: JetElementCustomEvent[on | off | auto]
  var splitterPositionChanged: JetElementCustomEvent[Double]
  var stackChanged: JetElementCustomEvent[on | off]
  var stackLabelChanged: JetElementCustomEvent[on | off]
  var styleDefaultsChanged: JetElementCustomEvent[AnonAboveMarker]
  var timeAxisTypeChanged: JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto]
  var tooltipChanged: JetElementCustomEvent[AnonContext]
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto]
  var typeChanged: JetElementCustomEvent[
    line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  ]
  var valueFormatsChanged: JetElementCustomEvent[AnonClose]
  var xAxisChanged: JetElementCustomEvent[AnonAxisLine]
  var y2AxisChanged: JetElementCustomEvent[AnonAlignTickMarks]
  var yAxisChanged: JetElementCustomEvent[AnonAutoAxisLine]
  var zoomAndScrollChanged: JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off]
  var zoomDirectionChanged: JetElementCustomEvent[x | y | auto]
}

object ojChartEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationOnDataChangeChanged: JetElementCustomEvent[auto | slideToLeft | slideToRight | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | alphaFade | zoom | none],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    change: Event_,
    click: MouseEvent,
    close: Event_,
    contextmenu: MouseEvent,
    coordinateSystemChanged: JetElementCustomEvent[polar | cartesian],
    copy: ClipboardEvent,
    cuechange: Event_,
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dataCursorBehaviorChanged: JetElementCustomEvent[smooth | snap | auto],
    dataCursorChanged: JetElementCustomEvent[off | on | auto],
    dataCursorPositionChanged: JetElementCustomEvent[AnonX],
    dataLabelChanged: JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, AnonInsert | AnonPreventDefault]],
    dblclick: MouseEvent,
    dndChanged: JetElementCustomEvent[AnonDrag],
    drag: DragEvent,
    dragModeChanged: JetElementCustomEvent[pan | zoom | select | off | user],
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event_,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: JetElementCustomEvent[on | seriesOnly | groupsOnly | off],
    drop: DragEvent,
    durationchange: Event_,
    emptied: Event_,
    ended: Event_,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event_,
    fullscreenerror: Event_,
    gotpointercapture: PointerEvent,
    groupComparatorChanged: JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null],
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hideAndShowBehaviorChanged: JetElementCustomEvent[withRescale | withoutRescale | none],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    initialZoomingChanged: JetElementCustomEvent[first | last | none],
    input: Event_,
    invalid: Event_,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    legendChanged: JetElementCustomEvent[AnonAsNeeded],
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event_,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojDrill: ojDrill,
    ojSelectInput: ojSelectInput,
    ojViewportChange: ojViewportChange,
    ojViewportChangeInput: ojViewportChangeInput,
    orientationChanged: JetElementCustomEvent[horizontal | vertical],
    otherThresholdChanged: JetElementCustomEvent[Double],
    overviewChanged: JetElementCustomEvent[AnonContent],
    paste: ClipboardEvent,
    pause: Event_,
    pieCenterChanged: JetElementCustomEvent[AnonAuto],
    play: Event_,
    playing: Event_,
    plotAreaChanged: JetElementCustomEvent[AnonBackgroundColor],
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    polarGridShapeChanged: JetElementCustomEvent[polygon | circle],
    progress: ProgressEvent[EventTarget],
    ratechange: Event_,
    reset: Event_,
    resize: UIEvent,
    scroll: Event_,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionChanged: JetElementCustomEvent[js.Array[K]],
    selectionModeChanged: JetElementCustomEvent[single | multiple | none],
    selectionchange: Event_,
    selectstart: Event_,
    seriesComparatorChanged: JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null],
    sortingChanged: JetElementCustomEvent[ascending | descending | off],
    splitDualYChanged: JetElementCustomEvent[on | off | auto],
    splitterPositionChanged: JetElementCustomEvent[Double],
    stackChanged: JetElementCustomEvent[on | off],
    stackLabelChanged: JetElementCustomEvent[on | off],
    stalled: Event_,
    styleDefaultsChanged: JetElementCustomEvent[AnonAboveMarker],
    submit: Event_,
    suspend: Event_,
    timeAxisTypeChanged: JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto],
    timeupdate: Event_,
    toggle: Event_,
    tooltipChanged: JetElementCustomEvent[AnonContext],
    touchResponseChanged: JetElementCustomEvent[touchStart | auto],
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    trackResizeChanged: JetElementCustomEvent[on | off],
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    typeChanged: JetElementCustomEvent[
      line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ],
    valueFormatsChanged: JetElementCustomEvent[AnonClose],
    volumechange: Event_,
    waiting: Event_,
    wheel: WheelEvent,
    xAxisChanged: JetElementCustomEvent[AnonAxisLine],
    y2AxisChanged: JetElementCustomEvent[AnonAlignTickMarks],
    yAxisChanged: JetElementCustomEvent[AnonAutoAxisLine],
    zoomAndScrollChanged: JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off],
    zoomDirectionChanged: JetElementCustomEvent[x | y | auto]
  ): ojChartEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], coordinateSystemChanged = coordinateSystemChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dataCursorBehaviorChanged = dataCursorBehaviorChanged.asInstanceOf[js.Any], dataCursorChanged = dataCursorChanged.asInstanceOf[js.Any], dataCursorPositionChanged = dataCursorPositionChanged.asInstanceOf[js.Any], dataLabelChanged = dataLabelChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragModeChanged = dragModeChanged.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupComparatorChanged = groupComparatorChanged.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], hideAndShowBehaviorChanged = hideAndShowBehaviorChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], initialZoomingChanged = initialZoomingChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], legendChanged = legendChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojDrill = ojDrill.asInstanceOf[js.Any], ojSelectInput = ojSelectInput.asInstanceOf[js.Any], ojViewportChange = ojViewportChange.asInstanceOf[js.Any], ojViewportChangeInput = ojViewportChangeInput.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], otherThresholdChanged = otherThresholdChanged.asInstanceOf[js.Any], overviewChanged = overviewChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pieCenterChanged = pieCenterChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], plotAreaChanged = plotAreaChanged.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], polarGridShapeChanged = polarGridShapeChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], seriesComparatorChanged = seriesComparatorChanged.asInstanceOf[js.Any], sortingChanged = sortingChanged.asInstanceOf[js.Any], splitDualYChanged = splitDualYChanged.asInstanceOf[js.Any], splitterPositionChanged = splitterPositionChanged.asInstanceOf[js.Any], stackChanged = stackChanged.asInstanceOf[js.Any], stackLabelChanged = stackLabelChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeAxisTypeChanged = timeAxisTypeChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], valueFormatsChanged = valueFormatsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], xAxisChanged = xAxisChanged.asInstanceOf[js.Any], y2AxisChanged = y2AxisChanged.asInstanceOf[js.Any], yAxisChanged = yAxisChanged.asInstanceOf[js.Any], zoomAndScrollChanged = zoomAndScrollChanged.asInstanceOf[js.Any], zoomDirectionChanged = zoomDirectionChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojChartEventMap[K, D]]
  }
}

