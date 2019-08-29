package typings.atOracleOraclejet.ojnboxMod

import typings.atOracleOraclejet.Anon_BorderColorBorderRadiusBorderWidthCircleColor
import typings.atOracleOraclejet.Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
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

trait ojNBoxNodeEventMap extends HTMLElementEventMap {
  var borderColorChanged: JetElementCustomEvent[String]
  var borderWidthChanged: JetElementCustomEvent[Double]
  var categoriesChanged: JetElementCustomEvent[js.Array[String]]
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var columnChanged: JetElementCustomEvent[String]
  var groupCategoryChanged: JetElementCustomEvent[js.UndefOr[String]]
  var iconChanged: JetElementCustomEvent[js.UndefOr[Anon_BorderColorBorderRadiusBorderWidthCircleColor]]
  var indicatorColorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var indicatorIconChanged: JetElementCustomEvent[js.UndefOr[Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond]]
  var labelChanged: JetElementCustomEvent[String]
  var rowChanged: JetElementCustomEvent[String]
  var secondaryLabelChanged: JetElementCustomEvent[String]
  var shortDescChanged: JetElementCustomEvent[String]
  var svgClassNameChanged: JetElementCustomEvent[String]
  var svgStyleChanged: JetElementCustomEvent[js.Object | Null]
  var xPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]]
  var yPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]]
}

object ojNBoxNodeEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[String],
    borderWidthChanged: JetElementCustomEvent[Double],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.Array[String]],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[js.UndefOr[String]],
    columnChanged: JetElementCustomEvent[String],
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
    groupCategoryChanged: JetElementCustomEvent[js.UndefOr[String]],
    iconChanged: JetElementCustomEvent[js.UndefOr[Anon_BorderColorBorderRadiusBorderWidthCircleColor]],
    indicatorColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    indicatorIconChanged: JetElementCustomEvent[js.UndefOr[Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond]],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[String],
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
    rowChanged: JetElementCustomEvent[String],
    scroll: Event,
    secondaryLabelChanged: JetElementCustomEvent[String],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[String],
    stalled: Event,
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[js.Object | Null],
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
    xPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]],
    yPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]]
  ): ojNBoxNodeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, borderColorChanged = borderColorChanged, borderWidthChanged = borderWidthChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, categoriesChanged = categoriesChanged, change = change, click = click, close = close, colorChanged = colorChanged, columnChanged = columnChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, groupCategoryChanged = groupCategoryChanged, iconChanged = iconChanged, indicatorColorChanged = indicatorColorChanged, indicatorIconChanged = indicatorIconChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rowChanged = rowChanged, scroll = scroll, secondaryLabelChanged = secondaryLabelChanged, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, shortDescChanged = shortDescChanged, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, volumechange = volumechange, waiting = waiting, wheel = wheel, xPercentageChanged = xPercentageChanged, yPercentageChanged = yPercentageChanged)
  
    __obj.asInstanceOf[ojNBoxNodeEventMap]
  }
}

