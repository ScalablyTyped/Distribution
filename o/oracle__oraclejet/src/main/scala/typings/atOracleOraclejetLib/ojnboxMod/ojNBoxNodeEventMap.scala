package typings
package atOracleOraclejetLib.ojnboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNBoxNodeEventMap
  extends stdLib.HTMLElementEventMap {
  var borderColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var borderWidthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var categoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]]
  var colorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var columnChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var groupCategoryChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var iconChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidthCircleColor]
  ]
  var indicatorColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var indicatorIconChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond]
  ]
  var labelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var rowChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var secondaryLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Object | scala.Null]
  var xPercentageChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double | scala.Null]]
  var yPercentageChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double | scala.Null]]
}

object ojNBoxNodeEventMap {
  @scala.inline
  def apply(
    abort: stdLib.UIEvent,
    animationcancel: stdLib.AnimationEvent,
    animationend: stdLib.AnimationEvent,
    animationiteration: stdLib.AnimationEvent,
    animationstart: stdLib.AnimationEvent,
    auxclick: stdLib.Event,
    blur: stdLib.FocusEvent,
    borderColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    borderWidthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    cancel: stdLib.Event,
    canplay: stdLib.Event,
    canplaythrough: stdLib.Event,
    categoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]],
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    colorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    columnChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
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
    groupCategoryChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    iconChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidthCircleColor]
    ],
    indicatorColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    indicatorIconChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond]
    ],
    input: stdLib.Event,
    invalid: stdLib.Event,
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    labelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
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
    rowChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    scroll: stdLib.Event,
    secondaryLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.Event,
    selectionchange: stdLib.Event,
    selectstart: stdLib.Event,
    shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    stalled: stdLib.Event,
    submit: stdLib.Event,
    suspend: stdLib.Event,
    svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Object | scala.Null],
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
    wheel: stdLib.WheelEvent,
    xPercentageChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double | scala.Null]],
    yPercentageChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double | scala.Null]]
  ): ojNBoxNodeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, borderColorChanged = borderColorChanged, borderWidthChanged = borderWidthChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, categoriesChanged = categoriesChanged, change = change, click = click, close = close, colorChanged = colorChanged, columnChanged = columnChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, groupCategoryChanged = groupCategoryChanged, iconChanged = iconChanged, indicatorColorChanged = indicatorColorChanged, indicatorIconChanged = indicatorIconChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rowChanged = rowChanged, scroll = scroll, secondaryLabelChanged = secondaryLabelChanged, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, shortDescChanged = shortDescChanged, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, volumechange = volumechange, waiting = waiting, wheel = wheel, xPercentageChanged = xPercentageChanged, yPercentageChanged = yPercentageChanged)
  
    __obj.asInstanceOf[ojNBoxNodeEventMap]
  }
}

