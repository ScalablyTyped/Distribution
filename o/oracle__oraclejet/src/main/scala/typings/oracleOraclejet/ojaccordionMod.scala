package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.DictpropName
import typings.oracleOraclejet.anon.Id
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.expanded
import typings.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.multipleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typings.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typings.oracleOraclejet.oracleOraclejetStrings.ojExpand
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojaccordionMod {
  
  @js.native
  trait ojAccordion
    extends StObject
       with baseComponent[ojAccordionSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_expandedChanged(
      `type`: expandedChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Id] | Null], js.Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_expandedChanged(
      `type`: expandedChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Id] | Null], js.Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_multipleChanged(
      `type`: multipleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_multipleChanged(
      `type`: multipleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCollapse(
      `type`: ojBeforeCollapse,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeCollapse, 
          js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCollapse(
      `type`: ojBeforeCollapse,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeCollapse, 
          js.Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeExpand(
      `type`: ojBeforeExpand,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeExpand, 
          js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeExpand(
      `type`: ojBeforeExpand,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeExpand, 
          js.Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojCollapse(
      `type`: ojCollapse,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojCollapse, 
          js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojCollapse(
      `type`: ojCollapse,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojCollapse, 
          js.Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojExpand(
      `type`: ojExpand,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojExpand, 
          js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojExpand(
      `type`: ojExpand,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojExpand, 
          js.Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    
    var expanded: js.Array[Id] | Null = js.native
    
    @JSName("getProperty")
    def getProperty_expanded(property: expanded): js.Array[Id] | Null = js.native
    @JSName("getProperty")
    def getProperty_multiple(property: multiple): Boolean = js.native
    
    var multiple: Boolean = js.native
    
    var onExpandedChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Id] | Null], js.Any]) | Null = js.native
    
    var onMultipleChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], js.Any]) | Null = js.native
    
    var onOjBeforeCollapse: (js.Function1[
        /* event */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeCollapse, 
        js.Any
      ]) | Null = js.native
    
    var onOjBeforeExpand: (js.Function1[
        /* event */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeExpand, 
        js.Any
      ]) | Null = js.native
    
    var onOjCollapse: (js.Function1[/* event */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojCollapse, js.Any]) | Null = js.native
    
    var onOjExpand: (js.Function1[/* event */ typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojExpand, js.Any]) | Null = js.native
    
    def setProperties(properties: ojAccordionSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_expanded(property: expanded): Unit = js.native
    @JSName("setProperty")
    def setProperty_expanded(property: expanded, value: js.Array[Double | Id | String]): Unit = js.native
    @JSName("setProperty")
    def setProperty_multiple(property: multiple, value: Boolean): Unit = js.native
  }
  object ojAccordion {
    
    type ojBeforeCollapse = CustomEvent[DictpropName]
    
    type ojBeforeExpand = CustomEvent[DictpropName]
    
    type ojCollapse = CustomEvent[DictpropName]
    
    type ojExpand = CustomEvent[DictpropName]
  }
  
  trait ojAccordionEventMap
    extends StObject
       with baseComponentEventMap[ojAccordionSettableProperties] {
    
    var expandedChanged: JetElementCustomEvent[js.Array[Id] | Null]
    
    var multipleChanged: JetElementCustomEvent[Boolean]
    
    var ojBeforeCollapse: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeCollapse
    
    var ojBeforeExpand: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeExpand
    
    var ojCollapse: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojCollapse
    
    var ojExpand: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojExpand
  }
  object ojAccordionEventMap {
    
    inline def apply(
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
      expandedChanged: JetElementCustomEvent[js.Array[Id] | Null],
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
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
      multipleChanged: JetElementCustomEvent[Boolean],
      ojBeforeCollapse: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeCollapse,
      ojBeforeExpand: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeExpand,
      ojCollapse: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojCollapse,
      ojExpand: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojExpand,
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
      volumechange: Event,
      waiting: Event,
      wheel: WheelEvent
    ): ojAccordionEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], multipleChanged = multipleChanged.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojAccordionEventMap]
    }
    
    extension [Self <: ojAccordionEventMap](x: Self) {
      
      inline def setExpandedChanged(value: JetElementCustomEvent[js.Array[Id] | Null]): Self = StObject.set(x, "expandedChanged", value.asInstanceOf[js.Any])
      
      inline def setMultipleChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "multipleChanged", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeCollapse(value: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeCollapse): Self = StObject.set(x, "ojBeforeCollapse", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeExpand(value: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojBeforeExpand): Self = StObject.set(x, "ojBeforeExpand", value.asInstanceOf[js.Any])
      
      inline def setOjCollapse(value: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojCollapse): Self = StObject.set(x, "ojCollapse", value.asInstanceOf[js.Any])
      
      inline def setOjExpand(value: typings.oracleOraclejet.ojaccordionMod.ojAccordion.ojExpand): Self = StObject.set(x, "ojExpand", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojAccordionSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    var expanded: (js.Array[Double | Id | String]) | Null
    
    var multiple: Boolean
  }
  object ojAccordionSettableProperties {
    
    inline def apply(multiple: Boolean): ojAccordionSettableProperties = {
      val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any], expanded = null, translations = null)
      __obj.asInstanceOf[ojAccordionSettableProperties]
    }
    
    extension [Self <: ojAccordionSettableProperties](x: Self) {
      
      inline def setExpanded(value: js.Array[Double | Id | String]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedNull: Self = StObject.set(x, "expanded", null)
      
      inline def setExpandedVarargs(value: (Double | Id | String)*): Self = StObject.set(x, "expanded", js.Array(value :_*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojaccordion.ojAccordionSettableProperties> */
  trait ojAccordionSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var expanded: js.UndefOr[(js.Array[Double | Id | String]) | Null] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var translations: js.UndefOr[js.Object | Null] = js.undefined
  }
  object ojAccordionSettablePropertiesLenient {
    
    inline def apply(): ojAccordionSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojAccordionSettablePropertiesLenient]
    }
    
    extension [Self <: ojAccordionSettablePropertiesLenient](x: Self) {
      
      inline def setExpanded(value: js.Array[Double | Id | String]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedNull: Self = StObject.set(x, "expanded", null)
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setExpandedVarargs(value: (Double | Id | String)*): Self = StObject.set(x, "expanded", js.Array(value :_*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsNull: Self = StObject.set(x, "translations", null)
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
