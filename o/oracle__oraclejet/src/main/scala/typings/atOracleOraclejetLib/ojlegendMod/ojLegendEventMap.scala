package typings
package atOracleOraclejetLib.ojlegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLegendEventMap[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentEventMap[ojLegendSettableProperties[K, D]] {
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null]
  var drillingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ]
  var expandedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K] | scala.Null]
  var halignChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  ]
  var hiddenCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]]
  var hideAndShowBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ]
  var highlightedCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]]
  var hoverBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var hoverBehaviorDelayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var ojDrill: atOracleOraclejetLib.ojlegendMod.ojLegendNs.ojDrill
  var orientationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  ]
  var scrollingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.asNeeded
  ]
  var symbolHeightChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var symbolWidthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var textStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]]
  var valignChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.middle | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
  ]
}

object ojLegendEventMap {
  @scala.inline
  def apply[K, D](
    abort: stdLib.UIEvent,
    animationcancel: stdLib.AnimationEvent,
    animationend: stdLib.AnimationEvent,
    animationiteration: stdLib.AnimationEvent,
    animationstart: stdLib.AnimationEvent,
    asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    auxclick: stdLib.Event,
    blur: stdLib.FocusEvent,
    cancel: stdLib.Event,
    canplay: stdLib.Event,
    canplaythrough: stdLib.Event,
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    contextmenu: stdLib.MouseEvent,
    copy: stdLib.ClipboardEvent,
    cuechange: stdLib.Event,
    cut: stdLib.ClipboardEvent,
    dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null],
    dblclick: stdLib.MouseEvent,
    drag: stdLib.DragEvent,
    dragend: stdLib.DragEvent,
    dragenter: stdLib.DragEvent,
    dragexit: stdLib.Event,
    dragleave: stdLib.DragEvent,
    dragover: stdLib.DragEvent,
    dragstart: stdLib.DragEvent,
    drillingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    drop: stdLib.DragEvent,
    durationchange: stdLib.Event,
    emptied: stdLib.Event,
    ended: stdLib.Event,
    error: stdLib.ErrorEvent,
    expandedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K] | scala.Null],
    focus: stdLib.FocusEvent,
    fullscreenchange: stdLib.Event,
    fullscreenerror: stdLib.Event,
    gotpointercapture: stdLib.PointerEvent,
    halignChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
    ],
    hiddenCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]],
    hideAndShowBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    highlightedCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]],
    hoverBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    hoverBehaviorDelayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
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
    ojDrill: atOracleOraclejetLib.ojlegendMod.ojLegendNs.ojDrill,
    orientationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
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
    progress: stdLib.ProgressEvent,
    ratechange: stdLib.Event,
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    scroll: stdLib.Event,
    scrollingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.asNeeded
    ],
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.Event,
    selectionchange: stdLib.Event,
    selectstart: stdLib.Event,
    stalled: stdLib.Event,
    submit: stdLib.Event,
    suspend: stdLib.Event,
    symbolHeightChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    symbolWidthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    textStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]],
    timeupdate: stdLib.Event,
    toggle: stdLib.Event,
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
    valignChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.middle | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
    ],
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojLegendEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dataChanged = dataChanged, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillingChanged = drillingChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, expandedChanged = expandedChanged, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, halignChanged = halignChanged, hiddenCategoriesChanged = hiddenCategoriesChanged, hideAndShowBehaviorChanged = hideAndShowBehaviorChanged, highlightedCategoriesChanged = highlightedCategoriesChanged, hoverBehaviorChanged = hoverBehaviorChanged, hoverBehaviorDelayChanged = hoverBehaviorDelayChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojDrill = ojDrill, orientationChanged = orientationChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, scrollingChanged = scrollingChanged, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, symbolHeightChanged = symbolHeightChanged, symbolWidthChanged = symbolWidthChanged, textStyleChanged = textStyleChanged, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, valignChanged = valignChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojLegendEventMap[K, D]]
  }
}

