package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.anon.Source
import typings.oracleOraclejet.anon.`11`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import typings.oracleOraclejet.oracleOraclejetNumbers.`0.5`
import typings.oracleOraclejet.oracleOraclejetNumbers.`1`
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.meet
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojRatingGaugeEventMap extends dvtBaseComponentEventMap[ojRatingGaugeSettableProperties] {
  
  var changedChanged: JetElementCustomEvent[Boolean] = js.native
  
  var changedStateChanged: JetElementCustomEvent[Source] = js.native
  
  var hoverStateChanged: JetElementCustomEvent[Source] = js.native
  
  var maxChanged: JetElementCustomEvent[Double] = js.native
  
  var minChanged: JetElementCustomEvent[Double] = js.native
  
  var orientationChanged: JetElementCustomEvent[vertical | horizontal] = js.native
  
  var preserveAspectRatioChanged: JetElementCustomEvent[none | meet] = js.native
  
  var readonlyChanged: JetElementCustomEvent[Boolean] = js.native
  
  var selectedStateChanged: JetElementCustomEvent[Source] = js.native
  
  var stepChanged: JetElementCustomEvent[`0.5` | `1`] = js.native
  
  var thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]] = js.native
  
  var tooltipChanged: JetElementCustomEvent[`11`] = js.native
  
  var transientValueChanged: JetElementCustomEvent[Double | Null] = js.native
  
  var unselectedStateChanged: JetElementCustomEvent[Source] = js.native
  
  var valueChanged: JetElementCustomEvent[Double | Null] = js.native
  
  var visualEffectsChanged: JetElementCustomEvent[none | auto] = js.native
}
object ojRatingGaugeEventMap {
  
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    changedChanged: JetElementCustomEvent[Boolean],
    changedStateChanged: JetElementCustomEvent[Source],
    click: MouseEvent,
    close: Event,
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
    hoverStateChanged: JetElementCustomEvent[Source],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maxChanged: JetElementCustomEvent[Double],
    minChanged: JetElementCustomEvent[Double],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    orientationChanged: JetElementCustomEvent[vertical | horizontal],
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
    preserveAspectRatioChanged: JetElementCustomEvent[none | meet],
    progress: ProgressEvent[EventTarget],
    ratechange: Event,
    readonlyChanged: JetElementCustomEvent[Boolean],
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectedStateChanged: JetElementCustomEvent[Source],
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    stepChanged: JetElementCustomEvent[`0.5` | `1`],
    submit: Event,
    suspend: Event,
    thresholdsChanged: JetElementCustomEvent[js.Array[Threshold]],
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[`11`],
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
    unselectedStateChanged: JetElementCustomEvent[Source],
    valueChanged: JetElementCustomEvent[Double | Null],
    visualEffectsChanged: JetElementCustomEvent[none | auto],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojRatingGaugeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], changedChanged = changedChanged.asInstanceOf[js.Any], changedStateChanged = changedStateChanged.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hoverStateChanged = hoverStateChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxChanged = maxChanged.asInstanceOf[js.Any], minChanged = minChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], preserveAspectRatioChanged = preserveAspectRatioChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], readonlyChanged = readonlyChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectedStateChanged = selectedStateChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], stepChanged = stepChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], thresholdsChanged = thresholdsChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transientValueChanged = transientValueChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], unselectedStateChanged = unselectedStateChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], visualEffectsChanged = visualEffectsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRatingGaugeEventMap]
  }
  
  @scala.inline
  implicit class ojRatingGaugeEventMapMutableBuilder[Self <: ojRatingGaugeEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "changedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedStateChanged(value: JetElementCustomEvent[Source]): Self = StObject.set(x, "changedStateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverStateChanged(value: JetElementCustomEvent[Source]): Self = StObject.set(x, "hoverStateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "maxChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "minChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationChanged(value: JetElementCustomEvent[vertical | horizontal]): Self = StObject.set(x, "orientationChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatioChanged(value: JetElementCustomEvent[none | meet]): Self = StObject.set(x, "preserveAspectRatioChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "readonlyChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStateChanged(value: JetElementCustomEvent[Source]): Self = StObject.set(x, "selectedStateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepChanged(value: JetElementCustomEvent[`0.5` | `1`]): Self = StObject.set(x, "stepChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsChanged(value: JetElementCustomEvent[js.Array[Threshold]]): Self = StObject.set(x, "thresholdsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipChanged(value: JetElementCustomEvent[`11`]): Self = StObject.set(x, "tooltipChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientValueChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "transientValueChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedStateChanged(value: JetElementCustomEvent[Source]): Self = StObject.set(x, "unselectedStateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualEffectsChanged(value: JetElementCustomEvent[none | auto]): Self = StObject.set(x, "visualEffectsChanged", value.asInstanceOf[js.Any])
  }
}
