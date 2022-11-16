package typings.oracleOraclejet.ojthematicmapMod

import typings.oracleOraclejet.anon.AreaSvgStyle
import typings.oracleOraclejet.anon.Geo
import typings.oracleOraclejet.anon.InsertSVGElement
import typings.oracleOraclejet.anon.`27`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.ojthematicmapMod.ojThematicMap.RendererContext
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.fixed
import typings.oracleOraclejet.oracleOraclejetStrings.labelAndShortDesc
import typings.oracleOraclejet.oracleOraclejetStrings.long
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.short
import typings.oracleOraclejet.oracleOraclejetStrings.shortDesc
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.zoom
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojThematicMapEventMap[K1, K2, K3, D1, D2, D3]
  extends StObject
     with dvtBaseComponentEventMap[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]] {
  
  var animationDurationChanged: JetElementCustomEvent[Double]
  
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  
  var areaDataChanged: JetElementCustomEvent[(DataProvider[K1, D1]) | Null]
  
  var asChanged: JetElementCustomEvent[String]
  
  var focusRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ]
  
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  
  var highlightMatchChanged: JetElementCustomEvent[any | all]
  
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none]
  
  var hoverRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ]
  
  var initialZoomingChanged: JetElementCustomEvent[auto | none]
  
  var isolatedItemChanged: JetElementCustomEvent[K1]
  
  var labelDisplayChanged: JetElementCustomEvent[on | off | auto]
  
  var labelTypeChanged: JetElementCustomEvent[long | short]
  
  var linkDataChanged: JetElementCustomEvent[(DataProvider[K2, D2]) | Null]
  
  var mapProviderChanged: JetElementCustomEvent[Geo]
  
  var markerDataChanged: JetElementCustomEvent[(DataProvider[K3, D3]) | Null]
  
  var markerZoomBehaviorChanged: JetElementCustomEvent[zoom | fixed]
  
  var maxZoomChanged: JetElementCustomEvent[Double]
  
  var panningChanged: JetElementCustomEvent[auto | none]
  
  var rendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ]
  
  var selectionChanged: JetElementCustomEvent[js.Array[K1 | K2 | K3]]
  
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none]
  
  var selectionRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ]
  
  var styleDefaultsChanged: JetElementCustomEvent[AreaSvgStyle]
  
  var tooltipChanged: JetElementCustomEvent[`27`[K1, K2, K3, D1, D2, D3]]
  
  var tooltipDisplayChanged: JetElementCustomEvent[auto | labelAndShortDesc | none | shortDesc]
  
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto]
  
  var zoomingChanged: JetElementCustomEvent[auto | none]
}
object ojThematicMapEventMap {
  
  inline def apply[K1, K2, K3, D1, D2, D3](
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
    beforeinput: InputEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    compositionend: CompositionEvent,
    compositionstart: CompositionEvent,
    compositionupdate: CompositionEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
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
      (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
    ],
    focusin: FocusEvent,
    focusout: FocusEvent,
    formdata: FormDataEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    hoverRendererChanged: JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
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
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mapProviderChanged: JetElementCustomEvent[Geo],
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
      (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
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
      (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
    ],
    selectionchange: Event,
    selectstart: Event,
    slotchange: Event,
    stalled: Event,
    styleDefaultsChanged: JetElementCustomEvent[AreaSvgStyle],
    submit: SubmitEvent,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[`27`[K1, K2, K3, D1, D2, D3]],
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
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent,
    zoomingChanged: JetElementCustomEvent[auto | none]
  ): ojThematicMapEventMap[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationDurationChanged = animationDurationChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], areaDataChanged = areaDataChanged.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusRendererChanged = focusRendererChanged.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], hoverRendererChanged = hoverRendererChanged.asInstanceOf[js.Any], initialZoomingChanged = initialZoomingChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], isolatedItemChanged = isolatedItemChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelDisplayChanged = labelDisplayChanged.asInstanceOf[js.Any], labelTypeChanged = labelTypeChanged.asInstanceOf[js.Any], linkDataChanged = linkDataChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mapProviderChanged = mapProviderChanged.asInstanceOf[js.Any], markerDataChanged = markerDataChanged.asInstanceOf[js.Any], markerZoomBehaviorChanged = markerZoomBehaviorChanged.asInstanceOf[js.Any], maxZoomChanged = maxZoomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], panningChanged = panningChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rendererChanged = rendererChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRendererChanged = selectionRendererChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], tooltipDisplayChanged = tooltipDisplayChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoomingChanged = zoomingChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapEventMap[K1, K2, K3, D1, D2, D3]]
  }
  
  extension [Self <: ojThematicMapEventMap[?, ?, ?, ?, ?, ?], K1, K2, K3, D1, D2, D3](x: Self & (ojThematicMapEventMap[K1, K2, K3, D1, D2, D3])) {
    
    inline def setAnimationDurationChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "animationDurationChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayChanged(value: JetElementCustomEvent[auto | none]): Self = StObject.set(x, "animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setAreaDataChanged(value: JetElementCustomEvent[(DataProvider[K1, D1]) | Null]): Self = StObject.set(x, "areaDataChanged", value.asInstanceOf[js.Any])
    
    inline def setAsChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "asChanged", value.asInstanceOf[js.Any])
    
    inline def setFocusRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
        ]
    ): Self = StObject.set(x, "focusRendererChanged", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = StObject.set(x, "hiddenCategoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setHighlightMatchChanged(value: JetElementCustomEvent[any | all]): Self = StObject.set(x, "highlightMatchChanged", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = StObject.set(x, "highlightedCategoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorChanged(value: JetElementCustomEvent[dim | none]): Self = StObject.set(x, "hoverBehaviorChanged", value.asInstanceOf[js.Any])
    
    inline def setHoverRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
        ]
    ): Self = StObject.set(x, "hoverRendererChanged", value.asInstanceOf[js.Any])
    
    inline def setInitialZoomingChanged(value: JetElementCustomEvent[auto | none]): Self = StObject.set(x, "initialZoomingChanged", value.asInstanceOf[js.Any])
    
    inline def setIsolatedItemChanged(value: JetElementCustomEvent[K1]): Self = StObject.set(x, "isolatedItemChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayChanged(value: JetElementCustomEvent[on | off | auto]): Self = StObject.set(x, "labelDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelTypeChanged(value: JetElementCustomEvent[long | short]): Self = StObject.set(x, "labelTypeChanged", value.asInstanceOf[js.Any])
    
    inline def setLinkDataChanged(value: JetElementCustomEvent[(DataProvider[K2, D2]) | Null]): Self = StObject.set(x, "linkDataChanged", value.asInstanceOf[js.Any])
    
    inline def setMapProviderChanged(value: JetElementCustomEvent[Geo]): Self = StObject.set(x, "mapProviderChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerDataChanged(value: JetElementCustomEvent[(DataProvider[K3, D3]) | Null]): Self = StObject.set(x, "markerDataChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerZoomBehaviorChanged(value: JetElementCustomEvent[zoom | fixed]): Self = StObject.set(x, "markerZoomBehaviorChanged", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "maxZoomChanged", value.asInstanceOf[js.Any])
    
    inline def setPanningChanged(value: JetElementCustomEvent[auto | none]): Self = StObject.set(x, "panningChanged", value.asInstanceOf[js.Any])
    
    inline def setRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
        ]
    ): Self = StObject.set(x, "rendererChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(value: JetElementCustomEvent[js.Array[K1 | K2 | K3]]): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeChanged(value: JetElementCustomEvent[single | multiple | none]): Self = StObject.set(x, "selectionModeChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
        ]
    ): Self = StObject.set(x, "selectionRendererChanged", value.asInstanceOf[js.Any])
    
    inline def setStyleDefaultsChanged(value: JetElementCustomEvent[AreaSvgStyle]): Self = StObject.set(x, "styleDefaultsChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipChanged(value: JetElementCustomEvent[`27`[K1, K2, K3, D1, D2, D3]]): Self = StObject.set(x, "tooltipChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipDisplayChanged(value: JetElementCustomEvent[auto | labelAndShortDesc | none | shortDesc]): Self = StObject.set(x, "tooltipDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setTouchResponseChanged(value: JetElementCustomEvent[touchStart | auto]): Self = StObject.set(x, "touchResponseChanged", value.asInstanceOf[js.Any])
    
    inline def setZoomingChanged(value: JetElementCustomEvent[auto | none]): Self = StObject.set(x, "zoomingChanged", value.asInstanceOf[js.Any])
  }
}
