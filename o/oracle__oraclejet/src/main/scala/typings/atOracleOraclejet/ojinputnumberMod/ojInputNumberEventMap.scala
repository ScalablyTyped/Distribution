package typings.atOracleOraclejet.ojinputnumberMod

import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.number
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.text
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.ojeditablevalueMod.editableValueEventMap
import typings.atOracleOraclejet.ojinputnumberMod.ojInputNumber.ojAnimateEnd
import typings.atOracleOraclejet.ojinputnumberMod.ojInputNumber.ojAnimateStart
import typings.atOracleOraclejet.ojmessagingMod.^
import typings.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredConverter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validator
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

trait ojInputNumberEventMap extends editableValueEventMap[Double | Null, ojInputNumberSettableProperties, Double | Null, String] {
  var asyncValidatorsChanged: JetElementCustomEvent[js.Array[AsyncValidator[Double]]]
  var autocompleteChanged: JetElementCustomEvent[on | off | String]
  var autofocusChanged: JetElementCustomEvent[Boolean]
  var converterChanged: JetElementCustomEvent[Converter[Double] | RegisteredConverter]
  var maxChanged: JetElementCustomEvent[Double | Null]
  var minChanged: JetElementCustomEvent[Double | Null]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojInputNumberEventMap: ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojInputNumberEventMap: ojAnimateStart
  var placeholderChanged: JetElementCustomEvent[String | Null]
  var rawValueChanged: JetElementCustomEvent[String]
  var readonlyChanged: JetElementCustomEvent[Boolean | Null]
  var requiredChanged: JetElementCustomEvent[Boolean]
  var stepChanged: JetElementCustomEvent[Double | Null]
  var validatorsChanged: JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]]
  var virtualKeyboardChanged: JetElementCustomEvent[auto | number | text]
}

object ojInputNumberEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asyncValidatorsChanged: JetElementCustomEvent[js.Array[AsyncValidator[Double]]],
    autocompleteChanged: JetElementCustomEvent[on | off | String],
    autofocusChanged: JetElementCustomEvent[Boolean],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    converterChanged: JetElementCustomEvent[Converter[Double] | RegisteredConverter],
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
    focusin: FocusEvent,
    focusout: FocusEvent,
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
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maxChanged: JetElementCustomEvent[Double | Null],
    messagesCustomChanged: JetElementCustomEvent[js.Array[^]],
    minChanged: JetElementCustomEvent[Double | Null],
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
    placeholderChanged: JetElementCustomEvent[String | Null],
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
    rawValueChanged: JetElementCustomEvent[String],
    readonlyChanged: JetElementCustomEvent[Boolean | Null],
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
    stepChanged: JetElementCustomEvent[Double | Null],
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
    validatorsChanged: JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]],
    valueChanged: JetElementCustomEvent[Double | Null],
    virtualKeyboardChanged: JetElementCustomEvent[auto | number | text],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojInputNumberEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, asyncValidatorsChanged = asyncValidatorsChanged, autocompleteChanged = autocompleteChanged, autofocusChanged = autofocusChanged, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, converterChanged = converterChanged, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, describedByChanged = describedByChanged, disabledChanged = disabledChanged, displayOptionsChanged = displayOptionsChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, helpChanged = helpChanged, helpHintsChanged = helpHintsChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelHintChanged = labelHintChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, maxChanged = maxChanged, messagesCustomChanged = messagesCustomChanged, minChanged = minChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, paste = paste, pause = pause, placeholderChanged = placeholderChanged, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, rawValueChanged = rawValueChanged, readonlyChanged = readonlyChanged, requiredChanged = requiredChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, stepChanged = stepChanged, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, validChanged = validChanged, validatorsChanged = validatorsChanged, valueChanged = valueChanged, virtualKeyboardChanged = virtualKeyboardChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojInputNumberEventMap]
  }
}

