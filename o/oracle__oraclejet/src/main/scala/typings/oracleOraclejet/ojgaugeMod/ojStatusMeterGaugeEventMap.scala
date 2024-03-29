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
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojStatusMeterGaugeEventMap
  extends StObject
     with dvtBaseComponentEventMap[ojStatusMeterGaugeSettableProperties] {
  
  var angleExtentChanged: JetElementCustomEvent[Double]
  
  var animationDurationChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  
  var borderColorChanged: JetElementCustomEvent[String]
  
  var borderRadiusChanged: JetElementCustomEvent[String]
  
  var centerChanged: JetElementCustomEvent[`12`]
  
  var colorChanged: JetElementCustomEvent[String]
  
  var indicatorSizeChanged: JetElementCustomEvent[Double]
  
  var innerRadiusChanged: JetElementCustomEvent[Double]
  
  var labelChanged: JetElementCustomEvent[PositionStyle]
  
  var maxChanged: JetElementCustomEvent[Double]
  
  var metricLabelChanged: JetElementCustomEvent[ConverterPosition]
  
  var minChanged: JetElementCustomEvent[Double]
  
  var orientationChanged: JetElementCustomEvent[circular | vertical | horizontal]
  
  var plotAreaChanged: JetElementCustomEvent[BorderColorBorderRadius]
  
  var readonlyChanged: JetElementCustomEvent[Boolean]
  
  var referenceLinesChanged: JetElementCustomEvent[js.Array[ReferenceLine]]
  
  var startAngleChanged: JetElementCustomEvent[Double]
  
  var stepChanged: JetElementCustomEvent[Double | Null]
  
  var svgClassNameChanged: JetElementCustomEvent[String]
  
  var svgStyleChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any
  ]
  
  var thresholdDisplayChanged: JetElementCustomEvent[currentOnly | all | onIndicator]
  
  var thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]]
  
  var tooltipChanged: JetElementCustomEvent[`13`]
  
  var transientValueChanged: JetElementCustomEvent[Double | Null]
  
  var valueChanged: JetElementCustomEvent[Double | Null]
  
  var visualEffectsChanged: JetElementCustomEvent[none | auto]
}
object ojStatusMeterGaugeEventMap {
  
  inline def apply(
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
    beforeinput: InputEvent,
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
    compositionend: CompositionEvent,
    compositionstart: CompositionEvent,
    compositionupdate: CompositionEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
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
    formdata: FormDataEvent,
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
    slotchange: Event,
    stalled: Event,
    startAngleChanged: JetElementCustomEvent[Double],
    stepChanged: JetElementCustomEvent[Double | Null],
    submit: SubmitEvent,
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
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent
  ): ojStatusMeterGaugeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], angleExtentChanged = angleExtentChanged.asInstanceOf[js.Any], animationDurationChanged = animationDurationChanged.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderRadiusChanged = borderRadiusChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], centerChanged = centerChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], indicatorSizeChanged = indicatorSizeChanged.asInstanceOf[js.Any], innerRadiusChanged = innerRadiusChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxChanged = maxChanged.asInstanceOf[js.Any], metricLabelChanged = metricLabelChanged.asInstanceOf[js.Any], minChanged = minChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], plotAreaChanged = plotAreaChanged.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], readonlyChanged = readonlyChanged.asInstanceOf[js.Any], referenceLinesChanged = referenceLinesChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startAngleChanged = startAngleChanged.asInstanceOf[js.Any], stepChanged = stepChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], thresholdDisplayChanged = thresholdDisplayChanged.asInstanceOf[js.Any], thresholdsChanged = thresholdsChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transientValueChanged = transientValueChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], visualEffectsChanged = visualEffectsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojStatusMeterGaugeEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojStatusMeterGaugeEventMap] (val x: Self) extends AnyVal {
    
    inline def setAngleExtentChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "angleExtentChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "animationDurationChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDataChangeChanged(value: JetElementCustomEvent[auto | none]): Self = StObject.set(x, "animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayChanged(value: JetElementCustomEvent[auto | none]): Self = StObject.set(x, "animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setBorderColorChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "borderColorChanged", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "borderRadiusChanged", value.asInstanceOf[js.Any])
    
    inline def setCenterChanged(value: JetElementCustomEvent[`12`]): Self = StObject.set(x, "centerChanged", value.asInstanceOf[js.Any])
    
    inline def setColorChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "colorChanged", value.asInstanceOf[js.Any])
    
    inline def setIndicatorSizeChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "indicatorSizeChanged", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "innerRadiusChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelChanged(value: JetElementCustomEvent[PositionStyle]): Self = StObject.set(x, "labelChanged", value.asInstanceOf[js.Any])
    
    inline def setMaxChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "maxChanged", value.asInstanceOf[js.Any])
    
    inline def setMetricLabelChanged(value: JetElementCustomEvent[ConverterPosition]): Self = StObject.set(x, "metricLabelChanged", value.asInstanceOf[js.Any])
    
    inline def setMinChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "minChanged", value.asInstanceOf[js.Any])
    
    inline def setOrientationChanged(value: JetElementCustomEvent[circular | vertical | horizontal]): Self = StObject.set(x, "orientationChanged", value.asInstanceOf[js.Any])
    
    inline def setPlotAreaChanged(value: JetElementCustomEvent[BorderColorBorderRadius]): Self = StObject.set(x, "plotAreaChanged", value.asInstanceOf[js.Any])
    
    inline def setReadonlyChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "readonlyChanged", value.asInstanceOf[js.Any])
    
    inline def setReferenceLinesChanged(value: JetElementCustomEvent[js.Array[ReferenceLine]]): Self = StObject.set(x, "referenceLinesChanged", value.asInstanceOf[js.Any])
    
    inline def setStartAngleChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "startAngleChanged", value.asInstanceOf[js.Any])
    
    inline def setStepChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "stepChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "svgClassNameChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any
        ]
    ): Self = StObject.set(x, "svgStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setThresholdDisplayChanged(value: JetElementCustomEvent[currentOnly | all | onIndicator]): Self = StObject.set(x, "thresholdDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setThresholdsChanged(value: JetElementCustomEvent[js.Array[Threshold]]): Self = StObject.set(x, "thresholdsChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipChanged(value: JetElementCustomEvent[`13`]): Self = StObject.set(x, "tooltipChanged", value.asInstanceOf[js.Any])
    
    inline def setTransientValueChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "transientValueChanged", value.asInstanceOf[js.Any])
    
    inline def setValueChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
    
    inline def setVisualEffectsChanged(value: JetElementCustomEvent[none | auto]): Self = StObject.set(x, "visualEffectsChanged", value.asInstanceOf[js.Any])
  }
}
