package typings.oracleOraclejet.ojtableMod

import typings.oracleOraclejet.Anon19
import typings.oracleOraclejet.AnonColumnKey
import typings.oracleOraclejet.AnonDropReorder
import typings.oracleOraclejet.AnonField
import typings.oracleOraclejet.AnonFooterClassName
import typings.oracleOraclejet.AnonMaxCount
import typings.oracleOraclejet.AnonRowHeader
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import typings.oracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateEnd
import typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateStart
import typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeCurrentRow
import typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEdit
import typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEditEnd
import typings.oracleOraclejet.ojtableMod.ojTable.ojSort
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.grid
import typings.oracleOraclejet.oracleOraclejetStrings.list
import typings.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.rowEdit
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.Event_
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
  var accessibilityChanged: JetElementCustomEvent[AnonRowHeader]
  var asChanged: JetElementCustomEvent[String]
  var columnsChanged: JetElementCustomEvent[(js.Array[AnonField[K, D]]) | Null]
  var columnsDefaultChanged: JetElementCustomEvent[AnonFooterClassName[K, D]]
  var currentRowChanged: JetElementCustomEvent[CurrentRow[K] | Null]
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  var displayChanged: JetElementCustomEvent[list | grid]
  var dndChanged: JetElementCustomEvent[AnonDropReorder[K, D]]
  var editModeChanged: JetElementCustomEvent[none | rowEdit]
  var firstSelectedRowChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
  ]
  var horizontalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled]
  var ojAnimateEnd: typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateEnd
  var ojAnimateStart: typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateStart
  var ojBeforeCurrentRow: typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeCurrentRow[K]
  var ojBeforeRowEdit: typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEdit
  var ojBeforeRowEditEnd: typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEditEnd
  var ojSort: typings.oracleOraclejet.ojtableMod.ojTable.ojSort
  var rowRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  ]
  var scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll]
  var scrollPolicyOptionsChanged: JetElementCustomEvent[AnonMaxCount]
  var scrollPositionChanged: JetElementCustomEvent[AnonColumnKey]
  var selectionChanged: JetElementCustomEvent[
    js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ]
  ]
  var selectionModeChanged: JetElementCustomEvent[Anon19]
  var selectionRequiredChanged: JetElementCustomEvent[Boolean]
  var verticalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled]
}

object ojTableEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    accessibilityChanged: JetElementCustomEvent[AnonRowHeader],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    change: Event_,
    click: MouseEvent,
    close: Event_,
    columnsChanged: JetElementCustomEvent[(js.Array[AnonField[K, D]]) | Null],
    columnsDefaultChanged: JetElementCustomEvent[AnonFooterClassName[K, D]],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event_,
    currentRowChanged: JetElementCustomEvent[CurrentRow[K] | Null],
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
    displayChanged: JetElementCustomEvent[list | grid],
    dndChanged: JetElementCustomEvent[AnonDropReorder[K, D]],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event_,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event_,
    editModeChanged: JetElementCustomEvent[none | rowEdit],
    emptied: Event_,
    ended: Event_,
    error: ErrorEvent,
    firstSelectedRowChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
    ],
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event_,
    fullscreenerror: Event_,
    gotpointercapture: PointerEvent,
    horizontalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled],
    input: Event_,
    invalid: Event_,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
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
    pause: Event_,
    play: Event_,
    playing: Event_,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    progress: ProgressEvent[EventTarget],
    ratechange: Event_,
    reset: Event_,
    resize: UIEvent,
    rowRendererChanged: JetElementCustomEvent[
      (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
    ],
    scroll: Event_,
    scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll],
    scrollPolicyOptionsChanged: JetElementCustomEvent[AnonMaxCount],
    scrollPositionChanged: JetElementCustomEvent[AnonColumnKey],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionChanged: JetElementCustomEvent[
      js.Array[
        (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
      ]
    ],
    selectionModeChanged: JetElementCustomEvent[Anon19],
    selectionRequiredChanged: JetElementCustomEvent[Boolean],
    selectionchange: Event_,
    selectstart: Event_,
    stalled: Event_,
    submit: Event_,
    suspend: Event_,
    timeupdate: Event_,
    toggle: Event_,
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
    volumechange: Event_,
    waiting: Event_,
    wheel: WheelEvent
  ): ojTableEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], accessibilityChanged = accessibilityChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], columnsChanged = columnsChanged.asInstanceOf[js.Any], columnsDefaultChanged = columnsDefaultChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentRowChanged = currentRowChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayChanged = displayChanged.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], editModeChanged = editModeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], firstSelectedRowChanged = firstSelectedRowChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], horizontalGridVisibleChanged = horizontalGridVisibleChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeCurrentRow = ojBeforeCurrentRow.asInstanceOf[js.Any], ojBeforeRowEdit = ojBeforeRowEdit.asInstanceOf[js.Any], ojBeforeRowEditEnd = ojBeforeRowEditEnd.asInstanceOf[js.Any], ojSort = ojSort.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowRendererChanged = rowRendererChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPolicyChanged = scrollPolicyChanged.asInstanceOf[js.Any], scrollPolicyOptionsChanged = scrollPolicyOptionsChanged.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRequiredChanged = selectionRequiredChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], verticalGridVisibleChanged = verticalGridVisibleChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojTableEventMap[K, D]]
  }
}

