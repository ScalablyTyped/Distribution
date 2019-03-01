package typings
package atOracleOraclejetLib.ojganttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttEventMap[K1, K2, D1, D2]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentEventMap[ojGanttSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChangeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var animationOnDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var axisPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
  ]
  var dependencyDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]]]
  var dndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Move]
  var endChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var gridlinesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoHidden]
  var majorAxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Converter]
  var minorAxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Converter]
  var ojMove: atOracleOraclejetLib.ojganttMod.ojGanttNs.ojMove[K2, D2]
  var ojViewportChange: atOracleOraclejetLib.ojganttMod.ojGanttNs.ojViewportChange
  var referenceObjectsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojganttMod.ojGanttNs.ReferenceObject]]
  var rowAxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Label[K2, D2]]
  var rowDefaultsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_HeightNumber]
  var scrollPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_OffsetY]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K2]]
  var selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var startChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var taskDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]]]
  var taskDefaultsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoBaseline]
  var tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]]
  var valueFormatsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BaselineDate]
  var viewportEndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var viewportStartChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
}

object ojGanttEventMap {
  @scala.inline
  def apply[K1, K2, D1, D2](
    abort: stdLib.UIEvent,
    animationOnDataChangeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    animationOnDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    animationcancel: stdLib.AnimationEvent,
    animationend: stdLib.AnimationEvent,
    animationiteration: stdLib.AnimationEvent,
    animationstart: stdLib.AnimationEvent,
    asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    auxclick: stdLib.Event,
    axisPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
    ],
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
    cut: stdLib.ClipboardEvent,
    dblclick: stdLib.MouseEvent,
    dependencyDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]]],
    dndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Move],
    drag: stdLib.DragEvent,
    dragend: stdLib.DragEvent,
    dragenter: stdLib.DragEvent,
    dragexit: stdLib.Event,
    dragleave: stdLib.DragEvent,
    dragover: stdLib.DragEvent,
    dragstart: stdLib.DragEvent,
    drop: stdLib.DragEvent,
    durationchange: stdLib.Event,
    emptied: stdLib.Event,
    endChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    ended: stdLib.Event,
    error: stdLib.ErrorEvent,
    focus: stdLib.FocusEvent,
    fullscreenchange: stdLib.Event,
    fullscreenerror: stdLib.Event,
    gotpointercapture: stdLib.PointerEvent,
    gridlinesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoHidden],
    input: stdLib.Event,
    invalid: stdLib.Event,
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    load: stdLib.Event,
    loadeddata: stdLib.Event,
    loadedmetadata: stdLib.Event,
    loadend: stdLib.ProgressEvent,
    loadstart: stdLib.Event,
    lostpointercapture: stdLib.PointerEvent,
    majorAxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Converter],
    minorAxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Converter],
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    ojMove: atOracleOraclejetLib.ojganttMod.ojGanttNs.ojMove[K2, D2],
    ojViewportChange: atOracleOraclejetLib.ojganttMod.ojGanttNs.ojViewportChange,
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
    referenceObjectsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojganttMod.ojGanttNs.ReferenceObject]],
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    rowAxisChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Label[K2, D2]],
    rowDefaultsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_HeightNumber],
    scroll: stdLib.UIEvent,
    scrollPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_OffsetY],
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.UIEvent,
    selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K2]],
    selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    stalled: stdLib.Event,
    startChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    submit: stdLib.Event,
    suspend: stdLib.Event,
    taskDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]]],
    taskDefaultsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoBaseline],
    timeupdate: stdLib.Event,
    toggle: stdLib.Event,
    tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]],
    touchcancel: stdLib.TouchEvent,
    touchend: stdLib.TouchEvent,
    touchmove: stdLib.TouchEvent,
    touchstart: stdLib.TouchEvent,
    trackResizeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ],
    transitioncancel: stdLib.TransitionEvent,
    transitionend: stdLib.TransitionEvent,
    transitionrun: stdLib.TransitionEvent,
    transitionstart: stdLib.TransitionEvent,
    translationsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Object | scala.Null],
    valueFormatsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BaselineDate],
    viewportEndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    viewportStartChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojGanttEventMap[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("animationOnDataChangeChanged")(animationOnDataChangeChanged)
    __obj.updateDynamic("animationOnDisplayChanged")(animationOnDisplayChanged)
    __obj.updateDynamic("animationcancel")(animationcancel)
    __obj.updateDynamic("animationend")(animationend)
    __obj.updateDynamic("animationiteration")(animationiteration)
    __obj.updateDynamic("animationstart")(animationstart)
    __obj.updateDynamic("asChanged")(asChanged)
    __obj.updateDynamic("auxclick")(auxclick)
    __obj.updateDynamic("axisPositionChanged")(axisPositionChanged)
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
    __obj.updateDynamic("cut")(cut)
    __obj.updateDynamic("dblclick")(dblclick)
    __obj.updateDynamic("dependencyDataChanged")(dependencyDataChanged)
    __obj.updateDynamic("dndChanged")(dndChanged)
    __obj.updateDynamic("drag")(drag)
    __obj.updateDynamic("dragend")(dragend)
    __obj.updateDynamic("dragenter")(dragenter)
    __obj.updateDynamic("dragexit")(dragexit)
    __obj.updateDynamic("dragleave")(dragleave)
    __obj.updateDynamic("dragover")(dragover)
    __obj.updateDynamic("dragstart")(dragstart)
    __obj.updateDynamic("drop")(drop)
    __obj.updateDynamic("durationchange")(durationchange)
    __obj.updateDynamic("emptied")(emptied)
    __obj.updateDynamic("endChanged")(endChanged)
    __obj.updateDynamic("ended")(ended)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("fullscreenchange")(fullscreenchange)
    __obj.updateDynamic("fullscreenerror")(fullscreenerror)
    __obj.updateDynamic("gotpointercapture")(gotpointercapture)
    __obj.updateDynamic("gridlinesChanged")(gridlinesChanged)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("invalid")(invalid)
    __obj.updateDynamic("keydown")(keydown)
    __obj.updateDynamic("keypress")(keypress)
    __obj.updateDynamic("keyup")(keyup)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadeddata")(loadeddata)
    __obj.updateDynamic("loadedmetadata")(loadedmetadata)
    __obj.updateDynamic("loadend")(loadend)
    __obj.updateDynamic("loadstart")(loadstart)
    __obj.updateDynamic("lostpointercapture")(lostpointercapture)
    __obj.updateDynamic("majorAxisChanged")(majorAxisChanged)
    __obj.updateDynamic("minorAxisChanged")(minorAxisChanged)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mouseenter")(mouseenter)
    __obj.updateDynamic("mouseleave")(mouseleave)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("mouseout")(mouseout)
    __obj.updateDynamic("mouseover")(mouseover)
    __obj.updateDynamic("mouseup")(mouseup)
    __obj.updateDynamic("ojMove")(ojMove)
    __obj.updateDynamic("ojViewportChange")(ojViewportChange)
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
    __obj.updateDynamic("referenceObjectsChanged")(referenceObjectsChanged)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("rowAxisChanged")(rowAxisChanged)
    __obj.updateDynamic("rowDefaultsChanged")(rowDefaultsChanged)
    __obj.updateDynamic("scroll")(scroll)
    __obj.updateDynamic("scrollPositionChanged")(scrollPositionChanged)
    __obj.updateDynamic("securitypolicyviolation")(securitypolicyviolation)
    __obj.updateDynamic("seeked")(seeked)
    __obj.updateDynamic("seeking")(seeking)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("selectionChanged")(selectionChanged)
    __obj.updateDynamic("selectionModeChanged")(selectionModeChanged)
    __obj.updateDynamic("stalled")(stalled)
    __obj.updateDynamic("startChanged")(startChanged)
    __obj.updateDynamic("submit")(submit)
    __obj.updateDynamic("suspend")(suspend)
    __obj.updateDynamic("taskDataChanged")(taskDataChanged)
    __obj.updateDynamic("taskDefaultsChanged")(taskDefaultsChanged)
    __obj.updateDynamic("timeupdate")(timeupdate)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("tooltipChanged")(tooltipChanged)
    __obj.updateDynamic("touchcancel")(touchcancel)
    __obj.updateDynamic("touchend")(touchend)
    __obj.updateDynamic("touchmove")(touchmove)
    __obj.updateDynamic("touchstart")(touchstart)
    __obj.updateDynamic("trackResizeChanged")(trackResizeChanged)
    __obj.updateDynamic("transitioncancel")(transitioncancel)
    __obj.updateDynamic("transitionend")(transitionend)
    __obj.updateDynamic("transitionrun")(transitionrun)
    __obj.updateDynamic("transitionstart")(transitionstart)
    __obj.updateDynamic("translationsChanged")(translationsChanged)
    __obj.updateDynamic("valueFormatsChanged")(valueFormatsChanged)
    __obj.updateDynamic("viewportEndChanged")(viewportEndChanged)
    __obj.updateDynamic("viewportStartChanged")(viewportStartChanged)
    __obj.updateDynamic("volumechange")(volumechange)
    __obj.updateDynamic("waiting")(waiting)
    __obj.updateDynamic("wheel")(wheel)
    __obj.asInstanceOf[ojGanttEventMap[K1, K2, D1, D2]]
  }
}

