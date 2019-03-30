package typings
package atOracleOraclejetLib.ojnavigationlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTabBarEventMap[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[ojTabBarSettableProperties[K, D]] {
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var currentItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing]
  var dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null]
  var displayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
  ]
  var edgeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end
  ]
  var itemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererSelectableBoolean[K, D]]
  var ojAnimateEnd: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojAnimateEnd
  var ojAnimateStart: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojAnimateStart
  var ojBeforeCurrentItem: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeCurrentItem
  var ojBeforeDeselect: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeDeselect
  var ojBeforeRemove: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeRemove
  var ojBeforeSelect: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeSelect
  var ojDeselect: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojDeselect
  var ojRemove: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojRemove
  var ojReorder: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojReorder
  var overflowChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  ]
  var reorderableChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing]
  var truncationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.progressive
  ]
}

object ojTabBarEventMap {
  @scala.inline
  def apply[K, D](
    abort: stdLib.UIEvent,
    animationcancel: stdLib.AnimationEvent,
    animationend: stdLib.AnimationEvent,
    animationiteration: stdLib.AnimationEvent,
    animationstart: stdLib.AnimationEvent,
    asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    auxclick: stdLib.Event,
    blur: stdLib.FocusEvent,
    cancel: stdLib.Event,
    canplay: stdLib.Event,
    canplaythrough: stdLib.Event,
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    contextmenu: stdLib.MouseEvent,
    copy: stdLib.ClipboardEvent,
    cuechange: stdLib.Event,
    currentItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing],
    cut: stdLib.ClipboardEvent,
    dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null],
    dblclick: stdLib.MouseEvent,
    displayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
    ],
    drag: stdLib.DragEvent,
    dragend: stdLib.DragEvent,
    dragenter: stdLib.DragEvent,
    dragexit: stdLib.Event,
    dragleave: stdLib.DragEvent,
    dragover: stdLib.DragEvent,
    dragstart: stdLib.DragEvent,
    drop: stdLib.DragEvent,
    durationchange: stdLib.Event,
    edgeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end
    ],
    emptied: stdLib.Event,
    ended: stdLib.Event,
    error: stdLib.ErrorEvent,
    focus: stdLib.FocusEvent,
    fullscreenchange: stdLib.Event,
    fullscreenerror: stdLib.Event,
    gotpointercapture: stdLib.PointerEvent,
    input: stdLib.Event,
    invalid: stdLib.Event,
    itemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererSelectableBoolean[K, D]],
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    load: stdLib.Event,
    loadeddata: stdLib.Event,
    loadedmetadata: stdLib.Event,
    loadend: stdLib.ProgressEvent,
    loadstart: stdLib.Event,
    lostpointercapture: stdLib.PointerEvent,
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    ojAnimateEnd: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojAnimateEnd,
    ojAnimateStart: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojAnimateStart,
    ojBeforeCurrentItem: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeCurrentItem,
    ojBeforeDeselect: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeDeselect,
    ojBeforeRemove: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeRemove,
    ojBeforeSelect: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeSelect,
    ojDeselect: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojDeselect,
    ojRemove: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojRemove,
    ojReorder: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojReorder,
    overflowChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
    ],
    paste: stdLib.ClipboardEvent,
    pause: stdLib.Event,
    play: stdLib.Event,
    playing: stdLib.Event,
    pointercancel: stdLib.PointerEvent,
    pointerdown: stdLib.PointerEvent,
    pointerenter: stdLib.PointerEvent,
    pointerleave: stdLib.PointerEvent,
    pointermove: stdLib.PointerEvent,
    pointerout: stdLib.PointerEvent,
    pointerover: stdLib.PointerEvent,
    pointerup: stdLib.PointerEvent,
    progress: stdLib.ProgressEvent,
    ratechange: stdLib.Event,
    reorderableChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
    ],
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    scroll: stdLib.Event,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.Event,
    selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing],
    selectionchange: stdLib.Event,
    selectstart: stdLib.Event,
    stalled: stdLib.Event,
    submit: stdLib.Event,
    suspend: stdLib.Event,
    timeupdate: stdLib.Event,
    toggle: stdLib.Event,
    touchcancel: stdLib.TouchEvent,
    touchend: stdLib.TouchEvent,
    touchmove: stdLib.TouchEvent,
    touchstart: stdLib.TouchEvent,
    transitioncancel: stdLib.TransitionEvent,
    transitionend: stdLib.TransitionEvent,
    transitionrun: stdLib.TransitionEvent,
    transitionstart: stdLib.TransitionEvent,
    translationsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Object | scala.Null],
    truncationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.progressive
    ],
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojTabBarEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, currentItemChanged = currentItemChanged, cut = cut, dataChanged = dataChanged, dblclick = dblclick, displayChanged = displayChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, edgeChanged = edgeChanged, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, input = input, invalid = invalid, itemChanged = itemChanged, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeCurrentItem = ojBeforeCurrentItem, ojBeforeDeselect = ojBeforeDeselect, ojBeforeRemove = ojBeforeRemove, ojBeforeSelect = ojBeforeSelect, ojDeselect = ojDeselect, ojRemove = ojRemove, ojReorder = ojReorder, overflowChanged = overflowChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reorderableChanged = reorderableChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, truncationChanged = truncationChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojTabBarEventMap[K, D]]
  }
}

