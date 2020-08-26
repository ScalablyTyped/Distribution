package typings.oracleOraclejet.ojlistviewMod

import typings.oracleOraclejet.anon.DragDrop
import typings.oracleOraclejet.anon.FetchSize
import typings.oracleOraclejet.anon.Focusable
import typings.oracleOraclejet.anon.Key
import typings.oracleOraclejet.anon.OffsetX
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojAnimateEnd
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojAnimateStart
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeCollapse
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeCurrentItem
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeExpand
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojCollapse
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojCopy
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojCut
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojExpand
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojPaste
import typings.oracleOraclejet.ojlistviewMod.ojListView.ojReorder
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.collapsible
import typings.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.static
import typings.oracleOraclejet.oracleOraclejetStrings.sticky
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
trait ojListViewEventMap[K, D] extends baseComponentEventMap[ojListViewSettableProperties[K, D]] {
  var asChanged: JetElementCustomEvent[String] = js.native
  var currentItemChanged: JetElementCustomEvent[K] = js.native
  var dataChanged: JetElementCustomEvent[DataProvider[K, D]] = js.native
  var dndChanged: JetElementCustomEvent[DragDrop] = js.native
  var drillModeChanged: JetElementCustomEvent[collapsible | none] = js.native
  var expandedChanged: JetElementCustomEvent[KeySet[K]] = js.native
  var firstSelectedItemChanged: JetElementCustomEvent[Key[K, D]] = js.native
  var groupHeaderPositionChanged: JetElementCustomEvent[static | sticky] = js.native
  var itemChanged: JetElementCustomEvent[Focusable[K, D]] = js.native
  var ojAnimateEnd: typings.oracleOraclejet.ojlistviewMod.ojListView.ojAnimateEnd = js.native
  var ojAnimateStart: typings.oracleOraclejet.ojlistviewMod.ojListView.ojAnimateStart = js.native
  var ojBeforeCollapse: typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeCollapse[K] = js.native
  var ojBeforeCurrentItem: typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeCurrentItem[K] = js.native
  var ojBeforeExpand: typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeExpand[K] = js.native
  var ojCollapse: typings.oracleOraclejet.ojlistviewMod.ojListView.ojCollapse[K] = js.native
  var ojCopy: typings.oracleOraclejet.ojlistviewMod.ojListView.ojCopy = js.native
  var ojCut: typings.oracleOraclejet.ojlistviewMod.ojListView.ojCut = js.native
  var ojExpand: typings.oracleOraclejet.ojlistviewMod.ojListView.ojExpand[K] = js.native
  var ojPaste: typings.oracleOraclejet.ojlistviewMod.ojListView.ojPaste = js.native
  var ojReorder: typings.oracleOraclejet.ojlistviewMod.ojListView.ojReorder = js.native
  var scrollPolicyChanged: JetElementCustomEvent[auto | loadMoreOnScroll] = js.native
  var scrollPolicyOptionsChanged: JetElementCustomEvent[FetchSize] = js.native
  var scrollPositionChanged: JetElementCustomEvent[OffsetX[K]] = js.native
  var selectionChanged: JetElementCustomEvent[js.Array[K]] = js.native
  var selectionModeChanged: JetElementCustomEvent[none | single | multiple] = js.native
  var selectionRequiredChanged: JetElementCustomEvent[Boolean] = js.native
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
    dndChanged: JetElementCustomEvent[DragDrop],
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
    firstSelectedItemChanged: JetElementCustomEvent[Key[K, D]],
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    groupHeaderPositionChanged: JetElementCustomEvent[static | sticky],
    input: Event,
    invalid: Event,
    itemChanged: JetElementCustomEvent[Focusable[K, D]],
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
    scrollPolicyOptionsChanged: JetElementCustomEvent[FetchSize],
    scrollPositionChanged: JetElementCustomEvent[OffsetX[K]],
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
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentItemChanged = currentItemChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillModeChanged = drillModeChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], firstSelectedItemChanged = firstSelectedItemChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupHeaderPositionChanged = groupHeaderPositionChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], itemChanged = itemChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeCurrentItem = ojBeforeCurrentItem.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojCopy = ojCopy.asInstanceOf[js.Any], ojCut = ojCut.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], ojPaste = ojPaste.asInstanceOf[js.Any], ojReorder = ojReorder.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPolicyChanged = scrollPolicyChanged.asInstanceOf[js.Any], scrollPolicyOptionsChanged = scrollPolicyOptionsChanged.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRequiredChanged = selectionRequiredChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojListViewEventMap[K, D]]
  }
  @scala.inline
  implicit class ojListViewEventMapOps[Self <: ojListViewEventMap[_, _], K, D] (val x: Self with (ojListViewEventMap[K, D])) extends AnyVal {
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
    def setAsChanged(value: JetElementCustomEvent[String]): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentItemChanged(value: JetElementCustomEvent[K]): Self = this.set("currentItemChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataChanged(value: JetElementCustomEvent[DataProvider[K, D]]): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDndChanged(value: JetElementCustomEvent[DragDrop]): Self = this.set("dndChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrillModeChanged(value: JetElementCustomEvent[collapsible | none]): Self = this.set("drillModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedChanged(value: JetElementCustomEvent[KeySet[K]]): Self = this.set("expandedChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstSelectedItemChanged(value: JetElementCustomEvent[Key[K, D]]): Self = this.set("firstSelectedItemChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupHeaderPositionChanged(value: JetElementCustomEvent[static | sticky]): Self = this.set("groupHeaderPositionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemChanged(value: JetElementCustomEvent[Focusable[K, D]]): Self = this.set("itemChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjAnimateEnd(value: ojAnimateEnd): Self = this.set("ojAnimateEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjAnimateStart(value: ojAnimateStart): Self = this.set("ojAnimateStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeCollapse(value: ojBeforeCollapse[K]): Self = this.set("ojBeforeCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeCurrentItem(value: ojBeforeCurrentItem[K]): Self = this.set("ojBeforeCurrentItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeExpand(value: ojBeforeExpand[K]): Self = this.set("ojBeforeExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjCollapse(value: ojCollapse[K]): Self = this.set("ojCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjCopy(value: ojCopy): Self = this.set("ojCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjCut(value: ojCut): Self = this.set("ojCut", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjExpand(value: ojExpand[K]): Self = this.set("ojExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjPaste(value: ojPaste): Self = this.set("ojPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjReorder(value: ojReorder): Self = this.set("ojReorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPolicyChanged(value: JetElementCustomEvent[auto | loadMoreOnScroll]): Self = this.set("scrollPolicyChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPolicyOptionsChanged(value: JetElementCustomEvent[FetchSize]): Self = this.set("scrollPolicyOptionsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPositionChanged(value: JetElementCustomEvent[OffsetX[K]]): Self = this.set("scrollPositionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(value: JetElementCustomEvent[js.Array[K]]): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionModeChanged(value: JetElementCustomEvent[none | single | multiple]): Self = this.set("selectionModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionRequiredChanged(value: JetElementCustomEvent[Boolean]): Self = this.set("selectionRequiredChanged", value.asInstanceOf[js.Any])
  }
  
}

