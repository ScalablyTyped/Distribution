package typings.oracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonChangeMonth
import typings.oracleOraclejet.AnonClass
import typings.oracleOraclejet.AnonConverterHint
import typings.oracleOraclejet.AnonDefinition
import typings.oracleOraclejet.AnonDisabled
import typings.oracleOraclejet.AnonFooterLayout
import typings.oracleOraclejet.AnonInstruction
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdatetimepickerMod.ojDateTimePicker.ojAnimateEnd
import typings.oracleOraclejet.ojdatetimepickerMod.ojDateTimePicker.ojAnimateStart
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterOutput
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.native
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.Event_
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

trait ojDateTimePickerEventMap extends ojInputDateTimeEventMap[ojDateTimePickerSettableProperties] {
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojDateTimePickerEventMap: ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojDateTimePickerEventMap: ojAnimateStart
}

object ojDateTimePickerEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asyncValidatorsChanged: JetElementCustomEvent[js.Array[AsyncValidator[String]]],
    autocompleteChanged: JetElementCustomEvent[on | off | String],
    autofocusChanged: JetElementCustomEvent[Boolean],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    change: Event_,
    click: MouseEvent,
    close: Event_,
    contextmenu: MouseEvent,
    converterChanged: JetElementCustomEvent[Converter[String] | RegisteredConverter],
    copy: ClipboardEvent,
    cuechange: Event_,
    cut: ClipboardEvent,
    datePickerChanged: JetElementCustomEvent[AnonChangeMonth],
    dayFormatterChanged: JetElementCustomEvent[js.Function1[/* param */ DayFormatterInput, Null | all | DayFormatterOutput]],
    dayMetaDataChanged: JetElementCustomEvent[StringDictionary[StringDictionary[StringDictionary[AnonDisabled]]]],
    dblclick: MouseEvent,
    describedByChanged: JetElementCustomEvent[String | Null],
    disabledChanged: JetElementCustomEvent[Boolean],
    displayOptionsChanged: JetElementCustomEvent[AnonConverterHint],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event_,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event_,
    emptied: Event_,
    ended: Event_,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event_,
    fullscreenerror: Event_,
    gotpointercapture: PointerEvent,
    helpChanged: JetElementCustomEvent[AnonInstruction],
    helpHintsChanged: JetElementCustomEvent[AnonDefinition],
    input: Event_,
    invalid: Event_,
    keyboardEditChanged: JetElementCustomEvent[enabled | disabled],
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelHintChanged: JetElementCustomEvent[String],
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
    lostpointercapture: PointerEvent,
    maxChanged: JetElementCustomEvent[String | Null],
    messagesCustomChanged: JetElementCustomEvent[js.Array[^]],
    minChanged: JetElementCustomEvent[String | Null],
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
    pause: Event_,
    pickerAttributesChanged: JetElementCustomEvent[AnonClass],
    placeholderChanged: JetElementCustomEvent[String],
    play: Event_,
    playing: Event_,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    progress: ProgressEvent[EventTarget],
    ratechange: Event_,
    rawValueChanged: JetElementCustomEvent[String],
    readonlyChanged: JetElementCustomEvent[Boolean],
    renderModeChanged: JetElementCustomEvent[jet | native],
    requiredChanged: JetElementCustomEvent[Boolean],
    reset: Event_,
    resize: UIEvent,
    scroll: Event_,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionchange: Event_,
    selectstart: Event_,
    stalled: Event_,
    submit: Event_,
    suspend: Event_,
    timePickerChanged: JetElementCustomEvent[AnonFooterLayout],
    timeupdate: Event_,
    toggle: Event_,
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
    validatorsChanged: JetElementCustomEvent[(js.Array[Validator[String] | RegisteredValidator]) | Null],
    valueChanged: JetElementCustomEvent[String],
    volumechange: Event_,
    waiting: Event_,
    wheel: WheelEvent
  ): ojDateTimePickerEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asyncValidatorsChanged = asyncValidatorsChanged.asInstanceOf[js.Any], autocompleteChanged = autocompleteChanged.asInstanceOf[js.Any], autofocusChanged = autofocusChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], converterChanged = converterChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], datePickerChanged = datePickerChanged.asInstanceOf[js.Any], dayFormatterChanged = dayFormatterChanged.asInstanceOf[js.Any], dayMetaDataChanged = dayMetaDataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keyboardEditChanged = keyboardEditChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxChanged = maxChanged.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], minChanged = minChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pickerAttributesChanged = pickerAttributesChanged.asInstanceOf[js.Any], placeholderChanged = placeholderChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rawValueChanged = rawValueChanged.asInstanceOf[js.Any], readonlyChanged = readonlyChanged.asInstanceOf[js.Any], renderModeChanged = renderModeChanged.asInstanceOf[js.Any], requiredChanged = requiredChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timePickerChanged = timePickerChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], validatorsChanged = validatorsChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojDateTimePickerEventMap]
  }
}

