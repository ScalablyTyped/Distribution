package typings.oracleOraclejet.ojpopupMod

import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.ojpopupMod.ojPopup.Position
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateEnd
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateStart
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeClose
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeOpen
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojClose
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojFocus
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojOpen
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.default
import typings.oracleOraclejet.oracleOraclejetStrings.firstFocusable
import typings.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.popup
import typings.oracleOraclejet.oracleOraclejetStrings.simple
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
trait ojPopupEventMap extends baseComponentEventMap[ojPopupSettableProperties] {
  var autoDismissChanged: JetElementCustomEvent[none | focusLoss] = js.native
  var chromeChanged: JetElementCustomEvent[default | none] = js.native
  var initialFocusChanged: JetElementCustomEvent[auto | none | firstFocusable | popup] = js.native
  var modalityChanged: JetElementCustomEvent[modeless | modal] = js.native
  var ojAnimateEnd: typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateEnd = js.native
  var ojAnimateStart: typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateStart = js.native
  var ojBeforeClose: typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeClose = js.native
  var ojBeforeOpen: typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeOpen = js.native
  var ojClose: typings.oracleOraclejet.ojpopupMod.ojPopup.ojClose = js.native
  var ojFocus: typings.oracleOraclejet.ojpopupMod.ojPopup.ojFocus = js.native
  var ojOpen: typings.oracleOraclejet.ojpopupMod.ojPopup.ojOpen = js.native
  var positionChanged: JetElementCustomEvent[Position] = js.native
  var tailChanged: JetElementCustomEvent[none | simple] = js.native
}

object ojPopupEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    autoDismissChanged: JetElementCustomEvent[none | focusLoss],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    chromeChanged: JetElementCustomEvent[default | none],
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
    initialFocusChanged: JetElementCustomEvent[auto | none | firstFocusable | popup],
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
    modalityChanged: JetElementCustomEvent[modeless | modal],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojAnimateEnd: ojAnimateEnd,
    ojAnimateStart: ojAnimateStart,
    ojBeforeClose: ojBeforeClose,
    ojBeforeOpen: ojBeforeOpen,
    ojClose: ojClose,
    ojFocus: ojFocus,
    ojOpen: ojOpen,
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
    positionChanged: JetElementCustomEvent[Position],
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
    stalled: Event,
    submit: Event,
    suspend: Event,
    tailChanged: JetElementCustomEvent[none | simple],
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
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojPopupEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], autoDismissChanged = autoDismissChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], chromeChanged = chromeChanged.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], initialFocusChanged = initialFocusChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], modalityChanged = modalityChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeClose = ojBeforeClose.asInstanceOf[js.Any], ojBeforeOpen = ojBeforeOpen.asInstanceOf[js.Any], ojClose = ojClose.asInstanceOf[js.Any], ojFocus = ojFocus.asInstanceOf[js.Any], ojOpen = ojOpen.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], positionChanged = positionChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], tailChanged = tailChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPopupEventMap]
  }
  @scala.inline
  implicit class ojPopupEventMapOps[Self <: ojPopupEventMap] (val x: Self) extends AnyVal {
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
    def setAutoDismissChanged(value: JetElementCustomEvent[none | focusLoss]): Self = this.set("autoDismissChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setChromeChanged(value: JetElementCustomEvent[default | none]): Self = this.set("chromeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialFocusChanged(value: JetElementCustomEvent[auto | none | firstFocusable | popup]): Self = this.set("initialFocusChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setModalityChanged(value: JetElementCustomEvent[modeless | modal]): Self = this.set("modalityChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjAnimateEnd(value: ojAnimateEnd): Self = this.set("ojAnimateEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjAnimateStart(value: ojAnimateStart): Self = this.set("ojAnimateStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeClose(value: ojBeforeClose): Self = this.set("ojBeforeClose", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjBeforeOpen(value: ojBeforeOpen): Self = this.set("ojBeforeOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjClose(value: ojClose): Self = this.set("ojClose", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjFocus(value: ojFocus): Self = this.set("ojFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjOpen(value: ojOpen): Self = this.set("ojOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionChanged(value: JetElementCustomEvent[Position]): Self = this.set("positionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTailChanged(value: JetElementCustomEvent[none | simple]): Self = this.set("tailChanged", value.asInstanceOf[js.Any])
  }
  
}

