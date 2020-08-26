package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.anon.`0`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.oracleOraclejetStrings.area
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typings.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.curved
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.segmented
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.stepped
import typings.oracleOraclejet.oracleOraclejetStrings.straight
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typings.oracleOraclejet.oracleOraclejetStrings.zero
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
trait ojSparkChartEventMap[K, D] extends dvtBaseComponentEventMap[ojSparkChartSettableProperties[K, D]] {
  var animationDurationChanged: JetElementCustomEvent[Double | Null] = js.native
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none] = js.native
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none] = js.native
  var areaColorChanged: JetElementCustomEvent[String] = js.native
  var areaSvgClassNameChanged: JetElementCustomEvent[String] = js.native
  var areaSvgStyleChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
  ] = js.native
  var asChanged: JetElementCustomEvent[String] = js.native
  var barGapRatioChanged: JetElementCustomEvent[Double] = js.native
  var baselineScalingChanged: JetElementCustomEvent[zero | min] = js.native
  var colorChanged: JetElementCustomEvent[String] = js.native
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null] = js.native
  var firstColorChanged: JetElementCustomEvent[String] = js.native
  var highColorChanged: JetElementCustomEvent[String] = js.native
  var lastColorChanged: JetElementCustomEvent[String] = js.native
  var lineStyleChanged: JetElementCustomEvent[dotted | dashed | solid] = js.native
  var lineTypeChanged: JetElementCustomEvent[
    curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
  ] = js.native
  var lineWidthChanged: JetElementCustomEvent[Double] = js.native
  var lowColorChanged: JetElementCustomEvent[String] = js.native
  var markerShapeChanged: JetElementCustomEvent[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.native
  var markerSizeChanged: JetElementCustomEvent[Double] = js.native
  var referenceObjectsChanged: JetElementCustomEvent[js.Array[ReferenceObject]] = js.native
  var svgClassNameChanged: JetElementCustomEvent[String] = js.native
  var svgStyleChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
  ] = js.native
  var tooltipChanged: JetElementCustomEvent[`0`] = js.native
  var typeChanged: JetElementCustomEvent[area | lineWithArea | bar | line] = js.native
  var visualEffectsChanged: JetElementCustomEvent[none | auto] = js.native
}

object ojSparkChartEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationDurationChanged: JetElementCustomEvent[Double | Null],
    animationOnDataChangeChanged: JetElementCustomEvent[auto | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | none],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    areaColorChanged: JetElementCustomEvent[String],
    areaSvgClassNameChanged: JetElementCustomEvent[String],
    areaSvgStyleChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
    ],
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    barGapRatioChanged: JetElementCustomEvent[Double],
    baselineScalingChanged: JetElementCustomEvent[zero | min],
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[String],
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
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    firstColorChanged: JetElementCustomEvent[String],
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    highColorChanged: JetElementCustomEvent[String],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    lastColorChanged: JetElementCustomEvent[String],
    lineStyleChanged: JetElementCustomEvent[dotted | dashed | solid],
    lineTypeChanged: JetElementCustomEvent[
      curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
    ],
    lineWidthChanged: JetElementCustomEvent[Double],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    lowColorChanged: JetElementCustomEvent[String],
    markerShapeChanged: JetElementCustomEvent[
      auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
    ],
    markerSizeChanged: JetElementCustomEvent[Double],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
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
    referenceObjectsChanged: JetElementCustomEvent[js.Array[ReferenceObject]],
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
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
    ],
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[`0`],
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
    typeChanged: JetElementCustomEvent[area | lineWithArea | bar | line],
    visualEffectsChanged: JetElementCustomEvent[none | auto],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojSparkChartEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationDurationChanged = animationDurationChanged.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], areaColorChanged = areaColorChanged.asInstanceOf[js.Any], areaSvgClassNameChanged = areaSvgClassNameChanged.asInstanceOf[js.Any], areaSvgStyleChanged = areaSvgStyleChanged.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], barGapRatioChanged = barGapRatioChanged.asInstanceOf[js.Any], baselineScalingChanged = baselineScalingChanged.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], firstColorChanged = firstColorChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], highColorChanged = highColorChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], lastColorChanged = lastColorChanged.asInstanceOf[js.Any], lineStyleChanged = lineStyleChanged.asInstanceOf[js.Any], lineTypeChanged = lineTypeChanged.asInstanceOf[js.Any], lineWidthChanged = lineWidthChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], lowColorChanged = lowColorChanged.asInstanceOf[js.Any], markerShapeChanged = markerShapeChanged.asInstanceOf[js.Any], markerSizeChanged = markerSizeChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], referenceObjectsChanged = referenceObjectsChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], visualEffectsChanged = visualEffectsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartEventMap[K, D]]
  }
  @scala.inline
  implicit class ojSparkChartEventMapOps[Self <: ojSparkChartEventMap[_, _], K, D] (val x: Self with (ojSparkChartEventMap[K, D])) extends AnyVal {
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
    def setAnimationDurationChanged(value: JetElementCustomEvent[Double | Null]): Self = this.set("animationDurationChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOnDataChangeChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOnDisplayChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("animationOnDisplayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaColorChanged(value: JetElementCustomEvent[String]): Self = this.set("areaColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaSvgClassNameChanged(value: JetElementCustomEvent[String]): Self = this.set("areaSvgClassNameChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaSvgStyleChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
        ]
    ): Self = this.set("areaSvgStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsChanged(value: JetElementCustomEvent[String]): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarGapRatioChanged(value: JetElementCustomEvent[Double]): Self = this.set("barGapRatioChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaselineScalingChanged(value: JetElementCustomEvent[zero | min]): Self = this.set("baselineScalingChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorChanged(value: JetElementCustomEvent[String]): Self = this.set("colorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataChanged(value: JetElementCustomEvent[(DataProvider[K, D]) | Null]): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstColorChanged(value: JetElementCustomEvent[String]): Self = this.set("firstColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighColorChanged(value: JetElementCustomEvent[String]): Self = this.set("highColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastColorChanged(value: JetElementCustomEvent[String]): Self = this.set("lastColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineStyleChanged(value: JetElementCustomEvent[dotted | dashed | solid]): Self = this.set("lineStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineTypeChanged(
      value: JetElementCustomEvent[
          curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
        ]
    ): Self = this.set("lineTypeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineWidthChanged(value: JetElementCustomEvent[Double]): Self = this.set("lineWidthChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowColorChanged(value: JetElementCustomEvent[String]): Self = this.set("lowColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerShapeChanged(
      value: JetElementCustomEvent[
          auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
        ]
    ): Self = this.set("markerShapeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerSizeChanged(value: JetElementCustomEvent[Double]): Self = this.set("markerSizeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceObjectsChanged(value: JetElementCustomEvent[js.Array[ReferenceObject]]): Self = this.set("referenceObjectsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgClassNameChanged(value: JetElementCustomEvent[String]): Self = this.set("svgClassNameChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgStyleChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
        ]
    ): Self = this.set("svgStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipChanged(value: JetElementCustomEvent[`0`]): Self = this.set("tooltipChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeChanged(value: JetElementCustomEvent[area | lineWithArea | bar | line]): Self = this.set("typeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualEffectsChanged(value: JetElementCustomEvent[none | auto]): Self = this.set("visualEffectsChanged", value.asInstanceOf[js.Any])
  }
  
}

