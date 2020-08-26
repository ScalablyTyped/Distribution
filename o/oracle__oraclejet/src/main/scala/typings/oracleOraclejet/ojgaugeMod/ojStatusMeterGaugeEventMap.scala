package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.anon.BorderColorBorderRadius
import typings.oracleOraclejet.anon.ConverterPosition
import typings.oracleOraclejet.anon.PositionStyle
import typings.oracleOraclejet.anon.`12`
import typings.oracleOraclejet.anon.`13`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.ReferenceLine
import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.Threshold
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.circular
import typings.oracleOraclejet.oracleOraclejetStrings.currentOnly
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.onIndicator
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
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
trait ojStatusMeterGaugeEventMap extends dvtBaseComponentEventMap[ojStatusMeterGaugeSettableProperties] {
  var angleExtentChanged: JetElementCustomEvent[Double] = js.native
  var animationDurationChanged: JetElementCustomEvent[js.UndefOr[Double]] = js.native
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none] = js.native
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none] = js.native
  var borderColorChanged: JetElementCustomEvent[String] = js.native
  var borderRadiusChanged: JetElementCustomEvent[String] = js.native
  var centerChanged: JetElementCustomEvent[`12`] = js.native
  var colorChanged: JetElementCustomEvent[String] = js.native
  var indicatorSizeChanged: JetElementCustomEvent[Double] = js.native
  var innerRadiusChanged: JetElementCustomEvent[Double] = js.native
  var labelChanged: JetElementCustomEvent[PositionStyle] = js.native
  var maxChanged: JetElementCustomEvent[Double] = js.native
  var metricLabelChanged: JetElementCustomEvent[ConverterPosition] = js.native
  var minChanged: JetElementCustomEvent[Double] = js.native
  var orientationChanged: JetElementCustomEvent[circular | vertical | horizontal] = js.native
  var plotAreaChanged: JetElementCustomEvent[BorderColorBorderRadius] = js.native
  var readonlyChanged: JetElementCustomEvent[Boolean] = js.native
  var referenceLinesChanged: JetElementCustomEvent[js.Array[ReferenceLine]] = js.native
  var startAngleChanged: JetElementCustomEvent[Double] = js.native
  var stepChanged: JetElementCustomEvent[Double | Null] = js.native
  var svgClassNameChanged: JetElementCustomEvent[String] = js.native
  var svgStyleChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any
  ] = js.native
  var thresholdDisplayChanged: JetElementCustomEvent[currentOnly | all | onIndicator] = js.native
  var thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]] = js.native
  var tooltipChanged: JetElementCustomEvent[`13`] = js.native
  var transientValueChanged: JetElementCustomEvent[Double | Null] = js.native
  var valueChanged: JetElementCustomEvent[Double | Null] = js.native
  var visualEffectsChanged: JetElementCustomEvent[none | auto] = js.native
}

object ojStatusMeterGaugeEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    angleExtentChanged: JetElementCustomEvent[Double],
    animationDurationChanged: JetElementCustomEvent[js.UndefOr[Double]],
    animationOnDataChangeChanged: JetElementCustomEvent[auto | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | none],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[String],
    borderRadiusChanged: JetElementCustomEvent[String],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    centerChanged: JetElementCustomEvent[`12`],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[String],
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
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    indicatorSizeChanged: JetElementCustomEvent[Double],
    innerRadiusChanged: JetElementCustomEvent[Double],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[PositionStyle],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maxChanged: JetElementCustomEvent[Double],
    metricLabelChanged: JetElementCustomEvent[ConverterPosition],
    minChanged: JetElementCustomEvent[Double],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    orientationChanged: JetElementCustomEvent[circular | vertical | horizontal],
    paste: ClipboardEvent,
    pause: Event,
    play: Event,
    playing: Event,
    plotAreaChanged: JetElementCustomEvent[BorderColorBorderRadius],
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
    readonlyChanged: JetElementCustomEvent[Boolean],
    referenceLinesChanged: JetElementCustomEvent[js.Array[ReferenceLine]],
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    startAngleChanged: JetElementCustomEvent[Double],
    stepChanged: JetElementCustomEvent[Double | Null],
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any
    ],
    thresholdDisplayChanged: JetElementCustomEvent[currentOnly | all | onIndicator],
    thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]],
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[`13`],
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    trackResizeChanged: JetElementCustomEvent[on | off],
    transientValueChanged: JetElementCustomEvent[Double | Null],
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    valueChanged: JetElementCustomEvent[Double | Null],
    visualEffectsChanged: JetElementCustomEvent[none | auto],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojStatusMeterGaugeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], angleExtentChanged = angleExtentChanged.asInstanceOf[js.Any], animationDurationChanged = animationDurationChanged.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderRadiusChanged = borderRadiusChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], centerChanged = centerChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], indicatorSizeChanged = indicatorSizeChanged.asInstanceOf[js.Any], innerRadiusChanged = innerRadiusChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxChanged = maxChanged.asInstanceOf[js.Any], metricLabelChanged = metricLabelChanged.asInstanceOf[js.Any], minChanged = minChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], plotAreaChanged = plotAreaChanged.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], readonlyChanged = readonlyChanged.asInstanceOf[js.Any], referenceLinesChanged = referenceLinesChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startAngleChanged = startAngleChanged.asInstanceOf[js.Any], stepChanged = stepChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], thresholdDisplayChanged = thresholdDisplayChanged.asInstanceOf[js.Any], thresholdsChanged = thresholdsChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transientValueChanged = transientValueChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], visualEffectsChanged = visualEffectsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojStatusMeterGaugeEventMap]
  }
  @scala.inline
  implicit class ojStatusMeterGaugeEventMapOps[Self <: ojStatusMeterGaugeEventMap] (val x: Self) extends AnyVal {
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
    def setAngleExtentChanged(value: JetElementCustomEvent[Double]): Self = this.set("angleExtentChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationDurationChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = this.set("animationDurationChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOnDataChangeChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOnDisplayChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("animationOnDisplayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColorChanged(value: JetElementCustomEvent[String]): Self = this.set("borderColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderRadiusChanged(value: JetElementCustomEvent[String]): Self = this.set("borderRadiusChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenterChanged(value: JetElementCustomEvent[`12`]): Self = this.set("centerChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorChanged(value: JetElementCustomEvent[String]): Self = this.set("colorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndicatorSizeChanged(value: JetElementCustomEvent[Double]): Self = this.set("indicatorSizeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerRadiusChanged(value: JetElementCustomEvent[Double]): Self = this.set("innerRadiusChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelChanged(value: JetElementCustomEvent[PositionStyle]): Self = this.set("labelChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxChanged(value: JetElementCustomEvent[Double]): Self = this.set("maxChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricLabelChanged(value: JetElementCustomEvent[ConverterPosition]): Self = this.set("metricLabelChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinChanged(value: JetElementCustomEvent[Double]): Self = this.set("minChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientationChanged(value: JetElementCustomEvent[circular | vertical | horizontal]): Self = this.set("orientationChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlotAreaChanged(value: JetElementCustomEvent[BorderColorBorderRadius]): Self = this.set("plotAreaChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadonlyChanged(value: JetElementCustomEvent[Boolean]): Self = this.set("readonlyChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceLinesChanged(value: JetElementCustomEvent[js.Array[ReferenceLine]]): Self = this.set("referenceLinesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAngleChanged(value: JetElementCustomEvent[Double]): Self = this.set("startAngleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepChanged(value: JetElementCustomEvent[Double | Null]): Self = this.set("stepChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgClassNameChanged(value: JetElementCustomEvent[String]): Self = this.set("svgClassNameChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgStyleChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any
        ]
    ): Self = this.set("svgStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setThresholdDisplayChanged(value: JetElementCustomEvent[currentOnly | all | onIndicator]): Self = this.set("thresholdDisplayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setThresholdsChanged(value: JetElementCustomEvent[js.Array[Threshold]]): Self = this.set("thresholdsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipChanged(value: JetElementCustomEvent[`13`]): Self = this.set("tooltipChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransientValueChanged(value: JetElementCustomEvent[Double | Null]): Self = this.set("transientValueChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueChanged(value: JetElementCustomEvent[Double | Null]): Self = this.set("valueChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualEffectsChanged(value: JetElementCustomEvent[none | auto]): Self = this.set("visualEffectsChanged", value.asInstanceOf[js.Any])
  }
  
}

