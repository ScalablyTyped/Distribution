package typings.atOracleOraclejet.ojmasonrylayoutMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentEventMap
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateEnd
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateStart
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeInsert
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeRemove
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeReorder
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeResize
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojInsert
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojRemove
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojReorder
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojResize
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

trait ojMasonryLayoutEventMap extends baseComponentEventMap[ojMasonryLayoutSettableProperties] {
  var ojAnimateEnd: typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateEnd
  var ojAnimateStart: typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateStart
  var ojBeforeInsert: typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeInsert
  var ojBeforeRemove: typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeRemove
  var ojBeforeReorder: typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeReorder
  var ojBeforeResize: typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeResize
  var ojInsert: typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojInsert
  var ojRemove: typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojRemove
  var ojReorder: typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojReorder
  var ojResize: typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojResize
  var reorderHandleChanged: JetElementCustomEvent[String | Null]
}

object ojMasonryLayoutEventMap {
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
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojAnimateEnd: ojAnimateEnd,
    ojAnimateStart: ojAnimateStart,
    ojBeforeInsert: ojBeforeInsert,
    ojBeforeRemove: ojBeforeRemove,
    ojBeforeReorder: ojBeforeReorder,
    ojBeforeResize: ojBeforeResize,
    ojInsert: ojInsert,
    ojRemove: ojRemove,
    ojReorder: ojReorder,
    ojResize: ojResize,
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
    progress: ProgressEvent,
    ratechange: Event,
    reorderHandleChanged: JetElementCustomEvent[String | Null],
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
  ): ojMasonryLayoutEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeInsert = ojBeforeInsert, ojBeforeRemove = ojBeforeRemove, ojBeforeReorder = ojBeforeReorder, ojBeforeResize = ojBeforeResize, ojInsert = ojInsert, ojRemove = ojRemove, ojReorder = ojReorder, ojResize = ojResize, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reorderHandleChanged = reorderHandleChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojMasonryLayoutEventMap]
  }
}

