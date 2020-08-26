package typings.oracleOraclejet.ojtableMod

import typings.oracleOraclejet.anon.ColumnKey
import typings.oracleOraclejet.anon.DropReorder
import typings.oracleOraclejet.anon.Field
import typings.oracleOraclejet.anon.FooterClassName
import typings.oracleOraclejet.anon.MaxCount
import typings.oracleOraclejet.anon.RowHeader
import typings.oracleOraclejet.anon.`21`
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

@js.native
trait ojTableEventMap[K, D] extends baseComponentEventMap[ojTableSettableProperties[K, D]] {
  var accessibilityChanged: JetElementCustomEvent[RowHeader] = js.native
  var asChanged: JetElementCustomEvent[String] = js.native
  var columnsChanged: JetElementCustomEvent[(js.Array[Field[K, D]]) | Null] = js.native
  var columnsDefaultChanged: JetElementCustomEvent[FooterClassName[K, D]] = js.native
  var currentRowChanged: JetElementCustomEvent[CurrentRow[K] | Null] = js.native
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null] = js.native
  var displayChanged: JetElementCustomEvent[list | grid] = js.native
  var dndChanged: JetElementCustomEvent[DropReorder[K, D]] = js.native
  var editModeChanged: JetElementCustomEvent[none | rowEdit] = js.native
  var firstSelectedRowChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
  ] = js.native
  var horizontalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled] = js.native
  var ojAnimateEnd: typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateEnd = js.native
  var ojAnimateStart: typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateStart = js.native
  var ojBeforeCurrentRow: typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeCurrentRow[K] = js.native
  var ojBeforeRowEdit: typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEdit = js.native
  var ojBeforeRowEditEnd: typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEditEnd = js.native
  var ojSort: typings.oracleOraclejet.ojtableMod.ojTable.ojSort = js.native
  var rowRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  ] = js.native
  var scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll] = js.native
  var scrollPolicyOptionsChanged: JetElementCustomEvent[MaxCount] = js.native
  var scrollPositionChanged: JetElementCustomEvent[ColumnKey] = js.native
  var selectionChanged: JetElementCustomEvent[
    js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ]
  ] = js.native
  var selectionModeChanged: JetElementCustomEvent[`21`] = js.native
  var selectionRequiredChanged: JetElementCustomEvent[Boolean] = js.native
  var verticalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled] = js.native
}

object ojTableEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    accessibilityChanged: JetElementCustomEvent[RowHeader],
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
    columnsChanged: JetElementCustomEvent[(js.Array[Field[K, D]]) | Null],
    columnsDefaultChanged: JetElementCustomEvent[FooterClassName[K, D]],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    currentRowChanged: JetElementCustomEvent[CurrentRow[K] | Null],
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
    displayChanged: JetElementCustomEvent[list | grid],
    dndChanged: JetElementCustomEvent[DropReorder[K, D]],
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
    scrollPolicyOptionsChanged: JetElementCustomEvent[MaxCount],
    scrollPositionChanged: JetElementCustomEvent[ColumnKey],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[
      js.Array[
        (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
      ]
    ],
    selectionModeChanged: JetElementCustomEvent[`21`],
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
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], accessibilityChanged = accessibilityChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], columnsChanged = columnsChanged.asInstanceOf[js.Any], columnsDefaultChanged = columnsDefaultChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentRowChanged = currentRowChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayChanged = displayChanged.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], editModeChanged = editModeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], firstSelectedRowChanged = firstSelectedRowChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], horizontalGridVisibleChanged = horizontalGridVisibleChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeCurrentRow = ojBeforeCurrentRow.asInstanceOf[js.Any], ojBeforeRowEdit = ojBeforeRowEdit.asInstanceOf[js.Any], ojBeforeRowEditEnd = ojBeforeRowEditEnd.asInstanceOf[js.Any], ojSort = ojSort.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowRendererChanged = rowRendererChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPolicyChanged = scrollPolicyChanged.asInstanceOf[js.Any], scrollPolicyOptionsChanged = scrollPolicyOptionsChanged.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRequiredChanged = selectionRequiredChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], verticalGridVisibleChanged = verticalGridVisibleChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTableEventMap[K, D]]
  }
  @scala.inline
  implicit class ojTableEventMapOps[Self <: ojTableEventMap[_, _], K, D] (val x: Self with (ojTableEventMap[K, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessibilityChanged(value: JetElementCustomEvent[RowHeader]): Self = this.set("accessibilityChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsChanged(value: JetElementCustomEvent[String]): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsChanged(value: JetElementCustomEvent[(js.Array[Field[K, D]]) | Null]): Self = this.set("columnsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsDefaultChanged(value: JetElementCustomEvent[FooterClassName[K, D]]): Self = this.set("columnsDefaultChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentRowChanged(value: JetElementCustomEvent[CurrentRow[K] | Null]): Self = this.set("currentRowChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataChanged(value: JetElementCustomEvent[(DataProvider[K, D]) | Null]): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayChanged(value: JetElementCustomEvent[list | grid]): Self = this.set("displayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDndChanged(value: JetElementCustomEvent[DropReorder[K, D]]): Self = this.set("dndChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditModeChanged(value: JetElementCustomEvent[none | rowEdit]): Self = this.set("editModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstSelectedRowChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
        ]
    ): Self = this.set("firstSelectedRowChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalGridVisibleChanged(value: JetElementCustomEvent[auto | enabled | disabled]): Self = this.set("horizontalGridVisibleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjAnimateEnd(value: ojAnimateEnd): Self = this.set("ojAnimateEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjAnimateStart(value: ojAnimateStart): Self = this.set("ojAnimateStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeCurrentRow(value: ojBeforeCurrentRow[K]): Self = this.set("ojBeforeCurrentRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeRowEdit(value: ojBeforeRowEdit): Self = this.set("ojBeforeRowEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeRowEditEnd(value: ojBeforeRowEditEnd): Self = this.set("ojBeforeRowEditEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjSort(value: ojSort): Self = this.set("ojSort", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
        ]
    ): Self = this.set("rowRendererChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPolicyChanged(value: JetElementCustomEvent[auto | loadMoreOnScroll]): Self = this.set("scrollPolicyChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPolicyOptionsChanged(value: JetElementCustomEvent[MaxCount]): Self = this.set("scrollPolicyOptionsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPositionChanged(value: JetElementCustomEvent[ColumnKey]): Self = this.set("scrollPositionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(
      value: JetElementCustomEvent[
          js.Array[
            (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
          ]
        ]
    ): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionModeChanged(value: JetElementCustomEvent[`21`]): Self = this.set("selectionModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionRequiredChanged(value: JetElementCustomEvent[Boolean]): Self = this.set("selectionRequiredChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalGridVisibleChanged(value: JetElementCustomEvent[auto | enabled | disabled]): Self = this.set("verticalGridVisibleChanged", value.asInstanceOf[js.Any])
  }
  
}

