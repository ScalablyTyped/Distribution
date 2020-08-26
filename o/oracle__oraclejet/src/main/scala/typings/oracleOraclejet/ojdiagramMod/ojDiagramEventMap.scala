package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.anon.AnimationDuration
import typings.oracleOraclejet.anon.Drop
import typings.oracleOraclejet.anon.Halign
import typings.oracleOraclejet.anon.InsertSVGElement
import typings.oracleOraclejet.anon.`5`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeCollapse
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeExpand
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojCollapse
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojExpand
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.oracleOraclejetStrings.`lazy`
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.link
import typings.oracleOraclejet.oracleOraclejetStrings.linkAndNodes
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.node
import typings.oracleOraclejet.oracleOraclejetStrings.nodeAndIncomingLinks
import typings.oracleOraclejet.oracleOraclejetStrings.nodeAndLinks
import typings.oracleOraclejet.oracleOraclejetStrings.nodeAndOutgoingLinks
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.x
import typings.oracleOraclejet.oracleOraclejetStrings.y
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
trait ojDiagramEventMap[K1, K2, D1, D2] extends dvtBaseComponentEventMap[ojDiagramSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none] = js.native
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none] = js.native
  var asChanged: JetElementCustomEvent[String] = js.native
  var dndChanged: JetElementCustomEvent[Drop] = js.native
  var expandedChanged: JetElementCustomEvent[KeySet[K1]] = js.native
  var focusRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.native
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  var highlightMatchChanged: JetElementCustomEvent[any | all] = js.native
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none] = js.native
  var hoverRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.native
  var layoutChanged: JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]] = js.native
  var linkDataChanged: JetElementCustomEvent[(DataProvider[K2, D2]) | Null] = js.native
  var linkHighlightModeChanged: JetElementCustomEvent[linkAndNodes | link] = js.native
  var maxZoomChanged: JetElementCustomEvent[Double] = js.native
  var minZoomChanged: JetElementCustomEvent[Double] = js.native
  var nodeDataChanged: JetElementCustomEvent[(DataProvider[K1, D1]) | Null] = js.native
  var nodeHighlightModeChanged: JetElementCustomEvent[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node] = js.native
  var ojBeforeCollapse: typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeCollapse = js.native
  var ojBeforeExpand: typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeExpand = js.native
  var ojCollapse: typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojCollapse = js.native
  var ojExpand: typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojExpand = js.native
  var overviewChanged: JetElementCustomEvent[Halign] = js.native
  var panDirectionChanged: JetElementCustomEvent[x | y | auto] = js.native
  var panningChanged: JetElementCustomEvent[auto | none] = js.native
  var promotedLinkBehaviorChanged: JetElementCustomEvent[none | full | `lazy`] = js.native
  var rendererChanged: JetElementCustomEvent[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement]] = js.native
  var selectionChanged: JetElementCustomEvent[js.Array[K1 | K2]] = js.native
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none] = js.native
  var selectionRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.native
  var styleDefaultsChanged: JetElementCustomEvent[AnimationDuration] = js.native
  var tooltipChanged: JetElementCustomEvent[`5`[K1, K2, D1, D2]] = js.native
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto] = js.native
  var zoomRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.native
  var zoomingChanged: JetElementCustomEvent[auto | none] = js.native
}

object ojDiagramEventMap {
  @scala.inline
  def apply[K1, K2, D1, D2](
    abort: UIEvent,
    animationOnDataChangeChanged: JetElementCustomEvent[auto | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | none],
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
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    dndChanged: JetElementCustomEvent[Drop],
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
    expandedChanged: JetElementCustomEvent[KeySet[K1]],
    focus: FocusEvent,
    focusRendererChanged: JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
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
      (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
    ],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    layoutChanged: JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]],
    linkDataChanged: JetElementCustomEvent[(DataProvider[K2, D2]) | Null],
    linkHighlightModeChanged: JetElementCustomEvent[linkAndNodes | link],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maxZoomChanged: JetElementCustomEvent[Double],
    minZoomChanged: JetElementCustomEvent[Double],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    nodeDataChanged: JetElementCustomEvent[(DataProvider[K1, D1]) | Null],
    nodeHighlightModeChanged: JetElementCustomEvent[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node],
    ojBeforeCollapse: ojBeforeCollapse,
    ojBeforeExpand: ojBeforeExpand,
    ojCollapse: ojCollapse,
    ojExpand: ojExpand,
    overviewChanged: JetElementCustomEvent[Halign],
    panDirectionChanged: JetElementCustomEvent[x | y | auto],
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
    promotedLinkBehaviorChanged: JetElementCustomEvent[none | full | `lazy`],
    ratechange: Event,
    rendererChanged: JetElementCustomEvent[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement]],
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[K1 | K2]],
    selectionModeChanged: JetElementCustomEvent[single | multiple | none],
    selectionRendererChanged: JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
    ],
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    styleDefaultsChanged: JetElementCustomEvent[AnimationDuration],
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[`5`[K1, K2, D1, D2]],
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
    zoomRendererChanged: JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
    ],
    zoomingChanged: JetElementCustomEvent[auto | none]
  ): ojDiagramEventMap[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusRendererChanged = focusRendererChanged.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], hoverRendererChanged = hoverRendererChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], layoutChanged = layoutChanged.asInstanceOf[js.Any], linkDataChanged = linkDataChanged.asInstanceOf[js.Any], linkHighlightModeChanged = linkHighlightModeChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxZoomChanged = maxZoomChanged.asInstanceOf[js.Any], minZoomChanged = minZoomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], nodeDataChanged = nodeDataChanged.asInstanceOf[js.Any], nodeHighlightModeChanged = nodeHighlightModeChanged.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], overviewChanged = overviewChanged.asInstanceOf[js.Any], panDirectionChanged = panDirectionChanged.asInstanceOf[js.Any], panningChanged = panningChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], promotedLinkBehaviorChanged = promotedLinkBehaviorChanged.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rendererChanged = rendererChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRendererChanged = selectionRendererChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoomRendererChanged = zoomRendererChanged.asInstanceOf[js.Any], zoomingChanged = zoomingChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramEventMap[K1, K2, D1, D2]]
  }
  @scala.inline
  implicit class ojDiagramEventMapOps[Self <: ojDiagramEventMap[_, _, _, _], K1, K2, D1, D2] (val x: Self with (ojDiagramEventMap[K1, K2, D1, D2])) extends AnyVal {
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
    def setAnimationOnDataChangeChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOnDisplayChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("animationOnDisplayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsChanged(value: JetElementCustomEvent[String]): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDndChanged(value: JetElementCustomEvent[Drop]): Self = this.set("dndChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedChanged(value: JetElementCustomEvent[KeySet[K1]]): Self = this.set("expandedChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
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
          (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
        ]
    ): Self = this.set("hoverRendererChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutChanged(value: JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]]): Self = this.set("layoutChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkDataChanged(value: JetElementCustomEvent[(DataProvider[K2, D2]) | Null]): Self = this.set("linkDataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkHighlightModeChanged(value: JetElementCustomEvent[linkAndNodes | link]): Self = this.set("linkHighlightModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxZoomChanged(value: JetElementCustomEvent[Double]): Self = this.set("maxZoomChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinZoomChanged(value: JetElementCustomEvent[Double]): Self = this.set("minZoomChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeDataChanged(value: JetElementCustomEvent[(DataProvider[K1, D1]) | Null]): Self = this.set("nodeDataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeHighlightModeChanged(value: JetElementCustomEvent[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node]): Self = this.set("nodeHighlightModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeCollapse(value: ojBeforeCollapse): Self = this.set("ojBeforeCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeExpand(value: ojBeforeExpand): Self = this.set("ojBeforeExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjCollapse(value: ojCollapse): Self = this.set("ojCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjExpand(value: ojExpand): Self = this.set("ojExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverviewChanged(value: JetElementCustomEvent[Halign]): Self = this.set("overviewChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanDirectionChanged(value: JetElementCustomEvent[typings.oracleOraclejet.oracleOraclejetStrings.x | y | auto]): Self = this.set("panDirectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanningChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("panningChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPromotedLinkBehaviorChanged(value: JetElementCustomEvent[none | full | `lazy`]): Self = this.set("promotedLinkBehaviorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendererChanged(
      value: JetElementCustomEvent[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement]]
    ): Self = this.set("rendererChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(value: JetElementCustomEvent[js.Array[K1 | K2]]): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionModeChanged(value: JetElementCustomEvent[single | multiple | none]): Self = this.set("selectionModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
        ]
    ): Self = this.set("selectionRendererChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleDefaultsChanged(value: JetElementCustomEvent[AnimationDuration]): Self = this.set("styleDefaultsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipChanged(value: JetElementCustomEvent[`5`[K1, K2, D1, D2]]): Self = this.set("tooltipChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchResponseChanged(value: JetElementCustomEvent[touchStart | auto]): Self = this.set("touchResponseChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomRendererChanged(
      value: JetElementCustomEvent[
          (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
        ]
    ): Self = this.set("zoomRendererChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomingChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("zoomingChanged", value.asInstanceOf[js.Any])
  }
  
}

