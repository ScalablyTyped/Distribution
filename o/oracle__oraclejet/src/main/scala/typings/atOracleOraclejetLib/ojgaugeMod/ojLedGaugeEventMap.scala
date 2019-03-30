package typings
package atOracleOraclejetLib.ojgaugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLedGaugeEventMap
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentEventMap[ojLedGaugeSettableProperties] {
  var borderColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var colorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var labelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Style]
  var maxChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var metricLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoBillionConverterMillionNone]
  var minChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var rotationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibNumbers.`90` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`180` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`270` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0`
  ]
  var sizeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing]
  var thresholdsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.Threshold]]
  var tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
  ]
  var typeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
  ]
  var valueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null]
  var visualEffectsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
}

object ojLedGaugeEventMap {
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
    cancel: stdLib.Event,
    canplay: stdLib.Event,
    canplaythrough: stdLib.Event,
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    colorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
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
    input: stdLib.Event,
    invalid: stdLib.Event,
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    labelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Style],
    load: stdLib.Event,
    loadeddata: stdLib.Event,
    loadedmetadata: stdLib.Event,
    loadend: stdLib.ProgressEvent,
    loadstart: stdLib.Event,
    lostpointercapture: stdLib.PointerEvent,
    maxChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    metricLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoBillionConverterMillionNone],
    minChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
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
    rotationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibNumbers.`90` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`180` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`270` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0`
    ],
    scroll: stdLib.Event,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.Event,
    selectionchange: stdLib.Event,
    selectstart: stdLib.Event,
    sizeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    stalled: stdLib.Event,
    submit: stdLib.Event,
    suspend: stdLib.Event,
    svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing],
    thresholdsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.Threshold]],
    timeupdate: stdLib.Event,
    toggle: stdLib.Event,
    tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
    ],
    touchcancel: stdLib.TouchEvent,
    touchend: stdLib.TouchEvent,
    touchmove: stdLib.TouchEvent,
    touchstart: stdLib.TouchEvent,
    trackResizeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    transitioncancel: stdLib.TransitionEvent,
    transitionend: stdLib.TransitionEvent,
    transitionrun: stdLib.TransitionEvent,
    transitionstart: stdLib.TransitionEvent,
    translationsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Object | scala.Null],
    typeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
    ],
    valueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null],
    visualEffectsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ],
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojLedGaugeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, borderColorChanged = borderColorChanged, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, colorChanged = colorChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelChanged = labelChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, maxChanged = maxChanged, metricLabelChanged = metricLabelChanged, minChanged = minChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rotationChanged = rotationChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, sizeChanged = sizeChanged, stalled = stalled, submit = submit, suspend = suspend, svgClassNameChanged = svgClassNameChanged, svgStyleChanged = svgStyleChanged, thresholdsChanged = thresholdsChanged, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, typeChanged = typeChanged, valueChanged = valueChanged, visualEffectsChanged = visualEffectsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojLedGaugeEventMap]
  }
}

