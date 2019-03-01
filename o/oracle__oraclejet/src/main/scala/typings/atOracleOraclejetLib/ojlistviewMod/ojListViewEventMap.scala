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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("animationcancel")(animationcancel)
    __obj.updateDynamic("animationend")(animationend)
    __obj.updateDynamic("animationiteration")(animationiteration)
    __obj.updateDynamic("animationstart")(animationstart)
    __obj.updateDynamic("asChanged")(asChanged)
    __obj.updateDynamic("auxclick")(auxclick)
    __obj.updateDynamic("blur")(blur)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("canplay")(canplay)
    __obj.updateDynamic("canplaythrough")(canplaythrough)
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("contextmenu")(contextmenu)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("cuechange")(cuechange)
    __obj.updateDynamic("currentItemChanged")(currentItemChanged)
    __obj.updateDynamic("cut")(cut)
    __obj.updateDynamic("dataChanged")(dataChanged)
    __obj.updateDynamic("dblclick")(dblclick)
    __obj.updateDynamic("dndChanged")(dndChanged)
    __obj.updateDynamic("drag")(drag)
    __obj.updateDynamic("dragend")(dragend)
    __obj.updateDynamic("dragenter")(dragenter)
    __obj.updateDynamic("dragexit")(dragexit)
    __obj.updateDynamic("dragleave")(dragleave)
    __obj.updateDynamic("dragover")(dragover)
    __obj.updateDynamic("dragstart")(dragstart)
    __obj.updateDynamic("drillModeChanged")(drillModeChanged)
    __obj.updateDynamic("drop")(drop)
    __obj.updateDynamic("durationchange")(durationchange)
    __obj.updateDynamic("emptied")(emptied)
    __obj.updateDynamic("ended")(ended)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("expandedChanged")(expandedChanged)
    __obj.updateDynamic("firstSelectedItemChanged")(firstSelectedItemChanged)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("fullscreenchange")(fullscreenchange)
    __obj.updateDynamic("fullscreenerror")(fullscreenerror)
    __obj.updateDynamic("gotpointercapture")(gotpointercapture)
    __obj.updateDynamic("groupHeaderPositionChanged")(groupHeaderPositionChanged)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("invalid")(invalid)
    __obj.updateDynamic("itemChanged")(itemChanged)
    __obj.updateDynamic("keydown")(keydown)
    __obj.updateDynamic("keypress")(keypress)
    __obj.updateDynamic("keyup")(keyup)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadeddata")(loadeddata)
    __obj.updateDynamic("loadedmetadata")(loadedmetadata)
    __obj.updateDynamic("loadend")(loadend)
    __obj.updateDynamic("loadstart")(loadstart)
    __obj.updateDynamic("lostpointercapture")(lostpointercapture)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mouseenter")(mouseenter)
    __obj.updateDynamic("mouseleave")(mouseleave)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("mouseout")(mouseout)
    __obj.updateDynamic("mouseover")(mouseover)
    __obj.updateDynamic("mouseup")(mouseup)
    __obj.updateDynamic("ojAnimateEnd")(ojAnimateEnd)
    __obj.updateDynamic("ojAnimateStart")(ojAnimateStart)
    __obj.updateDynamic("ojBeforeCollapse")(ojBeforeCollapse)
    __obj.updateDynamic("ojBeforeCurrentItem")(ojBeforeCurrentItem)
    __obj.updateDynamic("ojBeforeExpand")(ojBeforeExpand)
    __obj.updateDynamic("ojCollapse")(ojCollapse)
    __obj.updateDynamic("ojCopy")(ojCopy)
    __obj.updateDynamic("ojCut")(ojCut)
    __obj.updateDynamic("ojExpand")(ojExpand)
    __obj.updateDynamic("ojPaste")(ojPaste)
    __obj.updateDynamic("ojReorder")(ojReorder)
    __obj.updateDynamic("paste")(paste)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("playing")(playing)
    __obj.updateDynamic("pointercancel")(pointercancel)
    __obj.updateDynamic("pointerdown")(pointerdown)
    __obj.updateDynamic("pointerenter")(pointerenter)
    __obj.updateDynamic("pointerleave")(pointerleave)
    __obj.updateDynamic("pointermove")(pointermove)
    __obj.updateDynamic("pointerout")(pointerout)
    __obj.updateDynamic("pointerover")(pointerover)
    __obj.updateDynamic("pointerup")(pointerup)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("ratechange")(ratechange)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("scroll")(scroll)
    __obj.updateDynamic("scrollPolicyChanged")(scrollPolicyChanged)
    __obj.updateDynamic("scrollPolicyOptionsChanged")(scrollPolicyOptionsChanged)
    __obj.updateDynamic("scrollPositionChanged")(scrollPositionChanged)
    __obj.updateDynamic("securitypolicyviolation")(securitypolicyviolation)
    __obj.updateDynamic("seeked")(seeked)
    __obj.updateDynamic("seeking")(seeking)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("selectionChanged")(selectionChanged)
    __obj.updateDynamic("selectionModeChanged")(selectionModeChanged)
    __obj.updateDynamic("selectionRequiredChanged")(selectionRequiredChanged)
    __obj.updateDynamic("stalled")(stalled)
    __obj.updateDynamic("submit")(submit)
    __obj.updateDynamic("suspend")(suspend)
    __obj.updateDynamic("timeupdate")(timeupdate)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("touchcancel")(touchcancel)
    __obj.updateDynamic("touchend")(touchend)
    __obj.updateDynamic("touchmove")(touchmove)
    __obj.updateDynamic("touchstart")(touchstart)
    __obj.updateDynamic("transitioncancel")(transitioncancel)
    __obj.updateDynamic("transitionend")(transitionend)
    __obj.updateDynamic("transitionrun")(transitionrun)
    __obj.updateDynamic("transitionstart")(transitionstart)
    __obj.updateDynamic("translationsChanged")(translationsChanged)
    __obj.updateDynamic("volumechange")(volumechange)
    __obj.updateDynamic("waiting")(waiting)
    __obj.updateDynamic("wheel")(wheel)
    __obj.asInstanceOf[ojListViewEventMap[K, D]]
  }
}

