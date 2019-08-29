package typings.atOracleOraclejet.ojdatagridMod

import typings.atOracleOraclejet.Anon_Cell
import typings.atOracleOraclejet.Anon_ClassName
import typings.atOracleOraclejet.Anon_Column
import typings.atOracleOraclejet.Anon_ColumnColumnEnd
import typings.atOracleOraclejet.Anon_ColumnIndex
import typings.atOracleOraclejet.Anon_Hidden
import typings.atOracleOraclejet.Anon_MaxColumnCount
import typings.atOracleOraclejet.Anon_Reorder
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentEventMap
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.cellEdit
import typings.atOracleOraclejet.atOracleOraclejetStrings.cellNavigation
import typings.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.scroll
import typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.CurrentCell
import typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.Selection
import typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojBeforeCurrentCell
import typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojBeforeEdit
import typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojBeforeEditEnd
import typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojResize
import typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojScroll
import typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojSort
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
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

trait ojDataGridEventMap[K, D] extends baseComponentEventMap[ojDataGridSettableProperties[K, D]] {
  var bandingIntervalChanged: JetElementCustomEvent[Anon_Column]
  var cellChanged: JetElementCustomEvent[Anon_ClassName[K, D]]
  var currentCellChanged: JetElementCustomEvent[CurrentCell[K] | Null]
  var dataChanged: JetElementCustomEvent[DataProvider[K, D]]
  var dndChanged: JetElementCustomEvent[Anon_Reorder]
  var editModeChanged: JetElementCustomEvent[none | cellNavigation | cellEdit]
  var gridlinesChanged: JetElementCustomEvent[Anon_Hidden]
  var headerChanged: JetElementCustomEvent[Anon_ColumnColumnEnd[K, D]]
  var ojBeforeCurrentCell: typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojBeforeCurrentCell[K]
  var ojBeforeEdit: typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojBeforeEdit[K, D]
  var ojBeforeEditEnd: typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojBeforeEditEnd[K, D]
  var ojResize: typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojResize
  var ojScroll: typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojScroll
  var ojSort: typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.ojSort
  var scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll | scroll]
  var scrollPolicyOptionsChanged: JetElementCustomEvent[Anon_MaxColumnCount]
  var scrollPositionChanged: JetElementCustomEvent[Anon_ColumnIndex[K]]
  var selectionChanged: JetElementCustomEvent[js.Array[Selection[K]]]
  var selectionModeChanged: JetElementCustomEvent[Anon_Cell]
}

object ojDataGridEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    bandingIntervalChanged: JetElementCustomEvent[Anon_Column],
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    cellChanged: JetElementCustomEvent[Anon_ClassName[K, D]],
    change: Event,
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    currentCellChanged: JetElementCustomEvent[CurrentCell[K] | Null],
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[DataProvider[K, D]],
    dblclick: MouseEvent,
    dndChanged: JetElementCustomEvent[Anon_Reorder],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    editModeChanged: JetElementCustomEvent[none | cellNavigation | cellEdit],
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    gridlinesChanged: JetElementCustomEvent[Anon_Hidden],
    headerChanged: JetElementCustomEvent[Anon_ColumnColumnEnd[K, D]],
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
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojBeforeCurrentCell: ojBeforeCurrentCell[K],
    ojBeforeEdit: ojBeforeEdit[K, D],
    ojBeforeEditEnd: ojBeforeEditEnd[K, D],
    ojResize: ojResize,
    ojScroll: ojScroll,
    ojSort: ojSort,
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
    scroll: Event,
    scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll | scroll],
    scrollPolicyOptionsChanged: JetElementCustomEvent[Anon_MaxColumnCount],
    scrollPositionChanged: JetElementCustomEvent[Anon_ColumnIndex[K]],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[Selection[K]]],
    selectionModeChanged: JetElementCustomEvent[Anon_Cell],
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    submit: Event,
    suspend: Event,
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
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojDataGridEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, bandingIntervalChanged = bandingIntervalChanged, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, cellChanged = cellChanged, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, currentCellChanged = currentCellChanged, cut = cut, dataChanged = dataChanged, dblclick = dblclick, dndChanged = dndChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, editModeChanged = editModeChanged, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, gridlinesChanged = gridlinesChanged, headerChanged = headerChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojBeforeCurrentCell = ojBeforeCurrentCell, ojBeforeEdit = ojBeforeEdit, ojBeforeEditEnd = ojBeforeEditEnd, ojResize = ojResize, ojScroll = ojScroll, ojSort = ojSort, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, scrollPolicyChanged = scrollPolicyChanged, scrollPolicyOptionsChanged = scrollPolicyOptionsChanged, scrollPositionChanged = scrollPositionChanged, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojDataGridEventMap[K, D]]
  }
}

