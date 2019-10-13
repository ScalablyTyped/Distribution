package typings.atOracleOraclejet.ojchartMod

import typings.atOracleOraclejet.Anon_MedianSvgClassNameMedianSvgStyle
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.aboveMarker
import typings.atOracleOraclejet.atOracleOraclejetStrings.afterMarker
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.beforeMarker
import typings.atOracleOraclejet.atOracleOraclejetStrings.belowMarker
import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.inherit
import typings.atOracleOraclejet.atOracleOraclejetStrings.insideBarEdge
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeChecker
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeCrosshatch
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalLeft
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalRight
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeTriangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.outsideBarEdge
import typings.atOracleOraclejet.atOracleOraclejetStrings.outsideSlice
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallChecker
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallCrosshatch
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalLeft
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalRight
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallTriangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DocumentAndElementEventHandlersEventMap
import typings.std.DragEvent
import typings.std.ElementEventMap
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.GlobalEventHandlersEventMap
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

trait ojChartItemEventMap
  extends ElementEventMap
     with GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  var borderColorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var boxPlotChanged: JetElementCustomEvent[js.UndefOr[Anon_MedianSvgClassNameMedianSvgStyle]]
  var categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]]
  var closeChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var drillingChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]]
  var groupIdChanged: JetElementCustomEvent[js.Array[String | Double]]
  var highChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var itemsChanged: JetElementCustomEvent[js.UndefOr[js.Array[Double | js.Object]]]
  var labelChanged: JetElementCustomEvent[js.UndefOr[String | js.Array[String]]]
  var labelPositionChanged: JetElementCustomEvent[
    js.UndefOr[
      center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
    ]
  ]
  var labelStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object | js.Array[js.Object]]]
  var lowChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var markerDisplayedChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]]
  var markerShapeChanged: JetElementCustomEvent[
    js.UndefOr[
      circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
    ]
  ]
  var markerSizeChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var openChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var patternChanged: JetElementCustomEvent[
    js.UndefOr[
      smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
    ]
  ]
  var q1Changed: JetElementCustomEvent[js.UndefOr[Double]]
  var q2Changed: JetElementCustomEvent[js.UndefOr[Double]]
  var q3Changed: JetElementCustomEvent[js.UndefOr[Double]]
  var seriesIdChanged: JetElementCustomEvent[String | Double]
  var shortDescChanged: JetElementCustomEvent[js.UndefOr[String]]
  var sourceChanged: JetElementCustomEvent[js.UndefOr[String]]
  var sourceHoverChanged: JetElementCustomEvent[js.UndefOr[String]]
  var sourceHoverSelectedChanged: JetElementCustomEvent[js.UndefOr[String]]
  var sourceSelectedChanged: JetElementCustomEvent[js.UndefOr[String]]
  var svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]]
  var svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]]
  var targetValueChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var valueChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var volumeChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var xChanged: JetElementCustomEvent[js.UndefOr[Double | String]]
  var yChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var zChanged: JetElementCustomEvent[js.UndefOr[Double]]
}

object ojChartItemEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]],
    boxPlotChanged: JetElementCustomEvent[js.UndefOr[Anon_MedianSvgClassNameMedianSvgStyle]],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]],
    change: Event,
    click: MouseEvent,
    close: Event,
    closeChanged: JetElementCustomEvent[js.UndefOr[Double]],
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
    drillingChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]],
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
    groupIdChanged: JetElementCustomEvent[js.Array[String | Double]],
    highChanged: JetElementCustomEvent[js.UndefOr[Double]],
    input: Event,
    invalid: Event,
    itemsChanged: JetElementCustomEvent[js.UndefOr[js.Array[Double | js.Object]]],
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[js.UndefOr[String | js.Array[String]]],
    labelPositionChanged: JetElementCustomEvent[
      js.UndefOr[
        center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
      ]
    ],
    labelStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object | js.Array[js.Object]]],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    lowChanged: JetElementCustomEvent[js.UndefOr[Double]],
    markerDisplayedChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]],
    markerShapeChanged: JetElementCustomEvent[
      js.UndefOr[
        circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
      ]
    ],
    markerSizeChanged: JetElementCustomEvent[js.UndefOr[Double]],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    openChanged: JetElementCustomEvent[js.UndefOr[Double]],
    paste: ClipboardEvent,
    patternChanged: JetElementCustomEvent[
      js.UndefOr[
        smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
      ]
    ],
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
    q1Changed: JetElementCustomEvent[js.UndefOr[Double]],
    q2Changed: JetElementCustomEvent[js.UndefOr[Double]],
    q3Changed: JetElementCustomEvent[js.UndefOr[Double]],
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    seriesIdChanged: JetElementCustomEvent[String | Double],
    shortDescChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceHoverChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceHoverSelectedChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceSelectedChanged: JetElementCustomEvent[js.UndefOr[String]],
    stalled: Event,
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    targetValueChanged: JetElementCustomEvent[js.UndefOr[Double]],
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
    valueChanged: JetElementCustomEvent[js.UndefOr[Double]],
    volumeChanged: JetElementCustomEvent[js.UndefOr[Double]],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent,
    xChanged: JetElementCustomEvent[js.UndefOr[Double | String]],
    yChanged: JetElementCustomEvent[js.UndefOr[Double]],
    zChanged: JetElementCustomEvent[js.UndefOr[Double]]
  ): ojChartItemEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, borderColorChanged = borderColorChanged, borderWidthChanged = borderWidthChanged, boxPlotChanged = boxPlotChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, categoriesChanged = categoriesChanged, change = change, click = click, close = close, closeChanged = closeChanged, colorChanged = colorChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillingChanged = drillingChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, groupIdChanged = groupIdChanged, highChanged = highChanged, input = input, invalid = invalid, itemsChanged = itemsChanged, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, labelPositionChanged = labelPositionChanged, labelStyleChanged = labelStyleChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, lowChanged = lowChanged, markerDisplayedChanged = markerDisplayedChanged, markerShapeChanged = markerShapeChanged, markerSizeChanged = markerSizeChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, openChanged = openChanged, paste = paste, patternChanged = patternChanged, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, q1Changed = q1Changed, q2Changed = q2Changed, q3Changed = q3Changed, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, seriesIdChanged = seriesIdChanged, shortDescChanged = shortDescChanged, sourceChanged = sourceChanged, sourceHoverChanged = sourceHoverChanged, sourceHoverSelectedChanged = sourceHoverSelectedChanged, sourceSelectedChanged = sourceSelectedChanged, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, targetValueChanged = targetValueChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, valueChanged = valueChanged, volumeChanged = volumeChanged, volumechange = volumechange, waiting = waiting, wheel = wheel, xChanged = xChanged, yChanged = yChanged, zChanged = zChanged)
  
    __obj.asInstanceOf[ojChartItemEventMap]
  }
}

