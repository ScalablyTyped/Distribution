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
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLElement
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojTableEventMap[K, D]
  extends StObject
     with baseComponentEventMap[ojTableSettableProperties[K, D]] {
  
  var accessibilityChanged: JetElementCustomEvent[RowHeader]
  
  var asChanged: JetElementCustomEvent[String]
  
  var columnsChanged: JetElementCustomEvent[(js.Array[Field[K, D]]) | Null]
  
  var columnsDefaultChanged: JetElementCustomEvent[FooterClassName[K, D]]
  
  var currentRowChanged: JetElementCustomEvent[CurrentRow[K] | Null]
  
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  
  var displayChanged: JetElementCustomEvent[list | grid]
  
  var dndChanged: JetElementCustomEvent[DropReorder[K, D]]
  
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
  
  var scrollPolicyOptionsChanged: JetElementCustomEvent[MaxCount]
  
  var scrollPositionChanged: JetElementCustomEvent[ColumnKey]
  
  var selectionChanged: JetElementCustomEvent[
    js.Array[
      (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
    ]
  ]
  
  var selectionModeChanged: JetElementCustomEvent[`21`]
  
  var selectionRequiredChanged: JetElementCustomEvent[Boolean]
  
  var verticalGridVisibleChanged: JetElementCustomEvent[auto | enabled | disabled]
}
object ojTableEventMap {
  
  inline def apply[K, D](
    abort: UIEvent,
    accessibilityChanged: JetElementCustomEvent[RowHeader],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    beforeinput: InputEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    columnsChanged: JetElementCustomEvent[(js.Array[Field[K, D]]) | Null],
    columnsDefaultChanged: JetElementCustomEvent[FooterClassName[K, D]],
    compositionend: CompositionEvent,
    compositionstart: CompositionEvent,
    compositionupdate: CompositionEvent,
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
    formdata: FormDataEvent,
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
        (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
      ]
    ],
    selectionModeChanged: JetElementCustomEvent[`21`],
    selectionRequiredChanged: JetElementCustomEvent[Boolean],
    selectionchange: Event,
    selectstart: Event,
    slotchange: Event,
    stalled: Event,
    submit: SubmitEvent,
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
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent
  ): ojTableEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], accessibilityChanged = accessibilityChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], columnsChanged = columnsChanged.asInstanceOf[js.Any], columnsDefaultChanged = columnsDefaultChanged.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentRowChanged = currentRowChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayChanged = displayChanged.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], editModeChanged = editModeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], firstSelectedRowChanged = firstSelectedRowChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], horizontalGridVisibleChanged = horizontalGridVisibleChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeCurrentRow = ojBeforeCurrentRow.asInstanceOf[js.Any], ojBeforeRowEdit = ojBeforeRowEdit.asInstanceOf[js.Any], ojBeforeRowEditEnd = ojBeforeRowEditEnd.asInstanceOf[js.Any], ojSort = ojSort.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowRendererChanged = rowRendererChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPolicyChanged = scrollPolicyChanged.asInstanceOf[js.Any], scrollPolicyOptionsChanged = scrollPolicyOptionsChanged.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRequiredChanged = selectionRequiredChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], verticalGridVisibleChanged = verticalGridVisibleChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTableEventMap[K, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojTableEventMap[?, ?], K, D] (val x: Self & (ojTableEventMap[K, D])) extends AnyVal {
    
    inline def setAccessibilityChanged(value: JetElementCustomEvent[RowHeader]): Self = StObject.set(x, "accessibilityChanged", value.asInstanceOf[js.Any])
    
    inline def setAsChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "asChanged", value.asInstanceOf[js.Any])
    
    inline def setColumnsChanged(value: JetElementCustomEvent[(js.Array[Field[K, D]]) | Null]): Self = StObject.set(x, "columnsChanged", value.asInstanceOf[js.Any])
    
    inline def setColumnsDefaultChanged(value: JetElementCustomEvent[FooterClassName[K, D]]): Self = StObject.set(x, "columnsDefaultChanged", value.asInstanceOf[js.Any])
    
    inline def setCurrentRowChanged(value: JetElementCustomEvent[CurrentRow[K] | Null]): Self = StObject.set(x, "currentRowChanged", value.asInstanceOf[js.Any])
    
    inline def setDataChanged(value: JetElementCustomEvent[(DataProvider[K, D]) | Null]): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
    
    inline def setDisplayChanged(value: JetElementCustomEvent[list | grid]): Self = StObject.set(x, "displayChanged", value.asInstanceOf[js.Any])
    
    inline def setDndChanged(value: JetElementCustomEvent[DropReorder[K, D]]): Self = StObject.set(x, "dndChanged", value.asInstanceOf[js.Any])
    
    inline def setEditModeChanged(value: JetElementCustomEvent[none | rowEdit]): Self = StObject.set(x, "editModeChanged", value.asInstanceOf[js.Any])
    
    inline def setFirstSelectedRowChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
        ]
    ): Self = StObject.set(x, "firstSelectedRowChanged", value.asInstanceOf[js.Any])
    
    inline def setHorizontalGridVisibleChanged(value: JetElementCustomEvent[auto | enabled | disabled]): Self = StObject.set(x, "horizontalGridVisibleChanged", value.asInstanceOf[js.Any])
    
    inline def setOjAnimateEnd(value: ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
    
    inline def setOjAnimateStart(value: ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
    
    inline def setOjBeforeCurrentRow(value: ojBeforeCurrentRow[K]): Self = StObject.set(x, "ojBeforeCurrentRow", value.asInstanceOf[js.Any])
    
    inline def setOjBeforeRowEdit(value: ojBeforeRowEdit): Self = StObject.set(x, "ojBeforeRowEdit", value.asInstanceOf[js.Any])
    
    inline def setOjBeforeRowEditEnd(value: ojBeforeRowEditEnd): Self = StObject.set(x, "ojBeforeRowEditEnd", value.asInstanceOf[js.Any])
    
    inline def setOjSort(value: ojSort): Self = StObject.set(x, "ojSort", value.asInstanceOf[js.Any])
    
    inline def setRowRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
        ]
    ): Self = StObject.set(x, "rowRendererChanged", value.asInstanceOf[js.Any])
    
    inline def setScrollPolicyChanged(value: JetElementCustomEvent[auto | loadMoreOnScroll]): Self = StObject.set(x, "scrollPolicyChanged", value.asInstanceOf[js.Any])
    
    inline def setScrollPolicyOptionsChanged(value: JetElementCustomEvent[MaxCount]): Self = StObject.set(x, "scrollPolicyOptionsChanged", value.asInstanceOf[js.Any])
    
    inline def setScrollPositionChanged(value: JetElementCustomEvent[ColumnKey]): Self = StObject.set(x, "scrollPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(
      value: JetElementCustomEvent[
          js.Array[
            (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
          ]
        ]
    ): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeChanged(value: JetElementCustomEvent[`21`]): Self = StObject.set(x, "selectionModeChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionRequiredChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "selectionRequiredChanged", value.asInstanceOf[js.Any])
    
    inline def setVerticalGridVisibleChanged(value: JetElementCustomEvent[auto | enabled | disabled]): Self = StObject.set(x, "verticalGridVisibleChanged", value.asInstanceOf[js.Any])
  }
}
