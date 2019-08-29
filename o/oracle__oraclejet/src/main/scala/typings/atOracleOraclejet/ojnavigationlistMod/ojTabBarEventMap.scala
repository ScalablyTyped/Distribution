package typings.atOracleOraclejet.ojnavigationlistMod

import typings.atOracleOraclejet.Anon_ContextRendererSelectableBoolean
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentEventMap
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.icons
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.popup
import typings.atOracleOraclejet.atOracleOraclejetStrings.progressive
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojAnimateEnd
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojAnimateStart
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojBeforeCurrentItem
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojBeforeDeselect
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojBeforeRemove
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojBeforeSelect
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojDeselect
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojRemove
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojReorder
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

trait ojTabBarEventMap[K, D] extends baseComponentEventMap[ojTabBarSettableProperties[K, D]] {
  var asChanged: JetElementCustomEvent[String]
  var currentItemChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
  ]
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  var displayChanged: JetElementCustomEvent[all | icons]
  var edgeChanged: JetElementCustomEvent[top | bottom | start | end]
  var itemChanged: JetElementCustomEvent[Anon_ContextRendererSelectableBoolean[K, D]]
  var ojAnimateEnd: typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojAnimateEnd
  var ojAnimateStart: typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojAnimateStart
  var ojBeforeCurrentItem: typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojBeforeCurrentItem
  var ojBeforeDeselect: typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojBeforeDeselect
  var ojBeforeRemove: typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojBeforeRemove
  var ojBeforeSelect: typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojBeforeSelect
  var ojDeselect: typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojDeselect
  var ojRemove: typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojRemove
  var ojReorder: typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ojReorder
  var overflowChanged: JetElementCustomEvent[popup | hidden]
  var reorderableChanged: JetElementCustomEvent[enabled | disabled]
  var selectionChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
  ]
  var truncationChanged: JetElementCustomEvent[none | progressive]
}

object ojTabBarEventMap {
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
    currentItemChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
    ],
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
    drop: DragEvent,
    durationchange: Event,
    edgeChanged: JetElementCustomEvent[top | bottom | start | end],
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    input: Event,
    invalid: Event,
    itemChanged: JetElementCustomEvent[Anon_ContextRendererSelectableBoolean[K, D]],
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
    ojBeforeCurrentItem: ojBeforeCurrentItem,
    ojBeforeDeselect: ojBeforeDeselect,
    ojBeforeRemove: ojBeforeRemove,
    ojBeforeSelect: ojBeforeSelect,
    ojDeselect: ojDeselect,
    ojRemove: ojRemove,
    ojReorder: ojReorder,
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
    reorderableChanged: JetElementCustomEvent[enabled | disabled],
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
    ],
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
    truncationChanged: JetElementCustomEvent[none | progressive],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojTabBarEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, currentItemChanged = currentItemChanged, cut = cut, dataChanged = dataChanged, dblclick = dblclick, displayChanged = displayChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, edgeChanged = edgeChanged, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, input = input, invalid = invalid, itemChanged = itemChanged, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeCurrentItem = ojBeforeCurrentItem, ojBeforeDeselect = ojBeforeDeselect, ojBeforeRemove = ojBeforeRemove, ojBeforeSelect = ojBeforeSelect, ojDeselect = ojDeselect, ojRemove = ojRemove, ojReorder = ojReorder, overflowChanged = overflowChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reorderableChanged = reorderableChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, truncationChanged = truncationChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojTabBarEventMap[K, D]]
  }
}

