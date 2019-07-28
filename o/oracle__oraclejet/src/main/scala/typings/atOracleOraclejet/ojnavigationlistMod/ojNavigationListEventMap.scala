package typings.atOracleOraclejet.ojnavigationlistMod

import typings.atOracleOraclejet.Anon_ContextRendererSelectable
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentEventMap
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.collapsible
import typings.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.icons
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.popup
import typings.atOracleOraclejet.atOracleOraclejetStrings.sliding
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojkeysetMod.KeySet
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojAnimateEnd
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojAnimateStart
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeCollapse
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeCurrentItem
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeExpand
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeSelect
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojCollapse
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojExpand
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
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

trait ojNavigationListEventMap[K, D] extends baseComponentEventMap[ojNavigationListSettableProperties[K, D]] {
  var asChanged: JetElementCustomEvent[String]
  var currentItemChanged: JetElementCustomEvent[K]
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  var displayChanged: JetElementCustomEvent[all | icons]
  var drillModeChanged: JetElementCustomEvent[none | collapsible | sliding]
  var edgeChanged: JetElementCustomEvent[top | start]
  var expandedChanged: JetElementCustomEvent[KeySet[K]]
  var hierarchyMenuThresholdChanged: JetElementCustomEvent[Double]
  var itemChanged: JetElementCustomEvent[Anon_ContextRendererSelectable[K, D]]
  var ojAnimateEnd: typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojAnimateEnd
  var ojAnimateStart: typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojAnimateStart
  var ojBeforeCollapse: typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeCollapse
  var ojBeforeCurrentItem: typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeCurrentItem
  var ojBeforeExpand: typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeExpand
  var ojBeforeSelect: typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeSelect
  var ojCollapse: typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojCollapse
  var ojExpand: typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojExpand
  var overflowChanged: JetElementCustomEvent[popup | hidden]
  var rootLabelChanged: JetElementCustomEvent[String | Null]
  var selectionChanged: JetElementCustomEvent[K]
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
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    hierarchyMenuThresholdChanged: JetElementCustomEvent[Double],
    input: Event,
    invalid: Event,
    itemChanged: JetElementCustomEvent[Anon_ContextRendererSelectable[K, D]],
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
    progress: ProgressEvent,
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
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, currentItemChanged = currentItemChanged, cut = cut, dataChanged = dataChanged, dblclick = dblclick, displayChanged = displayChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillModeChanged = drillModeChanged, drop = drop, durationchange = durationchange, edgeChanged = edgeChanged, emptied = emptied, ended = ended, error = error, expandedChanged = expandedChanged, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, hierarchyMenuThresholdChanged = hierarchyMenuThresholdChanged, input = input, invalid = invalid, itemChanged = itemChanged, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeCollapse = ojBeforeCollapse, ojBeforeCurrentItem = ojBeforeCurrentItem, ojBeforeExpand = ojBeforeExpand, ojBeforeSelect = ojBeforeSelect, ojCollapse = ojCollapse, ojExpand = ojExpand, overflowChanged = overflowChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rootLabelChanged = rootLabelChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojNavigationListEventMap[K, D]]
  }
}

