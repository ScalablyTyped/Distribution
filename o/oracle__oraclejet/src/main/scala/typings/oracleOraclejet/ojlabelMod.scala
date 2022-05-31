package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.DefinitionSource
import typings.oracleOraclejet.anon.TooltipHelp
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.`for`
import typings.oracleOraclejet.oracleOraclejetStrings.forChanged
import typings.oracleOraclejet.oracleOraclejetStrings.help
import typings.oracleOraclejet.oracleOraclejetStrings.helpChanged
import typings.oracleOraclejet.oracleOraclejetStrings.labelId
import typings.oracleOraclejet.oracleOraclejetStrings.labelIdChanged
import typings.oracleOraclejet.oracleOraclejetStrings.showRequired
import typings.oracleOraclejet.oracleOraclejetStrings.showRequiredChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
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

object ojlabelMod {
  
  @js.native
  trait ojLabel
    extends StObject
       with baseComponent[ojLabelSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_forChanged(
      `type`: forChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], js.Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_forChanged(
      `type`: forChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], js.Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpChanged(
      `type`: helpChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[DefinitionSource], js.Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpChanged(
      `type`: helpChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[DefinitionSource], js.Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelIdChanged(
      `type`: labelIdChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], js.Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelIdChanged(
      `type`: labelIdChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], js.Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_showRequiredChanged(
      `type`: showRequiredChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean | Null], js.Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_showRequiredChanged(
      `type`: showRequiredChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean | Null], js.Any],
      useCapture: Boolean
    ): Unit = js.native
    
    var `for`: String | Null = js.native
    
    @JSName("getProperty")
    def getProperty_for(property: `for`): String | Null = js.native
    @JSName("getProperty")
    def getProperty_help(property: help): DefinitionSource = js.native
    @JSName("getProperty")
    def getProperty_labelId(property: labelId): String | Null = js.native
    @JSName("getProperty")
    def getProperty_showRequired(property: showRequired): Boolean | Null = js.native
    
    var help: DefinitionSource = js.native
    
    var labelId: String | Null = js.native
    
    var onForChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], js.Any]) | Null = js.native
    
    var onHelpChanged: (js.Function1[/* event */ JetElementCustomEvent[DefinitionSource], js.Any]) | Null = js.native
    
    var onLabelIdChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], js.Any]) | Null = js.native
    
    var onShowRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean | Null], js.Any]) | Null = js.native
    
    def setProperties(properties: ojLabelSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_for(property: `for`): Unit = js.native
    @JSName("setProperty")
    def setProperty_for(property: `for`, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_help(property: help, value: DefinitionSource): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelId(property: labelId): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelId(property: labelId, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_showRequired(property: showRequired): Unit = js.native
    @JSName("setProperty")
    def setProperty_showRequired(property: showRequired, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: TooltipHelp): Unit = js.native
    
    var showRequired: Boolean | Null = js.native
    
    @JSName("translations")
    var translations_ojLabel: TooltipHelp = js.native
  }
  
  trait ojLabelEventMap
    extends StObject
       with baseComponentEventMap[ojLabelSettableProperties] {
    
    var forChanged: JetElementCustomEvent[String | Null]
    
    var helpChanged: JetElementCustomEvent[DefinitionSource]
    
    var labelIdChanged: JetElementCustomEvent[String | Null]
    
    var showRequiredChanged: JetElementCustomEvent[Boolean | Null]
  }
  object ojLabelEventMap {
    
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
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      forChanged: JetElementCustomEvent[String | Null],
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      helpChanged: JetElementCustomEvent[DefinitionSource],
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      labelIdChanged: JetElementCustomEvent[String | Null],
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
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      showRequiredChanged: JetElementCustomEvent[Boolean | Null],
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
    ): ojLabelEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], forChanged = forChanged.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelIdChanged = labelIdChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], showRequiredChanged = showRequiredChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojLabelEventMap]
    }
    
    extension [Self <: ojLabelEventMap](x: Self) {
      
      inline def setForChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "forChanged", value.asInstanceOf[js.Any])
      
      inline def setHelpChanged(value: JetElementCustomEvent[DefinitionSource]): Self = StObject.set(x, "helpChanged", value.asInstanceOf[js.Any])
      
      inline def setLabelIdChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "labelIdChanged", value.asInstanceOf[js.Any])
      
      inline def setShowRequiredChanged(value: JetElementCustomEvent[Boolean | Null]): Self = StObject.set(x, "showRequiredChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojLabelSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    var `for`: String | Null
    
    var help: DefinitionSource
    
    var labelId: String | Null
    
    var showRequired: Boolean | Null
    
    @JSName("translations")
    var translations_ojLabelSettableProperties: TooltipHelp
  }
  object ojLabelSettableProperties {
    
    inline def apply(help: DefinitionSource, translations: TooltipHelp): ojLabelSettableProperties = {
      val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], labelId = null, showRequired = null)
      __obj.updateDynamic("for")(null)
      __obj.asInstanceOf[ojLabelSettableProperties]
    }
    
    extension [Self <: ojLabelSettableProperties](x: Self) {
      
      inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setForNull: Self = StObject.set(x, "for", null)
      
      inline def setHelp(value: DefinitionSource): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdNull: Self = StObject.set(x, "labelId", null)
      
      inline def setShowRequired(value: Boolean): Self = StObject.set(x, "showRequired", value.asInstanceOf[js.Any])
      
      inline def setShowRequiredNull: Self = StObject.set(x, "showRequired", null)
      
      inline def setTranslations(value: TooltipHelp): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlabel.ojLabelSettableProperties> */
  trait ojLabelSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var `for`: js.UndefOr[String | Null] = js.undefined
    
    var help: js.UndefOr[DefinitionSource] = js.undefined
    
    var labelId: js.UndefOr[String | Null] = js.undefined
    
    var showRequired: js.UndefOr[Boolean | Null] = js.undefined
    
    var translations: js.UndefOr[TooltipHelp] = js.undefined
  }
  object ojLabelSettablePropertiesLenient {
    
    inline def apply(): ojLabelSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojLabelSettablePropertiesLenient]
    }
    
    extension [Self <: ojLabelSettablePropertiesLenient](x: Self) {
      
      inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setForNull: Self = StObject.set(x, "for", null)
      
      inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      inline def setHelp(value: DefinitionSource): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdNull: Self = StObject.set(x, "labelId", null)
      
      inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      inline def setShowRequired(value: Boolean): Self = StObject.set(x, "showRequired", value.asInstanceOf[js.Any])
      
      inline def setShowRequiredNull: Self = StObject.set(x, "showRequired", null)
      
      inline def setShowRequiredUndefined: Self = StObject.set(x, "showRequired", js.undefined)
      
      inline def setTranslations(value: TooltipHelp): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
