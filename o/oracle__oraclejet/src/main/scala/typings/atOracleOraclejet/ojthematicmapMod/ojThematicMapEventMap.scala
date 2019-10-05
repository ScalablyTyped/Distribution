package typings.atOracleOraclejet.ojthematicmapMod

import typings.atOracleOraclejet.Anon_AreaSvgStyle
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultD1
import typings.atOracleOraclejet.Anon_Geo
import typings.atOracleOraclejet.Anon_InsertSVGElement
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.fixed
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelAndShortDesc
import typings.atOracleOraclejet.atOracleOraclejetStrings.long
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.short
import typings.atOracleOraclejet.atOracleOraclejetStrings.shortDesc
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.zoom
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typings.atOracleOraclejet.ojthematicmapMod.ojThematicMap.RendererContext
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

trait ojThematicMapEventMap[K1, K2, K3, D1, D2, D3] extends dvtBaseComponentEventMap[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]] {
  var animationDurationChanged: JetElementCustomEvent[Double]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  var areaDataChanged: JetElementCustomEvent[(DataProvider[K1, D1]) | Null]
  var asChanged: JetElementCustomEvent[String]
  var focusRendererChanged: JetElementCustomEvent[
    (js.Function1[
      /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
      Anon_InsertSVGElement | Unit
    ]) | Null
  ]
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var highlightMatchChanged: JetElementCustomEvent[any | all]
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none]
  var hoverRendererChanged: JetElementCustomEvent[
    (js.Function1[
      /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
      Anon_InsertSVGElement | Unit
    ]) | Null
  ]
  var initialZoomingChanged: JetElementCustomEvent[auto | none]
  var isolatedItemChanged: JetElementCustomEvent[K1]
  var labelDisplayChanged: JetElementCustomEvent[on | off | auto]
  var labelTypeChanged: JetElementCustomEvent[long | short]
  var linkDataChanged: JetElementCustomEvent[(DataProvider[K2, D2]) | Null]
  var mapProviderChanged: JetElementCustomEvent[Anon_Geo]
  var markerDataChanged: JetElementCustomEvent[(DataProvider[K3, D3]) | Null]
  var markerZoomBehaviorChanged: JetElementCustomEvent[zoom | fixed]
  var maxZoomChanged: JetElementCustomEvent[Double]
  var panningChanged: JetElementCustomEvent[auto | none]
  var rendererChanged: JetElementCustomEvent[
    (js.Function1[
      /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
      Anon_InsertSVGElement | Unit
    ]) | Null
  ]
  var selectionChanged: JetElementCustomEvent[js.Array[K1 | K2 | K3]]
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none]
  var selectionRendererChanged: JetElementCustomEvent[
    (js.Function1[
      /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
      Anon_InsertSVGElement | Unit
    ]) | Null
  ]
  var styleDefaultsChanged: JetElementCustomEvent[Anon_AreaSvgStyle]
  var tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultD1[D3, K1, K2, D1, K3, D2]]
  var tooltipDisplayChanged: JetElementCustomEvent[auto | labelAndShortDesc | none | shortDesc]
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto]
  var zoomingChanged: JetElementCustomEvent[auto | none]
}

object ojThematicMapEventMap {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    abort: UIEvent,
    animationDurationChanged: JetElementCustomEvent[Double],
    animationOnDisplayChanged: JetElementCustomEvent[auto | none],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    areaDataChanged: JetElementCustomEvent[(DataProvider[K1, D1]) | Null],
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
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusRendererChanged: JetElementCustomEvent[
      (js.Function1[
        /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
        Anon_InsertSVGElement | Unit
      ]) | Null
    ],
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    hoverRendererChanged: JetElementCustomEvent[
      (js.Function1[
        /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
        Anon_InsertSVGElement | Unit
      ]) | Null
    ],
    initialZoomingChanged: JetElementCustomEvent[auto | none],
    input: Event,
    invalid: Event,
    isolatedItemChanged: JetElementCustomEvent[K1],
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelDisplayChanged: JetElementCustomEvent[on | off | auto],
    labelTypeChanged: JetElementCustomEvent[long | short],
    linkDataChanged: JetElementCustomEvent[(DataProvider[K2, D2]) | Null],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mapProviderChanged: JetElementCustomEvent[Anon_Geo],
    markerDataChanged: JetElementCustomEvent[(DataProvider[K3, D3]) | Null],
    markerZoomBehaviorChanged: JetElementCustomEvent[zoom | fixed],
    maxZoomChanged: JetElementCustomEvent[Double],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    panningChanged: JetElementCustomEvent[auto | none],
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
    rendererChanged: JetElementCustomEvent[
      (js.Function1[
        /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
        Anon_InsertSVGElement | Unit
      ]) | Null
    ],
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[K1 | K2 | K3]],
    selectionModeChanged: JetElementCustomEvent[single | multiple | none],
    selectionRendererChanged: JetElementCustomEvent[
      (js.Function1[
        /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
        Anon_InsertSVGElement | Unit
      ]) | Null
    ],
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    styleDefaultsChanged: JetElementCustomEvent[Anon_AreaSvgStyle],
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultD1[D3, K1, K2, D1, K3, D2]],
    tooltipDisplayChanged: JetElementCustomEvent[auto | labelAndShortDesc | none | shortDesc],
    touchResponseChanged: JetElementCustomEvent[touchStart | auto],
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    trackResizeChanged: JetElementCustomEvent[on | off],
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent,
    zoomingChanged: JetElementCustomEvent[auto | none]
  ): ojThematicMapEventMap[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(abort = abort, animationDurationChanged = animationDurationChanged, animationOnDisplayChanged = animationOnDisplayChanged, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, areaDataChanged = areaDataChanged, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusRendererChanged = focusRendererChanged, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, hiddenCategoriesChanged = hiddenCategoriesChanged, highlightMatchChanged = highlightMatchChanged, highlightedCategoriesChanged = highlightedCategoriesChanged, hoverBehaviorChanged = hoverBehaviorChanged, hoverRendererChanged = hoverRendererChanged, initialZoomingChanged = initialZoomingChanged, input = input, invalid = invalid, isolatedItemChanged = isolatedItemChanged, keydown = keydown, keypress = keypress, keyup = keyup, labelDisplayChanged = labelDisplayChanged, labelTypeChanged = labelTypeChanged, linkDataChanged = linkDataChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mapProviderChanged = mapProviderChanged, markerDataChanged = markerDataChanged, markerZoomBehaviorChanged = markerZoomBehaviorChanged, maxZoomChanged = maxZoomChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, panningChanged = panningChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, rendererChanged = rendererChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionRendererChanged = selectionRendererChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, styleDefaultsChanged = styleDefaultsChanged, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, tooltipDisplayChanged = tooltipDisplayChanged, touchResponseChanged = touchResponseChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel, zoomingChanged = zoomingChanged)
  
    __obj.asInstanceOf[ojThematicMapEventMap[K1, K2, K3, D1, D2, D3]]
  }
}

