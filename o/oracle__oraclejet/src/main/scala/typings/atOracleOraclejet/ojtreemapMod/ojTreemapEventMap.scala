package typings.atOracleOraclejet.ojtreemapMod

import typings.atOracleOraclejet.Anon_BottomCenter
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultDK
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertDK
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bevels
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.gaps
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.outer
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.sliceAndDiceHorizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.sliceAndDiceVertical
import typings.atOracleOraclejet.atOracleOraclejetStrings.squarified
import typings.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typings.atOracleOraclejet.ojtreemapMod.ojTreemapNs.ojBeforeDrill
import typings.atOracleOraclejet.ojtreemapMod.ojTreemapNs.ojDrill
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

trait ojTreemapEventMap[K, D] extends dvtBaseComponentEventMap[ojTreemapSettableProperties[K, D]] {
  var animationDurationChanged: JetElementCustomEvent[Double]
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  var animationUpdateColorChanged: JetElementCustomEvent[String]
  var asChanged: JetElementCustomEvent[String]
  var colorLabelChanged: JetElementCustomEvent[String]
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  var displayLevelsChanged: JetElementCustomEvent[Double]
  var drillingChanged: JetElementCustomEvent[on | off]
  var groupGapsChanged: JetElementCustomEvent[all | none | outer]
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var highlightMatchChanged: JetElementCustomEvent[any | all]
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none]
  var hoverBehaviorDelayChanged: JetElementCustomEvent[Double]
  var isolatedNodeChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['isolatedNode'] */ js.Any
  ]
  var layoutChanged: JetElementCustomEvent[sliceAndDiceHorizontal | sliceAndDiceVertical | squarified]
  var nodeContentChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertDK[K, D]]
  var nodeDefaultsChanged: JetElementCustomEvent[Anon_BottomCenter]
  var nodeSeparatorsChanged: JetElementCustomEvent[bevels | gaps]
  var ojBeforeDrill: typings.atOracleOraclejet.ojtreemapMod.ojTreemapNs.ojBeforeDrill
  var ojDrill: typings.atOracleOraclejet.ojtreemapMod.ojTreemapNs.ojDrill
  var rootNodeChanged: JetElementCustomEvent[
    /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['rootNode'] */ js.Any
  ]
  var selectionChanged: JetElementCustomEvent[js.Array[_]]
  var selectionModeChanged: JetElementCustomEvent[none | single | multiple]
  var sizeLabelChanged: JetElementCustomEvent[String]
  var sortingChanged: JetElementCustomEvent[on | off]
  var tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultDK[K, D]]
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto]
}

object ojTreemapEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationDurationChanged: JetElementCustomEvent[Double],
    animationOnDataChangeChanged: JetElementCustomEvent[auto | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | none],
    animationUpdateColorChanged: JetElementCustomEvent[String],
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
    colorLabelChanged: JetElementCustomEvent[String],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
    displayLevelsChanged: JetElementCustomEvent[Double],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: JetElementCustomEvent[on | off],
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    groupGapsChanged: JetElementCustomEvent[all | none | outer],
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    hoverBehaviorDelayChanged: JetElementCustomEvent[Double],
    input: Event,
    invalid: Event,
    isolatedNodeChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['isolatedNode'] */ js.Any
    ],
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    layoutChanged: JetElementCustomEvent[sliceAndDiceHorizontal | sliceAndDiceVertical | squarified],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    nodeContentChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertDK[K, D]],
    nodeDefaultsChanged: JetElementCustomEvent[Anon_BottomCenter],
    nodeSeparatorsChanged: JetElementCustomEvent[bevels | gaps],
    ojBeforeDrill: ojBeforeDrill,
    ojDrill: ojDrill,
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
    reset: Event,
    resize: UIEvent,
    rootNodeChanged: JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['rootNode'] */ js.Any
    ],
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[_]],
    selectionModeChanged: JetElementCustomEvent[none | single | multiple],
    selectionchange: Event,
    selectstart: Event,
    sizeLabelChanged: JetElementCustomEvent[String],
    sortingChanged: JetElementCustomEvent[on | off],
    stalled: Event,
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultDK[K, D]],
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
    wheel: WheelEvent
  ): ojTreemapEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationDurationChanged = animationDurationChanged, animationOnDataChangeChanged = animationOnDataChangeChanged, animationOnDisplayChanged = animationOnDisplayChanged, animationUpdateColorChanged = animationUpdateColorChanged, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, colorLabelChanged = colorLabelChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dataChanged = dataChanged, dblclick = dblclick, displayLevelsChanged = displayLevelsChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillingChanged = drillingChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, groupGapsChanged = groupGapsChanged, hiddenCategoriesChanged = hiddenCategoriesChanged, highlightMatchChanged = highlightMatchChanged, highlightedCategoriesChanged = highlightedCategoriesChanged, hoverBehaviorChanged = hoverBehaviorChanged, hoverBehaviorDelayChanged = hoverBehaviorDelayChanged, input = input, invalid = invalid, isolatedNodeChanged = isolatedNodeChanged, keydown = keydown, keypress = keypress, keyup = keyup, layoutChanged = layoutChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, nodeContentChanged = nodeContentChanged, nodeDefaultsChanged = nodeDefaultsChanged, nodeSeparatorsChanged = nodeSeparatorsChanged, ojBeforeDrill = ojBeforeDrill, ojDrill = ojDrill, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rootNodeChanged = rootNodeChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionchange = selectionchange, selectstart = selectstart, sizeLabelChanged = sizeLabelChanged, sortingChanged = sortingChanged, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchResponseChanged = touchResponseChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojTreemapEventMap[K, D]]
  }
}

