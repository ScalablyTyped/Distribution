package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.Label
import typings.oracleOraclejet.anon.LabelNone
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojcolorMod.^
import typings.oracleOraclejet.ojcolorpaletteMod.ojColorPalette.ojAnimateEnd
import typings.oracleOraclejet.ojcolorpaletteMod.ojColorPalette.ojAnimateStart
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.ojeditablevalueMod.editableValueEventMap
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.grid
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.labelDisplay
import typings.oracleOraclejet.oracleOraclejetStrings.labelDisplayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.labelledBy
import typings.oracleOraclejet.oracleOraclejetStrings.labelledByChanged
import typings.oracleOraclejet.oracleOraclejetStrings.layout
import typings.oracleOraclejet.oracleOraclejetStrings.layoutChanged
import typings.oracleOraclejet.oracleOraclejetStrings.lg
import typings.oracleOraclejet.oracleOraclejetStrings.list
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.palette
import typings.oracleOraclejet.oracleOraclejetStrings.paletteChanged
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.sm
import typings.oracleOraclejet.oracleOraclejetStrings.swatchSize
import typings.oracleOraclejet.oracleOraclejetStrings.swatchSizeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.oracleOraclejet.oracleOraclejetStrings.xs
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

object ojcolorpaletteMod {
  
  @js.native
  trait ojColorPalette
    extends StObject
       with editableValue[^, ojColorPaletteSettableProperties, ^, ^] {
    
    def addEventListener(
      `type`: labelDisplayChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | off], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: labelDisplayChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | off], Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: layoutChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[grid | list], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: layoutChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[grid | list], Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: swatchSizeChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[xs | sm | lg], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: swatchSizeChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[xs | sm | lg], Any],
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
    def addEventListener_paletteChanged(
      `type`: paletteChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Label]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paletteChanged(
      `type`: paletteChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Label]], Any],
      useCapture: Boolean
    ): Unit = js.native
    
    @JSName("getProperty")
    def getProperty_labelDisplay(property: labelDisplay): auto | off = js.native
    @JSName("getProperty")
    def getProperty_labelledBy(property: labelledBy): String | Null = js.native
    @JSName("getProperty")
    def getProperty_layout(property: layout): grid | list = js.native
    @JSName("getProperty")
    def getProperty_palette(property: palette): js.Array[Label] = js.native
    @JSName("getProperty")
    def getProperty_swatchSize(property: swatchSize): xs | sm | lg = js.native
    
    var labelDisplay: auto | off = js.native
    
    var labelledBy: String | Null = js.native
    
    var layout: grid | list = js.native
    
    var onLabelDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | off], Any]) | Null = js.native
    
    var onLabelledByChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], Any]) | Null = js.native
    
    var onLayoutChanged: (js.Function1[/* event */ JetElementCustomEvent[grid | list], Any]) | Null = js.native
    
    @JSName("onOjAnimateEnd")
    var onOjAnimateEnd_ojColorPalette: (js.Function1[/* event */ ojAnimateEnd, Any]) | Null = js.native
    
    @JSName("onOjAnimateStart")
    var onOjAnimateStart_ojColorPalette: (js.Function1[/* event */ ojAnimateStart, Any]) | Null = js.native
    
    var onPaletteChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Label]], Any]) | Null = js.native
    
    var onSwatchSizeChanged: (js.Function1[/* event */ JetElementCustomEvent[xs | sm | lg], Any]) | Null = js.native
    
    var palette: js.Array[Label] = js.native
    
    def setProperties(properties: ojColorPaletteSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: labelDisplay, value: auto | off): Unit = js.native
    def setProperty(property: layout, value: grid | list): Unit = js.native
    def setProperty(property: swatchSize, value: xs | sm | lg): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelledBy(property: labelledBy): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_palette(property: palette, value: js.Array[Label]): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelNone): Unit = js.native
    
    var swatchSize: xs | sm | lg = js.native
    
    @JSName("translations")
    var translations_ojColorPalette: LabelNone = js.native
  }
  object ojColorPalette {
    
    type ojAnimateEnd = CustomEvent[Action]
    
    type ojAnimateStart = CustomEvent[Element]
  }
  
  trait ojColorPaletteEventMap
    extends StObject
       with editableValueEventMap[^, ojColorPaletteSettableProperties, ^, ^] {
    
    var labelDisplayChanged: JetElementCustomEvent[auto | off]
    
    var labelledByChanged: JetElementCustomEvent[String | Null]
    
    var layoutChanged: JetElementCustomEvent[grid | list]
    
    @JSName("ojAnimateEnd")
    var ojAnimateEnd_ojColorPaletteEventMap: ojAnimateEnd
    
    @JSName("ojAnimateStart")
    var ojAnimateStart_ojColorPaletteEventMap: ojAnimateStart
    
    var paletteChanged: JetElementCustomEvent[js.Array[Label]]
    
    var swatchSizeChanged: JetElementCustomEvent[xs | sm | lg]
  }
  object ojColorPaletteEventMap {
    
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
      labelDisplayChanged: JetElementCustomEvent[auto | off],
      labelHintChanged: JetElementCustomEvent[String],
      labelledByChanged: JetElementCustomEvent[String | Null],
      layoutChanged: JetElementCustomEvent[grid | list],
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      messagesCustomChanged: JetElementCustomEvent[js.Array[typings.oracleOraclejet.ojmessagingMod.^]],
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAnimateEnd: ojAnimateEnd,
      ojAnimateStart: ojAnimateStart,
      paletteChanged: JetElementCustomEvent[js.Array[Label]],
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
      slotchange: Event,
      stalled: Event,
      submit: SubmitEvent,
      suspend: Event,
      swatchSizeChanged: JetElementCustomEvent[xs | sm | lg],
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
      valueChanged: JetElementCustomEvent[^],
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ojColorPaletteEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelDisplayChanged = labelDisplayChanged.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], labelledByChanged = labelledByChanged.asInstanceOf[js.Any], layoutChanged = layoutChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], paletteChanged = paletteChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], swatchSizeChanged = swatchSizeChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojColorPaletteEventMap]
    }
    
    extension [Self <: ojColorPaletteEventMap](x: Self) {
      
      inline def setLabelDisplayChanged(value: JetElementCustomEvent[auto | off]): Self = StObject.set(x, "labelDisplayChanged", value.asInstanceOf[js.Any])
      
      inline def setLabelledByChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "labelledByChanged", value.asInstanceOf[js.Any])
      
      inline def setLayoutChanged(value: JetElementCustomEvent[grid | list]): Self = StObject.set(x, "layoutChanged", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateEnd(value: ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateStart(value: ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      inline def setPaletteChanged(value: JetElementCustomEvent[js.Array[Label]]): Self = StObject.set(x, "paletteChanged", value.asInstanceOf[js.Any])
      
      inline def setSwatchSizeChanged(value: JetElementCustomEvent[xs | sm | lg]): Self = StObject.set(x, "swatchSizeChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojColorPaletteSettableProperties
    extends StObject
       with editableValueSettableProperties[^, ^, ^] {
    
    var labelDisplay: auto | off
    
    var labelledBy: String | Null
    
    var layout: grid | list
    
    var palette: js.Array[Label]
    
    var swatchSize: xs | sm | lg
    
    @JSName("translations")
    var translations_ojColorPaletteSettableProperties: LabelNone
  }
  object ojColorPaletteSettableProperties {
    
    inline def apply(
      disabled: Boolean,
      displayOptions: ConverterHint,
      help: Instruction,
      helpHints: Definition,
      labelDisplay: auto | off,
      labelHint: String,
      layout: grid | list,
      messagesCustom: js.Array[typings.oracleOraclejet.ojmessagingMod.^],
      palette: js.Array[Label],
      swatchSize: xs | sm | lg,
      translations: LabelNone,
      valid: valid | pending | invalidHidden | invalidShown,
      value: ^
    ): ojColorPaletteSettableProperties = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], swatchSize = swatchSize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], describedBy = null, labelledBy = null)
      __obj.asInstanceOf[ojColorPaletteSettableProperties]
    }
    
    extension [Self <: ojColorPaletteSettableProperties](x: Self) {
      
      inline def setLabelDisplay(value: auto | off): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
      
      inline def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      inline def setLabelledByNull: Self = StObject.set(x, "labelledBy", null)
      
      inline def setLayout(value: grid | list): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setPalette(value: js.Array[Label]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteVarargs(value: Label*): Self = StObject.set(x, "palette", js.Array(value*))
      
      inline def setSwatchSize(value: xs | sm | lg): Self = StObject.set(x, "swatchSize", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: LabelNone): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcolorpalette.ojColorPaletteSettableProperties> */
  trait ojColorPaletteSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var describedBy: js.UndefOr[String | Null] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var displayOptions: js.UndefOr[ConverterHint] = js.undefined
    
    var help: js.UndefOr[Instruction] = js.undefined
    
    var helpHints: js.UndefOr[Definition] = js.undefined
    
    var labelDisplay: js.UndefOr[auto | off] = js.undefined
    
    var labelHint: js.UndefOr[String] = js.undefined
    
    var labelledBy: js.UndefOr[String | Null] = js.undefined
    
    var layout: js.UndefOr[grid | list] = js.undefined
    
    var messagesCustom: js.UndefOr[js.Array[typings.oracleOraclejet.ojmessagingMod.^]] = js.undefined
    
    var palette: js.UndefOr[js.Array[Label]] = js.undefined
    
    var swatchSize: js.UndefOr[xs | sm | lg] = js.undefined
    
    var translations: js.UndefOr[LabelNone] = js.undefined
    
    var valid: js.UndefOr[
        typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ] = js.undefined
    
    var value: js.UndefOr[^] = js.undefined
  }
  object ojColorPaletteSettablePropertiesLenient {
    
    inline def apply(): ojColorPaletteSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojColorPaletteSettablePropertiesLenient]
    }
    
    extension [Self <: ojColorPaletteSettablePropertiesLenient](x: Self) {
      
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
      
      inline def setLabelDisplay(value: auto | off): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
      
      inline def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
      
      inline def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
      
      inline def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
      
      inline def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      inline def setLabelledByNull: Self = StObject.set(x, "labelledBy", null)
      
      inline def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      inline def setLayout(value: grid | list): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMessagesCustom(value: js.Array[typings.oracleOraclejet.ojmessagingMod.^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      inline def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
      
      inline def setMessagesCustomVarargs(value: typings.oracleOraclejet.ojmessagingMod.^ *): Self = StObject.set(x, "messagesCustom", js.Array(value*))
      
      inline def setPalette(value: js.Array[Label]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPaletteVarargs(value: Label*): Self = StObject.set(x, "palette", js.Array(value*))
      
      inline def setSwatchSize(value: xs | sm | lg): Self = StObject.set(x, "swatchSize", value.asInstanceOf[js.Any])
      
      inline def setSwatchSizeUndefined: Self = StObject.set(x, "swatchSize", js.undefined)
      
      inline def setTranslations(value: LabelNone): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      inline def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValue(value: ^): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
