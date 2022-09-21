package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.anon.AlignTickMarks
import typings.oracleOraclejet.anon.AnimationDownColor
import typings.oracleOraclejet.anon.AxisLine
import typings.oracleOraclejet.anon.BackgroundColor
import typings.oracleOraclejet.anon.BaselineScaling
import typings.oracleOraclejet.anon.BorderWidth
import typings.oracleOraclejet.anon.Close
import typings.oracleOraclejet.anon.Content
import typings.oracleOraclejet.anon.Converter
import typings.oracleOraclejet.anon.Drag
import typings.oracleOraclejet.anon.Insert
import typings.oracleOraclejet.anon.PreventDefault
import typings.oracleOraclejet.anon.Renderer
import typings.oracleOraclejet.anon.X
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
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojChartEventMap[K, D]
  extends StObject
     with dvtBaseComponentEventMap[ojChartSettableProperties[K, D]] {
  
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | slideToLeft | slideToRight | none]
  
  var animationOnDisplayChanged: JetElementCustomEvent[auto | alphaFade | zoom | none]
  
  var asChanged: JetElementCustomEvent[String]
  
  var coordinateSystemChanged: JetElementCustomEvent[polar | cartesian]
  
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  
  var dataCursorBehaviorChanged: JetElementCustomEvent[smooth | snap | auto]
  
  var dataCursorChanged: JetElementCustomEvent[off | on | auto]
  
  var dataCursorPositionChanged: JetElementCustomEvent[X]
  
  var dataLabelChanged: JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]]
  
  var dndChanged: JetElementCustomEvent[Drag]
  
  var dragModeChanged: JetElementCustomEvent[pan | zoom | select | off | user]
  
  var drillingChanged: JetElementCustomEvent[on | seriesOnly | groupsOnly | off]
  
  var groupComparatorChanged: JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null]
  
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  
  var hideAndShowBehaviorChanged: JetElementCustomEvent[withRescale | withoutRescale | none]
  
  var highlightMatchChanged: JetElementCustomEvent[any | all]
  
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none]
  
  var initialZoomingChanged: JetElementCustomEvent[first | last | none]
  
  var legendChanged: JetElementCustomEvent[BackgroundColor]
  
  var ojDrill: typings.oracleOraclejet.ojchartMod.ojChart.ojDrill
  
  var ojSelectInput: typings.oracleOraclejet.ojchartMod.ojChart.ojSelectInput
  
  var ojViewportChange: typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChange
  
  var ojViewportChangeInput: typings.oracleOraclejet.ojchartMod.ojChart.ojViewportChangeInput
  
  var orientationChanged: JetElementCustomEvent[horizontal | vertical]
  
  var otherThresholdChanged: JetElementCustomEvent[Double]
  
  var overviewChanged: JetElementCustomEvent[Content]
  
  var pieCenterChanged: JetElementCustomEvent[Converter]
  
  var plotAreaChanged: JetElementCustomEvent[BorderWidth]
  
  var polarGridShapeChanged: JetElementCustomEvent[polygon | circle]
  
  var selectionChanged: JetElementCustomEvent[js.Array[K]]
  
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none]
  
  var seriesComparatorChanged: JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null]
  
  var sortingChanged: JetElementCustomEvent[ascending | descending | off]
  
  var splitDualYChanged: JetElementCustomEvent[on | off | auto]
  
  var splitterPositionChanged: JetElementCustomEvent[Double]
  
  var stackChanged: JetElementCustomEvent[on | off]
  
  var stackLabelChanged: JetElementCustomEvent[on | off]
  
  var styleDefaultsChanged: JetElementCustomEvent[AnimationDownColor]
  
  var timeAxisTypeChanged: JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto]
  
  var tooltipChanged: JetElementCustomEvent[Renderer]
  
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto]
  
  var typeChanged: JetElementCustomEvent[
    line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  ]
  
  var valueFormatsChanged: JetElementCustomEvent[Close]
  
  var xAxisChanged: JetElementCustomEvent[AxisLine]
  
  var y2AxisChanged: JetElementCustomEvent[AlignTickMarks]
  
  var yAxisChanged: JetElementCustomEvent[BaselineScaling]
  
  var zoomAndScrollChanged: JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off]
  
  var zoomDirectionChanged: JetElementCustomEvent[x | y | auto]
}
object ojChartEventMap {
  
  inline def apply[K, D](
    abort: UIEvent,
    animationOnDataChangeChanged: JetElementCustomEvent[auto | slideToLeft | slideToRight | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | alphaFade | zoom | none],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    beforeinput: InputEvent,
    blur: FocusEvent,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    compositionend: CompositionEvent,
    compositionstart: CompositionEvent,
    compositionupdate: CompositionEvent,
    contextmenu: MouseEvent,
    coordinateSystemChanged: JetElementCustomEvent[polar | cartesian],
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dataCursorBehaviorChanged: JetElementCustomEvent[smooth | snap | auto],
    dataCursorChanged: JetElementCustomEvent[off | on | auto],
    dataCursorPositionChanged: JetElementCustomEvent[X],
    dataLabelChanged: JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]],
    dblclick: MouseEvent,
    dndChanged: JetElementCustomEvent[Drag],
    drag: DragEvent,
    dragModeChanged: JetElementCustomEvent[pan | zoom | select | off | user],
    dragend: DragEvent,
    dragenter: DragEvent,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: JetElementCustomEvent[on | seriesOnly | groupsOnly | off],
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    formdata: FormDataEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    groupComparatorChanged: JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null],
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hideAndShowBehaviorChanged: JetElementCustomEvent[withRescale | withoutRescale | none],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    initialZoomingChanged: JetElementCustomEvent[first | last | none],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    legendChanged: JetElementCustomEvent[BackgroundColor],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
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
    overviewChanged: JetElementCustomEvent[Content],
    paste: ClipboardEvent,
    pause: Event,
    pieCenterChanged: JetElementCustomEvent[Converter],
    play: Event,
    playing: Event,
    plotAreaChanged: JetElementCustomEvent[BorderWidth],
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
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[K]],
    selectionModeChanged: JetElementCustomEvent[single | multiple | none],
    selectionchange: Event,
    selectstart: Event,
    seriesComparatorChanged: JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null],
    slotchange: Event,
    sortingChanged: JetElementCustomEvent[ascending | descending | off],
    splitDualYChanged: JetElementCustomEvent[on | off | auto],
    splitterPositionChanged: JetElementCustomEvent[Double],
    stackChanged: JetElementCustomEvent[on | off],
    stackLabelChanged: JetElementCustomEvent[on | off],
    stalled: Event,
    styleDefaultsChanged: JetElementCustomEvent[AnimationDownColor],
    submit: SubmitEvent,
    suspend: Event,
    timeAxisTypeChanged: JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto],
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Renderer],
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
    valueFormatsChanged: JetElementCustomEvent[Close],
    volumechange: Event,
    waiting: Event,
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent,
    xAxisChanged: JetElementCustomEvent[AxisLine],
    y2AxisChanged: JetElementCustomEvent[AlignTickMarks],
    yAxisChanged: JetElementCustomEvent[BaselineScaling],
    zoomAndScrollChanged: JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off],
    zoomDirectionChanged: JetElementCustomEvent[x | y | auto]
  ): ojChartEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], coordinateSystemChanged = coordinateSystemChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dataCursorBehaviorChanged = dataCursorBehaviorChanged.asInstanceOf[js.Any], dataCursorChanged = dataCursorChanged.asInstanceOf[js.Any], dataCursorPositionChanged = dataCursorPositionChanged.asInstanceOf[js.Any], dataLabelChanged = dataLabelChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragModeChanged = dragModeChanged.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupComparatorChanged = groupComparatorChanged.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], hideAndShowBehaviorChanged = hideAndShowBehaviorChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], initialZoomingChanged = initialZoomingChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], legendChanged = legendChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojDrill = ojDrill.asInstanceOf[js.Any], ojSelectInput = ojSelectInput.asInstanceOf[js.Any], ojViewportChange = ojViewportChange.asInstanceOf[js.Any], ojViewportChangeInput = ojViewportChangeInput.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], otherThresholdChanged = otherThresholdChanged.asInstanceOf[js.Any], overviewChanged = overviewChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pieCenterChanged = pieCenterChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], plotAreaChanged = plotAreaChanged.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], polarGridShapeChanged = polarGridShapeChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], seriesComparatorChanged = seriesComparatorChanged.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], sortingChanged = sortingChanged.asInstanceOf[js.Any], splitDualYChanged = splitDualYChanged.asInstanceOf[js.Any], splitterPositionChanged = splitterPositionChanged.asInstanceOf[js.Any], stackChanged = stackChanged.asInstanceOf[js.Any], stackLabelChanged = stackLabelChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeAxisTypeChanged = timeAxisTypeChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], valueFormatsChanged = valueFormatsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], xAxisChanged = xAxisChanged.asInstanceOf[js.Any], y2AxisChanged = y2AxisChanged.asInstanceOf[js.Any], yAxisChanged = yAxisChanged.asInstanceOf[js.Any], zoomAndScrollChanged = zoomAndScrollChanged.asInstanceOf[js.Any], zoomDirectionChanged = zoomDirectionChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartEventMap[K, D]]
  }
  
  extension [Self <: ojChartEventMap[?, ?], K, D](x: Self & (ojChartEventMap[K, D])) {
    
    inline def setAnimationOnDataChangeChanged(value: JetElementCustomEvent[auto | slideToLeft | slideToRight | none]): Self = StObject.set(x, "animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayChanged(value: JetElementCustomEvent[auto | alphaFade | zoom | none]): Self = StObject.set(x, "animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setAsChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "asChanged", value.asInstanceOf[js.Any])
    
    inline def setCoordinateSystemChanged(value: JetElementCustomEvent[polar | cartesian]): Self = StObject.set(x, "coordinateSystemChanged", value.asInstanceOf[js.Any])
    
    inline def setDataChanged(value: JetElementCustomEvent[(DataProvider[K, D]) | Null]): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
    
    inline def setDataCursorBehaviorChanged(value: JetElementCustomEvent[smooth | snap | auto]): Self = StObject.set(x, "dataCursorBehaviorChanged", value.asInstanceOf[js.Any])
    
    inline def setDataCursorChanged(value: JetElementCustomEvent[off | on | auto]): Self = StObject.set(x, "dataCursorChanged", value.asInstanceOf[js.Any])
    
    inline def setDataCursorPositionChanged(value: JetElementCustomEvent[X]): Self = StObject.set(x, "dataCursorPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setDataLabelChanged(
      value: JetElementCustomEvent[js.Function1[/* context */ DataLabelContext, Insert | PreventDefault]]
    ): Self = StObject.set(x, "dataLabelChanged", value.asInstanceOf[js.Any])
    
    inline def setDndChanged(value: JetElementCustomEvent[Drag]): Self = StObject.set(x, "dndChanged", value.asInstanceOf[js.Any])
    
    inline def setDragModeChanged(value: JetElementCustomEvent[pan | zoom | select | off | user]): Self = StObject.set(x, "dragModeChanged", value.asInstanceOf[js.Any])
    
    inline def setDrillingChanged(value: JetElementCustomEvent[on | seriesOnly | groupsOnly | off]): Self = StObject.set(x, "drillingChanged", value.asInstanceOf[js.Any])
    
    inline def setGroupComparatorChanged(
      value: JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null]
    ): Self = StObject.set(x, "groupComparatorChanged", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = StObject.set(x, "hiddenCategoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setHideAndShowBehaviorChanged(value: JetElementCustomEvent[withRescale | withoutRescale | none]): Self = StObject.set(x, "hideAndShowBehaviorChanged", value.asInstanceOf[js.Any])
    
    inline def setHighlightMatchChanged(value: JetElementCustomEvent[any | all]): Self = StObject.set(x, "highlightMatchChanged", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = StObject.set(x, "highlightedCategoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorChanged(value: JetElementCustomEvent[dim | none]): Self = StObject.set(x, "hoverBehaviorChanged", value.asInstanceOf[js.Any])
    
    inline def setInitialZoomingChanged(value: JetElementCustomEvent[first | last | none]): Self = StObject.set(x, "initialZoomingChanged", value.asInstanceOf[js.Any])
    
    inline def setLegendChanged(value: JetElementCustomEvent[BackgroundColor]): Self = StObject.set(x, "legendChanged", value.asInstanceOf[js.Any])
    
    inline def setOjDrill(value: ojDrill): Self = StObject.set(x, "ojDrill", value.asInstanceOf[js.Any])
    
    inline def setOjSelectInput(value: ojSelectInput): Self = StObject.set(x, "ojSelectInput", value.asInstanceOf[js.Any])
    
    inline def setOjViewportChange(value: ojViewportChange): Self = StObject.set(x, "ojViewportChange", value.asInstanceOf[js.Any])
    
    inline def setOjViewportChangeInput(value: ojViewportChangeInput): Self = StObject.set(x, "ojViewportChangeInput", value.asInstanceOf[js.Any])
    
    inline def setOrientationChanged(value: JetElementCustomEvent[horizontal | vertical]): Self = StObject.set(x, "orientationChanged", value.asInstanceOf[js.Any])
    
    inline def setOtherThresholdChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "otherThresholdChanged", value.asInstanceOf[js.Any])
    
    inline def setOverviewChanged(value: JetElementCustomEvent[Content]): Self = StObject.set(x, "overviewChanged", value.asInstanceOf[js.Any])
    
    inline def setPieCenterChanged(value: JetElementCustomEvent[Converter]): Self = StObject.set(x, "pieCenterChanged", value.asInstanceOf[js.Any])
    
    inline def setPlotAreaChanged(value: JetElementCustomEvent[BorderWidth]): Self = StObject.set(x, "plotAreaChanged", value.asInstanceOf[js.Any])
    
    inline def setPolarGridShapeChanged(value: JetElementCustomEvent[polygon | circle]): Self = StObject.set(x, "polarGridShapeChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(value: JetElementCustomEvent[js.Array[K]]): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeChanged(value: JetElementCustomEvent[single | multiple | none]): Self = StObject.set(x, "selectionModeChanged", value.asInstanceOf[js.Any])
    
    inline def setSeriesComparatorChanged(
      value: JetElementCustomEvent[(js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null]
    ): Self = StObject.set(x, "seriesComparatorChanged", value.asInstanceOf[js.Any])
    
    inline def setSortingChanged(value: JetElementCustomEvent[ascending | descending | off]): Self = StObject.set(x, "sortingChanged", value.asInstanceOf[js.Any])
    
    inline def setSplitDualYChanged(value: JetElementCustomEvent[on | off | auto]): Self = StObject.set(x, "splitDualYChanged", value.asInstanceOf[js.Any])
    
    inline def setSplitterPositionChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "splitterPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setStackChanged(value: JetElementCustomEvent[on | off]): Self = StObject.set(x, "stackChanged", value.asInstanceOf[js.Any])
    
    inline def setStackLabelChanged(value: JetElementCustomEvent[on | off]): Self = StObject.set(x, "stackLabelChanged", value.asInstanceOf[js.Any])
    
    inline def setStyleDefaultsChanged(value: JetElementCustomEvent[AnimationDownColor]): Self = StObject.set(x, "styleDefaultsChanged", value.asInstanceOf[js.Any])
    
    inline def setTimeAxisTypeChanged(value: JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto]): Self = StObject.set(x, "timeAxisTypeChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipChanged(value: JetElementCustomEvent[Renderer]): Self = StObject.set(x, "tooltipChanged", value.asInstanceOf[js.Any])
    
    inline def setTouchResponseChanged(value: JetElementCustomEvent[touchStart | auto]): Self = StObject.set(x, "touchResponseChanged", value.asInstanceOf[js.Any])
    
    inline def setTypeChanged(
      value: JetElementCustomEvent[
          line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
        ]
    ): Self = StObject.set(x, "typeChanged", value.asInstanceOf[js.Any])
    
    inline def setValueFormatsChanged(value: JetElementCustomEvent[Close]): Self = StObject.set(x, "valueFormatsChanged", value.asInstanceOf[js.Any])
    
    inline def setXAxisChanged(value: JetElementCustomEvent[AxisLine]): Self = StObject.set(x, "xAxisChanged", value.asInstanceOf[js.Any])
    
    inline def setY2AxisChanged(value: JetElementCustomEvent[AlignTickMarks]): Self = StObject.set(x, "y2AxisChanged", value.asInstanceOf[js.Any])
    
    inline def setYAxisChanged(value: JetElementCustomEvent[BaselineScaling]): Self = StObject.set(x, "yAxisChanged", value.asInstanceOf[js.Any])
    
    inline def setZoomAndScrollChanged(value: JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off]): Self = StObject.set(x, "zoomAndScrollChanged", value.asInstanceOf[js.Any])
    
    inline def setZoomDirectionChanged(value: JetElementCustomEvent[typings.oracleOraclejet.oracleOraclejetStrings.x | y | auto]): Self = StObject.set(x, "zoomDirectionChanged", value.asInstanceOf[js.Any])
  }
}
