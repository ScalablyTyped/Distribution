package typings.atOracleOraclejet.ojinputtextMod

import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.always
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.conditional
import typings.atOracleOraclejet.atOracleOraclejetStrings.email
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.never
import typings.atOracleOraclejet.atOracleOraclejetStrings.number
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.search
import typings.atOracleOraclejet.atOracleOraclejetStrings.tel
import typings.atOracleOraclejet.atOracleOraclejetStrings.text
import typings.atOracleOraclejet.atOracleOraclejetStrings.url
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.ojinputtextMod.ojInputTextNs.ojAnimateEnd
import typings.atOracleOraclejet.ojinputtextMod.ojInputTextNs.ojAnimateStart
import typings.atOracleOraclejet.ojmessagingMod.^
import typings.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
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

trait ojInputTextEventMap
  extends inputBaseEventMap[js.Any, ojInputTextSettableProperties, js.Any, js.Any] {
  var clearIconChanged: JetElementCustomEvent[never | always | conditional]
  var converterChanged: JetElementCustomEvent[Converter[_] | RegisteredConverter | Null]
  var listChanged: JetElementCustomEvent[String]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojInputTextEventMap: ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojInputTextEventMap: ojAnimateStart
  var virtualKeyboardChanged: JetElementCustomEvent[auto | email | number | search | tel | text | url]
}

object ojInputTextEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asyncValidatorsChanged: JetElementCustomEvent[js.Array[AsyncValidator[js.Any]]],
    autocompleteChanged: JetElementCustomEvent[on | off | String],
    autofocusChanged: JetElementCustomEvent[Boolean],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    clearIconChanged: JetElementCustomEvent[never | always | conditional],
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    converterChanged: JetElementCustomEvent[Converter[_] | RegisteredConverter | Null],
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    describedByChanged: JetElementCustomEvent[String | Null],
    disabledChanged: JetElementCustomEvent[Boolean],
    displayOptionsChanged: JetElementCustomEvent[Anon_ConverterHint],
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
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    helpChanged: JetElementCustomEvent[Anon_Instruction],
    helpHintsChanged: JetElementCustomEvent[Anon_Definition],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelHintChanged: JetElementCustomEvent[String],
    listChanged: JetElementCustomEvent[String],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    messagesCustomChanged: JetElementCustomEvent[js.Array[^]],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojAnimateEnd: ojAnimateEnd,
    ojAnimateStart: ojAnimateStart,
    paste: ClipboardEvent,
    pause: Event,
    placeholderChanged: JetElementCustomEvent[String],
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
    progress: ProgressEvent,
    ratechange: Event,
    rawValueChanged: JetElementCustomEvent[js.Any],
    readonlyChanged: JetElementCustomEvent[Boolean],
    requiredChanged: JetElementCustomEvent[Boolean],
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
    validChanged: JetElementCustomEvent[valid | pending | invalidHidden | invalidShown],
    validatorsChanged: JetElementCustomEvent[(js.Array[Validator[js.Any] | RegisteredValidator]) | Null],
    valueChanged: JetElementCustomEvent[js.Any],
    virtualKeyboardChanged: JetElementCustomEvent[auto | email | number | search | tel | text | url],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojInputTextEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asyncValidatorsChanged = asyncValidatorsChanged, autocompleteChanged = autocompleteChanged, autofocusChanged = autofocusChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, clearIconChanged = clearIconChanged, click = click, close = close, contextmenu = contextmenu, converterChanged = converterChanged, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, describedByChanged = describedByChanged, disabledChanged = disabledChanged, displayOptionsChanged = displayOptionsChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, helpChanged = helpChanged, helpHintsChanged = helpHintsChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelHintChanged = labelHintChanged, listChanged = listChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, messagesCustomChanged = messagesCustomChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, paste = paste, pause = pause, placeholderChanged = placeholderChanged, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, rawValueChanged = rawValueChanged, readonlyChanged = readonlyChanged, requiredChanged = requiredChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, validChanged = validChanged, validatorsChanged = validatorsChanged, valueChanged = valueChanged, virtualKeyboardChanged = virtualKeyboardChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojInputTextEventMap]
  }
}

