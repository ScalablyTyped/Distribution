package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxOneEventMap[K, D]
  extends ojComboboxEventMap[js.Any, ojComboboxOneSettableProperties[K, D], js.Any, java.lang.String] {
  var asyncValidatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[_]]]
  var converterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
  ]
  var filterOnOpenChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue
  ]
  var minLengthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojComboboxOneEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxOneNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojComboboxOneEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxOneNs.ojAnimateStart
  var ojValueUpdated: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxOneNs.ojValueUpdated
  var optionRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      (js.Function1[
        /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
        stdLib.Element
      ]) | scala.Null
    ]
  ]
  var optionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Array[
      atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
    ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  ]
  var optionsKeysChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildren]
  var pickerAttributesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class]
  var placeholderChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var rawValueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var readOnlyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var requiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var validatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ]) | scala.Null
  ]
  @JSName("valueChanged")
  var valueChanged_ojComboboxOneEventMap: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
  var valueOptionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_LabelValue]
}

object ojComboboxOneEventMap {
  @scala.inline
  def apply[K, D](
    abort: stdLib.UIEvent,
    animationcancel: stdLib.AnimationEvent,
    animationend: stdLib.AnimationEvent,
    animationiteration: stdLib.AnimationEvent,
    animationstart: stdLib.AnimationEvent,
    asyncValidatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[_]]],
    auxclick: stdLib.Event,
    blur: stdLib.FocusEvent,
    cancel: stdLib.Event,
    canplay: stdLib.Event,
    canplaythrough: stdLib.Event,
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    contextmenu: stdLib.MouseEvent,
    converterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
    ],
    copy: stdLib.ClipboardEvent,
    cuechange: stdLib.Event,
    cut: stdLib.ClipboardEvent,
    dblclick: stdLib.MouseEvent,
    describedByChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null],
    disabledChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean],
    displayOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ConverterHint],
    drag: stdLib.DragEvent,
    dragend: stdLib.DragEvent,
    dragenter: stdLib.DragEvent,
    dragexit: stdLib.Event,
    dragleave: stdLib.DragEvent,
    dragover: stdLib.DragEvent,
    dragstart: stdLib.DragEvent,
    drop: stdLib.DragEvent,
    durationchange: stdLib.Event,
    emptied: stdLib.Event,
    ended: stdLib.Event,
    error: stdLib.ErrorEvent,
    filterOnOpenChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue
    ],
    focus: stdLib.FocusEvent,
    fullscreenchange: stdLib.Event,
    fullscreenerror: stdLib.Event,
    gotpointercapture: stdLib.PointerEvent,
    helpChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Instruction],
    helpHintsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Definition],
    input: stdLib.Event,
    invalid: stdLib.Event,
    keydown: stdLib.KeyboardEvent,
    keypress: stdLib.KeyboardEvent,
    keyup: stdLib.KeyboardEvent,
    labelHintChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String],
    load: stdLib.Event,
    loadeddata: stdLib.Event,
    loadedmetadata: stdLib.Event,
    loadend: stdLib.ProgressEvent,
    loadstart: stdLib.Event,
    lostpointercapture: stdLib.PointerEvent,
    messagesCustomChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced]],
    minLengthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    ojAnimateEnd: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxOneNs.ojAnimateEnd,
    ojAnimateStart: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxOneNs.ojAnimateStart,
    ojValueUpdated: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxOneNs.ojValueUpdated,
    optionRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        (js.Function1[
          /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
          stdLib.Element
        ]) | scala.Null
      ]
    ],
    optionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Array[
        atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
      ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
    ],
    optionsKeysChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildren],
    paste: stdLib.ClipboardEvent,
    pause: stdLib.Event,
    pickerAttributesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class],
    placeholderChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null],
    play: stdLib.Event,
    playing: stdLib.Event,
    pointercancel: stdLib.PointerEvent,
    pointerdown: stdLib.PointerEvent,
    pointerenter: stdLib.PointerEvent,
    pointerleave: stdLib.PointerEvent,
    pointermove: stdLib.PointerEvent,
    pointerout: stdLib.PointerEvent,
    pointerover: stdLib.PointerEvent,
    pointerup: stdLib.PointerEvent,
    progress: stdLib.ProgressEvent,
    ratechange: stdLib.Event,
    rawValueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null],
    readOnlyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean],
    requiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean],
    reset: stdLib.Event,
    resize: stdLib.UIEvent,
    scroll: stdLib.UIEvent,
    securitypolicyviolation: stdLib.SecurityPolicyViolationEvent,
    seeked: stdLib.Event,
    seeking: stdLib.Event,
    select: stdLib.UIEvent,
    stalled: stdLib.Event,
    submit: stdLib.Event,
    suspend: stdLib.Event,
    timeupdate: stdLib.Event,
    toggle: stdLib.Event,
    touchcancel: stdLib.TouchEvent,
    touchend: stdLib.TouchEvent,
    touchmove: stdLib.TouchEvent,
    touchstart: stdLib.TouchEvent,
    transitioncancel: stdLib.TransitionEvent,
    transitionend: stdLib.TransitionEvent,
    transitionrun: stdLib.TransitionEvent,
    transitionstart: stdLib.TransitionEvent,
    translationsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Object | scala.Null],
    validChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown
    ],
    validatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Array[
        atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
      ]) | scala.Null
    ],
    valueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_],
    valueOptionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_LabelValue],
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojComboboxOneEventMap[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("animationcancel")(animationcancel)
    __obj.updateDynamic("animationend")(animationend)
    __obj.updateDynamic("animationiteration")(animationiteration)
    __obj.updateDynamic("animationstart")(animationstart)
    __obj.updateDynamic("asyncValidatorsChanged")(asyncValidatorsChanged)
    __obj.updateDynamic("auxclick")(auxclick)
    __obj.updateDynamic("blur")(blur)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("canplay")(canplay)
    __obj.updateDynamic("canplaythrough")(canplaythrough)
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("contextmenu")(contextmenu)
    __obj.updateDynamic("converterChanged")(converterChanged)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("cuechange")(cuechange)
    __obj.updateDynamic("cut")(cut)
    __obj.updateDynamic("dblclick")(dblclick)
    __obj.updateDynamic("describedByChanged")(describedByChanged)
    __obj.updateDynamic("disabledChanged")(disabledChanged)
    __obj.updateDynamic("displayOptionsChanged")(displayOptionsChanged)
    __obj.updateDynamic("drag")(drag)
    __obj.updateDynamic("dragend")(dragend)
    __obj.updateDynamic("dragenter")(dragenter)
    __obj.updateDynamic("dragexit")(dragexit)
    __obj.updateDynamic("dragleave")(dragleave)
    __obj.updateDynamic("dragover")(dragover)
    __obj.updateDynamic("dragstart")(dragstart)
    __obj.updateDynamic("drop")(drop)
    __obj.updateDynamic("durationchange")(durationchange)
    __obj.updateDynamic("emptied")(emptied)
    __obj.updateDynamic("ended")(ended)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("filterOnOpenChanged")(filterOnOpenChanged)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("fullscreenchange")(fullscreenchange)
    __obj.updateDynamic("fullscreenerror")(fullscreenerror)
    __obj.updateDynamic("gotpointercapture")(gotpointercapture)
    __obj.updateDynamic("helpChanged")(helpChanged)
    __obj.updateDynamic("helpHintsChanged")(helpHintsChanged)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("invalid")(invalid)
    __obj.updateDynamic("keydown")(keydown)
    __obj.updateDynamic("keypress")(keypress)
    __obj.updateDynamic("keyup")(keyup)
    __obj.updateDynamic("labelHintChanged")(labelHintChanged)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadeddata")(loadeddata)
    __obj.updateDynamic("loadedmetadata")(loadedmetadata)
    __obj.updateDynamic("loadend")(loadend)
    __obj.updateDynamic("loadstart")(loadstart)
    __obj.updateDynamic("lostpointercapture")(lostpointercapture)
    __obj.updateDynamic("messagesCustomChanged")(messagesCustomChanged)
    __obj.updateDynamic("minLengthChanged")(minLengthChanged)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mouseenter")(mouseenter)
    __obj.updateDynamic("mouseleave")(mouseleave)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("mouseout")(mouseout)
    __obj.updateDynamic("mouseover")(mouseover)
    __obj.updateDynamic("mouseup")(mouseup)
    __obj.updateDynamic("ojAnimateEnd")(ojAnimateEnd)
    __obj.updateDynamic("ojAnimateStart")(ojAnimateStart)
    __obj.updateDynamic("ojValueUpdated")(ojValueUpdated)
    __obj.updateDynamic("optionRendererChanged")(optionRendererChanged)
    __obj.updateDynamic("optionsChanged")(optionsChanged)
    __obj.updateDynamic("optionsKeysChanged")(optionsKeysChanged)
    __obj.updateDynamic("paste")(paste)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("pickerAttributesChanged")(pickerAttributesChanged)
    __obj.updateDynamic("placeholderChanged")(placeholderChanged)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("playing")(playing)
    __obj.updateDynamic("pointercancel")(pointercancel)
    __obj.updateDynamic("pointerdown")(pointerdown)
    __obj.updateDynamic("pointerenter")(pointerenter)
    __obj.updateDynamic("pointerleave")(pointerleave)
    __obj.updateDynamic("pointermove")(pointermove)
    __obj.updateDynamic("pointerout")(pointerout)
    __obj.updateDynamic("pointerover")(pointerover)
    __obj.updateDynamic("pointerup")(pointerup)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("ratechange")(ratechange)
    __obj.updateDynamic("rawValueChanged")(rawValueChanged)
    __obj.updateDynamic("readOnlyChanged")(readOnlyChanged)
    __obj.updateDynamic("requiredChanged")(requiredChanged)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("scroll")(scroll)
    __obj.updateDynamic("securitypolicyviolation")(securitypolicyviolation)
    __obj.updateDynamic("seeked")(seeked)
    __obj.updateDynamic("seeking")(seeking)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("stalled")(stalled)
    __obj.updateDynamic("submit")(submit)
    __obj.updateDynamic("suspend")(suspend)
    __obj.updateDynamic("timeupdate")(timeupdate)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("touchcancel")(touchcancel)
    __obj.updateDynamic("touchend")(touchend)
    __obj.updateDynamic("touchmove")(touchmove)
    __obj.updateDynamic("touchstart")(touchstart)
    __obj.updateDynamic("transitioncancel")(transitioncancel)
    __obj.updateDynamic("transitionend")(transitionend)
    __obj.updateDynamic("transitionrun")(transitionrun)
    __obj.updateDynamic("transitionstart")(transitionstart)
    __obj.updateDynamic("translationsChanged")(translationsChanged)
    __obj.updateDynamic("validChanged")(validChanged)
    __obj.updateDynamic("validatorsChanged")(validatorsChanged)
    __obj.updateDynamic("valueChanged")(valueChanged)
    __obj.updateDynamic("valueOptionChanged")(valueOptionChanged)
    __obj.updateDynamic("volumechange")(volumechange)
    __obj.updateDynamic("waiting")(waiting)
    __obj.updateDynamic("wheel")(wheel)
    __obj.asInstanceOf[ojComboboxOneEventMap[K, D]]
  }
}

