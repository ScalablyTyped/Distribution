package typings.oracleOraclejet.ojnboxMod

import typings.oracleOraclejet.anon.CellDefaults
import typings.oracleOraclejet.anon.`15`
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
trait ojNBoxEventMap[K, D] extends dvtBaseComponentEventMap[ojNBoxSettableProperties[K, D]] {
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none] = js.native
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none] = js.native
  var asChanged: JetElementCustomEvent[String] = js.native
  var cellContentChanged: JetElementCustomEvent[counts | auto] = js.native
  var cellMaximizeChanged: JetElementCustomEvent[off | on] = js.native
  var cellsChanged: JetElementCustomEvent[js.Promise[js.Array[Cell]] | Null] = js.native
  var columnsChanged: JetElementCustomEvent[js.Promise[js.Array[Column]] | Null] = js.native
  var columnsTitleChanged: JetElementCustomEvent[String] = js.native
  var countLabelChanged: JetElementCustomEvent[js.Function1[/* context */ CountLabelContext, String | Null]] = js.native
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null] = js.native
  var groupAttributesChanged: JetElementCustomEvent[
    color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
  ] = js.native
  var groupBehaviorChanged: JetElementCustomEvent[acrossCells | none | withinCell] = js.native
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  var highlightMatchChanged: JetElementCustomEvent[any | all] = js.native
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none] = js.native
  var labelTruncationChanged: JetElementCustomEvent[ifRequired | on] = js.native
  var maximizedColumnChanged: JetElementCustomEvent[String] = js.native
  var maximizedRowChanged: JetElementCustomEvent[String] = js.native
  var otherColorChanged: JetElementCustomEvent[String] = js.native
  var otherThresholdChanged: JetElementCustomEvent[Double] = js.native
  var rowsChanged: JetElementCustomEvent[js.Promise[js.Array[Row]] | Null] = js.native
  var rowsTitleChanged: JetElementCustomEvent[String] = js.native
  var selectionChanged: JetElementCustomEvent[js.Array[K]] = js.native
  var selectionModeChanged: JetElementCustomEvent[none | single | multiple] = js.native
  var styleDefaultsChanged: JetElementCustomEvent[CellDefaults] = js.native
  var tooltipChanged: JetElementCustomEvent[`15`[K]] = js.native
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto] = js.native
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
    focusin: FocusEvent,
    focusout: FocusEvent,
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
    progress: ProgressEvent[EventTarget],
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
    styleDefaultsChanged: JetElementCustomEvent[CellDefaults],
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[`15`[K]],
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
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], cellContentChanged = cellContentChanged.asInstanceOf[js.Any], cellMaximizeChanged = cellMaximizeChanged.asInstanceOf[js.Any], cellsChanged = cellsChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], columnsChanged = columnsChanged.asInstanceOf[js.Any], columnsTitleChanged = columnsTitleChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], countLabelChanged = countLabelChanged.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupAttributesChanged = groupAttributesChanged.asInstanceOf[js.Any], groupBehaviorChanged = groupBehaviorChanged.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelTruncationChanged = labelTruncationChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maximizedColumnChanged = maximizedColumnChanged.asInstanceOf[js.Any], maximizedRowChanged = maximizedRowChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], otherColorChanged = otherColorChanged.asInstanceOf[js.Any], otherThresholdChanged = otherThresholdChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowsChanged = rowsChanged.asInstanceOf[js.Any], rowsTitleChanged = rowsTitleChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxEventMap[K, D]]
  }
  @scala.inline
  implicit class ojNBoxEventMapOps[Self <: ojNBoxEventMap[_, _], K, D] (val x: Self with (ojNBoxEventMap[K, D])) extends AnyVal {
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
    def setCellContentChanged(value: JetElementCustomEvent[counts | auto]): Self = this.set("cellContentChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellMaximizeChanged(value: JetElementCustomEvent[off | on]): Self = this.set("cellMaximizeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellsChanged(value: JetElementCustomEvent[js.Promise[js.Array[Cell]] | Null]): Self = this.set("cellsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsChanged(value: JetElementCustomEvent[js.Promise[js.Array[Column]] | Null]): Self = this.set("columnsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsTitleChanged(value: JetElementCustomEvent[String]): Self = this.set("columnsTitleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountLabelChanged(value: JetElementCustomEvent[js.Function1[/* context */ CountLabelContext, String | Null]]): Self = this.set("countLabelChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataChanged(value: JetElementCustomEvent[(DataProvider[K, D]) | Null]): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupAttributesChanged(
      value: JetElementCustomEvent[
          color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
        ]
    ): Self = this.set("groupAttributesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupBehaviorChanged(value: JetElementCustomEvent[acrossCells | none | withinCell]): Self = this.set("groupBehaviorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiddenCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = this.set("hiddenCategoriesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightMatchChanged(value: JetElementCustomEvent[any | all]): Self = this.set("highlightMatchChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = this.set("highlightedCategoriesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverBehaviorChanged(value: JetElementCustomEvent[dim | none]): Self = this.set("hoverBehaviorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelTruncationChanged(value: JetElementCustomEvent[ifRequired | on]): Self = this.set("labelTruncationChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximizedColumnChanged(value: JetElementCustomEvent[String]): Self = this.set("maximizedColumnChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximizedRowChanged(value: JetElementCustomEvent[String]): Self = this.set("maximizedRowChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOtherColorChanged(value: JetElementCustomEvent[String]): Self = this.set("otherColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOtherThresholdChanged(value: JetElementCustomEvent[Double]): Self = this.set("otherThresholdChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsChanged(value: JetElementCustomEvent[js.Promise[js.Array[Row]] | Null]): Self = this.set("rowsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsTitleChanged(value: JetElementCustomEvent[String]): Self = this.set("rowsTitleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(value: JetElementCustomEvent[js.Array[K]]): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionModeChanged(value: JetElementCustomEvent[none | single | multiple]): Self = this.set("selectionModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleDefaultsChanged(value: JetElementCustomEvent[CellDefaults]): Self = this.set("styleDefaultsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipChanged(value: JetElementCustomEvent[`15`[K]]): Self = this.set("tooltipChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchResponseChanged(value: JetElementCustomEvent[touchStart | auto]): Self = this.set("touchResponseChanged", value.asInstanceOf[js.Any])
  }
  
}

