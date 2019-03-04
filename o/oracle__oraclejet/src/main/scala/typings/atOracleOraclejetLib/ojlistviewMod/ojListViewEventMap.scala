package typings
package atOracleOraclejetLib.ojlistviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojListViewEventMap[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[ojListViewSettableProperties[K, D]] {
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var currentItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K]
  var dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]]
  var dndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDropReorder]
  var drillModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var expandedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K]]
  var firstSelectedItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DataKey[K, D]]
  var groupHeaderPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky
  ]
  var itemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Focusable[K, D]]
  var ojAnimateEnd: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateEnd
  var ojAnimateStart: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateStart
  var ojBeforeCollapse: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCollapse[K]
  var ojBeforeCurrentItem: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCurrentItem[K]
  var ojBeforeExpand: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeExpand[K]
  var ojCollapse: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCollapse[K]
  var ojCopy: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCopy
  var ojCut: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCut
  var ojExpand: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojExpand[K]
  var ojPaste: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojPaste
  var ojReorder: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojReorder
  var scrollPolicyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
  ]
  var scrollPolicyOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_FetchSize]
  var scrollPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_IndexKey[K]]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]]
  var selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  ]
  var selectionRequiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
}

object ojListViewEventMap {
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
    currentItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K],
    cut: stdLib.ClipboardEvent,
    dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]],
    dblclick: stdLib.MouseEvent,
    dndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDropReorder],
    drag: stdLib.DragEvent,
    dragend: stdLib.DragEvent,
    dragenter: stdLib.DragEvent,
    dragexit: stdLib.Event,
    dragleave: stdLib.DragEvent,
    dragover: stdLib.DragEvent,
    dragstart: stdLib.DragEvent,
    drillModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    drop: stdLib.DragEvent,
    durationchange: stdLib.Event,
    emptied: stdLib.Event,
    ended: stdLib.Event,
    error: stdLib.ErrorEvent,
    expandedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K]],
    firstSelectedItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DataKey[K, D]],
    focus: stdLib.FocusEvent,
    fullscreenchange: stdLib.Event,
    fullscreenerror: stdLib.Event,
    gotpointercapture: stdLib.PointerEvent,
    groupHeaderPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky
    ],
    input: stdLib.Event,
    invalid: stdLib.Event,
    itemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Focusable[K, D]],
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
    ojAnimateEnd: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateEnd,
    ojAnimateStart: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateStart,
    ojBeforeCollapse: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCollapse[K],
    ojBeforeCurrentItem: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCurrentItem[K],
    ojBeforeExpand: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeExpand[K],
    ojCollapse: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCollapse[K],
    ojCopy: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCopy,
    ojCut: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCut,
    ojExpand: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojExpand[K],
    ojPaste: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojPaste,
    ojReorder: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojReorder,
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
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    scroll: stdLib.UIEvent,
    scrollPolicyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
    ],
    scrollPolicyOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_FetchSize],
    scrollPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_IndexKey[K]],
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.UIEvent,
    selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]],
    selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
    ],
    selectionRequiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean],
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
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojListViewEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, currentItemChanged = currentItemChanged, cut = cut, dataChanged = dataChanged, dblclick = dblclick, dndChanged = dndChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillModeChanged = drillModeChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, expandedChanged = expandedChanged, firstSelectedItemChanged = firstSelectedItemChanged, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, groupHeaderPositionChanged = groupHeaderPositionChanged, input = input, invalid = invalid, itemChanged = itemChanged, keydown = keydown, keypress = keypress, keyup = keyup, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, ojBeforeCollapse = ojBeforeCollapse, ojBeforeCurrentItem = ojBeforeCurrentItem, ojBeforeExpand = ojBeforeExpand, ojCollapse = ojCollapse, ojCopy = ojCopy, ojCut = ojCut, ojExpand = ojExpand, ojPaste = ojPaste, ojReorder = ojReorder, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, scroll = scroll, scrollPolicyChanged = scrollPolicyChanged, scrollPolicyOptionsChanged = scrollPolicyOptionsChanged, scrollPositionChanged = scrollPositionChanged, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionRequiredChanged = selectionRequiredChanged, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojListViewEventMap[K, D]]
  }
}

