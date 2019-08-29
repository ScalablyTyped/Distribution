package typings.atOracleOraclejet.ojchartMod

import typings.atOracleOraclejet.Anon_MedianSvgClassNameMedianSvgStyleQ2Color
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.area
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bar
import typings.atOracleOraclejet.atOracleOraclejetStrings.boxPlot
import typings.atOracleOraclejet.atOracleOraclejetStrings.candlestick
import typings.atOracleOraclejet.atOracleOraclejetStrings.centeredSegmented
import typings.atOracleOraclejet.atOracleOraclejetStrings.centeredStepped
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.curved
import typings.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.inherit
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeChecker
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeCrosshatch
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalLeft
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalRight
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeTriangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.line
import typings.atOracleOraclejet.atOracleOraclejetStrings.lineWithArea
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.segmented
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallChecker
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallCrosshatch
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalLeft
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalRight
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallTriangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.stepped
import typings.atOracleOraclejet.atOracleOraclejetStrings.straight
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

trait ojChartSeriesEventMap extends HTMLElementEventMap {
  var areaColorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var areaSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]]
  var areaSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]]
  var assignedToY2Changed: JetElementCustomEvent[js.UndefOr[on | off]]
  var borderColorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var boxPlotChanged: JetElementCustomEvent[js.UndefOr[Anon_MedianSvgClassNameMedianSvgStyleQ2Color]]
  var categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]]
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var displayInLegendChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]]
  var drillingChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]]
  var lineStyleChanged: JetElementCustomEvent[js.UndefOr[dotted | dashed | solid]]
  var lineTypeChanged: JetElementCustomEvent[
    js.UndefOr[
      straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
    ]
  ]
  var lineWidthChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var markerColorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var markerDisplayedChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]]
  var markerShapeChanged: JetElementCustomEvent[
    js.UndefOr[
      circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
    ]
  ]
  var markerSizeChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var markerSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]]
  var markerSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]]
  var nameChanged: JetElementCustomEvent[js.UndefOr[String]]
  var patternChanged: JetElementCustomEvent[
    js.UndefOr[
      smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
    ]
  ]
  var pieSliceExplodeChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var shortDescChanged: JetElementCustomEvent[js.UndefOr[String]]
  var sourceChanged: JetElementCustomEvent[js.UndefOr[String]]
  var sourceHoverChanged: JetElementCustomEvent[js.UndefOr[String]]
  var sourceHoverSelectedChanged: JetElementCustomEvent[js.UndefOr[String]]
  var sourceSelectedChanged: JetElementCustomEvent[js.UndefOr[String]]
  var stackCategoryChanged: JetElementCustomEvent[js.UndefOr[String]]
  var svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]]
  var svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]]
  var typeChanged: JetElementCustomEvent[js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto]]
}

object ojChartSeriesEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    areaColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    areaSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    areaSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    assignedToY2Changed: JetElementCustomEvent[js.UndefOr[on | off]],
    auxclick: MouseEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]],
    boxPlotChanged: JetElementCustomEvent[js.UndefOr[Anon_MedianSvgClassNameMedianSvgStyleQ2Color]],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[js.UndefOr[String]],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    displayInLegendChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]],
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
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    lineStyleChanged: JetElementCustomEvent[js.UndefOr[dotted | dashed | solid]],
    lineTypeChanged: JetElementCustomEvent[
      js.UndefOr[
        straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
      ]
    ],
    lineWidthChanged: JetElementCustomEvent[js.UndefOr[Double]],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    markerColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    markerDisplayedChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]],
    markerShapeChanged: JetElementCustomEvent[
      js.UndefOr[
        circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
      ]
    ],
    markerSizeChanged: JetElementCustomEvent[js.UndefOr[Double]],
    markerSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    markerSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    nameChanged: JetElementCustomEvent[js.UndefOr[String]],
    paste: ClipboardEvent,
    patternChanged: JetElementCustomEvent[
      js.UndefOr[
        smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
      ]
    ],
    pause: Event,
    pieSliceExplodeChanged: JetElementCustomEvent[js.UndefOr[Double]],
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
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceHoverChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceHoverSelectedChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceSelectedChanged: JetElementCustomEvent[js.UndefOr[String]],
    stackCategoryChanged: JetElementCustomEvent[js.UndefOr[String]],
    stalled: Event,
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
    typeChanged: JetElementCustomEvent[js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto]],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojChartSeriesEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, areaColorChanged = areaColorChanged, areaSvgClassNameChanged = areaSvgClassNameChanged, areaSvgStyleChanged = areaSvgStyleChanged, assignedToY2Changed = assignedToY2Changed, auxclick = auxclick, blur = blur, borderColorChanged = borderColorChanged, borderWidthChanged = borderWidthChanged, boxPlotChanged = boxPlotChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, categoriesChanged = categoriesChanged, change = change, click = click, close = close, colorChanged = colorChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, displayInLegendChanged = displayInLegendChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillingChanged = drillingChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, lineStyleChanged = lineStyleChanged, lineTypeChanged = lineTypeChanged, lineWidthChanged = lineWidthChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, markerColorChanged = markerColorChanged, markerDisplayedChanged = markerDisplayedChanged, markerShapeChanged = markerShapeChanged, markerSizeChanged = markerSizeChanged, markerSvgClassNameChanged = markerSvgClassNameChanged, markerSvgStyleChanged = markerSvgStyleChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, nameChanged = nameChanged, paste = paste, patternChanged = patternChanged, pause = pause, pieSliceExplodeChanged = pieSliceExplodeChanged, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, shortDescChanged = shortDescChanged, sourceChanged = sourceChanged, sourceHoverChanged = sourceHoverChanged, sourceHoverSelectedChanged = sourceHoverSelectedChanged, sourceSelectedChanged = sourceSelectedChanged, stackCategoryChanged = stackCategoryChanged, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, typeChanged = typeChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojChartSeriesEventMap]
  }
}

