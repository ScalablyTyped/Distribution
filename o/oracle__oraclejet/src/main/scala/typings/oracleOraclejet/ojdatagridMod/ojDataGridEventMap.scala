package typings.oracleOraclejet.ojdatagridMod

import typings.oracleOraclejet.anon.Cell
import typings.oracleOraclejet.anon.ClassName
import typings.oracleOraclejet.anon.Column
import typings.oracleOraclejet.anon.ColumnEnd
import typings.oracleOraclejet.anon.ColumnIndex
import typings.oracleOraclejet.anon.Horizontal
import typings.oracleOraclejet.anon.MaxColumnCount
import typings.oracleOraclejet.anon.Reorder
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.Selection
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeCurrentCell
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeEdit
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeEditEnd
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojResize
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojScroll
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojSort
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.cellEdit
import typings.oracleOraclejet.oracleOraclejetStrings.cellNavigation
import typings.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.scroll
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

@js.native
trait ojDataGridEventMap[K, D] extends baseComponentEventMap[ojDataGridSettableProperties[K, D]] {
  var bandingIntervalChanged: JetElementCustomEvent[Column] = js.native
  var cellChanged: JetElementCustomEvent[ClassName[K, D]] = js.native
  var currentCellChanged: JetElementCustomEvent[CurrentCell[K] | Null] = js.native
  var dataChanged: JetElementCustomEvent[DataProvider[K, D]] = js.native
  var dndChanged: JetElementCustomEvent[Reorder] = js.native
  var editModeChanged: JetElementCustomEvent[none | cellNavigation | cellEdit] = js.native
  var gridlinesChanged: JetElementCustomEvent[Horizontal] = js.native
  var headerChanged: JetElementCustomEvent[ColumnEnd[K, D]] = js.native
  var ojBeforeCurrentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeCurrentCell[K] = js.native
  var ojBeforeEdit: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeEdit[K, D] = js.native
  var ojBeforeEditEnd: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeEditEnd[K, D] = js.native
  var ojResize: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojResize = js.native
  var ojScroll: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojScroll = js.native
  var ojSort: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojSort = js.native
  var scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll | scroll] = js.native
  var scrollPolicyOptionsChanged: JetElementCustomEvent[MaxColumnCount] = js.native
  var scrollPositionChanged: JetElementCustomEvent[ColumnIndex[K]] = js.native
  var selectionChanged: JetElementCustomEvent[js.Array[Selection[K]]] = js.native
  var selectionModeChanged: JetElementCustomEvent[Cell] = js.native
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
    bandingIntervalChanged: JetElementCustomEvent[Column],
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    cellChanged: JetElementCustomEvent[ClassName[K, D]],
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
    dndChanged: JetElementCustomEvent[Reorder],
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
    gridlinesChanged: JetElementCustomEvent[Horizontal],
    headerChanged: JetElementCustomEvent[ColumnEnd[K, D]],
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
    scrollPolicyOptionsChanged: JetElementCustomEvent[MaxColumnCount],
    scrollPositionChanged: JetElementCustomEvent[ColumnIndex[K]],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[Selection[K]]],
    selectionModeChanged: JetElementCustomEvent[Cell],
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
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], bandingIntervalChanged = bandingIntervalChanged.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], cellChanged = cellChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentCellChanged = currentCellChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], editModeChanged = editModeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], gridlinesChanged = gridlinesChanged.asInstanceOf[js.Any], headerChanged = headerChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojBeforeCurrentCell = ojBeforeCurrentCell.asInstanceOf[js.Any], ojBeforeEdit = ojBeforeEdit.asInstanceOf[js.Any], ojBeforeEditEnd = ojBeforeEditEnd.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], ojScroll = ojScroll.asInstanceOf[js.Any], ojSort = ojSort.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPolicyChanged = scrollPolicyChanged.asInstanceOf[js.Any], scrollPolicyOptionsChanged = scrollPolicyOptionsChanged.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDataGridEventMap[K, D]]
  }
  @scala.inline
  implicit class ojDataGridEventMapOps[Self <: ojDataGridEventMap[_, _], K, D] (val x: Self with (ojDataGridEventMap[K, D])) extends AnyVal {
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
    def setBandingIntervalChanged(value: JetElementCustomEvent[Column]): Self = this.set("bandingIntervalChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellChanged(value: JetElementCustomEvent[ClassName[K, D]]): Self = this.set("cellChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentCellChanged(value: JetElementCustomEvent[CurrentCell[K] | Null]): Self = this.set("currentCellChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataChanged(value: JetElementCustomEvent[DataProvider[K, D]]): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDndChanged(value: JetElementCustomEvent[Reorder]): Self = this.set("dndChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditModeChanged(value: JetElementCustomEvent[none | cellNavigation | cellEdit]): Self = this.set("editModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridlinesChanged(value: JetElementCustomEvent[Horizontal]): Self = this.set("gridlinesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderChanged(value: JetElementCustomEvent[ColumnEnd[K, D]]): Self = this.set("headerChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeCurrentCell(value: ojBeforeCurrentCell[K]): Self = this.set("ojBeforeCurrentCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeEdit(value: ojBeforeEdit[K, D]): Self = this.set("ojBeforeEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeEditEnd(value: ojBeforeEditEnd[K, D]): Self = this.set("ojBeforeEditEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjResize(value: ojResize): Self = this.set("ojResize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjScroll(value: ojScroll): Self = this.set("ojScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjSort(value: ojSort): Self = this.set("ojSort", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPolicyChanged(value: JetElementCustomEvent[auto | loadMoreOnScroll | scroll]): Self = this.set("scrollPolicyChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPolicyOptionsChanged(value: JetElementCustomEvent[MaxColumnCount]): Self = this.set("scrollPolicyOptionsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPositionChanged(value: JetElementCustomEvent[ColumnIndex[K]]): Self = this.set("scrollPositionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(value: JetElementCustomEvent[js.Array[Selection[K]]]): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionModeChanged(value: JetElementCustomEvent[Cell]): Self = this.set("selectionModeChanged", value.asInstanceOf[js.Any])
  }
  
}

