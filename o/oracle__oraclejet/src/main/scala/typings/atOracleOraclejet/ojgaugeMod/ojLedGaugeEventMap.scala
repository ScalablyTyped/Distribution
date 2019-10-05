package typings.atOracleOraclejet.ojgaugeMod

import typings.atOracleOraclejet.Anon_AutoBillionConverterMillionNone
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
import typings.atOracleOraclejet.Anon_Style
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`0`
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`180`
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`270`
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`90`
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrow
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangle
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typings.atOracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
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

trait ojLedGaugeEventMap extends dvtBaseComponentEventMap[ojLedGaugeSettableProperties] {
  var borderColorChanged: JetElementCustomEvent[String]
  var colorChanged: JetElementCustomEvent[String]
  var labelChanged: JetElementCustomEvent[Anon_Style]
  var maxChanged: JetElementCustomEvent[Double]
  var metricLabelChanged: JetElementCustomEvent[Anon_AutoBillionConverterMillionNone]
  var minChanged: JetElementCustomEvent[Double]
  var rotationChanged: JetElementCustomEvent[`90` | `180` | `270` | `0`]
  var sizeChanged: JetElementCustomEvent[Double]
  var svgClassNameChanged: JetElementCustomEvent[String]
  var svgStyleChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGauge['svgStyle'] */ js.Any
  ]
  var thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]]
  var tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext]
  var typeChanged: JetElementCustomEvent[arrow | diamond | square | rectangle | triangle | star | human | circle]
  var valueChanged: JetElementCustomEvent[Double | Null]
  var visualEffectsChanged: JetElementCustomEvent[none | auto]
}

object ojLedGaugeEventMap {
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
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[Anon_Style],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maxChanged: JetElementCustomEvent[Double],
    metricLabelChanged: JetElementCustomEvent[Anon_AutoBillionConverterMillionNone],
    minChanged: JetElementCustomEvent[Double],
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
    rotationChanged: JetElementCustomEvent[`90` | `180` | `270` | `0`],
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    sizeChanged: JetElementCustomEvent[Double],
    stalled: Event,
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGauge['svgStyle'] */ js.Any
    ],
    thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]],
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext],
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
    typeChanged: JetElementCustomEvent[arrow | diamond | square | rectangle | triangle | star | human | circle],
    valueChanged: JetElementCustomEvent[Double | Null],
    visualEffectsChanged: JetElementCustomEvent[none | auto],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojLedGaugeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, borderColorChanged = borderColorChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, colorChanged = colorChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, maxChanged = maxChanged, metricLabelChanged = metricLabelChanged, minChanged = minChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rotationChanged = rotationChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, sizeChanged = sizeChanged, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, thresholdsChanged = thresholdsChanged, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, typeChanged = typeChanged, valueChanged = valueChanged, visualEffectsChanged = visualEffectsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojLedGaugeEventMap]
  }
}

