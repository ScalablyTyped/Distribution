package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Id
import typings.oracleOraclejet.anon.LabelAccArrowNextPage
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.adjacent
import typings.oracleOraclejet.oracleOraclejetStrings.arrowPlacement
import typings.oracleOraclejet.oracleOraclejetStrings.arrowPlacementChanged
import typings.oracleOraclejet.oracleOraclejetStrings.arrowVisibility
import typings.oracleOraclejet.oracleOraclejetStrings.arrowVisibilityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.currentItem
import typings.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.hover
import typings.oracleOraclejet.oracleOraclejetStrings.looping
import typings.oracleOraclejet.oracleOraclejetStrings.loopingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.maxItemsPerPage
import typings.oracleOraclejet.oracleOraclejetStrings.maxItemsPerPageChanged
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.orientation
import typings.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typings.oracleOraclejet.oracleOraclejetStrings.overlay
import typings.oracleOraclejet.oracleOraclejetStrings.page
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import typings.oracleOraclejet.oracleOraclejetStrings.visible
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
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

object ojfilmstripMod {
  
  @js.native
  trait ojFilmStrip
    extends StObject
       with baseComponent[ojFilmStripSettableProperties] {
    
    def addEventListener(
      `type`: arrowPlacementChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[adjacent | overlay], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: arrowPlacementChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[adjacent | overlay], Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: arrowVisibilityChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[visible | hidden | hover | auto], 
          Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: arrowVisibilityChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[visible | hidden | hover | auto], 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: loopingChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | page], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: loopingChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | page], Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: orientationChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: orientationChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_currentItemChanged(
      `type`: currentItemChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Id], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_currentItemChanged(
      `type`: currentItemChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Id], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_maxItemsPerPageChanged(
      `type`: maxItemsPerPageChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_maxItemsPerPageChanged(
      `type`: maxItemsPerPageChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], Any],
      useCapture: Boolean
    ): Unit = js.native
    
    var arrowPlacement: adjacent | overlay = js.native
    
    var arrowVisibility: visible | hidden | hover | auto = js.native
    
    var currentItem: Id = js.native
    
    def getItemsPerPage(): Double = js.native
    
    @JSName("getProperty")
    def getProperty_arrowPlacement(property: arrowPlacement): adjacent | overlay = js.native
    @JSName("getProperty")
    def getProperty_arrowVisibility(property: arrowVisibility): visible | hidden | hover | auto = js.native
    @JSName("getProperty")
    def getProperty_currentItem(property: currentItem): Id = js.native
    @JSName("getProperty")
    def getProperty_looping(property: looping): off | page = js.native
    @JSName("getProperty")
    def getProperty_maxItemsPerPage(property: maxItemsPerPage): Double = js.native
    @JSName("getProperty")
    def getProperty_orientation(property: orientation): horizontal | vertical = js.native
    
    var looping: off | page = js.native
    
    var maxItemsPerPage: Double = js.native
    
    var onArrowPlacementChanged: (js.Function1[/* event */ JetElementCustomEvent[adjacent | overlay], Any]) | Null = js.native
    
    var onArrowVisibilityChanged: (js.Function1[/* event */ JetElementCustomEvent[visible | hidden | hover | auto], Any]) | Null = js.native
    
    var onCurrentItemChanged: (js.Function1[/* event */ JetElementCustomEvent[Id], Any]) | Null = js.native
    
    var onLoopingChanged: (js.Function1[/* event */ JetElementCustomEvent[off | page], Any]) | Null = js.native
    
    var onMaxItemsPerPageChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], Any]) | Null = js.native
    
    var onOrientationChanged: (js.Function1[/* event */ JetElementCustomEvent[horizontal | vertical], Any]) | Null = js.native
    
    var orientation: horizontal | vertical = js.native
    
    def setProperties(properties: ojFilmStripSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: arrowPlacement, value: adjacent | overlay): Unit = js.native
    def setProperty(property: arrowVisibility, value: visible | hidden | hover | auto): Unit = js.native
    def setProperty(property: looping, value: off | page): Unit = js.native
    def setProperty(property: orientation, value: horizontal | vertical): Unit = js.native
    @JSName("setProperty")
    def setProperty_currentItem(property: currentItem, value: Id): Unit = js.native
    @JSName("setProperty")
    def setProperty_maxItemsPerPage(property: maxItemsPerPage, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelAccArrowNextPage): Unit = js.native
    
    @JSName("translations")
    var translations_ojFilmStrip: LabelAccArrowNextPage = js.native
  }
  
  trait ojFilmStripEventMap
    extends StObject
       with baseComponentEventMap[ojFilmStripSettableProperties] {
    
    var arrowPlacementChanged: JetElementCustomEvent[adjacent | overlay]
    
    var arrowVisibilityChanged: JetElementCustomEvent[visible | hidden | hover | auto]
    
    var currentItemChanged: JetElementCustomEvent[Id]
    
    var loopingChanged: JetElementCustomEvent[off | page]
    
    var maxItemsPerPageChanged: JetElementCustomEvent[Double]
    
    var orientationChanged: JetElementCustomEvent[horizontal | vertical]
  }
  object ojFilmStripEventMap {
    
    inline def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      arrowPlacementChanged: JetElementCustomEvent[adjacent | overlay],
      arrowVisibilityChanged: JetElementCustomEvent[visible | hidden | hover | auto],
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
      currentItemChanged: JetElementCustomEvent[Id],
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
      loopingChanged: JetElementCustomEvent[off | page],
      lostpointercapture: PointerEvent,
      maxItemsPerPageChanged: JetElementCustomEvent[Double],
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      orientationChanged: JetElementCustomEvent[horizontal | vertical],
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
    ): ojFilmStripEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], arrowPlacementChanged = arrowPlacementChanged.asInstanceOf[js.Any], arrowVisibilityChanged = arrowVisibilityChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentItemChanged = currentItemChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], loopingChanged = loopingChanged.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxItemsPerPageChanged = maxItemsPerPageChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojFilmStripEventMap]
    }
    
    extension [Self <: ojFilmStripEventMap](x: Self) {
      
      inline def setArrowPlacementChanged(value: JetElementCustomEvent[adjacent | overlay]): Self = StObject.set(x, "arrowPlacementChanged", value.asInstanceOf[js.Any])
      
      inline def setArrowVisibilityChanged(value: JetElementCustomEvent[visible | hidden | hover | auto]): Self = StObject.set(x, "arrowVisibilityChanged", value.asInstanceOf[js.Any])
      
      inline def setCurrentItemChanged(value: JetElementCustomEvent[Id]): Self = StObject.set(x, "currentItemChanged", value.asInstanceOf[js.Any])
      
      inline def setLoopingChanged(value: JetElementCustomEvent[off | page]): Self = StObject.set(x, "loopingChanged", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsPerPageChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "maxItemsPerPageChanged", value.asInstanceOf[js.Any])
      
      inline def setOrientationChanged(value: JetElementCustomEvent[horizontal | vertical]): Self = StObject.set(x, "orientationChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojFilmStripSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    var arrowPlacement: adjacent | overlay
    
    var arrowVisibility: visible | hidden | hover | auto
    
    var currentItem: Id
    
    var looping: off | page
    
    var maxItemsPerPage: Double
    
    var orientation: horizontal | vertical
    
    @JSName("translations")
    var translations_ojFilmStripSettableProperties: LabelAccArrowNextPage
  }
  object ojFilmStripSettableProperties {
    
    inline def apply(
      arrowPlacement: adjacent | overlay,
      arrowVisibility: visible | hidden | hover | auto,
      currentItem: Id,
      looping: off | page,
      maxItemsPerPage: Double,
      orientation: horizontal | vertical,
      translations: LabelAccArrowNextPage
    ): ojFilmStripSettableProperties = {
      val __obj = js.Dynamic.literal(arrowPlacement = arrowPlacement.asInstanceOf[js.Any], arrowVisibility = arrowVisibility.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], maxItemsPerPage = maxItemsPerPage.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojFilmStripSettableProperties]
    }
    
    extension [Self <: ojFilmStripSettableProperties](x: Self) {
      
      inline def setArrowPlacement(value: adjacent | overlay): Self = StObject.set(x, "arrowPlacement", value.asInstanceOf[js.Any])
      
      inline def setArrowVisibility(value: visible | hidden | hover | auto): Self = StObject.set(x, "arrowVisibility", value.asInstanceOf[js.Any])
      
      inline def setCurrentItem(value: Id): Self = StObject.set(x, "currentItem", value.asInstanceOf[js.Any])
      
      inline def setLooping(value: off | page): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsPerPage(value: Double): Self = StObject.set(x, "maxItemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: LabelAccArrowNextPage): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojfilmstrip.ojFilmStripSettableProperties> */
  trait ojFilmStripSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var arrowPlacement: js.UndefOr[adjacent | overlay] = js.undefined
    
    var arrowVisibility: js.UndefOr[visible | hidden | hover | auto] = js.undefined
    
    var currentItem: js.UndefOr[Id] = js.undefined
    
    var looping: js.UndefOr[off | page] = js.undefined
    
    var maxItemsPerPage: js.UndefOr[Double] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var translations: js.UndefOr[LabelAccArrowNextPage] = js.undefined
  }
  object ojFilmStripSettablePropertiesLenient {
    
    inline def apply(): ojFilmStripSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojFilmStripSettablePropertiesLenient]
    }
    
    extension [Self <: ojFilmStripSettablePropertiesLenient](x: Self) {
      
      inline def setArrowPlacement(value: adjacent | overlay): Self = StObject.set(x, "arrowPlacement", value.asInstanceOf[js.Any])
      
      inline def setArrowPlacementUndefined: Self = StObject.set(x, "arrowPlacement", js.undefined)
      
      inline def setArrowVisibility(value: visible | hidden | hover | auto): Self = StObject.set(x, "arrowVisibility", value.asInstanceOf[js.Any])
      
      inline def setArrowVisibilityUndefined: Self = StObject.set(x, "arrowVisibility", js.undefined)
      
      inline def setCurrentItem(value: Id): Self = StObject.set(x, "currentItem", value.asInstanceOf[js.Any])
      
      inline def setCurrentItemUndefined: Self = StObject.set(x, "currentItem", js.undefined)
      
      inline def setLooping(value: off | page): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
      
      inline def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
      
      inline def setMaxItemsPerPage(value: Double): Self = StObject.set(x, "maxItemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsPerPageUndefined: Self = StObject.set(x, "maxItemsPerPage", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setTranslations(value: LabelAccArrowNextPage): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
