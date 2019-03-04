package typings
package atOracleOraclejetLib.ojgaugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRatingGaugeEventMap
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentEventMap[ojRatingGaugeSettableProperties] {
  var changedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var changedStateChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BorderColorCircle]
  var hoverStateChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BorderColorCircle]
  var maxChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var minChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var orientationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal
  ]
  var preserveAspectRatioChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.meet
  ]
  var readonlyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var selectedStateChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BorderColorCircle]
  var stepChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0DOT5` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`1`
  ]
  var thresholdsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojgaugeMod.ojRatingGaugeNs.Threshold]]
  var tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_718918166
  ]
  var transientValueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null]
  var unselectedStateChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BorderColorCircle]
  var valueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null]
  var visualEffectsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
}

object ojRatingGaugeEventMap {
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
    change: stdLib.Event,
    changedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean],
    changedStateChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BorderColorCircle],
    click: stdLib.MouseEvent,
    close: stdLib.Event,
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
    hoverStateChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BorderColorCircle],
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
    maxChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    minChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    orientationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal
    ],
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
    preserveAspectRatioChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.meet
    ],
    progress: stdLib.ProgressEvent,
    ratechange: stdLib.Event,
    readonlyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean],
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    scroll: stdLib.UIEvent,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.UIEvent,
    selectedStateChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BorderColorCircle],
    stalled: stdLib.Event,
    stepChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0DOT5` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`1`
    ],
    submit: stdLib.Event,
    suspend: stdLib.Event,
    thresholdsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojgaugeMod.ojRatingGaugeNs.Threshold]],
    timeupdate: stdLib.Event,
    toggle: stdLib.Event,
    tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_718918166
    ],
    touchcancel: stdLib.TouchEvent,
    touchend: stdLib.TouchEvent,
    touchmove: stdLib.TouchEvent,
    touchstart: stdLib.TouchEvent,
    trackResizeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    transientValueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null],
    transitioncancel: stdLib.TransitionEvent,
    transitionend: stdLib.TransitionEvent,
    transitionrun: stdLib.TransitionEvent,
    transitionstart: stdLib.TransitionEvent,
    translationsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Object | scala.Null],
    unselectedStateChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BorderColorCircle],
    valueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null],
    visualEffectsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ],
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojRatingGaugeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, changedChanged = changedChanged, changedStateChanged = changedStateChanged, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, hoverStateChanged = hoverStateChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, maxChanged = maxChanged, minChanged = minChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, orientationChanged = orientationChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, preserveAspectRatioChanged = preserveAspectRatioChanged, progress = progress, ratechange = ratechange, readonlyChanged = readonlyChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectedStateChanged = selectedStateChanged, stalled = stalled, stepChanged = stepChanged, submit = submit, suspend = suspend, thresholdsChanged = thresholdsChanged, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transientValueChanged = transientValueChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, unselectedStateChanged = unselectedStateChanged, valueChanged = valueChanged, visualEffectsChanged = visualEffectsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojRatingGaugeEventMap]
  }
}

