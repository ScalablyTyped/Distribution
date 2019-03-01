package typings
package atOracleOraclejetLib.ojthematicmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapEventMap[K1, K2, K3, D1, D2, D3]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentEventMap[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]] {
  var animationDurationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var animationOnDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var areaDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null]
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var focusRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]) | scala.Null
  ]
  var hiddenCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]]
  var highlightMatchChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  ]
  var highlightedCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]]
  var hoverBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var hoverRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]) | scala.Null
  ]
  var initialZoomingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var isolatedItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K1]
  var labelDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
  var labelTypeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.short
  ]
  var linkDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null]
  var mapProviderChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Geo]
  var markerDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K3, D3]) | scala.Null]
  var markerZoomBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.fixed
  ]
  var maxZoomChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var panningChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var rendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]) | scala.Null
  ]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K1 | K2 | K3]]
  var selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var selectionRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]) | scala.Null
  ]
  var styleDefaultsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AreaSvgStyle]
  var tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1]
  ]
  var tooltipDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.labelAndShortDesc | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc
  ]
  var touchResponseChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
  var zoomingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
}

object ojThematicMapEventMap {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    abort: stdLib.UIEvent,
    animationDurationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    animationOnDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    animationcancel: stdLib.AnimationEvent,
    animationend: stdLib.AnimationEvent,
    animationiteration: stdLib.AnimationEvent,
    animationstart: stdLib.AnimationEvent,
    areaDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null],
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
    cut: stdLib.ClipboardEvent,
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
    focusRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ],
    fullscreenchange: stdLib.Event,
    fullscreenerror: stdLib.Event,
    gotpointercapture: stdLib.PointerEvent,
    hiddenCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]],
    highlightMatchChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
    ],
    highlightedCategoriesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]],
    hoverBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    hoverRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ],
    initialZoomingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    input: stdLib.Event,
    invalid: stdLib.Event,
    isolatedItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K1],
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    labelDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ],
    labelTypeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.short
    ],
    linkDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null],
    load: stdLib.Event,
    loadeddata: stdLib.Event,
    loadedmetadata: stdLib.Event,
    loadend: stdLib.ProgressEvent,
    loadstart: stdLib.Event,
    lostpointercapture: stdLib.PointerEvent,
    mapProviderChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Geo],
    markerDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K3, D3]) | scala.Null],
    markerZoomBehaviorChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.fixed
    ],
    maxZoomChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    panningChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
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
    rendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ],
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    scroll: stdLib.UIEvent,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.UIEvent,
    selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K1 | K2 | K3]],
    selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ],
    selectionRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ],
    stalled: stdLib.Event,
    styleDefaultsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AreaSvgStyle],
    submit: stdLib.Event,
    suspend: stdLib.Event,
    timeupdate: stdLib.Event,
    toggle: stdLib.Event,
    tooltipChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1]
    ],
    tooltipDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.labelAndShortDesc | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc
    ],
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
    wheel: stdLib.WheelEvent,
    zoomingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ]
  ): ojThematicMapEventMap[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("animationDurationChanged")(animationDurationChanged)
    __obj.updateDynamic("animationOnDisplayChanged")(animationOnDisplayChanged)
    __obj.updateDynamic("animationcancel")(animationcancel)
    __obj.updateDynamic("animationend")(animationend)
    __obj.updateDynamic("animationiteration")(animationiteration)
    __obj.updateDynamic("animationstart")(animationstart)
    __obj.updateDynamic("areaDataChanged")(areaDataChanged)
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
    __obj.updateDynamic("cut")(cut)
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
    __obj.updateDynamic("focusRendererChanged")(focusRendererChanged)
    __obj.updateDynamic("fullscreenchange")(fullscreenchange)
    __obj.updateDynamic("fullscreenerror")(fullscreenerror)
    __obj.updateDynamic("gotpointercapture")(gotpointercapture)
    __obj.updateDynamic("hiddenCategoriesChanged")(hiddenCategoriesChanged)
    __obj.updateDynamic("highlightMatchChanged")(highlightMatchChanged)
    __obj.updateDynamic("highlightedCategoriesChanged")(highlightedCategoriesChanged)
    __obj.updateDynamic("hoverBehaviorChanged")(hoverBehaviorChanged)
    __obj.updateDynamic("hoverRendererChanged")(hoverRendererChanged)
    __obj.updateDynamic("initialZoomingChanged")(initialZoomingChanged)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("invalid")(invalid)
    __obj.updateDynamic("isolatedItemChanged")(isolatedItemChanged)
    __obj.updateDynamic("keydown")(keydown)
    __obj.updateDynamic("keypress")(keypress)
    __obj.updateDynamic("keyup")(keyup)
    __obj.updateDynamic("labelDisplayChanged")(labelDisplayChanged)
    __obj.updateDynamic("labelTypeChanged")(labelTypeChanged)
    __obj.updateDynamic("linkDataChanged")(linkDataChanged)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadeddata")(loadeddata)
    __obj.updateDynamic("loadedmetadata")(loadedmetadata)
    __obj.updateDynamic("loadend")(loadend)
    __obj.updateDynamic("loadstart")(loadstart)
    __obj.updateDynamic("lostpointercapture")(lostpointercapture)
    __obj.updateDynamic("mapProviderChanged")(mapProviderChanged)
    __obj.updateDynamic("markerDataChanged")(markerDataChanged)
    __obj.updateDynamic("markerZoomBehaviorChanged")(markerZoomBehaviorChanged)
    __obj.updateDynamic("maxZoomChanged")(maxZoomChanged)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mouseenter")(mouseenter)
    __obj.updateDynamic("mouseleave")(mouseleave)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("mouseout")(mouseout)
    __obj.updateDynamic("mouseover")(mouseover)
    __obj.updateDynamic("mouseup")(mouseup)
    __obj.updateDynamic("panningChanged")(panningChanged)
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
    __obj.updateDynamic("rendererChanged")(rendererChanged)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("scroll")(scroll)
    __obj.updateDynamic("securitypolicyviolation")(securitypolicyviolation)
    __obj.updateDynamic("seeked")(seeked)
    __obj.updateDynamic("seeking")(seeking)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("selectionChanged")(selectionChanged)
    __obj.updateDynamic("selectionModeChanged")(selectionModeChanged)
    __obj.updateDynamic("selectionRendererChanged")(selectionRendererChanged)
    __obj.updateDynamic("stalled")(stalled)
    __obj.updateDynamic("styleDefaultsChanged")(styleDefaultsChanged)
    __obj.updateDynamic("submit")(submit)
    __obj.updateDynamic("suspend")(suspend)
    __obj.updateDynamic("timeupdate")(timeupdate)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("tooltipChanged")(tooltipChanged)
    __obj.updateDynamic("tooltipDisplayChanged")(tooltipDisplayChanged)
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
    __obj.updateDynamic("zoomingChanged")(zoomingChanged)
    __obj.asInstanceOf[ojThematicMapEventMap[K1, K2, K3, D1, D2, D3]]
  }
}

