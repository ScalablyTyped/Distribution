package typings.atOracleOraclejet.ojgaugeMod

import typings.atOracleOraclejet.Anon_BorderColorCircle
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_885303288
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`0DOT5`
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`1`
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.meet
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typings.atOracleOraclejet.ojgaugeMod.ojRatingGaugeNs.Threshold
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

trait ojRatingGaugeEventMap extends dvtBaseComponentEventMap[ojRatingGaugeSettableProperties] {
  var changedChanged: JetElementCustomEvent[Boolean]
  var changedStateChanged: JetElementCustomEvent[Anon_BorderColorCircle]
  var hoverStateChanged: JetElementCustomEvent[Anon_BorderColorCircle]
  var maxChanged: JetElementCustomEvent[Double]
  var minChanged: JetElementCustomEvent[Double]
  var orientationChanged: JetElementCustomEvent[vertical | horizontal]
  var preserveAspectRatioChanged: JetElementCustomEvent[none | meet]
  var readonlyChanged: JetElementCustomEvent[Boolean]
  var selectedStateChanged: JetElementCustomEvent[Anon_BorderColorCircle]
  var stepChanged: JetElementCustomEvent[`0DOT5` | `1`]
  var thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]]
  var tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_885303288]
  var transientValueChanged: JetElementCustomEvent[Double | Null]
  var unselectedStateChanged: JetElementCustomEvent[Anon_BorderColorCircle]
  var valueChanged: JetElementCustomEvent[Double | Null]
  var visualEffectsChanged: JetElementCustomEvent[none | auto]
}

object ojRatingGaugeEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    changedChanged: JetElementCustomEvent[Boolean],
    changedStateChanged: JetElementCustomEvent[Anon_BorderColorCircle],
    click: MouseEvent,
    close: Event,
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
    hoverStateChanged: JetElementCustomEvent[Anon_BorderColorCircle],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maxChanged: JetElementCustomEvent[Double],
    minChanged: JetElementCustomEvent[Double],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    orientationChanged: JetElementCustomEvent[vertical | horizontal],
    paste: ClipboardEvent,
    pause: Event,
    play: Event,
    playing: Event,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    preserveAspectRatioChanged: JetElementCustomEvent[none | meet],
    progress: ProgressEvent,
    ratechange: Event,
    readonlyChanged: JetElementCustomEvent[Boolean],
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectedStateChanged: JetElementCustomEvent[Anon_BorderColorCircle],
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    stepChanged: JetElementCustomEvent[`0DOT5` | `1`],
    submit: Event,
    suspend: Event,
    thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]],
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_885303288],
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
    unselectedStateChanged: JetElementCustomEvent[Anon_BorderColorCircle],
    valueChanged: JetElementCustomEvent[Double | Null],
    visualEffectsChanged: JetElementCustomEvent[none | auto],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojRatingGaugeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, changedChanged = changedChanged, changedStateChanged = changedStateChanged, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, hoverStateChanged = hoverStateChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, maxChanged = maxChanged, minChanged = minChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, orientationChanged = orientationChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, preserveAspectRatioChanged = preserveAspectRatioChanged, progress = progress, ratechange = ratechange, readonlyChanged = readonlyChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectedStateChanged = selectedStateChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, stepChanged = stepChanged, submit = submit, suspend = suspend, thresholdsChanged = thresholdsChanged, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transientValueChanged = transientValueChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, unselectedStateChanged = unselectedStateChanged, valueChanged = valueChanged, visualEffectsChanged = visualEffectsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojRatingGaugeEventMap]
  }
}

