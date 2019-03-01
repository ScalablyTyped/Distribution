package typings
package atOracleOraclejetLib.ojnboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNBoxEventMap[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentEventMap[ojNBoxSettableProperties[K, D]] {
  var animationOnDataChangeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var animationOnDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var cellContentChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.counts | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
  var cellMaximizeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ]
  var cellsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Cell]] | scala.Null]
  var columnsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Column]] | scala.Null
  ]
  var columnsTitleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var countLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.Function1[
      /* context */ atOracleOraclejetLib.ojnboxMod.ojNBoxNs.CountLabelContext, 
      java.lang.String | scala.Null
    ]
  ]
  var dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null]
  var groupAttributesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.color | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorColor | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconColor | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconPattern | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconShape
  ]
  var groupBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.acrossCells | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.withinCell
  ]
  var hiddenCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]]
  var highlightMatchChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  ]
  var highlightedCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]]
  var hoverBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var labelTruncationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.ifRequired | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ]
  var maximizedColumnChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var maximizedRowChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var otherColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var otherThresholdChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var rowsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Row]] | scala.Null]
  var rowsTitleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]]
  var selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  ]
  var styleDefaultsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AnimationDurationCellDefaults]
  var tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultK[K]]
  var touchResponseChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
}

object ojNBoxEventMap {
  @scala.inline
  def apply[K, D](
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
    blur: stdLib.FocusEvent,
    cancel: stdLib.Event,
    canplay: stdLib.Event,
    canplaythrough: stdLib.Event,
    cellContentChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.counts | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ],
    cellMaximizeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
    ],
    cellsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Cell]] | scala.Null],
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    columnsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Column]] | scala.Null
    ],
    columnsTitleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    contextmenu: stdLib.MouseEvent,
    copy: stdLib.ClipboardEvent,
    countLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.Function1[
        /* context */ atOracleOraclejetLib.ojnboxMod.ojNBoxNs.CountLabelContext, 
        java.lang.String | scala.Null
      ]
    ],
    cuechange: stdLib.Event,
    cut: stdLib.ClipboardEvent,
    dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null],
    dblclick: stdLib.MouseEvent,
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
    ended: stdLib.Event,
    error: stdLib.ErrorEvent,
    focus: stdLib.FocusEvent,
    fullscreenchange: stdLib.Event,
    fullscreenerror: stdLib.Event,
    gotpointercapture: stdLib.PointerEvent,
    groupAttributesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.color | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorColor | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconColor | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconPattern | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconShape
    ],
    groupBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.acrossCells | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.withinCell
    ],
    hiddenCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]],
    highlightMatchChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
    ],
    highlightedCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]],
    hoverBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    input: stdLib.Event,
    invalid: stdLib.Event,
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    labelTruncationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.ifRequired | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
    ],
    load: stdLib.Event,
    loadeddata: stdLib.Event,
    loadedmetadata: stdLib.Event,
    loadend: stdLib.ProgressEvent,
    loadstart: stdLib.Event,
    lostpointercapture: stdLib.PointerEvent,
    maximizedColumnChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    maximizedRowChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    otherColorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    otherThresholdChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
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
    rowsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Row]] | scala.Null],
    rowsTitleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    scroll: stdLib.UIEvent,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.UIEvent,
    selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]],
    selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
    ],
    stalled: stdLib.Event,
    styleDefaultsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AnimationDurationCellDefaults],
    submit: stdLib.Event,
    suspend: stdLib.Event,
    timeupdate: stdLib.Event,
    toggle: stdLib.Event,
    tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultK[K]],
    touchResponseChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ],
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
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojNBoxEventMap[K, D] = {
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
    __obj.updateDynamic("blur")(blur)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("canplay")(canplay)
    __obj.updateDynamic("canplaythrough")(canplaythrough)
    __obj.updateDynamic("cellContentChanged")(cellContentChanged)
    __obj.updateDynamic("cellMaximizeChanged")(cellMaximizeChanged)
    __obj.updateDynamic("cellsChanged")(cellsChanged)
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("columnsChanged")(columnsChanged)
    __obj.updateDynamic("columnsTitleChanged")(columnsTitleChanged)
    __obj.updateDynamic("contextmenu")(contextmenu)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("countLabelChanged")(countLabelChanged)
    __obj.updateDynamic("cuechange")(cuechange)
    __obj.updateDynamic("cut")(cut)
    __obj.updateDynamic("dataChanged")(dataChanged)
    __obj.updateDynamic("dblclick")(dblclick)
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
    __obj.updateDynamic("ended")(ended)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("fullscreenchange")(fullscreenchange)
    __obj.updateDynamic("fullscreenerror")(fullscreenerror)
    __obj.updateDynamic("gotpointercapture")(gotpointercapture)
    __obj.updateDynamic("groupAttributesChanged")(groupAttributesChanged)
    __obj.updateDynamic("groupBehaviorChanged")(groupBehaviorChanged)
    __obj.updateDynamic("hiddenCategoriesChanged")(hiddenCategoriesChanged)
    __obj.updateDynamic("highlightMatchChanged")(highlightMatchChanged)
    __obj.updateDynamic("highlightedCategoriesChanged")(highlightedCategoriesChanged)
    __obj.updateDynamic("hoverBehaviorChanged")(hoverBehaviorChanged)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("invalid")(invalid)
    __obj.updateDynamic("keydown")(keydown)
    __obj.updateDynamic("keypress")(keypress)
    __obj.updateDynamic("keyup")(keyup)
    __obj.updateDynamic("labelTruncationChanged")(labelTruncationChanged)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadeddata")(loadeddata)
    __obj.updateDynamic("loadedmetadata")(loadedmetadata)
    __obj.updateDynamic("loadend")(loadend)
    __obj.updateDynamic("loadstart")(loadstart)
    __obj.updateDynamic("lostpointercapture")(lostpointercapture)
    __obj.updateDynamic("maximizedColumnChanged")(maximizedColumnChanged)
    __obj.updateDynamic("maximizedRowChanged")(maximizedRowChanged)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mouseenter")(mouseenter)
    __obj.updateDynamic("mouseleave")(mouseleave)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("mouseout")(mouseout)
    __obj.updateDynamic("mouseover")(mouseover)
    __obj.updateDynamic("mouseup")(mouseup)
    __obj.updateDynamic("otherColorChanged")(otherColorChanged)
    __obj.updateDynamic("otherThresholdChanged")(otherThresholdChanged)
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
    __obj.updateDynamic("rowsChanged")(rowsChanged)
    __obj.updateDynamic("rowsTitleChanged")(rowsTitleChanged)
    __obj.updateDynamic("scroll")(scroll)
    __obj.updateDynamic("securitypolicyviolation")(securitypolicyviolation)
    __obj.updateDynamic("seeked")(seeked)
    __obj.updateDynamic("seeking")(seeking)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("selectionChanged")(selectionChanged)
    __obj.updateDynamic("selectionModeChanged")(selectionModeChanged)
    __obj.updateDynamic("stalled")(stalled)
    __obj.updateDynamic("styleDefaultsChanged")(styleDefaultsChanged)
    __obj.updateDynamic("submit")(submit)
    __obj.updateDynamic("suspend")(suspend)
    __obj.updateDynamic("timeupdate")(timeupdate)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("tooltipChanged")(tooltipChanged)
    __obj.updateDynamic("touchResponseChanged")(touchResponseChanged)
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
    __obj.updateDynamic("volumechange")(volumechange)
    __obj.updateDynamic("waiting")(waiting)
    __obj.updateDynamic("wheel")(wheel)
    __obj.asInstanceOf[ojNBoxEventMap[K, D]]
  }
}

