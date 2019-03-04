package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSelectManyEventMap[K, D]
  extends ojSelectEventMap[
      js.Array[js.Any] | scala.Null, 
      ojSelectManySettableProperties[K, D], 
      js.Array[js.Any] | scala.Null
    ] {
  var minimumResultsForSearchChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojSelectManyEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojSelectManyNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojSelectManyEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojSelectManyNs.ojAnimateStart
  var optionRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      (js.Function1[
        /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
        stdLib.Element
      ]) | scala.Null
    ]
  ]
  var optionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Array[
      atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
    ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  ]
  var optionsKeysChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue]
  var pickerAttributesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class]
  var placeholderChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var readOnlyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var renderModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
  ]
  var requiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  @JSName("valueChanged")
  var valueChanged_ojSelectManyEventMap: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[_] | scala.Null]
  var valueOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null]
}

object ojSelectManyEventMap {
  @scala.inline
  def apply[K, D](
    abort: stdLib.UIEvent,
    animationcancel: stdLib.AnimationEvent,
    animationend: stdLib.AnimationEvent,
    animationiteration: stdLib.AnimationEvent,
    animationstart: stdLib.AnimationEvent,
    auxclick: stdLib.Event,
    blur: stdLib.FocusEvent,
    cancel: stdLib.Event,
    canplay: stdLib.Event,
    canplaythrough: stdLib.Event,
    change: stdLib.Event,
    click: stdLib.MouseEvent,
    close: stdLib.Event,
    contextmenu: stdLib.MouseEvent,
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
    minimumResultsForSearchChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double],
    mousedown: stdLib.MouseEvent,
    mouseenter: stdLib.MouseEvent,
    mouseleave: stdLib.MouseEvent,
    mousemove: stdLib.MouseEvent,
    mouseout: stdLib.MouseEvent,
    mouseover: stdLib.MouseEvent,
    mouseup: stdLib.MouseEvent,
    ojAnimateEnd: atOracleOraclejetLib.ojselectcomboboxMod.ojSelectManyNs.ojAnimateEnd,
    ojAnimateStart: atOracleOraclejetLib.ojselectcomboboxMod.ojSelectManyNs.ojAnimateStart,
    optionRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        (js.Function1[
          /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
          stdLib.Element
        ]) | scala.Null
      ]
    ],
    optionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Array[
        atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
      ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
    ],
    optionsKeysChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue],
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
    readOnlyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean],
    renderModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
    ],
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
    valueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[_] | scala.Null],
    valueOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null],
    volumechange: stdLib.Event,
    waiting: stdLib.Event,
    wheel: stdLib.WheelEvent
  ): ojSelectManyEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, contextmenu = contextmenu, copy = copy, cuechange = cuechange, cut = cut, dblclick = dblclick, describedByChanged = describedByChanged, disabledChanged = disabledChanged, displayOptionsChanged = displayOptionsChanged, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, gotpointercapture = gotpointercapture, helpChanged = helpChanged, helpHintsChanged = helpHintsChanged, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, labelHintChanged = labelHintChanged, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, messagesCustomChanged = messagesCustomChanged, minimumResultsForSearchChanged = minimumResultsForSearchChanged, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, ojAnimateEnd = ojAnimateEnd, ojAnimateStart = ojAnimateStart, optionRendererChanged = optionRendererChanged, optionsChanged = optionsChanged, optionsKeysChanged = optionsKeysChanged, paste = paste, pause = pause, pickerAttributesChanged = pickerAttributesChanged, placeholderChanged = placeholderChanged, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, progress = progress, ratechange = ratechange, readOnlyChanged = readOnlyChanged, renderModeChanged = renderModeChanged, requiredChanged = requiredChanged, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, stalled = stalled, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, translationsChanged = translationsChanged, validChanged = validChanged, valueChanged = valueChanged, valueOptionsChanged = valueOptionsChanged, volumechange = volumechange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[ojSelectManyEventMap[K, D]]
  }
}

