package typings.atOracleOraclejet.ojthematicmapMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.ellipse
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
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

trait ojThematicMapMarkerEventMap extends HTMLElementEventMap {
  var borderColorChanged: JetElementCustomEvent[String]
  var borderStyleChanged: JetElementCustomEvent[solid | none]
  var borderWidthChanged: JetElementCustomEvent[Double]
  var categoriesChanged: JetElementCustomEvent[js.Array[String]]
  var colorChanged: JetElementCustomEvent[String]
  var heightChanged: JetElementCustomEvent[Double]
  var labelChanged: JetElementCustomEvent[String]
  var labelPositionChanged: JetElementCustomEvent[bottom | center | top]
  var labelStyleChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapMarker['labelStyle'] */ js.Any
  ]
  var locationChanged: JetElementCustomEvent[String]
  var opacityChanged: JetElementCustomEvent[Double]
  var rotationChanged: JetElementCustomEvent[Double]
  var selectableChanged: JetElementCustomEvent[auto | off]
  var shapeChanged: JetElementCustomEvent[
    js.UndefOr[
      circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
    ]
  ]
  var shortDescChanged: JetElementCustomEvent[String]
  var sourceChanged: JetElementCustomEvent[String]
  var sourceHoverChanged: JetElementCustomEvent[String]
  var sourceHoverSelectedChanged: JetElementCustomEvent[String]
  var sourceSelectedChanged: JetElementCustomEvent[String]
  var svgClassNameChanged: JetElementCustomEvent[String]
  var svgStyleChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapMarker['svgStyle'] */ js.Any
  ]
  var valueChanged: JetElementCustomEvent[Double]
  var widthChanged: JetElementCustomEvent[Double]
  var xChanged: JetElementCustomEvent[Double | Null]
  var yChanged: JetElementCustomEvent[Double | Null]
}

object ojThematicMapMarkerEventMap {
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
    borderStyleChanged: JetElementCustomEvent[solid | none],
    borderWidthChanged: JetElementCustomEvent[Double],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.Array[String]],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[String],
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
    heightChanged: JetElementCustomEvent[Double],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[String],
    labelPositionChanged: JetElementCustomEvent[bottom | center | top],
    labelStyleChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapMarker['labelStyle'] */ js.Any
    ],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    locationChanged: JetElementCustomEvent[String],
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    opacityChanged: JetElementCustomEvent[Double],
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
    rotationChanged: JetElementCustomEvent[Double],
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectableChanged: JetElementCustomEvent[auto | off],
    selectionchange: Event,
    selectstart: Event,
    shapeChanged: JetElementCustomEvent[
      js.UndefOr[
        circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
      ]
    ],
    shortDescChanged: JetElementCustomEvent[String],
    sourceChanged: JetElementCustomEvent[String],
    sourceHoverChanged: JetElementCustomEvent[String],
    sourceHoverSelectedChanged: JetElementCustomEvent[String],
    sourceSelectedChanged: JetElementCustomEvent[String],
    stalled: Event,
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapMarker['svgStyle'] */ js.Any
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
    valueChanged: JetElementCustomEvent[Double],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent,
    widthChanged: JetElementCustomEvent[Double],
    xChanged: JetElementCustomEvent[Double | Null],
    yChanged: JetElementCustomEvent[Double | Null]
  ): ojThematicMapMarkerEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, borderColorChanged = borderColorChanged, borderStyleChanged = borderStyleChanged, borderWidthChanged = borderWidthChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, categoriesChanged = categoriesChanged, change = change, click = click, close = close, colorChanged = colorChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, heightChanged = heightChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, labelPositionChanged = labelPositionChanged, labelStyleChanged = labelStyleChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, locationChanged = locationChanged, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, opacityChanged = opacityChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rotationChanged = rotationChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectableChanged = selectableChanged, selectionchange = selectionchange, selectstart = selectstart, shapeChanged = shapeChanged, shortDescChanged = shortDescChanged, sourceChanged = sourceChanged, sourceHoverChanged = sourceHoverChanged, sourceHoverSelectedChanged = sourceHoverSelectedChanged, sourceSelectedChanged = sourceSelectedChanged, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, valueChanged = valueChanged, volumechange = volumechange, waiting = waiting, wheel = wheel, widthChanged = widthChanged, xChanged = xChanged, yChanged = yChanged)
  
    __obj.asInstanceOf[ojThematicMapMarkerEventMap]
  }
}

