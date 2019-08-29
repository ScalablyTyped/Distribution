package typings.atOracleOraclejet.ojdiagramMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrow
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrowConcave
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrowOpen
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangleRounded
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

trait ojDiagramLinkEventMap extends HTMLElementEventMap {
  var categoriesChanged: JetElementCustomEvent[js.Array[String]]
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var endConnectorTypeChanged: JetElementCustomEvent[
    js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded]
  ]
  var endNodeChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['endNode'] */ js.Any
  ]
  var labelChanged: JetElementCustomEvent[js.UndefOr[String]]
  var labelStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object | Null]]
  var selectableChanged: JetElementCustomEvent[js.UndefOr[auto | off]]
  var shortDescChanged: JetElementCustomEvent[js.UndefOr[String]]
  var startConnectorTypeChanged: JetElementCustomEvent[
    js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded]
  ]
  var startNodeChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['startNode'] */ js.Any
  ]
  var svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]]
  var svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]]
  var widthChanged: JetElementCustomEvent[js.UndefOr[Double]]
}

object ojDiagramLinkEventMap {
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
    categoriesChanged: JetElementCustomEvent[js.Array[String]],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[js.UndefOr[String]],
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
    endConnectorTypeChanged: JetElementCustomEvent[
      js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded]
    ],
    endNodeChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['endNode'] */ js.Any
    ],
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[js.UndefOr[String]],
    labelStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object | Null]],
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
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectableChanged: JetElementCustomEvent[js.UndefOr[auto | off]],
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[js.UndefOr[String]],
    stalled: Event,
    startConnectorTypeChanged: JetElementCustomEvent[
      js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded]
    ],
    startNodeChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['startNode'] */ js.Any
    ],
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
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
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent,
    widthChanged: JetElementCustomEvent[js.UndefOr[Double]]
  ): ojDiagramLinkEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, categoriesChanged = categoriesChanged, change = change, click = click, close = close, colorChanged = colorChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, endConnectorTypeChanged = endConnectorTypeChanged, endNodeChanged = endNodeChanged, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, labelStyleChanged = labelStyleChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectableChanged = selectableChanged, selectionchange = selectionchange, selectstart = selectstart, shortDescChanged = shortDescChanged, stalled = stalled, startConnectorTypeChanged = startConnectorTypeChanged, startNodeChanged = startNodeChanged, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, volumechange = volumechange, waiting = waiting, wheel = wheel, widthChanged = widthChanged)
  
    __obj.asInstanceOf[ojDiagramLinkEventMap]
  }
}

