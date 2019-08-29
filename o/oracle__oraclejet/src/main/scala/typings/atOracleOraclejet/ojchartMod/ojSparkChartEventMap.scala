package typings.atOracleOraclejet.ojchartMod

import typings.atOracleOraclejet.Anon_ContextRenderer
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.area
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bar
import typings.atOracleOraclejet.atOracleOraclejetStrings.centeredSegmented
import typings.atOracleOraclejet.atOracleOraclejetStrings.centeredStepped
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.curved
import typings.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.line
import typings.atOracleOraclejet.atOracleOraclejetStrings.lineWithArea
import typings.atOracleOraclejet.atOracleOraclejetStrings.min
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.segmented
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.stepped
import typings.atOracleOraclejet.atOracleOraclejetStrings.straight
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import typings.atOracleOraclejet.atOracleOraclejetStrings.zero
import typings.atOracleOraclejet.ojchartMod.ojSparkChartNs.ReferenceObject
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
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

trait ojSparkChartEventMap[K, D] extends dvtBaseComponentEventMap[ojSparkChartSettableProperties[K, D]] {
  var animationDurationChanged: JetElementCustomEvent[Double | Null]
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  var areaColorChanged: JetElementCustomEvent[String]
  var areaSvgClassNameChanged: JetElementCustomEvent[String]
  var areaSvgStyleChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
  ]
  var asChanged: JetElementCustomEvent[String]
  var barGapRatioChanged: JetElementCustomEvent[Double]
  var baselineScalingChanged: JetElementCustomEvent[zero | min]
  var colorChanged: JetElementCustomEvent[String]
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  var firstColorChanged: JetElementCustomEvent[String]
  var highColorChanged: JetElementCustomEvent[String]
  var lastColorChanged: JetElementCustomEvent[String]
  var lineStyleChanged: JetElementCustomEvent[dotted | dashed | solid]
  var lineTypeChanged: JetElementCustomEvent[
    curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
  ]
  var lineWidthChanged: JetElementCustomEvent[Double]
  var lowColorChanged: JetElementCustomEvent[String]
  var markerShapeChanged: JetElementCustomEvent[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ]
  var markerSizeChanged: JetElementCustomEvent[Double]
  var referenceObjectsChanged: JetElementCustomEvent[js.Array[ReferenceObject]]
  var svgClassNameChanged: JetElementCustomEvent[String]
  var svgStyleChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
  ]
  var tooltipChanged: JetElementCustomEvent[Anon_ContextRenderer]
  var typeChanged: JetElementCustomEvent[area | lineWithArea | bar | line]
  var visualEffectsChanged: JetElementCustomEvent[none | auto]
}

object ojSparkChartEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationDurationChanged: JetElementCustomEvent[Double | Null],
    animationOnDataChangeChanged: JetElementCustomEvent[auto | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | none],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    areaColorChanged: JetElementCustomEvent[String],
    areaSvgClassNameChanged: JetElementCustomEvent[String],
    areaSvgStyleChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
    ],
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    barGapRatioChanged: JetElementCustomEvent[Double],
    baselineScalingChanged: JetElementCustomEvent[zero | min],
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[String],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
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
    firstColorChanged: JetElementCustomEvent[String],
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    highColorChanged: JetElementCustomEvent[String],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    lastColorChanged: JetElementCustomEvent[String],
    lineStyleChanged: JetElementCustomEvent[dotted | dashed | solid],
    lineTypeChanged: JetElementCustomEvent[
      curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
    ],
    lineWidthChanged: JetElementCustomEvent[Double],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    lowColorChanged: JetElementCustomEvent[String],
    markerShapeChanged: JetElementCustomEvent[
      auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
    ],
    markerSizeChanged: JetElementCustomEvent[Double],
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
    referenceObjectsChanged: JetElementCustomEvent[js.Array[ReferenceObject]],
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
    ],
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Anon_ContextRenderer],
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    trackResizeChanged: JetElementCustomEvent[on | off],
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    typeChanged: JetElementCustomEvent[area | lineWithArea | bar | line],
    visualEffectsChanged: JetElementCustomEvent[none | auto],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojSparkChartEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationDurationChanged = animationDurationChanged, animationOnDataChangeChanged = animationOnDataChangeChanged, animationOnDisplayChanged = animationOnDisplayChanged, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, areaColorChanged = areaColorChanged, areaSvgClassNameChanged = areaSvgClassNameChanged, areaSvgStyleChanged = areaSvgStyleChanged, asChanged = asChanged, auxclick = auxclick, barGapRatioChanged = barGapRatioChanged, baselineScalingChanged = baselineScalingChanged, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, colorChanged = colorChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dataChanged = dataChanged, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, firstColorChanged = firstColorChanged, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, highColorChanged = highColorChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, lastColorChanged = lastColorChanged, lineStyleChanged = lineStyleChanged, lineTypeChanged = lineTypeChanged, lineWidthChanged = lineWidthChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, lowColorChanged = lowColorChanged, markerShapeChanged = markerShapeChanged, markerSizeChanged = markerSizeChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, referenceObjectsChanged = referenceObjectsChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, typeChanged = typeChanged, visualEffectsChanged = visualEffectsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojSparkChartEventMap[K, D]]
  }
}

