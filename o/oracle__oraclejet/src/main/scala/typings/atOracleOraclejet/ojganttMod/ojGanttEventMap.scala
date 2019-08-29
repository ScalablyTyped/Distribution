package typings.atOracleOraclejet.ojganttMod

import typings.atOracleOraclejet.Anon_AutoBaseline
import typings.atOracleOraclejet.Anon_AutoHidden
import typings.atOracleOraclejet.Anon_BaselineDate
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefault
import typings.atOracleOraclejet.Anon_Converter
import typings.atOracleOraclejet.Anon_HeightNumber
import typings.atOracleOraclejet.Anon_Label
import typings.atOracleOraclejet.Anon_Move
import typings.atOracleOraclejet.Anon_OffsetY
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typings.atOracleOraclejet.ojganttMod.ojGanttNs.ReferenceObject
import typings.atOracleOraclejet.ojganttMod.ojGanttNs.ojMove
import typings.atOracleOraclejet.ojganttMod.ojGanttNs.ojViewportChange
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

trait ojGanttEventMap[K1, K2, D1, D2] extends dvtBaseComponentEventMap[ojGanttSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  var asChanged: JetElementCustomEvent[String]
  var axisPositionChanged: JetElementCustomEvent[bottom | top]
  var dependencyDataChanged: JetElementCustomEvent[js.UndefOr[DataProvider[K1, D1]]]
  var dndChanged: JetElementCustomEvent[Anon_Move]
  var endChanged: JetElementCustomEvent[String]
  var gridlinesChanged: JetElementCustomEvent[Anon_AutoHidden]
  var majorAxisChanged: JetElementCustomEvent[Anon_Converter]
  var minorAxisChanged: JetElementCustomEvent[Anon_Converter]
  var ojMove: typings.atOracleOraclejet.ojganttMod.ojGanttNs.ojMove[K2, D2]
  var ojViewportChange: typings.atOracleOraclejet.ojganttMod.ojGanttNs.ojViewportChange
  var referenceObjectsChanged: JetElementCustomEvent[js.Array[ReferenceObject]]
  var rowAxisChanged: JetElementCustomEvent[Anon_Label[K2, D2]]
  var rowDefaultsChanged: JetElementCustomEvent[Anon_HeightNumber]
  var scrollPositionChanged: JetElementCustomEvent[Anon_OffsetY]
  var selectionChanged: JetElementCustomEvent[js.Array[K2]]
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none]
  var startChanged: JetElementCustomEvent[String]
  var taskDataChanged: JetElementCustomEvent[js.UndefOr[DataProvider[K2, D2]]]
  var taskDefaultsChanged: JetElementCustomEvent[Anon_AutoBaseline]
  var tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]]
  var valueFormatsChanged: JetElementCustomEvent[Anon_BaselineDate]
  var viewportEndChanged: JetElementCustomEvent[String]
  var viewportStartChanged: JetElementCustomEvent[String]
}

object ojGanttEventMap {
  @scala.inline
  def apply[K1, K2, D1, D2](
    abort: UIEvent,
    animationOnDataChangeChanged: JetElementCustomEvent[auto | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | none],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    axisPositionChanged: JetElementCustomEvent[bottom | top],
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    dependencyDataChanged: JetElementCustomEvent[js.UndefOr[DataProvider[K1, D1]]],
    dndChanged: JetElementCustomEvent[Anon_Move],
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
    endChanged: JetElementCustomEvent[String],
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    gridlinesChanged: JetElementCustomEvent[Anon_AutoHidden],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    majorAxisChanged: JetElementCustomEvent[Anon_Converter],
    minorAxisChanged: JetElementCustomEvent[Anon_Converter],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojMove: ojMove[K2, D2],
    ojViewportChange: ojViewportChange,
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
    rowAxisChanged: JetElementCustomEvent[Anon_Label[K2, D2]],
    rowDefaultsChanged: JetElementCustomEvent[Anon_HeightNumber],
    scroll: Event,
    scrollPositionChanged: JetElementCustomEvent[Anon_OffsetY],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[K2]],
    selectionModeChanged: JetElementCustomEvent[single | multiple | none],
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    startChanged: JetElementCustomEvent[String],
    submit: Event,
    suspend: Event,
    taskDataChanged: JetElementCustomEvent[js.UndefOr[DataProvider[K2, D2]]],
    taskDefaultsChanged: JetElementCustomEvent[Anon_AutoBaseline],
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]],
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
    valueFormatsChanged: JetElementCustomEvent[Anon_BaselineDate],
    viewportEndChanged: JetElementCustomEvent[String],
    viewportStartChanged: JetElementCustomEvent[String],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojGanttEventMap[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(abort = abort, animationOnDataChangeChanged = animationOnDataChangeChanged, animationOnDisplayChanged = animationOnDisplayChanged, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, axisPositionChanged = axisPositionChanged, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, dependencyDataChanged = dependencyDataChanged, dndChanged = dndChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, endChanged = endChanged, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, gridlinesChanged = gridlinesChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, majorAxisChanged = majorAxisChanged, minorAxisChanged = minorAxisChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojMove = ojMove, ojViewportChange = ojViewportChange, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, referenceObjectsChanged = referenceObjectsChanged, reset = reset, resize = resize, rowAxisChanged = rowAxisChanged, rowDefaultsChanged = rowDefaultsChanged, scroll = scroll, scrollPositionChanged = scrollPositionChanged, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, startChanged = startChanged, submit = submit, suspend = suspend, taskDataChanged = taskDataChanged, taskDefaultsChanged = taskDefaultsChanged, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, valueFormatsChanged = valueFormatsChanged, viewportEndChanged = viewportEndChanged, viewportStartChanged = viewportStartChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojGanttEventMap[K1, K2, D1, D2]]
  }
}

