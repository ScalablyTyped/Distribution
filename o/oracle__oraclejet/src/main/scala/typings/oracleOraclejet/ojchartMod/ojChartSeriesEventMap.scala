package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.anon.Q2Color
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.oracleOraclejetStrings.area
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.boxPlot
import typings.oracleOraclejet.oracleOraclejetStrings.candlestick
import typings.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typings.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.curved
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typings.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.segmented
import typings.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typings.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.stepped
import typings.oracleOraclejet.oracleOraclejetStrings.straight
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DocumentAndElementEventHandlersEventMap
import typings.std.DragEvent
import typings.std.ElementEventMap
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.GlobalEventHandlersEventMap
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
trait ojChartSeriesEventMap
  extends ElementEventMap
     with GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  var areaColorChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var areaSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var areaSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]] = js.native
  var assignedToY2Changed: JetElementCustomEvent[js.UndefOr[on | off]] = js.native
  var borderColorChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]] = js.native
  var boxPlotChanged: JetElementCustomEvent[js.UndefOr[Q2Color]] = js.native
  var categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]] = js.native
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var displayInLegendChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]] = js.native
  var drillingChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]] = js.native
  var lineStyleChanged: JetElementCustomEvent[js.UndefOr[dotted | dashed | solid]] = js.native
  var lineTypeChanged: JetElementCustomEvent[
    js.UndefOr[
      straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
    ]
  ] = js.native
  var lineWidthChanged: JetElementCustomEvent[js.UndefOr[Double]] = js.native
  var markerColorChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var markerDisplayedChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]] = js.native
  var markerShapeChanged: JetElementCustomEvent[
    js.UndefOr[
      circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
    ]
  ] = js.native
  var markerSizeChanged: JetElementCustomEvent[js.UndefOr[Double]] = js.native
  var markerSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var markerSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]] = js.native
  var nameChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var patternChanged: JetElementCustomEvent[
    js.UndefOr[
      smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
    ]
  ] = js.native
  var pieSliceExplodeChanged: JetElementCustomEvent[js.UndefOr[Double]] = js.native
  var shortDescChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var sourceChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var sourceHoverChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var sourceHoverSelectedChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var sourceSelectedChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var stackCategoryChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]] = js.native
  var typeChanged: JetElementCustomEvent[js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto]] = js.native
}

object ojChartSeriesEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    areaColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    areaSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    areaSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    assignedToY2Changed: JetElementCustomEvent[js.UndefOr[on | off]],
    auxclick: MouseEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]],
    boxPlotChanged: JetElementCustomEvent[js.UndefOr[Q2Color]],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[js.UndefOr[String]],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    displayInLegendChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]],
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
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    lineStyleChanged: JetElementCustomEvent[js.UndefOr[dotted | dashed | solid]],
    lineTypeChanged: JetElementCustomEvent[
      js.UndefOr[
        straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
      ]
    ],
    lineWidthChanged: JetElementCustomEvent[js.UndefOr[Double]],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    markerColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    markerDisplayedChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]],
    markerShapeChanged: JetElementCustomEvent[
      js.UndefOr[
        circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
      ]
    ],
    markerSizeChanged: JetElementCustomEvent[js.UndefOr[Double]],
    markerSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    markerSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    nameChanged: JetElementCustomEvent[js.UndefOr[String]],
    paste: ClipboardEvent,
    patternChanged: JetElementCustomEvent[
      js.UndefOr[
        smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
      ]
    ],
    pause: Event,
    pieSliceExplodeChanged: JetElementCustomEvent[js.UndefOr[Double]],
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
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceHoverChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceHoverSelectedChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceSelectedChanged: JetElementCustomEvent[js.UndefOr[String]],
    stackCategoryChanged: JetElementCustomEvent[js.UndefOr[String]],
    stalled: Event,
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    timeupdate: Event,
    toggle: Event,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    typeChanged: JetElementCustomEvent[js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto]],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojChartSeriesEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], areaColorChanged = areaColorChanged.asInstanceOf[js.Any], areaSvgClassNameChanged = areaSvgClassNameChanged.asInstanceOf[js.Any], areaSvgStyleChanged = areaSvgStyleChanged.asInstanceOf[js.Any], assignedToY2Changed = assignedToY2Changed.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderWidthChanged = borderWidthChanged.asInstanceOf[js.Any], boxPlotChanged = boxPlotChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayInLegendChanged = displayInLegendChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], lineStyleChanged = lineStyleChanged.asInstanceOf[js.Any], lineTypeChanged = lineTypeChanged.asInstanceOf[js.Any], lineWidthChanged = lineWidthChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], markerColorChanged = markerColorChanged.asInstanceOf[js.Any], markerDisplayedChanged = markerDisplayedChanged.asInstanceOf[js.Any], markerShapeChanged = markerShapeChanged.asInstanceOf[js.Any], markerSizeChanged = markerSizeChanged.asInstanceOf[js.Any], markerSvgClassNameChanged = markerSvgClassNameChanged.asInstanceOf[js.Any], markerSvgStyleChanged = markerSvgStyleChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], nameChanged = nameChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], patternChanged = patternChanged.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pieSliceExplodeChanged = pieSliceExplodeChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], sourceChanged = sourceChanged.asInstanceOf[js.Any], sourceHoverChanged = sourceHoverChanged.asInstanceOf[js.Any], sourceHoverSelectedChanged = sourceHoverSelectedChanged.asInstanceOf[js.Any], sourceSelectedChanged = sourceSelectedChanged.asInstanceOf[js.Any], stackCategoryChanged = stackCategoryChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSeriesEventMap]
  }
  @scala.inline
  implicit class ojChartSeriesEventMapOps[Self <: ojChartSeriesEventMap] (val x: Self) extends AnyVal {
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
    def setAreaColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("areaColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaSvgClassNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("areaSvgClassNameChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaSvgStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = this.set("areaSvgStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignedToY2Changed(value: JetElementCustomEvent[js.UndefOr[on | off]]): Self = this.set("assignedToY2Changed", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("borderColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidthChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = this.set("borderWidthChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoxPlotChanged(value: JetElementCustomEvent[js.UndefOr[Q2Color]]): Self = this.set("boxPlotChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesChanged(value: JetElementCustomEvent[js.UndefOr[js.Array[String]]]): Self = this.set("categoriesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("colorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayInLegendChanged(value: JetElementCustomEvent[js.UndefOr[on | off | auto]]): Self = this.set("displayInLegendChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrillingChanged(value: JetElementCustomEvent[js.UndefOr[on | off | inherit]]): Self = this.set("drillingChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineStyleChanged(value: JetElementCustomEvent[js.UndefOr[dotted | dashed | solid]]): Self = this.set("lineStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineTypeChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
          ]
        ]
    ): Self = this.set("lineTypeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineWidthChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = this.set("lineWidthChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("markerColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerDisplayedChanged(value: JetElementCustomEvent[js.UndefOr[on | off | auto]]): Self = this.set("markerDisplayedChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerShapeChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
          ]
        ]
    ): Self = this.set("markerShapeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerSizeChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = this.set("markerSizeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerSvgClassNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("markerSvgClassNameChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerSvgStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = this.set("markerSvgStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("nameChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
          ]
        ]
    ): Self = this.set("patternChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPieSliceExplodeChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = this.set("pieSliceExplodeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDescChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("shortDescChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("sourceChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceHoverChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("sourceHoverChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceHoverSelectedChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("sourceHoverSelectedChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceSelectedChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("sourceSelectedChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackCategoryChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("stackCategoryChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgClassNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("svgClassNameChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = this.set("svgStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeChanged(
      value: JetElementCustomEvent[js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto]]
    ): Self = this.set("typeChanged", value.asInstanceOf[js.Any])
  }
  
}

