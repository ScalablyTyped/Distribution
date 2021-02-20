package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.oracleOraclejetStrings.describedBy
import typings.oracleOraclejet.oracleOraclejetStrings.describedByChanged
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typings.oracleOraclejet.oracleOraclejetStrings.displayOptions
import typings.oracleOraclejet.oracleOraclejetStrings.displayOptionsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.help
import typings.oracleOraclejet.oracleOraclejetStrings.helpChanged
import typings.oracleOraclejet.oracleOraclejetStrings.helpHints
import typings.oracleOraclejet.oracleOraclejetStrings.helpHintsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.labelHint
import typings.oracleOraclejet.oracleOraclejetStrings.labelHintChanged
import typings.oracleOraclejet.oracleOraclejetStrings.messagesCustom
import typings.oracleOraclejet.oracleOraclejetStrings.messagesCustomChanged
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.oracleOraclejet.oracleOraclejetStrings.validChanged
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HTMLElement
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

object ojeditablevalueMod {
  
  @js.native
  trait editableValue[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] extends baseComponent[SP] {
    
    def addEventListener(
      `type`: validChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[
            typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
          ], 
          _
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: validChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[
            typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
          ], 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_describedByChanged(
      `type`: describedByChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_describedByChanged(
      `type`: describedByChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_disabledChanged(
      `type`: disabledChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_disabledChanged(
      `type`: disabledChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_displayOptionsChanged(
      `type`: displayOptionsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ConverterHint], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_displayOptionsChanged(
      `type`: displayOptionsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ConverterHint], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpChanged(
      `type`: helpChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Instruction], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpChanged(
      `type`: helpChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Instruction], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpHintsChanged(
      `type`: helpHintsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Definition], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpHintsChanged(
      `type`: helpHintsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Definition], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelHintChanged(
      `type`: labelHintChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelHintChanged(
      `type`: labelHintChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messagesCustomChanged(
      `type`: messagesCustomChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[^]], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messagesCustomChanged(
      `type`: messagesCustomChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[^]], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateEnd, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateEnd, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateStart, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateStart, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_valueChanged(
      `type`: valueChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[V], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_valueChanged(
      `type`: valueChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[V], _],
      useCapture: Boolean
    ): Unit = js.native
    
    var describedBy: String | Null = js.native
    
    var disabled: Boolean = js.native
    
    var displayOptions: ConverterHint = js.native
    
    @JSName("getProperty")
    def getProperty_describedBy(property: describedBy): String | Null = js.native
    @JSName("getProperty")
    def getProperty_disabled(property: disabled): Boolean = js.native
    @JSName("getProperty")
    def getProperty_displayOptions(property: displayOptions): ConverterHint = js.native
    @JSName("getProperty")
    def getProperty_help(property: help): Instruction = js.native
    @JSName("getProperty")
    def getProperty_helpHints(property: helpHints): Definition = js.native
    @JSName("getProperty")
    def getProperty_labelHint(property: labelHint): String = js.native
    @JSName("getProperty")
    def getProperty_messagesCustom(property: messagesCustom): js.Array[^] = js.native
    @JSName("getProperty")
    def getProperty_valid(property: typings.oracleOraclejet.oracleOraclejetStrings.valid): typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
    @JSName("getProperty")
    def getProperty_value(property: value): V = js.native
    
    var help: Instruction = js.native
    
    var helpHints: Definition = js.native
    
    var labelHint: String = js.native
    
    var messagesCustom: js.Array[^] = js.native
    
    var onDescribedByChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
    
    var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
    
    var onDisplayOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[ConverterHint], _]) | Null = js.native
    
    var onHelpChanged: (js.Function1[/* event */ JetElementCustomEvent[Instruction], _]) | Null = js.native
    
    var onHelpHintsChanged: (js.Function1[/* event */ JetElementCustomEvent[Definition], _]) | Null = js.native
    
    var onLabelHintChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
    
    var onMessagesCustomChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[^]], _]) | Null = js.native
    
    var onOjAnimateEnd: (js.Function1[
        /* event */ typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateEnd, 
        _
      ]) | Null = js.native
    
    var onOjAnimateStart: (js.Function1[
        /* event */ typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateStart, 
        _
      ]) | Null = js.native
    
    var onValidChanged: (js.Function1[
        /* event */ JetElementCustomEvent[
          typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
        ], 
        _
      ]) | Null = js.native
    
    var onValueChanged: (js.Function1[/* event */ JetElementCustomEvent[V], _]) | Null = js.native
    
    def reset(): Unit = js.native
    
    def setProperties(properties: editableValueSettablePropertiesLenient[V, SV, RV]): Unit = js.native
    
    def setProperty(property: typings.oracleOraclejet.oracleOraclejetStrings.valid, value: invalidHidden): Unit = js.native
    def setProperty(property: typings.oracleOraclejet.oracleOraclejetStrings.valid, value: invalidShown): Unit = js.native
    def setProperty(property: typings.oracleOraclejet.oracleOraclejetStrings.valid, value: pending): Unit = js.native
    @JSName("setProperty")
    def setProperty_describedBy(property: describedBy): Unit = js.native
    @JSName("setProperty")
    def setProperty_describedBy(property: describedBy, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_displayOptions(property: displayOptions, value: ConverterHint): Unit = js.native
    @JSName("setProperty")
    def setProperty_help(property: help, value: Instruction): Unit = js.native
    @JSName("setProperty")
    def setProperty_helpHints(property: helpHints, value: Definition): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelHint(property: labelHint, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_messagesCustom(property: messagesCustom, value: js.Array[^]): Unit = js.native
    @JSName("setProperty")
    def setProperty_valid(
      property: typings.oracleOraclejet.oracleOraclejetStrings.valid,
      value: typings.oracleOraclejet.oracleOraclejetStrings.valid
    ): Unit = js.native
    @JSName("setProperty")
    def setProperty_value(property: value, value: SV): Unit = js.native
    
    def showMessages(): Unit = js.native
    
    val valid: typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
    
    var value: V = js.native
  }
  object editableValue {
    
    type ojAnimateEnd = CustomEvent[Action]
    
    type ojAnimateStart = CustomEvent[Element]
  }
  
  @js.native
  trait editableValueEventMap[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] extends baseComponentEventMap[SP] {
    
    var describedByChanged: JetElementCustomEvent[String | Null] = js.native
    
    var disabledChanged: JetElementCustomEvent[Boolean] = js.native
    
    var displayOptionsChanged: JetElementCustomEvent[ConverterHint] = js.native
    
    var helpChanged: JetElementCustomEvent[Instruction] = js.native
    
    var helpHintsChanged: JetElementCustomEvent[Definition] = js.native
    
    var labelHintChanged: JetElementCustomEvent[String] = js.native
    
    var messagesCustomChanged: JetElementCustomEvent[js.Array[^]] = js.native
    
    var ojAnimateEnd: typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateEnd = js.native
    
    var ojAnimateStart: typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateStart = js.native
    
    var validChanged: JetElementCustomEvent[valid | pending | invalidHidden | invalidShown] = js.native
    
    var valueChanged: JetElementCustomEvent[V] = js.native
  }
  object editableValueEventMap {
    
    @scala.inline
    def apply[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV](
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
      click: MouseEvent,
      close: Event,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      describedByChanged: JetElementCustomEvent[String | Null],
      disabledChanged: JetElementCustomEvent[Boolean],
      displayOptionsChanged: JetElementCustomEvent[ConverterHint],
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
      helpChanged: JetElementCustomEvent[Instruction],
      helpHintsChanged: JetElementCustomEvent[Definition],
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      labelHintChanged: JetElementCustomEvent[String],
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
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
      ojAnimateEnd: typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateEnd,
      ojAnimateStart: typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateStart,
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
      valueChanged: JetElementCustomEvent[V],
      volumechange: Event,
      waiting: Event,
      wheel: WheelEvent
    ): editableValueEventMap[V, SP, SV, RV] = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[editableValueEventMap[V, SP, SV, RV]]
    }
    
    @scala.inline
    implicit class editableValueEventMapMutableBuilder[Self <: editableValueEventMap[_, _, _, _], V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] (val x: Self with (editableValueEventMap[V, SP, SV, RV])) extends AnyVal {
      
      @scala.inline
      def setDescribedByChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "describedByChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "disabledChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayOptionsChanged(value: JetElementCustomEvent[ConverterHint]): Self = StObject.set(x, "displayOptionsChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpChanged(value: JetElementCustomEvent[Instruction]): Self = StObject.set(x, "helpChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpHintsChanged(value: JetElementCustomEvent[Definition]): Self = StObject.set(x, "helpHintsChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHintChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "labelHintChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustomChanged(value: JetElementCustomEvent[js.Array[^]]): Self = StObject.set(x, "messagesCustomChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateEnd(value: typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateStart(value: typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidChanged(value: JetElementCustomEvent[valid | pending | invalidHidden | invalidShown]): Self = StObject.set(x, "validChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueChanged(value: JetElementCustomEvent[V]): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait editableValueSettableProperties[V, SV, RV] extends baseComponentSettableProperties {
    
    var describedBy: String | Null = js.native
    
    var disabled: Boolean = js.native
    
    var displayOptions: ConverterHint = js.native
    
    var help: Instruction = js.native
    
    var helpHints: Definition = js.native
    
    var labelHint: String = js.native
    
    var messagesCustom: js.Array[^] = js.native
    
    val valid: typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
    
    var value: SV = js.native
  }
  object editableValueSettableProperties {
    
    @scala.inline
    def apply[V, SV, RV](
      disabled: Boolean,
      displayOptions: ConverterHint,
      help: Instruction,
      helpHints: Definition,
      labelHint: String,
      messagesCustom: js.Array[^],
      valid: valid | pending | invalidHidden | invalidShown,
      value: SV
    ): editableValueSettableProperties[V, SV, RV] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[editableValueSettableProperties[V, SV, RV]]
    }
    
    @scala.inline
    implicit class editableValueSettablePropertiesMutableBuilder[Self <: editableValueSettableProperties[_, _, _], V, SV, RV] (val x: Self with (editableValueSettableProperties[V, SV, RV])) extends AnyVal {
      
      @scala.inline
      def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescribedByNull: Self = StObject.set(x, "describedBy", null)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayOptions(value: ConverterHint): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value :_*))
      
      @scala.inline
      def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: SV): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojeditablevalue.editableValueSettableProperties<V, SV, RV>> */
  @js.native
  trait editableValueSettablePropertiesLenient[V, SV, RV]
    extends /* key */ StringDictionary[js.Any] {
    
    var describedBy: js.UndefOr[String | Null] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var displayOptions: js.UndefOr[ConverterHint] = js.native
    
    var help: js.UndefOr[Instruction] = js.native
    
    var helpHints: js.UndefOr[Definition] = js.native
    
    var labelHint: js.UndefOr[String] = js.native
    
    var messagesCustom: js.UndefOr[js.Array[^]] = js.native
    
    var translations: js.UndefOr[js.Object | Null] = js.native
    
    var valid: js.UndefOr[
        typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ] = js.native
    
    var value: js.UndefOr[SV] = js.native
  }
  object editableValueSettablePropertiesLenient {
    
    @scala.inline
    def apply[V, SV, RV](): editableValueSettablePropertiesLenient[V, SV, RV] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[editableValueSettablePropertiesLenient[V, SV, RV]]
    }
    
    @scala.inline
    implicit class editableValueSettablePropertiesLenientMutableBuilder[Self <: editableValueSettablePropertiesLenient[_, _, _], V, SV, RV] (val x: Self with (editableValueSettablePropertiesLenient[V, SV, RV])) extends AnyVal {
      
      @scala.inline
      def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescribedByNull: Self = StObject.set(x, "describedBy", null)
      
      @scala.inline
      def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisplayOptions(value: ConverterHint): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
      
      @scala.inline
      def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpHintsUndefined: Self = StObject.set(x, "helpHints", js.undefined)
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
      
      @scala.inline
      def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
      
      @scala.inline
      def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value :_*))
      
      @scala.inline
      def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsNull: Self = StObject.set(x, "translations", null)
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      @scala.inline
      def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setValue(value: SV): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
