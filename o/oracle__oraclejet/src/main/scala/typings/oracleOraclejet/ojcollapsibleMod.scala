package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Header
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typings.oracleOraclejet.oracleOraclejetStrings.disclosureIcon
import typings.oracleOraclejet.oracleOraclejetStrings.expandArea
import typings.oracleOraclejet.oracleOraclejetStrings.expandAreaChanged
import typings.oracleOraclejet.oracleOraclejetStrings.expanded
import typings.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typings.oracleOraclejet.oracleOraclejetStrings.header
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcollapsibleMod {
  
  @js.native
  trait ojCollapsible extends baseComponent[ojCollapsibleSettableProperties] {
    
    def addEventListener(
      `type`: expandAreaChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[header | disclosureIcon], _]
    ): Unit = js.native
    def addEventListener(
      `type`: expandAreaChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[header | disclosureIcon], _],
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
    def addEventListener_expandedChanged(
      `type`: expandedChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_expandedChanged(
      `type`: expandedChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCollapse(
      `type`: ojBeforeCollapse,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeCollapse, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCollapse(
      `type`: ojBeforeCollapse,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeCollapse, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeExpand(
      `type`: ojBeforeExpand,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeExpand, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeExpand(
      `type`: ojBeforeExpand,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeExpand, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojCollapse(
      `type`: ojCollapse,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojCollapse, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojCollapse(
      `type`: ojCollapse,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojCollapse, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojExpand(
      `type`: ojExpand,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojExpand, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojExpand(
      `type`: ojExpand,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojExpand, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    
    var disabled: Boolean = js.native
    
    var expandArea: header | disclosureIcon = js.native
    
    var expanded: Boolean = js.native
    
    @JSName("getProperty")
    def getProperty_disabled(property: disabled): Boolean = js.native
    @JSName("getProperty")
    def getProperty_expandArea(property: expandArea): header | disclosureIcon = js.native
    @JSName("getProperty")
    def getProperty_expanded(property: expanded): Boolean = js.native
    
    var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
    
    var onExpandAreaChanged: (js.Function1[/* event */ JetElementCustomEvent[header | disclosureIcon], _]) | Null = js.native
    
    var onExpandedChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
    
    var onOjBeforeCollapse: (js.Function1[
        /* event */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeCollapse, 
        _
      ]) | Null = js.native
    
    var onOjBeforeExpand: (js.Function1[
        /* event */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeExpand, 
        _
      ]) | Null = js.native
    
    var onOjCollapse: (js.Function1[/* event */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojCollapse, _]) | Null = js.native
    
    var onOjExpand: (js.Function1[/* event */ typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojExpand, _]) | Null = js.native
    
    def setProperties(properties: ojCollapsibleSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: expandArea, value: disclosureIcon): Unit = js.native
    def setProperty(property: expandArea, value: header): Unit = js.native
    @JSName("setProperty")
    def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_expanded(property: expanded, value: Boolean): Unit = js.native
  }
  object ojCollapsible {
    
    type ojBeforeCollapse = CustomEvent[Header]
    
    type ojBeforeExpand = CustomEvent[Header]
    
    type ojCollapse = CustomEvent[Header]
    
    type ojExpand = CustomEvent[Header]
  }
  
  @js.native
  trait ojCollapsibleEventMap extends baseComponentEventMap[ojCollapsibleSettableProperties] {
    
    var disabledChanged: JetElementCustomEvent[Boolean] = js.native
    
    var expandAreaChanged: JetElementCustomEvent[header | disclosureIcon] = js.native
    
    var expandedChanged: JetElementCustomEvent[Boolean] = js.native
    
    var ojBeforeCollapse: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeCollapse = js.native
    
    var ojBeforeExpand: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeExpand = js.native
    
    var ojCollapse: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojCollapse = js.native
    
    var ojExpand: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojExpand = js.native
  }
  object ojCollapsibleEventMap {
    
    @scala.inline
    def apply(
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
      disabledChanged: JetElementCustomEvent[Boolean],
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
      expandAreaChanged: JetElementCustomEvent[header | disclosureIcon],
      expandedChanged: JetElementCustomEvent[Boolean],
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
      ojBeforeCollapse: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeCollapse,
      ojBeforeExpand: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeExpand,
      ojCollapse: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojCollapse,
      ojExpand: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojExpand,
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
    ): ojCollapsibleEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandAreaChanged = expandAreaChanged.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojCollapsibleEventMap]
    }
    
    @scala.inline
    implicit class ojCollapsibleEventMapMutableBuilder[Self <: ojCollapsibleEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabledChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "disabledChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandAreaChanged(value: JetElementCustomEvent[header | disclosureIcon]): Self = StObject.set(x, "expandAreaChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "expandedChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeCollapse(value: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeCollapse): Self = StObject.set(x, "ojBeforeCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeExpand(value: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojBeforeExpand): Self = StObject.set(x, "ojBeforeExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjCollapse(value: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojCollapse): Self = StObject.set(x, "ojCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjExpand(value: typings.oracleOraclejet.ojcollapsibleMod.ojCollapsible.ojExpand): Self = StObject.set(x, "ojExpand", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojCollapsibleSettableProperties extends baseComponentSettableProperties {
    
    var disabled: Boolean = js.native
    
    var expandArea: header | disclosureIcon = js.native
    
    var expanded: Boolean = js.native
  }
  object ojCollapsibleSettableProperties {
    
    @scala.inline
    def apply(disabled: Boolean, expandArea: header | disclosureIcon, expanded: Boolean): ojCollapsibleSettableProperties = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], expandArea = expandArea.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojCollapsibleSettableProperties]
    }
    
    @scala.inline
    implicit class ojCollapsibleSettablePropertiesMutableBuilder[Self <: ojCollapsibleSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandArea(value: header | disclosureIcon): Self = StObject.set(x, "expandArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcollapsible.ojCollapsibleSettableProperties> */
  @js.native
  trait ojCollapsibleSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var expandArea: js.UndefOr[header | disclosureIcon] = js.native
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var translations: js.UndefOr[js.Object | Null] = js.native
  }
  object ojCollapsibleSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojCollapsibleSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojCollapsibleSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojCollapsibleSettablePropertiesLenientMutableBuilder[Self <: ojCollapsibleSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExpandArea(value: header | disclosureIcon): Self = StObject.set(x, "expandArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandAreaUndefined: Self = StObject.set(x, "expandArea", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsNull: Self = StObject.set(x, "translations", null)
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
