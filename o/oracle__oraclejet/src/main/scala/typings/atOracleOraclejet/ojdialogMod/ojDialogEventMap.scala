package typings.atOracleOraclejet.ojdialogMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentEventMap
import typings.atOracleOraclejet.atOracleOraclejetStrings.`title-bar`
import typings.atOracleOraclejet.atOracleOraclejetStrings.escape
import typings.atOracleOraclejet.atOracleOraclejetStrings.hide
import typings.atOracleOraclejet.atOracleOraclejetStrings.icon
import typings.atOracleOraclejet.atOracleOraclejetStrings.modal
import typings.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.resizable
import typings.atOracleOraclejet.atOracleOraclejetStrings.show
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.Position
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojAnimateEnd
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojAnimateStart
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojBeforeClose
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojBeforeOpen
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojClose
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojFocus
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojOpen
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojResize
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojResizeStart
import typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojResizeStop
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

trait ojDialogEventMap extends baseComponentEventMap[ojDialogSettableProperties] {
  var cancelBehaviorChanged: JetElementCustomEvent[icon | escape | none]
  var dialogTitleChanged: JetElementCustomEvent[String | Null]
  var dragAffordanceChanged: JetElementCustomEvent[`title-bar` | none]
  var initialVisibilityChanged: JetElementCustomEvent[hide | show]
  var modalityChanged: JetElementCustomEvent[modal | modeless]
  var ojAnimateEnd: typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojAnimateEnd
  var ojAnimateStart: typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojAnimateStart
  var ojBeforeClose: typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojBeforeClose
  var ojBeforeOpen: typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojBeforeOpen
  var ojClose: typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojClose
  var ojFocus: typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojFocus
  var ojOpen: typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojOpen
  var ojResize: typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojResize
  var ojResizeStart: typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojResizeStart
  var ojResizeStop: typings.atOracleOraclejet.ojdialogMod.ojDialogNs.ojResizeStop
  var positionChanged: JetElementCustomEvent[Position]
  var resizeBehaviorChanged: JetElementCustomEvent[resizable | none]
  var roleChanged: JetElementCustomEvent[String]
}

object ojDialogEventMap {
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
    cancelBehaviorChanged: JetElementCustomEvent[icon | escape | none],
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    dialogTitleChanged: JetElementCustomEvent[String | Null],
    drag: DragEvent,
    dragAffordanceChanged: JetElementCustomEvent[`title-bar` | none],
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
    initialVisibilityChanged: JetElementCustomEvent[hide | show],
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
    modalityChanged: JetElementCustomEvent[modal | modeless],
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
    ojResize: ojResize,
    ojResizeStart: ojResizeStart,
    ojResizeStop: ojResizeStop,
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
    resizeBehaviorChanged: JetElementCustomEvent[resizable | none],
    roleChanged: JetElementCustomEvent[String],
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
  ): ojDialogEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, cancel = cancel, cancelBehaviorChanged = cancelBehaviorChanged, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, dialogTitleChanged = dialogTitleChanged, drag = drag, dragAffordanceChanged = dragAffordanceChanged, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, initialVisibilityChanged = initialVisibilityChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, modalityChanged = modalityChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeClose = ojBeforeClose, ojBeforeOpen = ojBeforeOpen, ojClose = ojClose, ojFocus = ojFocus, ojOpen = ojOpen, ojResize = ojResize, ojResizeStart = ojResizeStart, ojResizeStop = ojResizeStop, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, positionChanged = positionChanged, progress = progress, ratechange = ratechange, reset = reset, resize = resize, resizeBehaviorChanged = resizeBehaviorChanged, roleChanged = roleChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojDialogEventMap]
  }
}

