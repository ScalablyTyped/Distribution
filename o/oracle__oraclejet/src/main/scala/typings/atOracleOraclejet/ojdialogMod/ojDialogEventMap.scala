package typings.atOracleOraclejet.ojdialogMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentEventMap
import typings.atOracleOraclejet.atOracleOraclejetStrings.`title-bar`
import typings.atOracleOraclejet.atOracleOraclejetStrings.escape
import typings.atOracleOraclejet.atOracleOraclejetStrings.hide
import typings.atOracleOraclejet.atOracleOraclejetStrings.icon
import typings.atOracleOraclejet.atOracleOraclejetStrings.modal
import typings.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.resizable
import typings.atOracleOraclejet.atOracleOraclejetStrings.show
import typings.atOracleOraclejet.ojdialogMod.ojDialog.Position
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojClose
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojFocus
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojOpen
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojResize
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojResizeStart
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojResizeStop
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

trait ojDialogEventMap extends baseComponentEventMap[ojDialogSettableProperties] {
  var cancelBehaviorChanged: JetElementCustomEvent[icon | escape | none]
  var dialogTitleChanged: JetElementCustomEvent[String | Null]
  var dragAffordanceChanged: JetElementCustomEvent[`title-bar` | none]
  var initialVisibilityChanged: JetElementCustomEvent[hide | show]
  var modalityChanged: JetElementCustomEvent[modal | modeless]
  var ojAnimateEnd: typings.atOracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd
  var ojAnimateStart: typings.atOracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart
  var ojBeforeClose: typings.atOracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose
  var ojBeforeOpen: typings.atOracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen
  var ojClose: typings.atOracleOraclejet.ojdialogMod.ojDialog.ojClose
  var ojFocus: typings.atOracleOraclejet.ojdialogMod.ojDialog.ojFocus
  var ojOpen: typings.atOracleOraclejet.ojdialogMod.ojDialog.ojOpen
  var ojResize: typings.atOracleOraclejet.ojdialogMod.ojDialog.ojResize
  var ojResizeStart: typings.atOracleOraclejet.ojdialogMod.ojDialog.ojResizeStart
  var ojResizeStop: typings.atOracleOraclejet.ojdialogMod.ojDialog.ojResizeStop
  var positionChanged: JetElementCustomEvent[Position]
  var resizeBehaviorChanged: JetElementCustomEvent[resizable | none]
  var roleChanged: JetElementCustomEvent[String]
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
    loadend: ProgressEvent[EventTarget],
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
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], cancelBehaviorChanged = cancelBehaviorChanged.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dialogTitleChanged = dialogTitleChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragAffordanceChanged = dragAffordanceChanged.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], initialVisibilityChanged = initialVisibilityChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], modalityChanged = modalityChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeClose = ojBeforeClose.asInstanceOf[js.Any], ojBeforeOpen = ojBeforeOpen.asInstanceOf[js.Any], ojClose = ojClose.asInstanceOf[js.Any], ojFocus = ojFocus.asInstanceOf[js.Any], ojOpen = ojOpen.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], ojResizeStart = ojResizeStart.asInstanceOf[js.Any], ojResizeStop = ojResizeStop.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], positionChanged = positionChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], resizeBehaviorChanged = resizeBehaviorChanged.asInstanceOf[js.Any], roleChanged = roleChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojDialogEventMap]
  }
}

