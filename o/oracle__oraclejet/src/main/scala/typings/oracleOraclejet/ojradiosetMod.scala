package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.Required
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.ojeditablevalueMod.editableValueEventMap
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojradiosetMod.ojRadioset.OptionContext
import typings.oracleOraclejet.ojradiosetMod.ojRadioset.OptionsKeys
import typings.oracleOraclejet.ojradiosetMod.ojRadioset.ojAnimateEnd
import typings.oracleOraclejet.ojradiosetMod.ojRadioset.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.labelledBy
import typings.oracleOraclejet.oracleOraclejetStrings.labelledByChanged
import typings.oracleOraclejet.oracleOraclejetStrings.optionRenderer
import typings.oracleOraclejet.oracleOraclejetStrings.optionRendererChanged
import typings.oracleOraclejet.oracleOraclejetStrings.options
import typings.oracleOraclejet.oracleOraclejetStrings.optionsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.optionsKeys
import typings.oracleOraclejet.oracleOraclejetStrings.optionsKeysChanged
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.required
import typings.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.Element
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLElement
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojradiosetMod {
  
  @js.native
  trait ojRadioset[K, D]
    extends StObject
       with editableValue[Any, ojRadiosetSettableProperties[K, D], Any, Any] {
    
    def addEventListener(
      `type`: valueChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[
            /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojradioset.ojRadioset<K, D>['value'] */ js.Any
          ], 
          Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: valueChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[
            /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojradioset.ojRadioset<K, D>['value'] */ js.Any
          ], 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelledByChanged(
      `type`: labelledByChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelledByChanged(
      `type`: labelledByChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionRendererChanged(
      `type`: optionRendererChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionRendererChanged(
      `type`: optionRendererChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null]], 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionsChanged(
      `type`: optionsChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionsChanged(
      `type`: optionsChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionsKeysChanged(
      `type`: optionsKeysChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[OptionsKeys]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionsKeysChanged(
      `type`: optionsKeysChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[OptionsKeys]], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requiredChanged(
      `type`: requiredChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requiredChanged(
      `type`: requiredChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], Any],
      useCapture: Boolean
    ): Unit = js.native
    
    @JSName("getProperty")
    def getProperty_labelledBy(property: labelledBy): String | Null = js.native
    @JSName("getProperty")
    def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.native
    @JSName("getProperty")
    def getProperty_options(property: options): (DataProvider[K, D]) | Null = js.native
    @JSName("getProperty")
    def getProperty_optionsKeys(property: optionsKeys): js.UndefOr[OptionsKeys] = js.native
    @JSName("getProperty")
    def getProperty_required(property: required): Boolean = js.native
    
    var labelledBy: String | Null = js.native
    
    var onLabelledByChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], Any]) | Null = js.native
    
    @JSName("onOjAnimateEnd")
    var onOjAnimateEnd_ojRadioset: (js.Function1[/* event */ ojAnimateEnd, Any]) | Null = js.native
    
    @JSName("onOjAnimateStart")
    var onOjAnimateStart_ojRadioset: (js.Function1[/* event */ ojAnimateStart, Any]) | Null = js.native
    
    var onOptionRendererChanged: (js.Function1[
        /* event */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null]], 
        Any
      ]) | Null = js.native
    
    var onOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], Any]) | Null = js.native
    
    var onOptionsKeysChanged: (js.Function1[/* event */ JetElementCustomEvent[js.UndefOr[OptionsKeys]], Any]) | Null = js.native
    
    var onRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], Any]) | Null = js.native
    
    @JSName("onValueChanged")
    var onValueChanged_ojRadioset: (js.Function1[
        /* event */ JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojradioset.ojRadioset<K, D>['value'] */ js.Any
        ], 
        Any
      ]) | Null = js.native
    
    var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.native
    
    var options: (DataProvider[K, D]) | Null = js.native
    
    var optionsKeys: js.UndefOr[OptionsKeys] = js.native
    
    var required: Boolean = js.native
    
    def setProperties(properties: ojRadiosetSettablePropertiesLenient[K, D]): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_labelledBy(property: labelledBy): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_optionRenderer(property: optionRenderer): Unit = js.native
    @JSName("setProperty")
    def setProperty_optionRenderer(property: optionRenderer, value: js.Function1[/* param0 */ OptionContext[D], Element]): Unit = js.native
    @JSName("setProperty")
    def setProperty_options(property: options): Unit = js.native
    @JSName("setProperty")
    def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
    @JSName("setProperty")
    def setProperty_optionsKeys(property: optionsKeys): Unit = js.native
    @JSName("setProperty")
    def setProperty_optionsKeys(property: optionsKeys, value: OptionsKeys): Unit = js.native
    @JSName("setProperty")
    def setProperty_required(property: required, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: Required): Unit = js.native
    
    @JSName("translations")
    var translations_ojRadioset: Required = js.native
    
    def validate(): js.Promise[String] = js.native
  }
  object ojRadioset {
    
    // tslint:disable-next-line interface-over-type-literal
    trait Option extends StObject {
      
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var value: Any
    }
    object Option {
      
      inline def apply(value: Any): Option = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Option]
      }
      
      extension [Self <: Option](x: Self) {
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait OptionContext[D] extends StObject {
      
      var component: Element
      
      var data: D
      
      var index: Double
    }
    object OptionContext {
      
      inline def apply[D](component: Element, data: D, index: Double): OptionContext[D] = {
        val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
        __obj.asInstanceOf[OptionContext[D]]
      }
      
      extension [Self <: OptionContext[?], D](x: Self & OptionContext[D]) {
        
        inline def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
        
        inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait OptionsKeys extends StObject {
      
      var label: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object OptionsKeys {
      
      inline def apply(): OptionsKeys = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OptionsKeys]
      }
      
      extension [Self <: OptionsKeys](x: Self) {
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    type ojAnimateEnd = CustomEvent[Action]
    
    type ojAnimateStart = CustomEvent[typings.oracleOraclejet.anon.Element]
  }
  
  trait ojRadiosetEventMap[K, D]
    extends StObject
       with editableValueEventMap[Any, ojRadiosetSettableProperties[K, D], Any, Any] {
    
    var labelledByChanged: JetElementCustomEvent[String | Null]
    
    @JSName("ojAnimateEnd")
    var ojAnimateEnd_ojRadiosetEventMap: ojAnimateEnd
    
    @JSName("ojAnimateStart")
    var ojAnimateStart_ojRadiosetEventMap: ojAnimateStart
    
    var optionRendererChanged: JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null]]
    
    var optionsChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null]
    
    var optionsKeysChanged: JetElementCustomEvent[js.UndefOr[OptionsKeys]]
    
    var requiredChanged: JetElementCustomEvent[Boolean]
    
    @JSName("valueChanged")
    var valueChanged_ojRadiosetEventMap: JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojradioset.ojRadioset<K, D>['value'] */ js.Any
      ]
  }
  object ojRadiosetEventMap {
    
    inline def apply[K, D](
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
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
      formdata: FormDataEvent,
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
      labelledByChanged: JetElementCustomEvent[String | Null],
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
      ojAnimateEnd: ojAnimateEnd,
      ojAnimateStart: ojAnimateStart,
      optionRendererChanged: JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null]],
      optionsChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
      optionsKeysChanged: JetElementCustomEvent[js.UndefOr[OptionsKeys]],
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
      slotchange: Event,
      stalled: Event,
      submit: SubmitEvent,
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
      valueChanged: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojradioset.ojRadioset<K, D>['value'] */ js.Any
        ],
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ojRadiosetEventMap[K, D] = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], labelledByChanged = labelledByChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], optionRendererChanged = optionRendererChanged.asInstanceOf[js.Any], optionsChanged = optionsChanged.asInstanceOf[js.Any], optionsKeysChanged = optionsKeysChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], requiredChanged = requiredChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojRadiosetEventMap[K, D]]
    }
    
    extension [Self <: ojRadiosetEventMap[?, ?], K, D](x: Self & (ojRadiosetEventMap[K, D])) {
      
      inline def setLabelledByChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "labelledByChanged", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateEnd(value: ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateStart(value: ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      inline def setOptionRendererChanged(
        value: JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null]]
      ): Self = StObject.set(x, "optionRendererChanged", value.asInstanceOf[js.Any])
      
      inline def setOptionsChanged(value: JetElementCustomEvent[(DataProvider[K, D]) | Null]): Self = StObject.set(x, "optionsChanged", value.asInstanceOf[js.Any])
      
      inline def setOptionsKeysChanged(value: JetElementCustomEvent[js.UndefOr[OptionsKeys]]): Self = StObject.set(x, "optionsKeysChanged", value.asInstanceOf[js.Any])
      
      inline def setRequiredChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "requiredChanged", value.asInstanceOf[js.Any])
      
      inline def setValueChanged(
        value: JetElementCustomEvent[
              /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojradioset.ojRadioset<K, D>['value'] */ js.Any
            ]
      ): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojRadiosetSettableProperties[K, D]
    extends StObject
       with editableValueSettableProperties[Any, Any, Any] {
    
    var labelledBy: String | Null
    
    var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.undefined
    
    var options: (DataProvider[K, D]) | Null
    
    var optionsKeys: js.UndefOr[OptionsKeys] = js.undefined
    
    var required: Boolean
    
    @JSName("translations")
    var translations_ojRadiosetSettableProperties: Required
  }
  object ojRadiosetSettableProperties {
    
    inline def apply[K, D](
      disabled: Boolean,
      displayOptions: ConverterHint,
      help: Instruction,
      helpHints: Definition,
      labelHint: String,
      messagesCustom: js.Array[^],
      required: Boolean,
      translations: Required,
      valid: valid | pending | invalidHidden | invalidShown,
      value: Any
    ): ojRadiosetSettableProperties[K, D] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], describedBy = null, labelledBy = null, options = null)
      __obj.asInstanceOf[ojRadiosetSettableProperties[K, D]]
    }
    
    extension [Self <: ojRadiosetSettableProperties[?, ?], K, D](x: Self & (ojRadiosetSettableProperties[K, D])) {
      
      inline def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      inline def setLabelledByNull: Self = StObject.set(x, "labelledBy", null)
      
      inline def setOptionRenderer(value: /* param0 */ OptionContext[D] => Element): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
      
      inline def setOptionRendererNull: Self = StObject.set(x, "optionRenderer", null)
      
      inline def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
      
      inline def setOptions(value: DataProvider[K, D]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsKeys(value: OptionsKeys): Self = StObject.set(x, "optionsKeys", value.asInstanceOf[js.Any])
      
      inline def setOptionsKeysUndefined: Self = StObject.set(x, "optionsKeys", js.undefined)
      
      inline def setOptionsNull: Self = StObject.set(x, "options", null)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: Required): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojradioset.ojRadiosetSettableProperties<K, D>> */
  trait ojRadiosetSettablePropertiesLenient[K, D]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var describedBy: js.UndefOr[String | Null] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var displayOptions: js.UndefOr[ConverterHint] = js.undefined
    
    var help: js.UndefOr[Instruction] = js.undefined
    
    var helpHints: js.UndefOr[Definition] = js.undefined
    
    var labelHint: js.UndefOr[String] = js.undefined
    
    var labelledBy: js.UndefOr[String | Null] = js.undefined
    
    var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
    
    var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.undefined
    
    var options: js.UndefOr[(DataProvider[K, D]) | Null] = js.undefined
    
    var optionsKeys: js.UndefOr[OptionsKeys] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var translations: js.UndefOr[Required] = js.undefined
    
    var valid: js.UndefOr[
        typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object ojRadiosetSettablePropertiesLenient {
    
    inline def apply[K, D](): ojRadiosetSettablePropertiesLenient[K, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojRadiosetSettablePropertiesLenient[K, D]]
    }
    
    extension [Self <: ojRadiosetSettablePropertiesLenient[?, ?], K, D](x: Self & (ojRadiosetSettablePropertiesLenient[K, D])) {
      
      inline def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
      
      inline def setDescribedByNull: Self = StObject.set(x, "describedBy", null)
      
      inline def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplayOptions(value: ConverterHint): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
      
      inline def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
      
      inline def setHelpHintsUndefined: Self = StObject.set(x, "helpHints", js.undefined)
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
      
      inline def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
      
      inline def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      inline def setLabelledByNull: Self = StObject.set(x, "labelledBy", null)
      
      inline def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      inline def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      inline def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
      
      inline def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value*))
      
      inline def setOptionRenderer(value: /* param0 */ OptionContext[D] => Element): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
      
      inline def setOptionRendererNull: Self = StObject.set(x, "optionRenderer", null)
      
      inline def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
      
      inline def setOptions(value: DataProvider[K, D]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsKeys(value: OptionsKeys): Self = StObject.set(x, "optionsKeys", value.asInstanceOf[js.Any])
      
      inline def setOptionsKeysUndefined: Self = StObject.set(x, "optionsKeys", js.undefined)
      
      inline def setOptionsNull: Self = StObject.set(x, "options", null)
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTranslations(value: Required): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      inline def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
