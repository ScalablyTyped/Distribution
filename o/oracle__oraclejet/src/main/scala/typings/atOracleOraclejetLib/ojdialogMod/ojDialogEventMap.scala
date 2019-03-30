package typings
package atOracleOraclejetLib.ojdialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDialogEventMap
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[ojDialogSettableProperties] {
  var cancelBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.icon | atOracleOraclejetLib.atOracleOraclejetLibStrings.escape | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var dialogTitleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var dragAffordanceChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.`title-bar` | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var initialVisibilityChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.hide | atOracleOraclejetLib.atOracleOraclejetLibStrings.show
  ]
  var modalityChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless
  ]
  var ojAnimateEnd: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojAnimateEnd
  var ojAnimateStart: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojAnimateStart
  var ojBeforeClose: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojBeforeClose
  var ojBeforeOpen: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojBeforeOpen
  var ojClose: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojClose
  var ojFocus: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojFocus
  var ojOpen: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojOpen
  var ojResize: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResize
  var ojResizeStart: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResizeStart
  var ojResizeStop: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResizeStop
  var positionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdialogMod.ojDialogNs.Position]
  var resizeBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.resizable | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var roleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
}

object ojDialogEventMap {
  @scala.inline
  def apply(
    abort: stdLib.UIEvent,
    animationcancel: stdLib.AnimationEvent,
    animationend: stdLib.AnimationEvent,
    animationiteration: stdLib.AnimationEvent,
    animationstart: stdLib.AnimationEvent,
    auxclick: stdLib.Event,
    blur: stdLib.FocusEvent,
    cancel: stdLib.Event,
    cancelBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.icon | atOracleOraclejetLib.atOracleOraclejetLibStrings.escape | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    canplay: stdLib.Event,
    canplaythrough: stdLib.Event,
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    contextmenu: stdLib.MouseEvent,
    copy: stdLib.ClipboardEvent,
    cuechange: stdLib.Event,
    cut: stdLib.ClipboardEvent,
    dblclick: stdLib.MouseEvent,
    dialogTitleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null],
    drag: stdLib.DragEvent,
    dragAffordanceChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.`title-bar` | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    dragend: stdLib.DragEvent,
    dragenter: stdLib.DragEvent,
    dragexit: stdLib.Event,
    dragleave: stdLib.DragEvent,
    dragover: stdLib.DragEvent,
    dragstart: stdLib.DragEvent,
    drop: stdLib.DragEvent,
    durationchange: stdLib.Event,
    emptied: stdLib.Event,
    ended: stdLib.Event,
    error: stdLib.ErrorEvent,
    focus: stdLib.FocusEvent,
    fullscreenchange: stdLib.Event,
    fullscreenerror: stdLib.Event,
    gotpointercapture: stdLib.PointerEvent,
    initialVisibilityChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.hide | atOracleOraclejetLib.atOracleOraclejetLibStrings.show
    ],
    input: stdLib.Event,
    invalid: stdLib.Event,
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    load: stdLib.Event,
    loadeddata: stdLib.Event,
    loadedmetadata: stdLib.Event,
    loadend: stdLib.ProgressEvent,
    loadstart: stdLib.Event,
    lostpointercapture: stdLib.PointerEvent,
    modalityChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless
    ],
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    ojAnimateEnd: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojAnimateEnd,
    ojAnimateStart: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojAnimateStart,
    ojBeforeClose: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojBeforeClose,
    ojBeforeOpen: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojBeforeOpen,
    ojClose: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojClose,
    ojFocus: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojFocus,
    ojOpen: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojOpen,
    ojResize: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResize,
    ojResizeStart: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResizeStart,
    ojResizeStop: atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResizeStop,
    paste: stdLib.ClipboardEvent,
    pause: stdLib.Event,
    play: stdLib.Event,
    playing: stdLib.Event,
    pointercancel: stdLib.PointerEvent,
    pointerdown: stdLib.PointerEvent,
    pointerenter: stdLib.PointerEvent,
    pointerleave: stdLib.PointerEvent,
    pointermove: stdLib.PointerEvent,
    pointerout: stdLib.PointerEvent,
    pointerover: stdLib.PointerEvent,
    pointerup: stdLib.PointerEvent,
    positionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdialogMod.ojDialogNs.Position],
    progress: stdLib.ProgressEvent,
    ratechange: stdLib.Event,
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    resizeBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.resizable | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    roleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    scroll: stdLib.Event,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.Event,
    selectionchange: stdLib.Event,
    selectstart: stdLib.Event,
    stalled: stdLib.Event,
    submit: stdLib.Event,
    suspend: stdLib.Event,
    timeupdate: stdLib.Event,
    toggle: stdLib.Event,
    touchcancel: stdLib.TouchEvent,
    touchend: stdLib.TouchEvent,
    touchmove: stdLib.TouchEvent,
    touchstart: stdLib.TouchEvent,
    transitioncancel: stdLib.TransitionEvent,
    transitionend: stdLib.TransitionEvent,
    transitionrun: stdLib.TransitionEvent,
    transitionstart: stdLib.TransitionEvent,
    translationsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Object | scala.Null],
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojDialogEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, cancel = cancel, cancelBehaviorChanged = cancelBehaviorChanged, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, dialogTitleChanged = dialogTitleChanged, drag = drag, dragAffordanceChanged = dragAffordanceChanged, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, initialVisibilityChanged = initialVisibilityChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, modalityChanged = modalityChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeClose = ojBeforeClose, ojBeforeOpen = ojBeforeOpen, ojClose = ojClose, ojFocus = ojFocus, ojOpen = ojOpen, ojResize = ojResize, ojResizeStart = ojResizeStart, ojResizeStop = ojResizeStop, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, positionChanged = positionChanged, progress = progress, ratechange = ratechange, reset = reset, resize = resize, resizeBehaviorChanged = resizeBehaviorChanged, roleChanged = roleChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojDialogEventMap]
  }
}

