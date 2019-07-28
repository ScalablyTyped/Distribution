package typings.atOracleOraclejet.ojgaugeMod

import typings.atOracleOraclejet.Anon_AutoBillionCenter
import typings.atOracleOraclejet.Anon_AutoBorderColor
import typings.atOracleOraclejet.Anon_AutoCenter
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_1592349836
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.circular
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentOnly
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.onIndicator
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typings.atOracleOraclejet.ojgaugeMod.ojStatusMeterGaugeNs.ReferenceLine
import typings.atOracleOraclejet.ojgaugeMod.ojStatusMeterGaugeNs.Threshold
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
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

trait ojStatusMeterGaugeEventMap extends dvtBaseComponentEventMap[ojStatusMeterGaugeSettableProperties] {
  var angleExtentChanged: JetElementCustomEvent[Double]
  var animationDurationChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  var borderColorChanged: JetElementCustomEvent[String]
  var borderRadiusChanged: JetElementCustomEvent[String]
  var centerChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext]
  var colorChanged: JetElementCustomEvent[String]
  var indicatorSizeChanged: JetElementCustomEvent[Double]
  var innerRadiusChanged: JetElementCustomEvent[Double]
  var labelChanged: JetElementCustomEvent[Anon_AutoCenter]
  var maxChanged: JetElementCustomEvent[Double]
  var metricLabelChanged: JetElementCustomEvent[Anon_AutoBillionCenter]
  var minChanged: JetElementCustomEvent[Double]
  var orientationChanged: JetElementCustomEvent[circular | vertical | horizontal]
  var plotAreaChanged: JetElementCustomEvent[Anon_AutoBorderColor]
  var readonlyChanged: JetElementCustomEvent[Boolean]
  var referenceLinesChanged: JetElementCustomEvent[js.Array[ReferenceLine]]
  var startAngleChanged: JetElementCustomEvent[Double]
  var stepChanged: JetElementCustomEvent[Double | Null]
  var svgClassNameChanged: JetElementCustomEvent[String]
  var svgStyleChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any
  ]
  var thresholdDisplayChanged: JetElementCustomEvent[currentOnly | all | onIndicator]
  var thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]]
  var tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_1592349836]
  var transientValueChanged: JetElementCustomEvent[Double | Null]
  var valueChanged: JetElementCustomEvent[Double | Null]
  var visualEffectsChanged: JetElementCustomEvent[none | auto]
}

object ojStatusMeterGaugeEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    angleExtentChanged: JetElementCustomEvent[Double],
    animationDurationChanged: JetElementCustomEvent[js.UndefOr[Double]],
    animationOnDataChangeChanged: JetElementCustomEvent[auto | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | none],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[String],
    borderRadiusChanged: JetElementCustomEvent[String],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    centerChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[String],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    indicatorSizeChanged: JetElementCustomEvent[Double],
    innerRadiusChanged: JetElementCustomEvent[Double],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[Anon_AutoCenter],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maxChanged: JetElementCustomEvent[Double],
    metricLabelChanged: JetElementCustomEvent[Anon_AutoBillionCenter],
    minChanged: JetElementCustomEvent[Double],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    orientationChanged: JetElementCustomEvent[circular | vertical | horizontal],
    paste: ClipboardEvent,
    pause: Event,
    play: Event,
    playing: Event,
    plotAreaChanged: JetElementCustomEvent[Anon_AutoBorderColor],
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    progress: ProgressEvent,
    ratechange: Event,
    readonlyChanged: JetElementCustomEvent[Boolean],
    referenceLinesChanged: JetElementCustomEvent[js.Array[ReferenceLine]],
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    startAngleChanged: JetElementCustomEvent[Double],
    stepChanged: JetElementCustomEvent[Double | Null],
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any
    ],
    thresholdDisplayChanged: JetElementCustomEvent[currentOnly | all | onIndicator],
    thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]],
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_1592349836],
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    trackResizeChanged: JetElementCustomEvent[on | off],
    transientValueChanged: JetElementCustomEvent[Double | Null],
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    valueChanged: JetElementCustomEvent[Double | Null],
    visualEffectsChanged: JetElementCustomEvent[none | auto],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojStatusMeterGaugeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, angleExtentChanged = angleExtentChanged, animationDurationChanged = animationDurationChanged, animationOnDataChangeChanged = animationOnDataChangeChanged, animationOnDisplayChanged = animationOnDisplayChanged, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, borderColorChanged = borderColorChanged, borderRadiusChanged = borderRadiusChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, centerChanged = centerChanged, change = change, click = click, close = close, colorChanged = colorChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, indicatorSizeChanged = indicatorSizeChanged, innerRadiusChanged = innerRadiusChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, maxChanged = maxChanged, metricLabelChanged = metricLabelChanged, minChanged = minChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, orientationChanged = orientationChanged, paste = paste, pause = pause, play = play, playing = playing, plotAreaChanged = plotAreaChanged, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, readonlyChanged = readonlyChanged, referenceLinesChanged = referenceLinesChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, startAngleChanged = startAngleChanged, stepChanged = stepChanged, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, thresholdDisplayChanged = thresholdDisplayChanged, thresholdsChanged = thresholdsChanged, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transientValueChanged = transientValueChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, valueChanged = valueChanged, visualEffectsChanged = visualEffectsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojStatusMeterGaugeEventMap]
  }
}

