package typings.oracleOraclejet.ojnboxMod

import typings.oracleOraclejet.Anon13
import typings.oracleOraclejet.AnonCellDefaults
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.ojnboxMod.ojNBox.Cell
import typings.oracleOraclejet.ojnboxMod.ojNBox.Column
import typings.oracleOraclejet.ojnboxMod.ojNBox.CountLabelContext
import typings.oracleOraclejet.ojnboxMod.ojNBox.Row
import typings.oracleOraclejet.oracleOraclejetStrings.acrossCells
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.color
import typings.oracleOraclejet.oracleOraclejetStrings.counts
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.ifRequired
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorColor
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorIconColor
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorIconPattern
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorIconShape
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.withinCell
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
  var styleDefaultsChanged: JetElementCustomEvent[AnonCellDefaults]
  var tooltipChanged: JetElementCustomEvent[Anon13[K]]
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
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    cellContentChanged: JetElementCustomEvent[counts | auto],
    cellMaximizeChanged: JetElementCustomEvent[off | on],
    cellsChanged: JetElementCustomEvent[js.Promise[js.Array[Cell]] | Null],
    change: Event_,
    click: MouseEvent,
    close: Event_,
    columnsChanged: JetElementCustomEvent[js.Promise[js.Array[Column]] | Null],
    columnsTitleChanged: JetElementCustomEvent[String],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    countLabelChanged: JetElementCustomEvent[js.Function1[/* context */ CountLabelContext, String | Null]],
    cuechange: Event_,
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
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
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event_,
    fullscreenerror: Event_,
    gotpointercapture: PointerEvent,
    groupAttributesChanged: JetElementCustomEvent[
      color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
    ],
    groupBehaviorChanged: JetElementCustomEvent[acrossCells | none | withinCell],
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    input: Event_,
    invalid: Event_,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelTruncationChanged: JetElementCustomEvent[ifRequired | on],
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
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
    ratechange: Event_,
    reset: Event_,
    resize: UIEvent,
    rowsChanged: JetElementCustomEvent[js.Promise[js.Array[Row]] | Null],
    rowsTitleChanged: JetElementCustomEvent[String],
    scroll: Event_,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionChanged: JetElementCustomEvent[js.Array[K]],
    selectionModeChanged: JetElementCustomEvent[none | single | multiple],
    selectionchange: Event_,
    selectstart: Event_,
    stalled: Event_,
    styleDefaultsChanged: JetElementCustomEvent[AnonCellDefaults],
    submit: Event_,
    suspend: Event_,
    timeupdate: Event_,
    toggle: Event_,
    tooltipChanged: JetElementCustomEvent[Anon13[K]],
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
    wheel: WheelEvent
  ): ojNBoxEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], cellContentChanged = cellContentChanged.asInstanceOf[js.Any], cellMaximizeChanged = cellMaximizeChanged.asInstanceOf[js.Any], cellsChanged = cellsChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], columnsChanged = columnsChanged.asInstanceOf[js.Any], columnsTitleChanged = columnsTitleChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], countLabelChanged = countLabelChanged.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupAttributesChanged = groupAttributesChanged.asInstanceOf[js.Any], groupBehaviorChanged = groupBehaviorChanged.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelTruncationChanged = labelTruncationChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maximizedColumnChanged = maximizedColumnChanged.asInstanceOf[js.Any], maximizedRowChanged = maximizedRowChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], otherColorChanged = otherColorChanged.asInstanceOf[js.Any], otherThresholdChanged = otherThresholdChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowsChanged = rowsChanged.asInstanceOf[js.Any], rowsTitleChanged = rowsTitleChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojNBoxEventMap[K, D]]
  }
}

