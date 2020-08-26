package typings.oracleOraclejet.ojnavigationlistMod

import typings.oracleOraclejet.anon.Selectable
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojAnimateEnd
import typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojAnimateStart
import typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeCollapse
import typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeCurrentItem
import typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeExpand
import typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeSelect
import typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojCollapse
import typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojExpand
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.collapsible
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.popup
import typings.oracleOraclejet.oracleOraclejetStrings.sliding
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
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
trait ojNavigationListEventMap[K, D] extends baseComponentEventMap[ojNavigationListSettableProperties[K, D]] {
  var asChanged: JetElementCustomEvent[String] = js.native
  var currentItemChanged: JetElementCustomEvent[K] = js.native
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null] = js.native
  var displayChanged: JetElementCustomEvent[all | icons] = js.native
  var drillModeChanged: JetElementCustomEvent[none | collapsible | sliding] = js.native
  var edgeChanged: JetElementCustomEvent[top | start] = js.native
  var expandedChanged: JetElementCustomEvent[KeySet[K]] = js.native
  var hierarchyMenuThresholdChanged: JetElementCustomEvent[Double] = js.native
  var itemChanged: JetElementCustomEvent[Selectable[K, D]] = js.native
  var ojAnimateEnd: typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojAnimateEnd = js.native
  var ojAnimateStart: typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojAnimateStart = js.native
  var ojBeforeCollapse: typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeCollapse = js.native
  var ojBeforeCurrentItem: typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeCurrentItem = js.native
  var ojBeforeExpand: typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeExpand = js.native
  var ojBeforeSelect: typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeSelect = js.native
  var ojCollapse: typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojCollapse = js.native
  var ojExpand: typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojExpand = js.native
  var overflowChanged: JetElementCustomEvent[popup | hidden] = js.native
  var rootLabelChanged: JetElementCustomEvent[String | Null] = js.native
  var selectionChanged: JetElementCustomEvent[K] = js.native
}

object ojNavigationListEventMap {
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
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
    displayChanged: JetElementCustomEvent[all | icons],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillModeChanged: JetElementCustomEvent[none | collapsible | sliding],
    drop: DragEvent,
    durationchange: Event,
    edgeChanged: JetElementCustomEvent[top | start],
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    expandedChanged: JetElementCustomEvent[KeySet[K]],
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    hierarchyMenuThresholdChanged: JetElementCustomEvent[Double],
    input: Event,
    invalid: Event,
    itemChanged: JetElementCustomEvent[Selectable[K, D]],
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
    ojBeforeCollapse: ojBeforeCollapse,
    ojBeforeCurrentItem: ojBeforeCurrentItem,
    ojBeforeExpand: ojBeforeExpand,
    ojBeforeSelect: ojBeforeSelect,
    ojCollapse: ojCollapse,
    ojExpand: ojExpand,
    overflowChanged: JetElementCustomEvent[popup | hidden],
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
    rootLabelChanged: JetElementCustomEvent[String | Null],
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[K],
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
  ): ojNavigationListEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentItemChanged = currentItemChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayChanged = displayChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillModeChanged = drillModeChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], edgeChanged = edgeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hierarchyMenuThresholdChanged = hierarchyMenuThresholdChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], itemChanged = itemChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeCurrentItem = ojBeforeCurrentItem.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojBeforeSelect = ojBeforeSelect.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], overflowChanged = overflowChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rootLabelChanged = rootLabelChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNavigationListEventMap[K, D]]
  }
  @scala.inline
  implicit class ojNavigationListEventMapOps[Self <: ojNavigationListEventMap[_, _], K, D] (val x: Self with (ojNavigationListEventMap[K, D])) extends AnyVal {
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
    def setDataChanged(value: JetElementCustomEvent[(DataProvider[K, D]) | Null]): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayChanged(value: JetElementCustomEvent[all | icons]): Self = this.set("displayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrillModeChanged(value: JetElementCustomEvent[none | collapsible | sliding]): Self = this.set("drillModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgeChanged(value: JetElementCustomEvent[top | start]): Self = this.set("edgeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedChanged(value: JetElementCustomEvent[KeySet[K]]): Self = this.set("expandedChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHierarchyMenuThresholdChanged(value: JetElementCustomEvent[Double]): Self = this.set("hierarchyMenuThresholdChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemChanged(value: JetElementCustomEvent[Selectable[K, D]]): Self = this.set("itemChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjAnimateEnd(value: ojAnimateEnd): Self = this.set("ojAnimateEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjAnimateStart(value: ojAnimateStart): Self = this.set("ojAnimateStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeCollapse(value: ojBeforeCollapse): Self = this.set("ojBeforeCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeCurrentItem(value: ojBeforeCurrentItem): Self = this.set("ojBeforeCurrentItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeExpand(value: ojBeforeExpand): Self = this.set("ojBeforeExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeSelect(value: ojBeforeSelect): Self = this.set("ojBeforeSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjCollapse(value: ojCollapse): Self = this.set("ojCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjExpand(value: ojExpand): Self = this.set("ojExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflowChanged(value: JetElementCustomEvent[popup | hidden]): Self = this.set("overflowChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootLabelChanged(value: JetElementCustomEvent[String | Null]): Self = this.set("rootLabelChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(value: JetElementCustomEvent[K]): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
  }
  
}

