package typings.oracleOraclejet.ojdialogMod

import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.ojdialogMod.ojDialog.Position
import typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd
import typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart
import typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose
import typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen
import typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose
import typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus
import typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen
import typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize
import typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart
import typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop
import typings.oracleOraclejet.oracleOraclejetStrings.`title-bar`
import typings.oracleOraclejet.oracleOraclejetStrings.escape
import typings.oracleOraclejet.oracleOraclejetStrings.hide
import typings.oracleOraclejet.oracleOraclejetStrings.icon
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.resizable
import typings.oracleOraclejet.oracleOraclejetStrings.show
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojDialogEventMap extends baseComponentEventMap[ojDialogSettableProperties] {
  
  var cancelBehaviorChanged: JetElementCustomEvent[icon | escape | none] = js.native
  
  var dialogTitleChanged: JetElementCustomEvent[String | Null] = js.native
  
  var dragAffordanceChanged: JetElementCustomEvent[`title-bar` | none] = js.native
  
  var initialVisibilityChanged: JetElementCustomEvent[hide | show] = js.native
  
  var modalityChanged: JetElementCustomEvent[modal | modeless] = js.native
  
  var ojAnimateEnd: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd = js.native
  
  var ojAnimateStart: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart = js.native
  
  var ojBeforeClose: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose = js.native
  
  var ojBeforeOpen: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen = js.native
  
  var ojClose: typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose = js.native
  
  var ojFocus: typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus = js.native
  
  var ojOpen: typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen = js.native
  
  var ojResize: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize = js.native
  
  var ojResizeStart: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart = js.native
  
  var ojResizeStop: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop = js.native
  
  var positionChanged: JetElementCustomEvent[Position] = js.native
  
  var resizeBehaviorChanged: JetElementCustomEvent[resizable | none] = js.native
  
  var roleChanged: JetElementCustomEvent[String] = js.native
}
object ojDialogEventMap {
  
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
    cancelBehaviorChanged: JetElementCustomEvent[icon | escape | none],
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    dialogTitleChanged: JetElementCustomEvent[String | Null],
    drag: DragEvent,
    dragAffordanceChanged: JetElementCustomEvent[`title-bar` | none],
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
    initialVisibilityChanged: JetElementCustomEvent[hide | show],
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
    modalityChanged: JetElementCustomEvent[modal | modeless],
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
    ojResize: ojResize,
    ojResizeStart: ojResizeStart,
    ojResizeStop: ojResizeStop,
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
    resizeBehaviorChanged: JetElementCustomEvent[resizable | none],
    roleChanged: JetElementCustomEvent[String],
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
  ): ojDialogEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], cancelBehaviorChanged = cancelBehaviorChanged.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dialogTitleChanged = dialogTitleChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragAffordanceChanged = dragAffordanceChanged.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], initialVisibilityChanged = initialVisibilityChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], modalityChanged = modalityChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeClose = ojBeforeClose.asInstanceOf[js.Any], ojBeforeOpen = ojBeforeOpen.asInstanceOf[js.Any], ojClose = ojClose.asInstanceOf[js.Any], ojFocus = ojFocus.asInstanceOf[js.Any], ojOpen = ojOpen.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], ojResizeStart = ojResizeStart.asInstanceOf[js.Any], ojResizeStop = ojResizeStop.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], positionChanged = positionChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], resizeBehaviorChanged = resizeBehaviorChanged.asInstanceOf[js.Any], roleChanged = roleChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDialogEventMap]
  }
  
  @scala.inline
  implicit class ojDialogEventMapOps[Self <: ojDialogEventMap] (val x: Self) extends AnyVal {
    
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
    def setCancelBehaviorChanged(value: JetElementCustomEvent[icon | escape | none]): Self = this.set("cancelBehaviorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogTitleChanged(value: JetElementCustomEvent[String | Null]): Self = this.set("dialogTitleChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragAffordanceChanged(value: JetElementCustomEvent[`title-bar` | none]): Self = this.set("dragAffordanceChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialVisibilityChanged(value: JetElementCustomEvent[hide | show]): Self = this.set("initialVisibilityChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalityChanged(value: JetElementCustomEvent[modal | modeless]): Self = this.set("modalityChanged", value.asInstanceOf[js.Any])
    
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
    def setOjResize(value: ojResize): Self = this.set("ojResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjResizeStart(value: ojResizeStart): Self = this.set("ojResizeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjResizeStop(value: ojResizeStop): Self = this.set("ojResizeStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionChanged(value: JetElementCustomEvent[Position]): Self = this.set("positionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeBehaviorChanged(value: JetElementCustomEvent[resizable | none]): Self = this.set("resizeBehaviorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleChanged(value: JetElementCustomEvent[String]): Self = this.set("roleChanged", value.asInstanceOf[js.Any])
  }
}
