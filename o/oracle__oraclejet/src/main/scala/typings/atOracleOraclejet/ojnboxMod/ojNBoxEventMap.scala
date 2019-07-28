package typings.atOracleOraclejet.ojnboxMod

import typings.atOracleOraclejet.Anon_AnimationDurationCellDefaults
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultK
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.acrossCells
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.color
import typings.atOracleOraclejet.atOracleOraclejetStrings.counts
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.ifRequired
import typings.atOracleOraclejet.atOracleOraclejetStrings.indicatorColor
import typings.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconColor
import typings.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconPattern
import typings.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconShape
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.withinCell
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typings.atOracleOraclejet.ojnboxMod.ojNBoxNs.Cell
import typings.atOracleOraclejet.ojnboxMod.ojNBoxNs.Column
import typings.atOracleOraclejet.ojnboxMod.ojNBoxNs.CountLabelContext
import typings.atOracleOraclejet.ojnboxMod.ojNBoxNs.Row
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
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

trait ojNBoxEventMap[K, D] extends dvtBaseComponentEventMap[ojNBoxSettableProperties[K, D]] {
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  var asChanged: JetElementCustomEvent[String]
  var cellContentChanged: JetElementCustomEvent[counts | auto]
  var cellMaximizeChanged: JetElementCustomEvent[off | on]
  var cellsChanged: JetElementCustomEvent[js.Promise[js.Array[Cell]] | Null]
  var columnsChanged: JetElementCustomEvent[js.Promise[js.Array[Column]] | Null]
  var columnsTitleChanged: JetElementCustomEvent[String]
  var countLabelChanged: JetElementCustomEvent[js.Function1[/* context */ CountLabelContext, String | Null]]
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  var groupAttributesChanged: JetElementCustomEvent[
    color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
  ]
  var groupBehaviorChanged: JetElementCustomEvent[acrossCells | none | withinCell]
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var highlightMatchChanged: JetElementCustomEvent[any | all]
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none]
  var labelTruncationChanged: JetElementCustomEvent[ifRequired | on]
  var maximizedColumnChanged: JetElementCustomEvent[String]
  var maximizedRowChanged: JetElementCustomEvent[String]
  var otherColorChanged: JetElementCustomEvent[String]
  var otherThresholdChanged: JetElementCustomEvent[Double]
  var rowsChanged: JetElementCustomEvent[js.Promise[js.Array[Row]] | Null]
  var rowsTitleChanged: JetElementCustomEvent[String]
  var selectionChanged: JetElementCustomEvent[js.Array[K]]
  var selectionModeChanged: JetElementCustomEvent[none | single | multiple]
  var styleDefaultsChanged: JetElementCustomEvent[Anon_AnimationDurationCellDefaults]
  var tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultK[K]]
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto]
}

object ojNBoxEventMap {
  @scala.inline
  def apply[K, D](
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
    cellContentChanged: JetElementCustomEvent[counts | auto],
    cellMaximizeChanged: JetElementCustomEvent[off | on],
    cellsChanged: JetElementCustomEvent[js.Promise[js.Array[Cell]] | Null],
    change: Event,
    click: MouseEvent,
    close: Event,
    columnsChanged: JetElementCustomEvent[js.Promise[js.Array[Column]] | Null],
    columnsTitleChanged: JetElementCustomEvent[String],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    countLabelChanged: JetElementCustomEvent[js.Function1[/* context */ CountLabelContext, String | Null]],
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
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    groupAttributesChanged: JetElementCustomEvent[
      color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
    ],
    groupBehaviorChanged: JetElementCustomEvent[acrossCells | none | withinCell],
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelTruncationChanged: JetElementCustomEvent[ifRequired | on],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maximizedColumnChanged: JetElementCustomEvent[String],
    maximizedRowChanged: JetElementCustomEvent[String],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    otherColorChanged: JetElementCustomEvent[String],
    otherThresholdChanged: JetElementCustomEvent[Double],
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
    progress: ProgressEvent,
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    rowsChanged: JetElementCustomEvent[js.Promise[js.Array[Row]] | Null],
    rowsTitleChanged: JetElementCustomEvent[String],
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[K]],
    selectionModeChanged: JetElementCustomEvent[none | single | multiple],
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    styleDefaultsChanged: JetElementCustomEvent[Anon_AnimationDurationCellDefaults],
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultK[K]],
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
  ): ojNBoxEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationOnDataChangeChanged = animationOnDataChangeChanged, animationOnDisplayChanged = animationOnDisplayChanged, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asChanged = asChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, cellContentChanged = cellContentChanged, cellMaximizeChanged = cellMaximizeChanged, cellsChanged = cellsChanged, change = change, click = click, close = close, columnsChanged = columnsChanged, columnsTitleChanged = columnsTitleChanged, contextmenu = contextmenu, copy = copy, countLabelChanged = countLabelChanged, cuechange = cuechange, cut = cut, dataChanged = dataChanged, dblclick = dblclick, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, groupAttributesChanged = groupAttributesChanged, groupBehaviorChanged = groupBehaviorChanged, hiddenCategoriesChanged = hiddenCategoriesChanged, highlightMatchChanged = highlightMatchChanged, highlightedCategoriesChanged = highlightedCategoriesChanged, hoverBehaviorChanged = hoverBehaviorChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelTruncationChanged = labelTruncationChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, maximizedColumnChanged = maximizedColumnChanged, maximizedRowChanged = maximizedRowChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, otherColorChanged = otherColorChanged, otherThresholdChanged = otherThresholdChanged, paste = paste, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, reset = reset, resize = resize, rowsChanged = rowsChanged, rowsTitleChanged = rowsTitleChanged, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionChanged = selectionChanged, selectionModeChanged = selectionModeChanged, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, styleDefaultsChanged = styleDefaultsChanged, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, tooltipChanged = tooltipChanged, touchResponseChanged = touchResponseChanged, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, trackResizeChanged = trackResizeChanged, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojNBoxEventMap[K, D]]
  }
}

