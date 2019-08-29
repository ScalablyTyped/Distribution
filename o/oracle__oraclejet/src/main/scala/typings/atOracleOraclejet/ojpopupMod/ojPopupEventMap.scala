package typings.atOracleOraclejet.ojpopupMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentEventMap
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.default
import typings.atOracleOraclejet.atOracleOraclejetStrings.firstFocusable
import typings.atOracleOraclejet.atOracleOraclejetStrings.focusLoss
import typings.atOracleOraclejet.atOracleOraclejetStrings.modal
import typings.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.popup
import typings.atOracleOraclejet.atOracleOraclejetStrings.simple
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.Position
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojAnimateEnd
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojAnimateStart
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojBeforeClose
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojBeforeOpen
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojClose
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojFocus
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojOpen
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
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

trait ojPopupEventMap extends baseComponentEventMap[ojPopupSettableProperties] {
  var autoDismissChanged: JetElementCustomEvent[none | focusLoss]
  var chromeChanged: JetElementCustomEvent[default | none]
  var initialFocusChanged: JetElementCustomEvent[auto | none | firstFocusable | popup]
  var modalityChanged: JetElementCustomEvent[modeless | modal]
  var ojAnimateEnd: typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojAnimateEnd
  var ojAnimateStart: typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojAnimateStart
  var ojBeforeClose: typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojBeforeClose
  var ojBeforeOpen: typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojBeforeOpen
  var ojClose: typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojClose
  var ojFocus: typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojFocus
  var ojOpen: typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojOpen
  var positionChanged: JetElementCustomEvent[Position]
  var tailChanged: JetElementCustomEvent[none | simple]
}

object ojPopupEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    autoDismissChanged: JetElementCustomEvent[none | focusLoss],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    chromeChanged: JetElementCustomEvent[default | none],
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
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    initialFocusChanged: JetElementCustomEvent[auto | none | firstFocusable | popup],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    modalityChanged: JetElementCustomEvent[modeless | modal],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojAnimateEnd: ojAnimateEnd,
    ojAnimateStart: ojAnimateStart,
    ojBeforeClose: ojBeforeClose,
    ojBeforeOpen: ojBeforeOpen,
    ojClose: ojClose,
    ojFocus: ojFocus,
    ojOpen: ojOpen,
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
    positionChanged: JetElementCustomEvent[Position],
    progress: ProgressEvent[EventTarget],
    ratechange: Event,
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
    submit: Event,
    suspend: Event,
    tailChanged: JetElementCustomEvent[none | simple],
    timeupdate: Event,
    toggle: Event,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojPopupEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, autoDismissChanged = autoDismissChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, chromeChanged = chromeChanged, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, initialFocusChanged = initialFocusChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, modalityChanged = modalityChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeClose = ojBeforeClose, ojBeforeOpen = ojBeforeOpen, ojClose = ojClose, ojFocus = ojFocus, ojOpen = ojOpen, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, positionChanged = positionChanged, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, tailChanged = tailChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojPopupEventMap]
  }
}

