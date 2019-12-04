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
import typings.atOracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typings.atOracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typings.atOracleOraclejet.ojtableMod.ojTable.CurrentRow
import typings.atOracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typings.atOracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typings.atOracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import typings.atOracleOraclejet.ojtableMod.ojTable.ojAnimateEnd
import typings.atOracleOraclejet.ojtableMod.ojTable.ojAnimateStart
import typings.atOracleOraclejet.ojtableMod.ojTable.ojBeforeCurrentRow
import typings.atOracleOraclejet.ojtableMod.ojTable.ojBeforeRowEdit
import typings.atOracleOraclejet.ojtableMod.ojTable.ojBeforeRowEditEnd
import typings.atOracleOraclejet.ojtableMod.ojTable.ojSort
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
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
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
  ]
  var horizontalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled]
  var ojAnimateEnd: typings.atOracleOraclejet.ojtableMod.ojTable.ojAnimateEnd
  var ojAnimateStart: typings.atOracleOraclejet.ojtableMod.ojTable.ojAnimateStart
  var ojBeforeCurrentRow: typings.atOracleOraclejet.ojtableMod.ojTable.ojBeforeCurrentRow[K]
  var ojBeforeRowEdit: typings.atOracleOraclejet.ojtableMod.ojTable.ojBeforeRowEdit
  var ojBeforeRowEditEnd: typings.atOracleOraclejet.ojtableMod.ojTable.ojBeforeRowEditEnd
  var ojSort: typings.atOracleOraclejet.ojtableMod.ojTable.ojSort
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
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
    ],
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
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
    progress: ProgressEvent[EventTarget],
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
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], accessibilityChanged = accessibilityChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], columnsChanged = columnsChanged.asInstanceOf[js.Any], columnsDefaultChanged = columnsDefaultChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentRowChanged = currentRowChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayChanged = displayChanged.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], editModeChanged = editModeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], firstSelectedRowChanged = firstSelectedRowChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], horizontalGridVisibleChanged = horizontalGridVisibleChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeCurrentRow = ojBeforeCurrentRow.asInstanceOf[js.Any], ojBeforeRowEdit = ojBeforeRowEdit.asInstanceOf[js.Any], ojBeforeRowEditEnd = ojBeforeRowEditEnd.asInstanceOf[js.Any], ojSort = ojSort.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowRendererChanged = rowRendererChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPolicyChanged = scrollPolicyChanged.asInstanceOf[js.Any], scrollPolicyOptionsChanged = scrollPolicyOptionsChanged.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRequiredChanged = selectionRequiredChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], verticalGridVisibleChanged = verticalGridVisibleChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojTableEventMap[K, D]]
  }
}

