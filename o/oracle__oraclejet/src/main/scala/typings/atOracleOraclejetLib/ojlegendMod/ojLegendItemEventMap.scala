package typings
package atOracleOraclejetLib.ojlegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLegendItemEventMap
  extends stdLib.HTMLElementEventMap {
  var borderColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var categoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[java.lang.String]]]
  var categoryVisibilityChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
    ]
  ]
  var colorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var drillingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
    ]
  ]
  var lineStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
    ]
  ]
  var lineWidthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]]
  var markerColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var markerShapeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  ]
  var markerSvgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var markerSvgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]]
  var patternChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ]
  ]
  var shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var sourceChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]]
  var symbolTypeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker
    ]
  ]
  var textChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
}

object ojLegendItemEventMap {
  @scala.inline
  def apply(
    abort: stdLib.UIEvent,
    animationcancel: stdLib.AnimationEvent,
    animationend: stdLib.AnimationEvent,
    animationiteration: stdLib.AnimationEvent,
    animationstart: stdLib.AnimationEvent,
    auxclick: stdLib.Event,
    blur: stdLib.FocusEvent,
    borderColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    cancel: stdLib.Event,
    canplay: stdLib.Event,
    canplaythrough: stdLib.Event,
    categoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[java.lang.String]]],
    categoryVisibilityChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
      ]
    ],
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    colorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
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
    drillingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
      ]
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
    lineStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
      ]
    ],
    lineWidthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]],
    load: stdLib.Event,
    loadeddata: stdLib.Event,
    loadedmetadata: stdLib.Event,
    loadend: stdLib.ProgressEvent,
    loadstart: stdLib.Event,
    lostpointercapture: stdLib.PointerEvent,
    markerColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    markerShapeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
    ],
    markerSvgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    markerSvgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]],
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    paste: stdLib.ClipboardEvent,
    patternChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ]
    ],
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
    selectionchange: stdLib.Event,
    selectstart: stdLib.Event,
    shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    sourceChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    stalled: stdLib.Event,
    submit: stdLib.Event,
    suspend: stdLib.Event,
    svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]],
    symbolTypeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker
      ]
    ],
    textChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
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
  ): ojLegendItemEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, borderColorChanged = borderColorChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, categoriesChanged = categoriesChanged, categoryVisibilityChanged = categoryVisibilityChanged, change = change, click = click, close = close, colorChanged = colorChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillingChanged = drillingChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, lineStyleChanged = lineStyleChanged, lineWidthChanged = lineWidthChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, markerColorChanged = markerColorChanged, markerShapeChanged = markerShapeChanged, markerSvgClassNameChanged = markerSvgClassNameChanged, markerSvgStyleChanged = markerSvgStyleChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, paste = paste, patternChanged = patternChanged, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, shortDescChanged = shortDescChanged, sourceChanged = sourceChanged, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, symbolTypeChanged = symbolTypeChanged, textChanged = textChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojLegendItemEventMap]
  }
}

