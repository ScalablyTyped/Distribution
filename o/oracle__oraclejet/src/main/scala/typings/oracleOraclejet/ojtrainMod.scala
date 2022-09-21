package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.FromStep
import typings.oracleOraclejet.anon.MessageType
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojtrainMod.ojTrain.Step
import typings.oracleOraclejet.oracleOraclejetStrings.error
import typings.oracleOraclejet.oracleOraclejetStrings.fatal
import typings.oracleOraclejet.oracleOraclejetStrings.info
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeDeselect
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeSelect
import typings.oracleOraclejet.oracleOraclejetStrings.ojDeselect
import typings.oracleOraclejet.oracleOraclejetStrings.ojSelect
import typings.oracleOraclejet.oracleOraclejetStrings.selectedStep
import typings.oracleOraclejet.oracleOraclejetStrings.selectedStepChanged
import typings.oracleOraclejet.oracleOraclejetStrings.steps
import typings.oracleOraclejet.oracleOraclejetStrings.stepsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.warning
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.CustomEvent
import typings.std.DragEvent
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

object ojtrainMod {
  
  @js.native
  trait ojTrain
    extends StObject
       with baseComponent[ojTrainSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_ojBeforeDeselect(
      `type`: ojBeforeDeselect,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeDeselect, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeDeselect(
      `type`: ojBeforeDeselect,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeDeselect, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeSelect(
      `type`: ojBeforeSelect,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeSelect, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeSelect(
      `type`: ojBeforeSelect,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeSelect, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojDeselect(
      `type`: ojDeselect,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojDeselect, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojDeselect(
      `type`: ojDeselect,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojDeselect, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojSelect(
      `type`: ojSelect,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojSelect, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojSelect(
      `type`: ojSelect,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojSelect, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectedStepChanged(
      `type`: selectedStepChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectedStepChanged(
      `type`: selectedStepChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stepsChanged(
      `type`: stepsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Step]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stepsChanged(
      `type`: stepsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Step]], Any],
      useCapture: Boolean
    ): Unit = js.native
    
    def getNextSelectableStep(): String | Null = js.native
    
    def getPreviousSelectableStep(): String | Null = js.native
    
    @JSName("getProperty")
    def getProperty_selectedStep(property: selectedStep): String = js.native
    @JSName("getProperty")
    def getProperty_steps(property: steps): js.Array[Step] = js.native
    
    def getStep(id: String): Step | Null = js.native
    
    var onOjBeforeDeselect: (js.Function1[/* event */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeDeselect, Any]) | Null = js.native
    
    var onOjBeforeSelect: (js.Function1[/* event */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeSelect, Any]) | Null = js.native
    
    var onOjDeselect: (js.Function1[/* event */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojDeselect, Any]) | Null = js.native
    
    var onOjSelect: (js.Function1[/* event */ typings.oracleOraclejet.ojtrainMod.ojTrain.ojSelect, Any]) | Null = js.native
    
    var onSelectedStepChanged: (js.Function1[/* event */ JetElementCustomEvent[String], Any]) | Null = js.native
    
    var onStepsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Step]], Any]) | Null = js.native
    
    var selectedStep: String = js.native
    
    def setProperties(properties: ojTrainSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_selectedStep(property: selectedStep, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_steps(property: steps, value: js.Array[Step]): Unit = js.native
    
    var steps: js.Array[Step] = js.native
    
    def updateStep(id: String, stepProperties: MessageType): Unit = js.native
  }
  object ojTrain {
    
    // tslint:disable-next-line interface-over-type-literal
    trait Step extends StObject {
      
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      var id: String
      
      var label: String
      
      var messageType: js.UndefOr[info | error | fatal | warning] = js.undefined
      
      var visited: js.UndefOr[Boolean] = js.undefined
    }
    object Step {
      
      inline def apply(id: String, label: String): Step = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[Step]
      }
      
      extension [Self <: Step](x: Self) {
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setMessageType(value: info | error | fatal | warning): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
        
        inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
        
        inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
        
        inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
      }
    }
    
    type ojBeforeDeselect = CustomEvent[FromStep]
    
    type ojBeforeSelect = CustomEvent[FromStep]
    
    type ojDeselect = CustomEvent[FromStep]
    
    type ojSelect = CustomEvent[FromStep]
  }
  
  trait ojTrainEventMap
    extends StObject
       with baseComponentEventMap[ojTrainSettableProperties] {
    
    var ojBeforeDeselect: typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeDeselect
    
    var ojBeforeSelect: typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeSelect
    
    var ojDeselect: typings.oracleOraclejet.ojtrainMod.ojTrain.ojDeselect
    
    var ojSelect: typings.oracleOraclejet.ojtrainMod.ojTrain.ojSelect
    
    var selectedStepChanged: JetElementCustomEvent[String]
    
    var stepsChanged: JetElementCustomEvent[js.Array[Step]]
  }
  object ojTrainEventMap {
    
    inline def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
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
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojBeforeDeselect: typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeDeselect,
      ojBeforeSelect: typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeSelect,
      ojDeselect: typings.oracleOraclejet.ojtrainMod.ojTrain.ojDeselect,
      ojSelect: typings.oracleOraclejet.ojtrainMod.ojTrain.ojSelect,
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
      selectedStepChanged: JetElementCustomEvent[String],
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      stepsChanged: JetElementCustomEvent[js.Array[Step]],
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
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ojTrainEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojBeforeDeselect = ojBeforeDeselect.asInstanceOf[js.Any], ojBeforeSelect = ojBeforeSelect.asInstanceOf[js.Any], ojDeselect = ojDeselect.asInstanceOf[js.Any], ojSelect = ojSelect.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectedStepChanged = selectedStepChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], stepsChanged = stepsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojTrainEventMap]
    }
    
    extension [Self <: ojTrainEventMap](x: Self) {
      
      inline def setOjBeforeDeselect(value: typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeDeselect): Self = StObject.set(x, "ojBeforeDeselect", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeSelect(value: typings.oracleOraclejet.ojtrainMod.ojTrain.ojBeforeSelect): Self = StObject.set(x, "ojBeforeSelect", value.asInstanceOf[js.Any])
      
      inline def setOjDeselect(value: typings.oracleOraclejet.ojtrainMod.ojTrain.ojDeselect): Self = StObject.set(x, "ojDeselect", value.asInstanceOf[js.Any])
      
      inline def setOjSelect(value: typings.oracleOraclejet.ojtrainMod.ojTrain.ojSelect): Self = StObject.set(x, "ojSelect", value.asInstanceOf[js.Any])
      
      inline def setSelectedStepChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "selectedStepChanged", value.asInstanceOf[js.Any])
      
      inline def setStepsChanged(value: JetElementCustomEvent[js.Array[Step]]): Self = StObject.set(x, "stepsChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojTrainSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    var selectedStep: String
    
    var steps: js.Array[Step]
  }
  object ojTrainSettableProperties {
    
    inline def apply(selectedStep: String, steps: js.Array[Step]): ojTrainSettableProperties = {
      val __obj = js.Dynamic.literal(selectedStep = selectedStep.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], translations = null)
      __obj.asInstanceOf[ojTrainSettableProperties]
    }
    
    extension [Self <: ojTrainSettableProperties](x: Self) {
      
      inline def setSelectedStep(value: String): Self = StObject.set(x, "selectedStep", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtrain.ojTrainSettableProperties> */
  trait ojTrainSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var selectedStep: js.UndefOr[String] = js.undefined
    
    var steps: js.UndefOr[js.Array[Step]] = js.undefined
    
    var translations: js.UndefOr[js.Object | Null] = js.undefined
  }
  object ojTrainSettablePropertiesLenient {
    
    inline def apply(): ojTrainSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojTrainSettablePropertiesLenient]
    }
    
    extension [Self <: ojTrainSettablePropertiesLenient](x: Self) {
      
      inline def setSelectedStep(value: String): Self = StObject.set(x, "selectedStep", value.asInstanceOf[js.Any])
      
      inline def setSelectedStepUndefined: Self = StObject.set(x, "selectedStep", js.undefined)
      
      inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsNull: Self = StObject.set(x, "translations", null)
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
