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

@js.native
trait ojThematicMapEventMap[K1, K2, K3, D1, D2, D3] extends dvtBaseComponentEventMap[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]] {
  var animationDurationChanged: JetElementCustomEvent[Double] = js.native
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none] = js.native
  var areaDataChanged: JetElementCustomEvent[(DataProvider[K1, D1]) | Null] = js.native
  var asChanged: JetElementCustomEvent[String] = js.native
  var focusRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.native
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  var highlightMatchChanged: JetElementCustomEvent[any | all] = js.native
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none] = js.native
  var hoverRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.native
  var initialZoomingChanged: JetElementCustomEvent[auto | none] = js.native
  var isolatedItemChanged: JetElementCustomEvent[K1] = js.native
  var labelDisplayChanged: JetElementCustomEvent[on | off | auto] = js.native
  var labelTypeChanged: JetElementCustomEvent[long | short] = js.native
  var linkDataChanged: JetElementCustomEvent[(DataProvider[K2, D2]) | Null] = js.native
  var mapProviderChanged: JetElementCustomEvent[Geo] = js.native
  var markerDataChanged: JetElementCustomEvent[(DataProvider[K3, D3]) | Null] = js.native
  var markerZoomBehaviorChanged: JetElementCustomEvent[zoom | fixed] = js.native
  var maxZoomChanged: JetElementCustomEvent[Double] = js.native
  var panningChanged: JetElementCustomEvent[auto | none] = js.native
  var rendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.native
  var selectionChanged: JetElementCustomEvent[js.Array[K1 | K2 | K3]] = js.native
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none] = js.native
  var selectionRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.native
  var styleDefaultsChanged: JetElementCustomEvent[AreaSvgStyle] = js.native
  var tooltipChanged: JetElementCustomEvent[`27`[K1, K2, K3, D1, D2, D3]] = js.native
  var tooltipDisplayChanged: JetElementCustomEvent[auto | labelAndShortDesc | none | shortDesc] = js.native
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto] = js.native
  var zoomingChanged: JetElementCustomEvent[auto | none] = js.native
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
      (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
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
    stalled: Event,
    styleDefaultsChanged: JetElementCustomEvent[AreaSvgStyle],
    submit: Event,
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
    wheel: WheelEvent,
    zoomingChanged: JetElementCustomEvent[auto | none]
  ): ojThematicMapEventMap[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationDurationChanged = animationDurationChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], areaDataChanged = areaDataChanged.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusRendererChanged = focusRendererChanged.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], hoverRendererChanged = hoverRendererChanged.asInstanceOf[js.Any], initialZoomingChanged = initialZoomingChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], isolatedItemChanged = isolatedItemChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelDisplayChanged = labelDisplayChanged.asInstanceOf[js.Any], labelTypeChanged = labelTypeChanged.asInstanceOf[js.Any], linkDataChanged = linkDataChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mapProviderChanged = mapProviderChanged.asInstanceOf[js.Any], markerDataChanged = markerDataChanged.asInstanceOf[js.Any], markerZoomBehaviorChanged = markerZoomBehaviorChanged.asInstanceOf[js.Any], maxZoomChanged = maxZoomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], panningChanged = panningChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rendererChanged = rendererChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRendererChanged = selectionRendererChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], tooltipDisplayChanged = tooltipDisplayChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoomingChanged = zoomingChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapEventMap[K1, K2, K3, D1, D2, D3]]
  }
  @scala.inline
  implicit class ojThematicMapEventMapOps[Self <: ojThematicMapEventMap[_, _, _, _, _, _], K1, K2, K3, D1, D2, D3] (val x: Self with (ojThematicMapEventMap[K1, K2, K3, D1, D2, D3])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationDurationChanged(value: JetElementCustomEvent[Double]): Self = this.set("animationDurationChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOnDisplayChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("animationOnDisplayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaDataChanged(value: JetElementCustomEvent[(DataProvider[K1, D1]) | Null]): Self = this.set("areaDataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsChanged(value: JetElementCustomEvent[String]): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
        ]
    ): Self = this.set("focusRendererChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiddenCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = this.set("hiddenCategoriesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightMatchChanged(value: JetElementCustomEvent[any | all]): Self = this.set("highlightMatchChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = this.set("highlightedCategoriesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverBehaviorChanged(value: JetElementCustomEvent[dim | none]): Self = this.set("hoverBehaviorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
        ]
    ): Self = this.set("hoverRendererChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialZoomingChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("initialZoomingChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsolatedItemChanged(value: JetElementCustomEvent[K1]): Self = this.set("isolatedItemChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelDisplayChanged(value: JetElementCustomEvent[on | off | auto]): Self = this.set("labelDisplayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelTypeChanged(value: JetElementCustomEvent[long | short]): Self = this.set("labelTypeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkDataChanged(value: JetElementCustomEvent[(DataProvider[K2, D2]) | Null]): Self = this.set("linkDataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapProviderChanged(value: JetElementCustomEvent[Geo]): Self = this.set("mapProviderChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerDataChanged(value: JetElementCustomEvent[(DataProvider[K3, D3]) | Null]): Self = this.set("markerDataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerZoomBehaviorChanged(value: JetElementCustomEvent[zoom | fixed]): Self = this.set("markerZoomBehaviorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxZoomChanged(value: JetElementCustomEvent[Double]): Self = this.set("maxZoomChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanningChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("panningChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
        ]
    ): Self = this.set("rendererChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(value: JetElementCustomEvent[js.Array[K1 | K2 | K3]]): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionModeChanged(value: JetElementCustomEvent[single | multiple | none]): Self = this.set("selectionModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
        ]
    ): Self = this.set("selectionRendererChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleDefaultsChanged(value: JetElementCustomEvent[AreaSvgStyle]): Self = this.set("styleDefaultsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipChanged(value: JetElementCustomEvent[`27`[K1, K2, K3, D1, D2, D3]]): Self = this.set("tooltipChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipDisplayChanged(value: JetElementCustomEvent[auto | labelAndShortDesc | none | shortDesc]): Self = this.set("tooltipDisplayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchResponseChanged(value: JetElementCustomEvent[touchStart | auto]): Self = this.set("touchResponseChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomingChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("zoomingChanged", value.asInstanceOf[js.Any])
  }
  
}

