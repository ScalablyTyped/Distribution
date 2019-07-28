package typings.atOracleOraclejet.ojtableMod

import typings.atOracleOraclejet.Anon_AutoClassName
import typings.atOracleOraclejet.Anon_AutoClassNameContext
import typings.atOracleOraclejet.Anon_ColumnIndexColumnKey
import typings.atOracleOraclejet.Anon_ColumnMultiple
import typings.atOracleOraclejet.Anon_DragDropReorderAnonColumns
import typings.atOracleOraclejet.Anon_FetchSizeMaxCount
import typings.atOracleOraclejet.Anon_RowHeader
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentEventMap
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.grid
import typings.atOracleOraclejet.atOracleOraclejetStrings.list
import typings.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowEdit
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ColumnSelectionEnd
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ColumnSelectionStart
import typings.atOracleOraclejet.ojtableMod.ojTableNs.CurrentRow
import typings.atOracleOraclejet.ojtableMod.ojTableNs.RowRendererContext
import typings.atOracleOraclejet.ojtableMod.ojTableNs.RowSelectionEnd
import typings.atOracleOraclejet.ojtableMod.ojTableNs.RowSelectionStart
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ojAnimateEnd
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ojAnimateStart
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ojBeforeCurrentRow
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ojBeforeRowEdit
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ojBeforeRowEditEnd
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ojSort
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
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

trait ojTableEventMap[K, D] extends baseComponentEventMap[ojTableSettableProperties[K, D]] {
  var accessibilityChanged: JetElementCustomEvent[Anon_RowHeader]
  var asChanged: JetElementCustomEvent[String]
  var columnsChanged: JetElementCustomEvent[(js.Array[Anon_AutoClassName[K, D]]) | Null]
  var columnsDefaultChanged: JetElementCustomEvent[Anon_AutoClassNameContext[K, D]]
  var currentRowChanged: JetElementCustomEvent[CurrentRow[K] | Null]
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  var displayChanged: JetElementCustomEvent[list | grid]
  var dndChanged: JetElementCustomEvent[Anon_DragDropReorderAnonColumns[K, D]]
  var editModeChanged: JetElementCustomEvent[none | rowEdit]
  var firstSelectedRowChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
  ]
  var horizontalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled]
  var ojAnimateEnd: typings.atOracleOraclejet.ojtableMod.ojTableNs.ojAnimateEnd
  var ojAnimateStart: typings.atOracleOraclejet.ojtableMod.ojTableNs.ojAnimateStart
  var ojBeforeCurrentRow: typings.atOracleOraclejet.ojtableMod.ojTableNs.ojBeforeCurrentRow[K]
  var ojBeforeRowEdit: typings.atOracleOraclejet.ojtableMod.ojTableNs.ojBeforeRowEdit
  var ojBeforeRowEditEnd: typings.atOracleOraclejet.ojtableMod.ojTableNs.ojBeforeRowEditEnd
  var ojSort: typings.atOracleOraclejet.ojtableMod.ojTableNs.ojSort
  var rowRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  ]
  var scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll]
  var scrollPolicyOptionsChanged: JetElementCustomEvent[Anon_FetchSizeMaxCount]
  var scrollPositionChanged: JetElementCustomEvent[Anon_ColumnIndexColumnKey]
  var selectionChanged: JetElementCustomEvent[
    js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ]
  ]
  var selectionModeChanged: JetElementCustomEvent[Anon_ColumnMultiple]
  var selectionRequiredChanged: JetElementCustomEvent[Boolean]
  var verticalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled]
}

object ojTableEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    accessibilityChanged: JetElementCustomEvent[Anon_RowHeader],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    columnsChanged: JetElementCustomEvent[(js.Array[Anon_AutoClassName[K, D]]) | Null],
    columnsDefaultChanged: JetElementCustomEvent[Anon_AutoClassNameContext[K, D]],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    currentRowChanged: JetElementCustomEvent[CurrentRow[K] | Null],
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
    displayChanged: JetElementCustomEvent[list | grid],
    dndChanged: JetElementCustomEvent[Anon_DragDropReorderAnonColumns[K, D]],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    editModeChanged: JetElementCustomEvent[none | rowEdit],
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    firstSelectedRowChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
    ],
    focus: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    horizontalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojAnimateEnd: ojAnimateEnd,
    ojAnimateStart: ojAnimateStart,
    ojBeforeCurrentRow: ojBeforeCurrentRow[K],
    ojBeforeRowEdit: ojBeforeRowEdit,
    ojBeforeRowEditEnd: ojBeforeRowEditEnd,
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
    progress: ProgressEvent,
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    rowRendererChanged: JetElementCustomEvent[
      (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
    ],
    scroll: Event,
    scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll],
    scrollPolicyOptionsChanged: JetElementCustomEvent[Anon_FetchSizeMaxCount],
    scrollPositionChanged: JetElementCustomEvent[Anon_ColumnIndexColumnKey],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[
      js.Array[
        (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
      ]
    ],
    selectionModeChanged: JetElementCustomEvent[Anon_ColumnMultiple],
    selectionRequiredChanged: JetElementCustomEvent[Boolean],
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
    verticalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojTableEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, accessibilityChanged = accessibilityChanged, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, columnsChanged = columnsChanged, columnsDefaultChanged = columnsDefaultChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, currentRowChanged = currentRowChanged, cut = cut, dataChanged = dataChanged, dblclick = dblclick, displayChanged = displayChanged, dndChanged = dndChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, editModeChanged = editModeChanged, emptied = emptied, ended = ended, error = error, firstSelectedRowChanged = firstSelectedRowChanged, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, horizontalGridVisibleChanged = horizontalGridVisibleChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeCurrentRow = ojBeforeCurrentRow, ojBeforeRowEdit = ojBeforeRowEdit, ojBeforeRowEditEnd = ojBeforeRowEditEnd, ojSort = ojSort, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rowRendererChanged = rowRendererChanged, scroll = scroll, scrollPolicyChanged = scrollPolicyChanged, scrollPolicyOptionsChanged = scrollPolicyOptionsChanged, scrollPositionChanged = scrollPositionChanged, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionRequiredChanged = selectionRequiredChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, verticalGridVisibleChanged = verticalGridVisibleChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojTableEventMap[K, D]]
  }
}

