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
import typings.std.CompositionEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.Element
import typings.std.ErrorEvent
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

object ojmenuMod {
  
  @js.native
  trait ojMenu
    extends StObject
       with baseComponent[ojMenuSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_disabledChanged(
      `type`: disabledChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_disabledChanged(
      `type`: disabledChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAction(
      `type`: ojAction,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAction(
      `type`: ojAction,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_openOptionsChanged(
      `type`: openOptionsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[OpenOptions], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_openOptionsChanged(
      `type`: openOptionsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[OpenOptions], Any],
      useCapture: Boolean
    ): Unit = js.native
    
    var disabled: Boolean = js.native
    
    @JSName("getProperty")
    def getProperty_disabled(property: disabled): Boolean = js.native
    @JSName("getProperty")
    def getProperty_openOptions(property: openOptions): OpenOptions = js.native
    
    var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], Any]) | Null = js.native
    
    var onOjAction: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction, Any]) | Null = js.native
    
    var onOjAnimateEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd, Any]) | Null = js.native
    
    var onOjAnimateStart: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart, Any]) | Null = js.native
    
    var onOjBeforeOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen, Any]) | Null = js.native
    
    var onOjClose: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose, Any]) | Null = js.native
    
    var onOjOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen, Any]) | Null = js.native
    
    var onOpenOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[OpenOptions], Any]) | Null = js.native
    
    def open(): Unit = js.native
    def open(event: js.Object): Unit = js.native
    def open(event: js.Object, openOptions: OpenOptions): Unit = js.native
    def open(event: Unit, openOptions: OpenOptions): Unit = js.native
    
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
    trait OpenOptions extends StObject {
      
      var display: js.UndefOr[String] = js.undefined
      
      var initialFocus: js.UndefOr[String] = js.undefined
      
      var launcher: js.UndefOr[String | Element] = js.undefined
      
      var position: js.UndefOr[Position] = js.undefined
    }
    object OpenOptions {
      
      inline def apply(): OpenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OpenOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OpenOptions] (val x: Self) extends AnyVal {
        
        inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        inline def setInitialFocus(value: String): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
        
        inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
        
        inline def setLauncher(value: String | Element): Self = StObject.set(x, "launcher", value.asInstanceOf[js.Any])
        
        inline def setLauncherUndefined: Self = StObject.set(x, "launcher", js.undefined)
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait Position extends StObject {
      
      var at: js.UndefOr[PositionAlign] = js.undefined
      
      var collision: js.UndefOr[flip | fit | flipfit | flipcenter | none] = js.undefined
      
      var my: js.UndefOr[PositionAlign] = js.undefined
      
      var of: js.UndefOr[String | PositionPoint] = js.undefined
      
      var offset: js.UndefOr[PositionPoint] = js.undefined
    }
    object Position {
      
      inline def apply(): Position = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Position]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
        
        inline def setAt(value: PositionAlign): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
        
        inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
        
        inline def setCollision(value: flip | fit | flipfit | flipcenter | none): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
        
        inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
        
        inline def setMy(value: PositionAlign): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
        
        inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
        
        inline def setOf(value: String | PositionPoint): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
        
        inline def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
        
        inline def setOffset(value: PositionPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait PositionAlign extends StObject {
      
      var horizontal: js.UndefOr[start | end | left | center | bottom] = js.undefined
      
      var vertical: js.UndefOr[top | bottom | center] = js.undefined
    }
    object PositionAlign {
      
      inline def apply(): PositionAlign = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionAlign]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PositionAlign] (val x: Self) extends AnyVal {
        
        inline def setHorizontal(value: start | end | left | center | bottom): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
        
        inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
        
        inline def setVertical(value: top | bottom | center): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
        
        inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait PositionPoint extends StObject {
      
      var x: js.UndefOr[Double] = js.undefined
      
      var y: js.UndefOr[Double] = js.undefined
    }
    object PositionPoint {
      
      inline def apply(): PositionPoint = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionPoint]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PositionPoint] (val x: Self) extends AnyVal {
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
    
    type ojAction = CustomEvent[StringDictionary[Any]]
    
    type ojAnimateEnd = CustomEvent[DictpropNameAction]
    
    type ojAnimateStart = CustomEvent[EndCallback]
    
    type ojBeforeOpen = CustomEvent[typings.oracleOraclejet.anon.OpenOptions]
    
    type ojClose = CustomEvent[Event]
    
    type ojOpen = CustomEvent[Event]
  }
  
  trait ojMenuEventMap
    extends StObject
       with baseComponentEventMap[ojMenuSettableProperties] {
    
    var disabledChanged: JetElementCustomEvent[Boolean]
    
    var ojAction: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction
    
    var ojAnimateEnd: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd
    
    var ojAnimateStart: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart
    
    var ojBeforeOpen: typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen
    
    var ojClose: typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose
    
    var ojOpen: typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen
    
    var openOptionsChanged: JetElementCustomEvent[OpenOptions]
  }
  object ojMenuEventMap {
    
    inline def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      cancel: typings.std.Event,
      canplay: typings.std.Event,
      canplaythrough: typings.std.Event,
      change: typings.std.Event,
      click: MouseEvent,
      close: typings.std.Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: typings.std.Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      disabledChanged: JetElementCustomEvent[Boolean],
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
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
      formdata: FormDataEvent,
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
      slotchange: typings.std.Event,
      stalled: typings.std.Event,
      submit: SubmitEvent,
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
      webkitanimationend: typings.std.Event,
      webkitanimationiteration: typings.std.Event,
      webkitanimationstart: typings.std.Event,
      webkittransitionend: typings.std.Event,
      wheel: WheelEvent
    ): ojMenuEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAction = ojAction.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeOpen = ojBeforeOpen.asInstanceOf[js.Any], ojClose = ojClose.asInstanceOf[js.Any], ojOpen = ojOpen.asInstanceOf[js.Any], openOptionsChanged = openOptionsChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojMenuEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ojMenuEventMap] (val x: Self) extends AnyVal {
      
      inline def setDisabledChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "disabledChanged", value.asInstanceOf[js.Any])
      
      inline def setOjAction(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction): Self = StObject.set(x, "ojAction", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateEnd(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateStart(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeOpen(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen): Self = StObject.set(x, "ojBeforeOpen", value.asInstanceOf[js.Any])
      
      inline def setOjClose(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose): Self = StObject.set(x, "ojClose", value.asInstanceOf[js.Any])
      
      inline def setOjOpen(value: typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen): Self = StObject.set(x, "ojOpen", value.asInstanceOf[js.Any])
      
      inline def setOpenOptionsChanged(value: JetElementCustomEvent[OpenOptions]): Self = StObject.set(x, "openOptionsChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojMenuSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    var disabled: Boolean
    
    var openOptions: OpenOptions
    
    @JSName("translations")
    var translations_ojMenuSettableProperties: AriaFocusSkipLink
  }
  object ojMenuSettableProperties {
    
    inline def apply(disabled: Boolean, openOptions: OpenOptions, translations: AriaFocusSkipLink): ojMenuSettableProperties = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], openOptions = openOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojMenuSettableProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ojMenuSettableProperties] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setOpenOptions(value: OpenOptions): Self = StObject.set(x, "openOptions", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: AriaFocusSkipLink): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmenu.ojMenuSettableProperties> */
  trait ojMenuSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var openOptions: js.UndefOr[OpenOptions] = js.undefined
    
    var translations: js.UndefOr[AriaFocusSkipLink] = js.undefined
  }
  object ojMenuSettablePropertiesLenient {
    
    inline def apply(): ojMenuSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojMenuSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ojMenuSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOpenOptions(value: OpenOptions): Self = StObject.set(x, "openOptions", value.asInstanceOf[js.Any])
      
      inline def setOpenOptionsUndefined: Self = StObject.set(x, "openOptions", js.undefined)
      
      inline def setTranslations(value: AriaFocusSkipLink): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
