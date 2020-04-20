package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.Anon5
import typings.oracleOraclejet.AnonAnimationDuration
import typings.oracleOraclejet.AnonDrop
import typings.oracleOraclejet.AnonHalign
import typings.oracleOraclejet.AnonInsertSVGElement
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
import typings.std.EventTarget
import typings.std.Event_
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

trait ojDiagramEventMap[K1, K2, D1, D2] extends dvtBaseComponentEventMap[ojDiagramSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  var asChanged: JetElementCustomEvent[String]
  var dndChanged: JetElementCustomEvent[AnonDrop]
  var expandedChanged: JetElementCustomEvent[KeySet[K1]]
  var focusRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  ]
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var highlightMatchChanged: JetElementCustomEvent[any | all]
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none]
  var hoverRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  ]
  var layoutChanged: JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]]
  var linkDataChanged: JetElementCustomEvent[(DataProvider[K2, D2]) | Null]
  var linkHighlightModeChanged: JetElementCustomEvent[linkAndNodes | link]
  var maxZoomChanged: JetElementCustomEvent[Double]
  var minZoomChanged: JetElementCustomEvent[Double]
  var nodeDataChanged: JetElementCustomEvent[(DataProvider[K1, D1]) | Null]
  var nodeHighlightModeChanged: JetElementCustomEvent[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node]
  var ojBeforeCollapse: typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeCollapse
  var ojBeforeExpand: typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeExpand
  var ojCollapse: typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojCollapse
  var ojExpand: typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojExpand
  var overviewChanged: JetElementCustomEvent[AnonHalign]
  var panDirectionChanged: JetElementCustomEvent[x | y | auto]
  var panningChanged: JetElementCustomEvent[auto | none]
  var promotedLinkBehaviorChanged: JetElementCustomEvent[none | full | `lazy`]
  var rendererChanged: JetElementCustomEvent[js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement]]
  var selectionChanged: JetElementCustomEvent[js.Array[K1 | K2]]
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none]
  var selectionRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  ]
  var styleDefaultsChanged: JetElementCustomEvent[AnonAnimationDuration]
  var tooltipChanged: JetElementCustomEvent[Anon5[K1, K2, D1, D2]]
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto]
  var zoomRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  ]
  var zoomingChanged: JetElementCustomEvent[auto | none]
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
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    change: Event_,
    click: MouseEvent,
    close: Event_,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event_,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    dndChanged: JetElementCustomEvent[AnonDrop],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event_,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event_,
    emptied: Event_,
    ended: Event_,
    error: ErrorEvent,
    expandedChanged: JetElementCustomEvent[KeySet[K1]],
    focus: FocusEvent,
    focusRendererChanged: JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
    ],
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event_,
    fullscreenerror: Event_,
    gotpointercapture: PointerEvent,
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    hoverRendererChanged: JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
    ],
    input: Event_,
    invalid: Event_,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    layoutChanged: JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]],
    linkDataChanged: JetElementCustomEvent[(DataProvider[K2, D2]) | Null],
    linkHighlightModeChanged: JetElementCustomEvent[linkAndNodes | link],
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
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
    overviewChanged: JetElementCustomEvent[AnonHalign],
    panDirectionChanged: JetElementCustomEvent[x | y | auto],
    panningChanged: JetElementCustomEvent[auto | none],
    paste: ClipboardEvent,
    pause: Event_,
    play: Event_,
    playing: Event_,
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
    ratechange: Event_,
    rendererChanged: JetElementCustomEvent[js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement]],
    reset: Event_,
    resize: UIEvent,
    scroll: Event_,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionChanged: JetElementCustomEvent[js.Array[K1 | K2]],
    selectionModeChanged: JetElementCustomEvent[single | multiple | none],
    selectionRendererChanged: JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
    ],
    selectionchange: Event_,
    selectstart: Event_,
    stalled: Event_,
    styleDefaultsChanged: JetElementCustomEvent[AnonAnimationDuration],
    submit: Event_,
    suspend: Event_,
    timeupdate: Event_,
    toggle: Event_,
    tooltipChanged: JetElementCustomEvent[Anon5[K1, K2, D1, D2]],
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
    volumechange: Event_,
    waiting: Event_,
    wheel: WheelEvent,
    zoomRendererChanged: JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
    ],
    zoomingChanged: JetElementCustomEvent[auto | none]
  ): ojDiagramEventMap[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusRendererChanged = focusRendererChanged.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], hoverRendererChanged = hoverRendererChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], layoutChanged = layoutChanged.asInstanceOf[js.Any], linkDataChanged = linkDataChanged.asInstanceOf[js.Any], linkHighlightModeChanged = linkHighlightModeChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxZoomChanged = maxZoomChanged.asInstanceOf[js.Any], minZoomChanged = minZoomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], nodeDataChanged = nodeDataChanged.asInstanceOf[js.Any], nodeHighlightModeChanged = nodeHighlightModeChanged.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], overviewChanged = overviewChanged.asInstanceOf[js.Any], panDirectionChanged = panDirectionChanged.asInstanceOf[js.Any], panningChanged = panningChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], promotedLinkBehaviorChanged = promotedLinkBehaviorChanged.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rendererChanged = rendererChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRendererChanged = selectionRendererChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoomRendererChanged = zoomRendererChanged.asInstanceOf[js.Any], zoomingChanged = zoomingChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramEventMap[K1, K2, D1, D2]]
  }
}

