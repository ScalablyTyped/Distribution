package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaFocusSkipLink
import typings.oracleOraclejet.anon.DictpropNameAction
import typings.oracleOraclejet.anon.EndCallback
import typings.oracleOraclejet.anon.Event
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.fit
import typings.oracleOraclejet.oracleOraclejetStrings.flip
import typings.oracleOraclejet.oracleOraclejetStrings.flipcenter
import typings.oracleOraclejet.oracleOraclejetStrings.flipfit
import typings.oracleOraclejet.oracleOraclejetStrings.left
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.ojAction
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen
import typings.oracleOraclejet.oracleOraclejetStrings.ojClose
import typings.oracleOraclejet.oracleOraclejetStrings.ojOpen
import typings.oracleOraclejet.oracleOraclejetStrings.openOptions
import typings.oracleOraclejet.oracleOraclejetStrings.openOptionsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.Element
import typings.std.ErrorEvent
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

object ojmenuMod {
  
  @js.native
  trait ojMenu extends baseComponent[ojMenuSettableProperties] {
    
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
    def addEventListener_ojAction(
      `type`: ojAction,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAction(
      `type`: ojAction,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_openOptionsChanged(
      `type`: openOptionsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[OpenOptions], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_openOptionsChanged(
      `type`: openOptionsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[OpenOptions], _],
      useCapture: Boolean
    ): Unit = js.native
    
    var disabled: Boolean = js.native
    
    @JSName("getProperty")
    def getProperty_disabled(property: disabled): Boolean = js.native
    @JSName("getProperty")
    def getProperty_openOptions(property: openOptions): OpenOptions = js.native
    
    var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
    
    var onOjAction: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction, _]) | Null = js.native
    
    var onOjAnimateEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd, _]) | Null = js.native
    
    var onOjAnimateStart: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart, _]) | Null = js.native
    
    var onOjBeforeOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen, _]) | Null = js.native
    
    var onOjClose: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose, _]) | Null = js.native
    
    var onOjOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen, _]) | Null = js.native
    
    var onOpenOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[OpenOptions], _]) | Null = js.native
    
    def open(): Unit = js.native
    def open(event: js.UndefOr[scala.Nothing], openOptions: OpenOptions): Unit = js.native
    def open(event: js.Object): Unit = js.native
    def open(event: js.Object, openOptions: OpenOptions): Unit = js.native
    
    var openOptions: OpenOptions = js.native
    
    def setProperties(properties: ojMenuSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_openOptions(property: openOptions, value: OpenOptions): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: AriaFocusSkipLink): Unit = js.native
    
    @JSName("translations")
    var translations_ojMenu: AriaFocusSkipLink = js.native
  }
  object ojMenu {
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait OpenOptions extends StObject {
      
      var display: js.UndefOr[String] = js.native
      
      var initialFocus: js.UndefOr[String] = js.native
      
      var launcher: js.UndefOr[String | Element] = js.native
      
      var position: js.UndefOr[Position] = js.native
    }
    object OpenOptions {
      
      @scala.inline
      def apply(): OpenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OpenOptions]
      }
      
      @scala.inline
      implicit class OpenOptionsMutableBuilder[Self <: OpenOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        @scala.inline
        def setInitialFocus(value: String): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
        
        @scala.inline
        def setLauncher(value: String | Element): Self = StObject.set(x, "launcher", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLauncherUndefined: Self = StObject.set(x, "launcher", js.undefined)
        
        @scala.inline
        def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait Position extends StObject {
      
      var at: js.UndefOr[PositionAlign] = js.native
      
      var collision: js.UndefOr[flip | fit | flipfit | flipcenter | none] = js.native
      
      var my: js.UndefOr[PositionAlign] = js.native
      
      var of: js.UndefOr[String | PositionPoint] = js.native
      
      var offset: js.UndefOr[PositionPoint] = js.native
    }
    object Position {
      
      @scala.inline
      def apply(): Position = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Position]
      }
      
      @scala.inline
      implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAt(value: PositionAlign): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
        
        @scala.inline
        def setCollision(value: flip | fit | flipfit | flipcenter | none): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
        
        @scala.inline
        def setMy(value: PositionAlign): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
        
        @scala.inline
        def setOf(value: String | PositionPoint): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
        
        @scala.inline
        def setOffset(value: PositionPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait PositionAlign extends StObject {
      
      var horizontal: js.UndefOr[start | end | left | center | bottom] = js.native
      
      var vertical: js.UndefOr[top | bottom | center] = js.native
    }
    object PositionAlign {
      
      @scala.inline
      def apply(): PositionAlign = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionAlign]
      }
      
      @scala.inline
      implicit class PositionAlignMutableBuilder[Self <: PositionAlign] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHorizontal(value: start | end | left | center | bottom): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
        
        @scala.inline
        def setVertical(value: top | bottom | center): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait PositionPoint extends StObject {
      
      var x: js.UndefOr[Double] = js.native
      
      var y: js.UndefOr[Double] = js.native
    }
    object PositionPoint {
      
      @scala.inline
      def apply(): PositionPoint = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionPoint]
      }
      
      @scala.inline
      implicit class PositionPointMutableBuilder[Self <: PositionPoint] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
    
    type ojAction = CustomEvent[StringDictionary[js.Any]]
    
    type ojAnimateEnd = CustomEvent[DictpropNameAction]
    
    type ojAnimateStart = CustomEvent[EndCallback]
    
    type ojBeforeOpen = CustomEvent[typings.oracleOraclejet.anon.OpenOptions]
    
    type ojClose = CustomEvent[Event]
    
    type ojOpen = CustomEvent[Event]
  }
  
  @js.native
  trait ojMenuEventMap extends baseComponentEventMap[ojMenuSettableProperties] {
    
    var disabledChanged: JetElementCustomEvent[Boolean] = js.native
    
    var ojAction: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction = js.native
    
    var ojAnimateEnd: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd = js.native
    
    var ojAnimateStart: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart = js.native
    
    var ojBeforeOpen: typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen = js.native
    
    var ojClose: typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose = js.native
    
    var ojOpen: typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen = js.native
    
    var openOptionsChanged: JetElementCustomEvent[OpenOptions] = js.native
  }
  object ojMenuEventMap {
    
    @scala.inline
    def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      blur: FocusEvent,
      cancel: typings.std.Event,
      canplay: typings.std.Event,
      canplaythrough: typings.std.Event,
      change: typings.std.Event,
      click: MouseEvent,
      close: typings.std.Event,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: typings.std.Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      disabledChanged: JetElementCustomEvent[Boolean],
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragexit: typings.std.Event,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: typings.std.Event,
      emptied: typings.std.Event,
      ended: typings.std.Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      fullscreenchange: typings.std.Event,
      fullscreenerror: typings.std.Event,
      gotpointercapture: PointerEvent,
      input: typings.std.Event,
      invalid: typings.std.Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: typings.std.Event,
      loadeddata: typings.std.Event,
      loadedmetadata: typings.std.Event,
      loadstart: typings.std.Event,
      lostpointercapture: PointerEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAction: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction,
      ojAnimateEnd: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd,
      ojAnimateStart: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart,
      ojBeforeOpen: typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen,
      ojClose: typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose,
      ojOpen: typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen,
      openOptionsChanged: JetElementCustomEvent[OpenOptions],
      paste: ClipboardEvent,
      pause: typings.std.Event,
      play: typings.std.Event,
      playing: typings.std.Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent[EventTarget],
      ratechange: typings.std.Event,
      reset: typings.std.Event,
      resize: UIEvent,
      scroll: typings.std.Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: typings.std.Event,
      seeking: typings.std.Event,
      select: typings.std.Event,
      selectionchange: typings.std.Event,
      selectstart: typings.std.Event,
      stalled: typings.std.Event,
      submit: typings.std.Event,
      suspend: typings.std.Event,
      timeupdate: typings.std.Event,
      toggle: typings.std.Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: JetElementCustomEvent[js.Object | Null],
      volumechange: typings.std.Event,
      waiting: typings.std.Event,
      wheel: WheelEvent
    ): ojMenuEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAction = ojAction.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeOpen = ojBeforeOpen.asInstanceOf[js.Any], ojClose = ojClose.asInstanceOf[js.Any], ojOpen = ojOpen.asInstanceOf[js.Any], openOptionsChanged = openOptionsChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojMenuEventMap]
    }
    
    @scala.inline
    implicit class ojMenuEventMapMutableBuilder[Self <: ojMenuEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabledChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "disabledChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAction(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction): Self = StObject.set(x, "ojAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateEnd(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateStart(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeOpen(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen): Self = StObject.set(x, "ojBeforeOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjClose(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose): Self = StObject.set(x, "ojClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjOpen(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen): Self = StObject.set(x, "ojOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOptionsChanged(value: JetElementCustomEvent[OpenOptions]): Self = StObject.set(x, "openOptionsChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojMenuSettableProperties extends baseComponentSettableProperties {
    
    var disabled: Boolean = js.native
    
    var openOptions: OpenOptions = js.native
    
    @JSName("translations")
    var translations_ojMenuSettableProperties: AriaFocusSkipLink = js.native
  }
  object ojMenuSettableProperties {
    
    @scala.inline
    def apply(disabled: Boolean, openOptions: OpenOptions, translations: AriaFocusSkipLink): ojMenuSettableProperties = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], openOptions = openOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojMenuSettableProperties]
    }
    
    @scala.inline
    implicit class ojMenuSettablePropertiesMutableBuilder[Self <: ojMenuSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOptions(value: OpenOptions): Self = StObject.set(x, "openOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslations(value: AriaFocusSkipLink): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmenu.ojMenuSettableProperties> */
  @js.native
  trait ojMenuSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var openOptions: js.UndefOr[OpenOptions] = js.native
    
    var translations: js.UndefOr[AriaFocusSkipLink] = js.native
  }
  object ojMenuSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojMenuSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojMenuSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojMenuSettablePropertiesLenientMutableBuilder[Self <: ojMenuSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOpenOptions(value: OpenOptions): Self = StObject.set(x, "openOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOptionsUndefined: Self = StObject.set(x, "openOptions", js.undefined)
      
      @scala.inline
      def setTranslations(value: AriaFocusSkipLink): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
