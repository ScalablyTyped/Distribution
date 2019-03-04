package typings
package atOracleOraclejetLib.ojmasonrylayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMasonryLayoutEventMap
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[ojMasonryLayoutSettableProperties] {
  var ojAnimateEnd: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateEnd
  var ojAnimateStart: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateStart
  var ojBeforeInsert: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeInsert
  var ojBeforeRemove: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeRemove
  var ojBeforeReorder: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeReorder
  var ojBeforeResize: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeResize
  var ojInsert: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojInsert
  var ojRemove: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojRemove
  var ojReorder: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojReorder
  var ojResize: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojResize
  var reorderHandleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
}

object ojMasonryLayoutEventMap {
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
    drag: stdLib.DragEvent,
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
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    ojAnimateEnd: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateEnd,
    ojAnimateStart: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateStart,
    ojBeforeInsert: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeInsert,
    ojBeforeRemove: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeRemove,
    ojBeforeReorder: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeReorder,
    ojBeforeResize: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeResize,
    ojInsert: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojInsert,
    ojRemove: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojRemove,
    ojReorder: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojReorder,
    ojResize: atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojResize,
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
    progress: stdLib.ProgressEvent,
    ratechange: stdLib.Event,
    reorderHandleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null],
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    scroll: stdLib.UIEvent,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.UIEvent,
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
  ): ojMasonryLayoutEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeInsert = ojBeforeInsert, ojBeforeRemove = ojBeforeRemove, ojBeforeReorder = ojBeforeReorder, ojBeforeResize = ojBeforeResize, ojInsert = ojInsert, ojRemove = ojRemove, ojReorder = ojReorder, ojResize = ojResize, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reorderHandleChanged = reorderHandleChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojMasonryLayoutEventMap]
  }
}

