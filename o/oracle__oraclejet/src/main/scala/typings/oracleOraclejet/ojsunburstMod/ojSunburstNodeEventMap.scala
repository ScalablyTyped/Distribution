package typings.oracleOraclejet.ojsunburstMod

import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.inner
import typings.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typings.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outer
import typings.oracleOraclejet.oracleOraclejetStrings.rotated
import typings.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typings.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.smallTriangle
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
trait ojSunburstNodeEventMap
  extends ElementEventMap
     with GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  var borderColorChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]] = js.native
  var categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]] = js.native
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var drillingChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]] = js.native
  var labelChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var labelDisplayChanged: JetElementCustomEvent[js.UndefOr[horizontal | rotated | off | auto]] = js.native
  var labelHalignChanged: JetElementCustomEvent[js.UndefOr[inner | outer | center]] = js.native
  var labelStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]] = js.native
  var patternChanged: JetElementCustomEvent[
    js.UndefOr[
      smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
    ]
  ] = js.native
  var radiusChanged: JetElementCustomEvent[js.UndefOr[Double]] = js.native
  var selectableChanged: JetElementCustomEvent[js.UndefOr[off | auto]] = js.native
  var shortDescChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var showDisclosureChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]] = js.native
  var svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]] = js.native
  var valueChanged: JetElementCustomEvent[Double] = js.native
}

object ojSunburstNodeEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]],
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
    labelChanged: JetElementCustomEvent[js.UndefOr[String]],
    labelDisplayChanged: JetElementCustomEvent[js.UndefOr[horizontal | rotated | off | auto]],
    labelHalignChanged: JetElementCustomEvent[js.UndefOr[inner | outer | center]],
    labelStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    paste: ClipboardEvent,
    patternChanged: JetElementCustomEvent[
      js.UndefOr[
        smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
      ]
    ],
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
    radiusChanged: JetElementCustomEvent[js.UndefOr[Double]],
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectableChanged: JetElementCustomEvent[js.UndefOr[off | auto]],
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[js.UndefOr[String]],
    showDisclosureChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]],
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
    valueChanged: JetElementCustomEvent[Double],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojSunburstNodeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderWidthChanged = borderWidthChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], labelDisplayChanged = labelDisplayChanged.asInstanceOf[js.Any], labelHalignChanged = labelHalignChanged.asInstanceOf[js.Any], labelStyleChanged = labelStyleChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], patternChanged = patternChanged.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], radiusChanged = radiusChanged.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectableChanged = selectableChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], showDisclosureChanged = showDisclosureChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSunburstNodeEventMap]
  }
  @scala.inline
  implicit class ojSunburstNodeEventMapOps[Self <: ojSunburstNodeEventMap] (val x: Self) extends AnyVal {
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
    def setBorderColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("borderColorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidthChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = this.set("borderWidthChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesChanged(value: JetElementCustomEvent[js.UndefOr[js.Array[String]]]): Self = this.set("categoriesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("colorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrillingChanged(value: JetElementCustomEvent[js.UndefOr[on | off | inherit]]): Self = this.set("drillingChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("labelChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelDisplayChanged(value: JetElementCustomEvent[js.UndefOr[horizontal | rotated | off | auto]]): Self = this.set("labelDisplayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelHalignChanged(value: JetElementCustomEvent[js.UndefOr[inner | outer | center]]): Self = this.set("labelHalignChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = this.set("labelStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
          ]
        ]
    ): Self = this.set("patternChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = this.set("radiusChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectableChanged(value: JetElementCustomEvent[js.UndefOr[off | auto]]): Self = this.set("selectableChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDescChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("shortDescChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowDisclosureChanged(value: JetElementCustomEvent[js.UndefOr[on | off | inherit]]): Self = this.set("showDisclosureChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgClassNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("svgClassNameChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = this.set("svgStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueChanged(value: JetElementCustomEvent[Double]): Self = this.set("valueChanged", value.asInstanceOf[js.Any])
  }
  
}

