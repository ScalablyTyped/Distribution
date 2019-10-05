package typings.atOracleOraclejet.ojpictochartMod

import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultKNull
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.alphaFade
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottomEnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottomStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.popIn
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.topEnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.topStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.atOracleOraclejetStrings.zoom
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typings.atOracleOraclejet.ojpictochartMod.ojPictoChart.ojDrill
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

trait ojPictoChartEventMap[K, D] extends dvtBaseComponentEventMap[ojPictoChartSettableProperties[K, D]] {
  var animationDurationChanged: JetElementCustomEvent[js.UndefOr[Double]]
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | popIn | alphaFade | zoom | none]
  var asChanged: JetElementCustomEvent[String]
  var columnCountChanged: JetElementCustomEvent[Double | Null]
  var columnWidthChanged: JetElementCustomEvent[Double | Null]
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  var drillingChanged: JetElementCustomEvent[on | off]
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var highlightMatchChanged: JetElementCustomEvent[any | all]
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none]
  var hoverBehaviorDelayChanged: JetElementCustomEvent[Double]
  var layoutChanged: JetElementCustomEvent[vertical | horizontal]
  var layoutOriginChanged: JetElementCustomEvent[topEnd | bottomStart | bottomEnd | topStart]
  var ojDrill: typings.atOracleOraclejet.ojpictochartMod.ojPictoChart.ojDrill
  var rowCountChanged: JetElementCustomEvent[Double | Null]
  var rowHeightChanged: JetElementCustomEvent[Double | Null]
  var selectionChanged: JetElementCustomEvent[js.Array[K]]
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none]
  var tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K]]
}

object ojPictoChartEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationDurationChanged: JetElementCustomEvent[js.UndefOr[Double]],
    animationOnDataChangeChanged: JetElementCustomEvent[auto | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | popIn | alphaFade | zoom | none],
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
    columnCountChanged: JetElementCustomEvent[Double | Null],
    columnWidthChanged: JetElementCustomEvent[Double | Null],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
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
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    hoverBehaviorDelayChanged: JetElementCustomEvent[Double],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    layoutChanged: JetElementCustomEvent[vertical | horizontal],
    layoutOriginChanged: JetElementCustomEvent[topEnd | bottomStart | bottomEnd | topStart],
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
    rowCountChanged: JetElementCustomEvent[Double | Null],
    rowHeightChanged: JetElementCustomEvent[Double | Null],
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[K]],
    selectionModeChanged: JetElementCustomEvent[single | multiple | none],
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K]],
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
  ): ojPictoChartEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationDurationChanged = animationDurationChanged, animationOnDataChangeChanged = animationOnDataChangeChanged, animationOnDisplayChanged = animationOnDisplayChanged, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, columnCountChanged = columnCountChanged, columnWidthChanged = columnWidthChanged, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dataChanged = dataChanged, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drillingChanged = drillingChanged, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, hiddenCategoriesChanged = hiddenCategoriesChanged, highlightMatchChanged = highlightMatchChanged, highlightedCategoriesChanged = highlightedCategoriesChanged, hoverBehaviorChanged = hoverBehaviorChanged, hoverBehaviorDelayChanged = hoverBehaviorDelayChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, layoutChanged = layoutChanged, layoutOriginChanged = layoutOriginChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojDrill = ojDrill, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rowCountChanged = rowCountChanged, rowHeightChanged = rowHeightChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojPictoChartEventMap[K, D]]
  }
}

