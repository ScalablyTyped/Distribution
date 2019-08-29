package typings.atOracleOraclejet.ojganttMod

import typings.atOracleOraclejet.Anon_BorderRadiusEnd
import typings.atOracleOraclejet.Anon_BorderRadiusHeightSvgClassName
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.innerCenter
import typings.atOracleOraclejet.atOracleOraclejetStrings.innerEnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.innerStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.milestone
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.normal
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.summary
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HTMLElementEventMap
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

trait ojGanttTaskEventMap extends HTMLElementEventMap {
  var baselineChanged: JetElementCustomEvent[Anon_BorderRadiusEnd]
  var borderRadiusChanged: JetElementCustomEvent[String]
  var endChanged: JetElementCustomEvent[String]
  var heightChanged: JetElementCustomEvent[Double | Null]
  var labelChanged: JetElementCustomEvent[String]
  var labelPositionChanged: JetElementCustomEvent[start | innerCenter | innerStart | innerEnd | end | none]
  var labelStyleChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTask['labelStyle'] */ js.Any
  ]
  var progressChanged: JetElementCustomEvent[Anon_BorderRadiusHeightSvgClassName]
  var rowIdChanged: JetElementCustomEvent[js.UndefOr[_]]
  var shortDescChanged: JetElementCustomEvent[String | Null]
  var startChanged: JetElementCustomEvent[String]
  var svgClassNameChanged: JetElementCustomEvent[String]
  var svgStyleChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTask['svgStyle'] */ js.Any
  ]
  var typeChanged: JetElementCustomEvent[normal | milestone | summary | auto]
}

object ojGanttTaskEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    baselineChanged: JetElementCustomEvent[Anon_BorderRadiusEnd],
    blur: FocusEvent,
    borderRadiusChanged: JetElementCustomEvent[String],
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
    endChanged: JetElementCustomEvent[String],
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    heightChanged: JetElementCustomEvent[Double | Null],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[String],
    labelPositionChanged: JetElementCustomEvent[start | innerCenter | innerStart | innerEnd | end | none],
    labelStyleChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTask['labelStyle'] */ js.Any
    ],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
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
    progress: ProgressEvent[EventTarget],
    progressChanged: JetElementCustomEvent[Anon_BorderRadiusHeightSvgClassName],
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    rowIdChanged: JetElementCustomEvent[js.UndefOr[_]],
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[String | Null],
    stalled: Event,
    startChanged: JetElementCustomEvent[String],
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTask['svgStyle'] */ js.Any
    ],
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
    typeChanged: JetElementCustomEvent[normal | milestone | summary | auto],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojGanttTaskEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, baselineChanged = baselineChanged, blur = blur, borderRadiusChanged = borderRadiusChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, endChanged = endChanged, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, heightChanged = heightChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, labelPositionChanged = labelPositionChanged, labelStyleChanged = labelStyleChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, progressChanged = progressChanged, ratechange = ratechange, reset = reset, resize = resize, rowIdChanged = rowIdChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, shortDescChanged = shortDescChanged, stalled = stalled, startChanged = startChanged, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, typeChanged = typeChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojGanttTaskEventMap]
  }
}

