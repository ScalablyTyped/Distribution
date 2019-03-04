package typings
package atOracleOraclejetLib.ojtreemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTreemapNodeEventMap
  extends stdLib.HTMLElementEventMap {
  var categoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[java.lang.String]]]
  var colorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var drillingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
    ]
  ]
  var groupLabelDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.node | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.header
    ]
  ]
  var headerChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.Anon_CenterEndIsolate]]
  var labelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var labelDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.node
    ]
  ]
  var labelHalignChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.center
    ]
  ]
  var labelStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]]
  var labelValignChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.center
    ]
  ]
  var patternChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ]
  ]
  var selectableChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ]
  ]
  var shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]]
  var svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]]
  var valueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
}

object ojTreemapNodeEventMap {
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
    groupLabelDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.node | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.header
      ]
    ],
    headerChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.Anon_CenterEndIsolate]],
    input: stdLib.Event,
    invalid: stdLib.Event,
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    labelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    labelDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.node
      ]
    ],
    labelHalignChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.center
      ]
    ],
    labelStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]],
    labelValignChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.center
      ]
    ],
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
    scroll: stdLib.UIEvent,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.UIEvent,
    selectableChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ]
    ],
    shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    stalled: stdLib.Event,
    submit: stdLib.Event,
    suspend: stdLib.Event,
    svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]],
    svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]],
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
    valueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojTreemapNodeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, categoriesChanged = categoriesChanged, change = change, click = click, close = close, colorChanged = colorChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillingChanged = drillingChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, groupLabelDisplayChanged = groupLabelDisplayChanged, headerChanged = headerChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, labelDisplayChanged = labelDisplayChanged, labelHalignChanged = labelHalignChanged, labelStyleChanged = labelStyleChanged, labelValignChanged = labelValignChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, paste = paste, patternChanged = patternChanged, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectableChanged = selectableChanged, shortDescChanged = shortDescChanged, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, valueChanged = valueChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojTreemapNodeEventMap]
  }
}

