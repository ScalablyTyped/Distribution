package typings
package atOracleOraclejetLib.ojdiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDiagramNodeEventMap
  extends stdLib.HTMLElementEventMap {
  var categoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[java.lang.String]]]
  var descendantsConnectivityChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.connected | atOracleOraclejetLib.atOracleOraclejetLibStrings.disjoint | atOracleOraclejetLib.atOracleOraclejetLibStrings.unknown
    ]
  ]
  var iconChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidth]]
  var labelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var labelStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object | scala.Null]]
  var overviewChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.Anon_IconAnonCircle]]
  var selectableChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ]
  ]
  var shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var showDisclosureChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ]
  ]
}

object ojDiagramNodeEventMap {
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
    categoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[java.lang.String]]],
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    contextmenu: stdLib.MouseEvent,
    copy: stdLib.ClipboardEvent,
    cuechange: stdLib.Event,
    cut: stdLib.ClipboardEvent,
    dblclick: stdLib.MouseEvent,
    descendantsConnectivityChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.connected | atOracleOraclejetLib.atOracleOraclejetLibStrings.disjoint | atOracleOraclejetLib.atOracleOraclejetLibStrings.unknown
      ]
    ],
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
    iconChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidth]],
    input: stdLib.Event,
    invalid: stdLib.Event,
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    labelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    labelStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object | scala.Null]],
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
    overviewChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.Anon_IconAnonCircle]],
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
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    scroll: stdLib.Event,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.Event,
    selectableChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ]
    ],
    selectionchange: stdLib.Event,
    selectstart: stdLib.Event,
    shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    showDisclosureChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ]
    ],
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
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojDiagramNodeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, categoriesChanged = categoriesChanged, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, descendantsConnectivityChanged = descendantsConnectivityChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, iconChanged = iconChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, labelStyleChanged = labelStyleChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, overviewChanged = overviewChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectableChanged = selectableChanged, selectionchange = selectionchange, selectstart = selectstart, shortDescChanged = shortDescChanged, showDisclosureChanged = showDisclosureChanged, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojDiagramNodeEventMap]
  }
}

