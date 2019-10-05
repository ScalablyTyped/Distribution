package typings.atOracleOraclejet.ojlistviewMod

import typings.atOracleOraclejet.Anon_DataKey
import typings.atOracleOraclejet.Anon_DragDropReorder
import typings.atOracleOraclejet.Anon_FetchSize
import typings.atOracleOraclejet.Anon_Focusable
import typings.atOracleOraclejet.Anon_IndexKey
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentEventMap
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.collapsible
import typings.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.static
import typings.atOracleOraclejet.atOracleOraclejetStrings.sticky
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojkeysetMod.KeySet
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojAnimateEnd
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojAnimateStart
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojBeforeCollapse
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojBeforeCurrentItem
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojBeforeExpand
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojCollapse
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojCopy
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojCut
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojExpand
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojPaste
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojReorder
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

trait ojListViewEventMap[K, D] extends baseComponentEventMap[ojListViewSettableProperties[K, D]] {
  var asChanged: JetElementCustomEvent[String]
  var currentItemChanged: JetElementCustomEvent[K]
  var dataChanged: JetElementCustomEvent[DataProvider[K, D]]
  var dndChanged: JetElementCustomEvent[Anon_DragDropReorder]
  var drillModeChanged: JetElementCustomEvent[collapsible | none]
  var expandedChanged: JetElementCustomEvent[KeySet[K]]
  var firstSelectedItemChanged: JetElementCustomEvent[Anon_DataKey[K, D]]
  var groupHeaderPositionChanged: JetElementCustomEvent[static | sticky]
  var itemChanged: JetElementCustomEvent[Anon_Focusable[K, D]]
  var ojAnimateEnd: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojAnimateEnd
  var ojAnimateStart: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojAnimateStart
  var ojBeforeCollapse: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojBeforeCollapse[K]
  var ojBeforeCurrentItem: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojBeforeCurrentItem[K]
  var ojBeforeExpand: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojBeforeExpand[K]
  var ojCollapse: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojCollapse[K]
  var ojCopy: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojCopy
  var ojCut: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojCut
  var ojExpand: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojExpand[K]
  var ojPaste: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojPaste
  var ojReorder: typings.atOracleOraclejet.ojlistviewMod.ojListView.ojReorder
  var scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll]
  var scrollPolicyOptionsChanged: JetElementCustomEvent[Anon_FetchSize]
  var scrollPositionChanged: JetElementCustomEvent[Anon_IndexKey[K]]
  var selectionChanged: JetElementCustomEvent[js.Array[K]]
  var selectionModeChanged: JetElementCustomEvent[none | single | multiple]
  var selectionRequiredChanged: JetElementCustomEvent[Boolean]
}

object ojListViewEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
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
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    currentItemChanged: JetElementCustomEvent[K],
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[DataProvider[K, D]],
    dblclick: MouseEvent,
    dndChanged: JetElementCustomEvent[Anon_DragDropReorder],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillModeChanged: JetElementCustomEvent[collapsible | none],
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    expandedChanged: JetElementCustomEvent[KeySet[K]],
    firstSelectedItemChanged: JetElementCustomEvent[Anon_DataKey[K, D]],
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    groupHeaderPositionChanged: JetElementCustomEvent[static | sticky],
    input: Event,
    invalid: Event,
    itemChanged: JetElementCustomEvent[Anon_Focusable[K, D]],
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
    ojBeforeCollapse: ojBeforeCollapse[K],
    ojBeforeCurrentItem: ojBeforeCurrentItem[K],
    ojBeforeExpand: ojBeforeExpand[K],
    ojCollapse: ojCollapse[K],
    ojCopy: ojCopy,
    ojCut: ojCut,
    ojExpand: ojExpand[K],
    ojPaste: ojPaste,
    ojReorder: ojReorder,
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
    scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll],
    scrollPolicyOptionsChanged: JetElementCustomEvent[Anon_FetchSize],
    scrollPositionChanged: JetElementCustomEvent[Anon_IndexKey[K]],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[K]],
    selectionModeChanged: JetElementCustomEvent[none | single | multiple],
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
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojListViewEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, currentItemChanged = currentItemChanged, cut = cut, dataChanged = dataChanged, dblclick = dblclick, dndChanged = dndChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillModeChanged = drillModeChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, expandedChanged = expandedChanged, firstSelectedItemChanged = firstSelectedItemChanged, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, groupHeaderPositionChanged = groupHeaderPositionChanged, input = input, invalid = invalid, itemChanged = itemChanged, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeCollapse = ojBeforeCollapse, ojBeforeCurrentItem = ojBeforeCurrentItem, ojBeforeExpand = ojBeforeExpand, ojCollapse = ojCollapse, ojCopy = ojCopy, ojCut = ojCut, ojExpand = ojExpand, ojPaste = ojPaste, ojReorder = ojReorder, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, scrollPolicyChanged = scrollPolicyChanged, scrollPolicyOptionsChanged = scrollPolicyOptionsChanged, scrollPositionChanged = scrollPositionChanged, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionRequiredChanged = selectionRequiredChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojListViewEventMap[K, D]]
  }
}

