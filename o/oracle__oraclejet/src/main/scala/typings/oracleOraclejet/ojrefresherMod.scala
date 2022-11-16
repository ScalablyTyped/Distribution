package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.refreshContentChanged
import typings.oracleOraclejet.oracleOraclejetStrings.target
import typings.oracleOraclejet.oracleOraclejetStrings.targetChanged
import typings.oracleOraclejet.oracleOraclejetStrings.text
import typings.oracleOraclejet.oracleOraclejetStrings.textChanged
import typings.oracleOraclejet.oracleOraclejetStrings.threshold
import typings.oracleOraclejet.oracleOraclejetStrings.thresholdChanged
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
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

object ojrefresherMod {
  
  @js.native
  trait ojRefresher
    extends StObject
       with baseComponent[ojRefresherSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_refreshContentChanged(
      `type`: refreshContentChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[js.Function0[js.Promise[Any]]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_refreshContentChanged(
      `type`: refreshContentChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[js.Function0[js.Promise[Any]]], 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_targetChanged(
      `type`: targetChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Element], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_targetChanged(
      `type`: targetChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Element], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_textChanged(
      `type`: textChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_textChanged(
      `type`: textChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_thresholdChanged(
      `type`: thresholdChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_thresholdChanged(
      `type`: thresholdChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], Any],
      useCapture: Boolean
    ): Unit = js.native
    
    @JSName("getProperty")
    def getProperty_target(property: target): Element = js.native
    @JSName("getProperty")
    def getProperty_text(property: text): String = js.native
    @JSName("getProperty")
    def getProperty_threshold(property: threshold): Double = js.native
    
    var onRefreshContentChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Function0[js.Promise[Any]]], Any]) | Null = js.native
    
    var onTargetChanged: (js.Function1[/* event */ JetElementCustomEvent[Element], Any]) | Null = js.native
    
    var onTextChanged: (js.Function1[/* event */ JetElementCustomEvent[String], Any]) | Null = js.native
    
    var onThresholdChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], Any]) | Null = js.native
    
    def refreshContent(): js.Promise[Any] = js.native
    
    def setProperties(properties: ojRefresherSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_target(property: target, value: Element): Unit = js.native
    @JSName("setProperty")
    def setProperty_text(property: text, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_threshold(property: threshold, value: Double): Unit = js.native
    
    var target: Element = js.native
    
    var text: String = js.native
    
    var threshold: Double = js.native
  }
  
  trait ojRefresherEventMap
    extends StObject
       with baseComponentEventMap[ojRefresherSettableProperties] {
    
    var refreshContentChanged: JetElementCustomEvent[js.Function0[js.Promise[Any]]]
    
    var targetChanged: JetElementCustomEvent[Element]
    
    var textChanged: JetElementCustomEvent[String]
    
    var thresholdChanged: JetElementCustomEvent[Double]
  }
  object ojRefresherEventMap {
    
    inline def apply(
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
      refreshContentChanged: JetElementCustomEvent[js.Function0[js.Promise[Any]]],
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
      targetChanged: JetElementCustomEvent[Element],
      textChanged: JetElementCustomEvent[String],
      thresholdChanged: JetElementCustomEvent[Double],
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
    ): ojRefresherEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], refreshContentChanged = refreshContentChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], targetChanged = targetChanged.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], thresholdChanged = thresholdChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojRefresherEventMap]
    }
    
    extension [Self <: ojRefresherEventMap](x: Self) {
      
      inline def setRefreshContentChanged(value: JetElementCustomEvent[js.Function0[js.Promise[Any]]]): Self = StObject.set(x, "refreshContentChanged", value.asInstanceOf[js.Any])
      
      inline def setTargetChanged(value: JetElementCustomEvent[Element]): Self = StObject.set(x, "targetChanged", value.asInstanceOf[js.Any])
      
      inline def setTextChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
      
      inline def setThresholdChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "thresholdChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojRefresherSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    def refreshContent(): js.Promise[Any]
    
    var target: Element
    
    var text: String
    
    var threshold: Double
  }
  object ojRefresherSettableProperties {
    
    inline def apply(refreshContent: () => js.Promise[Any], target: Element, text: String, threshold: Double): ojRefresherSettableProperties = {
      val __obj = js.Dynamic.literal(refreshContent = js.Any.fromFunction0(refreshContent), target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], translations = null)
      __obj.asInstanceOf[ojRefresherSettableProperties]
    }
    
    extension [Self <: ojRefresherSettableProperties](x: Self) {
      
      inline def setRefreshContent(value: () => js.Promise[Any]): Self = StObject.set(x, "refreshContent", js.Any.fromFunction0(value))
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojrefresher.ojRefresherSettableProperties> */
  trait ojRefresherSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var refreshContent: js.UndefOr[js.Function0[js.Promise[Any]]] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var translations: js.UndefOr[js.Object | Null] = js.undefined
  }
  object ojRefresherSettablePropertiesLenient {
    
    inline def apply(): ojRefresherSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojRefresherSettablePropertiesLenient]
    }
    
    extension [Self <: ojRefresherSettablePropertiesLenient](x: Self) {
      
      inline def setRefreshContent(value: () => js.Promise[Any]): Self = StObject.set(x, "refreshContent", js.Any.fromFunction0(value))
      
      inline def setRefreshContentUndefined: Self = StObject.set(x, "refreshContent", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsNull: Self = StObject.set(x, "translations", null)
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
