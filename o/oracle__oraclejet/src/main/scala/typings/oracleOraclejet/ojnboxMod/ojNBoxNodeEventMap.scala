package typings.oracleOraclejet.ojnboxMod

import typings.oracleOraclejet.anon.BorderRadiusBorderWidth
import typings.oracleOraclejet.anon.BorderWidthColor
import typings.oracleOraclejet.mod.JetElementCustomEvent
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojNBoxNodeEventMap
  extends ElementEventMap
     with GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  
  var borderColorChanged: JetElementCustomEvent[String] = js.native
  
  var borderWidthChanged: JetElementCustomEvent[Double] = js.native
  
  var categoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  
  var columnChanged: JetElementCustomEvent[String] = js.native
  
  var groupCategoryChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  
  var iconChanged: JetElementCustomEvent[js.UndefOr[BorderRadiusBorderWidth]] = js.native
  
  var indicatorColorChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  
  var indicatorIconChanged: JetElementCustomEvent[js.UndefOr[BorderWidthColor]] = js.native
  
  var labelChanged: JetElementCustomEvent[String] = js.native
  
  var rowChanged: JetElementCustomEvent[String] = js.native
  
  var secondaryLabelChanged: JetElementCustomEvent[String] = js.native
  
  var shortDescChanged: JetElementCustomEvent[String] = js.native
  
  var svgClassNameChanged: JetElementCustomEvent[String] = js.native
  
  var svgStyleChanged: JetElementCustomEvent[js.Object | Null] = js.native
  
  var xPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]] = js.native
  
  var yPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]] = js.native
}
object ojNBoxNodeEventMap {
  
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[String],
    borderWidthChanged: JetElementCustomEvent[Double],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.Array[String]],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[js.UndefOr[String]],
    columnChanged: JetElementCustomEvent[String],
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
    groupCategoryChanged: JetElementCustomEvent[js.UndefOr[String]],
    iconChanged: JetElementCustomEvent[js.UndefOr[BorderRadiusBorderWidth]],
    indicatorColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    indicatorIconChanged: JetElementCustomEvent[js.UndefOr[BorderWidthColor]],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[String],
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
    rowChanged: JetElementCustomEvent[String],
    scroll: Event,
    secondaryLabelChanged: JetElementCustomEvent[String],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[String],
    stalled: Event,
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[js.Object | Null],
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
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent,
    xPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]],
    yPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]]
  ): ojNBoxNodeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderWidthChanged = borderWidthChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], columnChanged = columnChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupCategoryChanged = groupCategoryChanged.asInstanceOf[js.Any], iconChanged = iconChanged.asInstanceOf[js.Any], indicatorColorChanged = indicatorColorChanged.asInstanceOf[js.Any], indicatorIconChanged = indicatorIconChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowChanged = rowChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], secondaryLabelChanged = secondaryLabelChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], xPercentageChanged = xPercentageChanged.asInstanceOf[js.Any], yPercentageChanged = yPercentageChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxNodeEventMap]
  }
  
  @scala.inline
  implicit class ojNBoxNodeEventMapOps[Self <: ojNBoxNodeEventMap] (val x: Self) extends AnyVal {
    
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
    def setBorderColorChanged(value: JetElementCustomEvent[String]): Self = this.set("borderColorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthChanged(value: JetElementCustomEvent[Double]): Self = this.set("borderWidthChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = this.set("categoriesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("colorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnChanged(value: JetElementCustomEvent[String]): Self = this.set("columnChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupCategoryChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("groupCategoryChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconChanged(value: JetElementCustomEvent[js.UndefOr[BorderRadiusBorderWidth]]): Self = this.set("iconChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("indicatorColorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorIconChanged(value: JetElementCustomEvent[js.UndefOr[BorderWidthColor]]): Self = this.set("indicatorIconChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelChanged(value: JetElementCustomEvent[String]): Self = this.set("labelChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowChanged(value: JetElementCustomEvent[String]): Self = this.set("rowChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryLabelChanged(value: JetElementCustomEvent[String]): Self = this.set("secondaryLabelChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescChanged(value: JetElementCustomEvent[String]): Self = this.set("shortDescChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassNameChanged(value: JetElementCustomEvent[String]): Self = this.set("svgClassNameChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyleChanged(value: JetElementCustomEvent[js.Object | Null]): Self = this.set("svgStyleChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPercentageChanged(value: JetElementCustomEvent[js.UndefOr[Double | Null]]): Self = this.set("xPercentageChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPercentageChanged(value: JetElementCustomEvent[js.UndefOr[Double | Null]]): Self = this.set("yPercentageChanged", value.asInstanceOf[js.Any])
  }
}
