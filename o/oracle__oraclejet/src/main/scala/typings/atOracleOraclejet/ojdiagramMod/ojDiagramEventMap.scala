package typings.atOracleOraclejet.ojdiagramMod

import typings.atOracleOraclejet.Anon_AnimationDuration
import typings.atOracleOraclejet.Anon_Bottom
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsert
import typings.atOracleOraclejet.Anon_DragDrop
import typings.atOracleOraclejet.Anon_InsertSVGElement
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.`lazy`
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.full
import typings.atOracleOraclejet.atOracleOraclejetStrings.link
import typings.atOracleOraclejet.atOracleOraclejetStrings.linkAndNodes
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.node
import typings.atOracleOraclejet.atOracleOraclejetStrings.nodeAndIncomingLinks
import typings.atOracleOraclejet.atOracleOraclejetStrings.nodeAndLinks
import typings.atOracleOraclejet.atOracleOraclejetStrings.nodeAndOutgoingLinks
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.x
import typings.atOracleOraclejet.atOracleOraclejetStrings.y
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typings.atOracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeCollapse
import typings.atOracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeExpand
import typings.atOracleOraclejet.ojdiagramMod.ojDiagram.ojCollapse
import typings.atOracleOraclejet.ojdiagramMod.ojDiagram.ojExpand
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typings.atOracleOraclejet.ojkeysetMod.KeySet
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

trait ojDiagramEventMap[K1, K2, D1, D2] extends dvtBaseComponentEventMap[ojDiagramSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  var asChanged: JetElementCustomEvent[String]
  var dndChanged: JetElementCustomEvent[Anon_DragDrop]
  var expandedChanged: JetElementCustomEvent[KeySet[K1]]
  var focusRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
  ]
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var highlightMatchChanged: JetElementCustomEvent[any | all]
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none]
  var hoverRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
  ]
  var layoutChanged: JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]]
  var linkDataChanged: JetElementCustomEvent[(DataProvider[K2, D2]) | Null]
  var linkHighlightModeChanged: JetElementCustomEvent[linkAndNodes | link]
  var maxZoomChanged: JetElementCustomEvent[Double]
  var minZoomChanged: JetElementCustomEvent[Double]
  var nodeDataChanged: JetElementCustomEvent[(DataProvider[K1, D1]) | Null]
  var nodeHighlightModeChanged: JetElementCustomEvent[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node]
  var ojBeforeCollapse: typings.atOracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeCollapse
  var ojBeforeExpand: typings.atOracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeExpand
  var ojCollapse: typings.atOracleOraclejet.ojdiagramMod.ojDiagram.ojCollapse
  var ojExpand: typings.atOracleOraclejet.ojdiagramMod.ojDiagram.ojExpand
  var overviewChanged: JetElementCustomEvent[Anon_Bottom]
  var panDirectionChanged: JetElementCustomEvent[x | y | auto]
  var panningChanged: JetElementCustomEvent[auto | none]
  var promotedLinkBehaviorChanged: JetElementCustomEvent[none | full | `lazy`]
  var rendererChanged: JetElementCustomEvent[js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement]]
  var selectionChanged: JetElementCustomEvent[js.Array[K1 | K2]]
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none]
  var selectionRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
  ]
  var styleDefaultsChanged: JetElementCustomEvent[Anon_AnimationDuration]
  var tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsert[K1, K2, D1, D2]]
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto]
  var zoomRendererChanged: JetElementCustomEvent[
    (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
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
    dndChanged: JetElementCustomEvent[Anon_DragDrop],
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
      (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
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
      (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
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
    loadend: ProgressEvent[EventTarget],
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
    overviewChanged: JetElementCustomEvent[Anon_Bottom],
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
    rendererChanged: JetElementCustomEvent[js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement]],
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
      (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
    ],
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    styleDefaultsChanged: JetElementCustomEvent[Anon_AnimationDuration],
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsert[K1, K2, D1, D2]],
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
      (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
    ],
    zoomingChanged: JetElementCustomEvent[auto | none]
  ): ojDiagramEventMap[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(abort = abort, animationOnDataChangeChanged = animationOnDataChangeChanged, animationOnDisplayChanged = animationOnDisplayChanged, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, dndChanged = dndChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, expandedChanged = expandedChanged, focus = focus, focusRendererChanged = focusRendererChanged, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, hiddenCategoriesChanged = hiddenCategoriesChanged, highlightMatchChanged = highlightMatchChanged, highlightedCategoriesChanged = highlightedCategoriesChanged, hoverBehaviorChanged = hoverBehaviorChanged, hoverRendererChanged = hoverRendererChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, layoutChanged = layoutChanged, linkDataChanged = linkDataChanged, linkHighlightModeChanged = linkHighlightModeChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, maxZoomChanged = maxZoomChanged, minZoomChanged = minZoomChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, nodeDataChanged = nodeDataChanged, nodeHighlightModeChanged = nodeHighlightModeChanged, ojBeforeCollapse = ojBeforeCollapse, ojBeforeExpand = ojBeforeExpand, ojCollapse = ojCollapse, ojExpand = ojExpand, overviewChanged = overviewChanged, panDirectionChanged = panDirectionChanged, panningChanged = panningChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, promotedLinkBehaviorChanged = promotedLinkBehaviorChanged, ratechange = ratechange, rendererChanged = rendererChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionRendererChanged = selectionRendererChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, styleDefaultsChanged = styleDefaultsChanged, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchResponseChanged = touchResponseChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel, zoomRendererChanged = zoomRendererChanged, zoomingChanged = zoomingChanged)
  
    __obj.asInstanceOf[ojDiagramEventMap[K1, K2, D1, D2]]
  }
}

