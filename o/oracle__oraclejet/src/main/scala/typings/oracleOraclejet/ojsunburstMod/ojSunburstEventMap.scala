package typings.oracleOraclejet.ojsunburstMod

import typings.oracleOraclejet.Anon16
import typings.oracleOraclejet.Anon17
import typings.oracleOraclejet.AnonHoverColor
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojBeforeCollapse
import typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojBeforeDrill
import typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojBeforeExpand
import typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojCollapse
import typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojDrill
import typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojExpand
import typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojRotateInput
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
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

trait ojSunburstEventMap[K, D] extends dvtBaseComponentEventMap[ojSunburstSettableProperties[K, D]] {
  var animationDurationChanged: JetElementCustomEvent[Double]
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  var animationUpdateColorChanged: JetElementCustomEvent[String]
  var asChanged: JetElementCustomEvent[String]
  var colorLabelChanged: JetElementCustomEvent[String]
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
  var displayLevelsChanged: JetElementCustomEvent[Double]
  var drillingChanged: JetElementCustomEvent[on | off]
  var expandedChanged: JetElementCustomEvent[KeySet[K]]
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var highlightMatchChanged: JetElementCustomEvent[any | all]
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]]
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none]
  var hoverBehaviorDelayChanged: JetElementCustomEvent[Double]
  var nodeDefaultsChanged: JetElementCustomEvent[AnonHoverColor]
  var ojBeforeCollapse: typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojBeforeCollapse
  var ojBeforeDrill: typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojBeforeDrill
  var ojBeforeExpand: typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojBeforeExpand
  var ojCollapse: typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojCollapse
  var ojDrill: typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojDrill
  var ojExpand: typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojExpand
  var ojRotateInput: typings.oracleOraclejet.ojsunburstMod.ojSunburst.ojRotateInput
  var rootNodeChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojsunburst.ojSunburst<K, D>['rootNode'] */ js.Any
  ]
  var rootNodeContentChanged: JetElementCustomEvent[Anon16[K, D]]
  var rotationChanged: JetElementCustomEvent[off | on]
  var selectionChanged: JetElementCustomEvent[js.Array[_]]
  var selectionModeChanged: JetElementCustomEvent[none | single | multiple]
  var sizeLabelChanged: JetElementCustomEvent[String]
  var sortingChanged: JetElementCustomEvent[on | off]
  var startAngleChanged: JetElementCustomEvent[Double]
  var tooltipChanged: JetElementCustomEvent[Anon17[K, D]]
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto]
}

object ojSunburstEventMap {
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
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    change: Event_,
    click: MouseEvent,
    close: Event_,
    colorLabelChanged: JetElementCustomEvent[String],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event_,
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
    displayLevelsChanged: JetElementCustomEvent[Double],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event_,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: JetElementCustomEvent[on | off],
    drop: DragEvent,
    durationchange: Event_,
    emptied: Event_,
    ended: Event_,
    error: ErrorEvent,
    expandedChanged: JetElementCustomEvent[KeySet[K]],
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event_,
    fullscreenerror: Event_,
    gotpointercapture: PointerEvent,
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    hoverBehaviorDelayChanged: JetElementCustomEvent[Double],
    input: Event_,
    invalid: Event_,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    nodeDefaultsChanged: JetElementCustomEvent[AnonHoverColor],
    ojBeforeCollapse: ojBeforeCollapse,
    ojBeforeDrill: ojBeforeDrill,
    ojBeforeExpand: ojBeforeExpand,
    ojCollapse: ojCollapse,
    ojDrill: ojDrill,
    ojExpand: ojExpand,
    ojRotateInput: ojRotateInput,
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
    rootNodeChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojsunburst.ojSunburst<K, D>['rootNode'] */ js.Any
    ],
    rootNodeContentChanged: JetElementCustomEvent[Anon16[K, D]],
    rotationChanged: JetElementCustomEvent[off | on],
    scroll: Event_,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionChanged: JetElementCustomEvent[js.Array[_]],
    selectionModeChanged: JetElementCustomEvent[none | single | multiple],
    selectionchange: Event_,
    selectstart: Event_,
    sizeLabelChanged: JetElementCustomEvent[String],
    sortingChanged: JetElementCustomEvent[on | off],
    stalled: Event_,
    startAngleChanged: JetElementCustomEvent[Double],
    submit: Event_,
    suspend: Event_,
    timeupdate: Event_,
    toggle: Event_,
    tooltipChanged: JetElementCustomEvent[Anon17[K, D]],
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
  ): ojSunburstEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationDurationChanged = animationDurationChanged.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationUpdateColorChanged = animationUpdateColorChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorLabelChanged = colorLabelChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayLevelsChanged = displayLevelsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], hoverBehaviorDelayChanged = hoverBehaviorDelayChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], nodeDefaultsChanged = nodeDefaultsChanged.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeDrill = ojBeforeDrill.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojDrill = ojDrill.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], ojRotateInput = ojRotateInput.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rootNodeChanged = rootNodeChanged.asInstanceOf[js.Any], rootNodeContentChanged = rootNodeContentChanged.asInstanceOf[js.Any], rotationChanged = rotationChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], sizeLabelChanged = sizeLabelChanged.asInstanceOf[js.Any], sortingChanged = sortingChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startAngleChanged = startAngleChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSunburstEventMap[K, D]]
  }
}

