package typings
package atOracleOraclejetLib.ojpictochartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojPictoChartItemEventMap
  extends stdLib.HTMLElementEventMap {
  var borderColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var borderWidthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var categoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]]
  var colorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var columnSpanChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var countChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var drillingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ]
  var nameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var rowSpanChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var shapeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | java.lang.String
    ]
  ]
  var shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var sourceChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var sourceHoverChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var sourceHoverSelectedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var sourceSelectedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
}

object ojPictoChartItemEventMap {
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
    colorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    columnSpanChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    contextmenu: stdLib.MouseEvent,
    copy: stdLib.ClipboardEvent,
    countChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
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
    drillingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
    ],
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
    nameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
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
    rowSpanChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    scroll: stdLib.UIEvent,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.UIEvent,
    shapeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | java.lang.String
      ]
    ],
    shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    sourceChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    sourceHoverChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    sourceHoverSelectedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    sourceSelectedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    stalled: stdLib.Event,
    submit: stdLib.Event,
    suspend: stdLib.Event,
    svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_],
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
  ): ojPictoChartItemEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, borderColorChanged = borderColorChanged, borderWidthChanged = borderWidthChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, categoriesChanged = categoriesChanged, change = change, click = click, close = close, colorChanged = colorChanged, columnSpanChanged = columnSpanChanged, contextmenu = contextmenu, copy = copy, countChanged = countChanged, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillingChanged = drillingChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, nameChanged = nameChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rowSpanChanged = rowSpanChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, shapeChanged = shapeChanged, shortDescChanged = shortDescChanged, sourceChanged = sourceChanged, sourceHoverChanged = sourceHoverChanged, sourceHoverSelectedChanged = sourceHoverSelectedChanged, sourceSelectedChanged = sourceSelectedChanged, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojPictoChartItemEventMap]
  }
}

