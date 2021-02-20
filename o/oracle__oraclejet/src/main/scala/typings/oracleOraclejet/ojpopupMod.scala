package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaCloseSkipLink
import typings.oracleOraclejet.anon.DictpropNameAction
import typings.oracleOraclejet.anon.EndCallback
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojpopupMod.ojPopup.Position
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.autoDismiss
import typings.oracleOraclejet.oracleOraclejetStrings.autoDismissChanged
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.chrome
import typings.oracleOraclejet.oracleOraclejetStrings.chromeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.default
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.firstFocusable
import typings.oracleOraclejet.oracleOraclejetStrings.fit
import typings.oracleOraclejet.oracleOraclejetStrings.flip
import typings.oracleOraclejet.oracleOraclejetStrings.flipcenter
import typings.oracleOraclejet.oracleOraclejetStrings.flipfit
import typings.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typings.oracleOraclejet.oracleOraclejetStrings.initialFocus
import typings.oracleOraclejet.oracleOraclejetStrings.initialFocusChanged
import typings.oracleOraclejet.oracleOraclejetStrings.left
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modality
import typings.oracleOraclejet.oracleOraclejetStrings.modalityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeClose
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen
import typings.oracleOraclejet.oracleOraclejetStrings.ojClose
import typings.oracleOraclejet.oracleOraclejetStrings.ojFocus
import typings.oracleOraclejet.oracleOraclejetStrings.ojOpen
import typings.oracleOraclejet.oracleOraclejetStrings.popup
import typings.oracleOraclejet.oracleOraclejetStrings.position
import typings.oracleOraclejet.oracleOraclejetStrings.positionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.simple
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.tail
import typings.oracleOraclejet.oracleOraclejetStrings.tailChanged
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.Element
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

object ojpopupMod {
  
  @js.native
  trait ojPopup extends baseComponent[ojPopupSettableProperties] {
    
    def addEventListener(
      `type`: autoDismissChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | focusLoss], _]
    ): Unit = js.native
    def addEventListener(
      `type`: autoDismissChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | focusLoss], _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: chromeChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[default | none], _]
    ): Unit = js.native
    def addEventListener(
      `type`: chromeChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[default | none], _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: initialFocusChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[auto | none | firstFocusable | popup], 
          _
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: initialFocusChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[auto | none | firstFocusable | popup], 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: modalityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modeless | modal], _]
    ): Unit = js.native
    def addEventListener(
      `type`: modalityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modeless | modal], _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: tailChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | simple], _]
    ): Unit = js.native
    def addEventListener(
      `type`: tailChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | simple], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateEnd, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateEnd, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateStart, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateStart, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeClose(
      `type`: ojBeforeClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeClose, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeClose(
      `type`: ojBeforeClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeClose, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeOpen, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeOpen, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojClose, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojClose, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojFocus(
      `type`: ojFocus,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojFocus, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojFocus(
      `type`: ojFocus,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojFocus, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojOpen, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojOpen, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_positionChanged(
      `type`: positionChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Position], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_positionChanged(
      `type`: positionChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Position], _],
      useCapture: Boolean
    ): Unit = js.native
    
    var autoDismiss: none | focusLoss = js.native
    
    var chrome: default | none = js.native
    
    def close(): Unit = js.native
    
    @JSName("getProperty")
    def getProperty_autoDismiss(property: autoDismiss): none | focusLoss = js.native
    @JSName("getProperty")
    def getProperty_chrome(property: chrome): default | none = js.native
    @JSName("getProperty")
    def getProperty_initialFocus(property: initialFocus): auto | none | firstFocusable | popup = js.native
    @JSName("getProperty")
    def getProperty_modality(property: modality): modeless | modal = js.native
    @JSName("getProperty")
    def getProperty_position(property: position): Position = js.native
    @JSName("getProperty")
    def getProperty_tail(property: tail): none | simple = js.native
    
    var initialFocus: auto | none | firstFocusable | popup = js.native
    
    def isOpen(): Boolean = js.native
    
    var modality: modeless | modal = js.native
    
    var onAutoDismissChanged: (js.Function1[/* event */ JetElementCustomEvent[none | focusLoss], _]) | Null = js.native
    
    var onChromeChanged: (js.Function1[/* event */ JetElementCustomEvent[default | none], _]) | Null = js.native
    
    var onInitialFocusChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none | firstFocusable | popup], _]) | Null = js.native
    
    var onModalityChanged: (js.Function1[/* event */ JetElementCustomEvent[modeless | modal], _]) | Null = js.native
    
    var onOjAnimateEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateEnd, _]) | Null = js.native
    
    var onOjAnimateStart: (js.Function1[/* event */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateStart, _]) | Null = js.native
    
    var onOjBeforeClose: (js.Function1[/* event */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeClose, _]) | Null = js.native
    
    var onOjBeforeOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeOpen, _]) | Null = js.native
    
    var onOjClose: (js.Function1[/* event */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojClose, _]) | Null = js.native
    
    var onOjFocus: (js.Function1[/* event */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojFocus, _]) | Null = js.native
    
    var onOjOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojpopupMod.ojPopup.ojOpen, _]) | Null = js.native
    
    var onPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Position], _]) | Null = js.native
    
    var onTailChanged: (js.Function1[/* event */ JetElementCustomEvent[none | simple], _]) | Null = js.native
    
    def open(launcher: String): Unit = js.native
    def open(launcher: String, position: Position): Unit = js.native
    def open(launcher: Element): Unit = js.native
    def open(launcher: Element, position: Position): Unit = js.native
    
    var position: Position = js.native
    
    def setProperties(properties: ojPopupSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: autoDismiss, value: focusLoss): Unit = js.native
    def setProperty(property: autoDismiss, value: none): Unit = js.native
    def setProperty(property: chrome, value: default): Unit = js.native
    def setProperty(property: chrome, value: none): Unit = js.native
    def setProperty(property: initialFocus, value: auto): Unit = js.native
    def setProperty(property: initialFocus, value: firstFocusable): Unit = js.native
    def setProperty(property: initialFocus, value: none): Unit = js.native
    def setProperty(property: initialFocus, value: popup): Unit = js.native
    def setProperty(property: modality, value: modal): Unit = js.native
    def setProperty(property: modality, value: modeless): Unit = js.native
    def setProperty(property: tail, value: none): Unit = js.native
    def setProperty(property: tail, value: simple): Unit = js.native
    @JSName("setProperty")
    def setProperty_position(property: position, value: Position): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: AriaCloseSkipLink): Unit = js.native
    
    var tail: none | simple = js.native
    
    @JSName("translations")
    var translations_ojPopup: AriaCloseSkipLink = js.native
  }
  object ojPopup {
    
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
    
    type ojAnimateEnd = CustomEvent[DictpropNameAction]
    
    type ojAnimateStart = CustomEvent[EndCallback]
    
    type ojBeforeClose = CustomEvent[StringDictionary[js.Any]]
    
    type ojBeforeOpen = CustomEvent[StringDictionary[js.Any]]
    
    type ojClose = CustomEvent[StringDictionary[js.Any]]
    
    type ojFocus = CustomEvent[StringDictionary[js.Any]]
    
    type ojOpen = CustomEvent[StringDictionary[js.Any]]
  }
  
  @js.native
  trait ojPopupEventMap extends baseComponentEventMap[ojPopupSettableProperties] {
    
    var autoDismissChanged: JetElementCustomEvent[none | focusLoss] = js.native
    
    var chromeChanged: JetElementCustomEvent[default | none] = js.native
    
    var initialFocusChanged: JetElementCustomEvent[auto | none | firstFocusable | popup] = js.native
    
    var modalityChanged: JetElementCustomEvent[modeless | modal] = js.native
    
    var ojAnimateEnd: typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateEnd = js.native
    
    var ojAnimateStart: typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateStart = js.native
    
    var ojBeforeClose: typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeClose = js.native
    
    var ojBeforeOpen: typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeOpen = js.native
    
    var ojClose: typings.oracleOraclejet.ojpopupMod.ojPopup.ojClose = js.native
    
    var ojFocus: typings.oracleOraclejet.ojpopupMod.ojPopup.ojFocus = js.native
    
    var ojOpen: typings.oracleOraclejet.ojpopupMod.ojPopup.ojOpen = js.native
    
    var positionChanged: JetElementCustomEvent[Position] = js.native
    
    var tailChanged: JetElementCustomEvent[none | simple] = js.native
  }
  object ojPopupEventMap {
    
    @scala.inline
    def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      autoDismissChanged: JetElementCustomEvent[none | focusLoss],
      auxclick: MouseEvent,
      blur: FocusEvent,
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      chromeChanged: JetElementCustomEvent[default | none],
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
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      initialFocusChanged: JetElementCustomEvent[auto | none | firstFocusable | popup],
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
      modalityChanged: JetElementCustomEvent[modeless | modal],
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAnimateEnd: typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateEnd,
      ojAnimateStart: typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateStart,
      ojBeforeClose: typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeClose,
      ojBeforeOpen: typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeOpen,
      ojClose: typings.oracleOraclejet.ojpopupMod.ojPopup.ojClose,
      ojFocus: typings.oracleOraclejet.ojpopupMod.ojPopup.ojFocus,
      ojOpen: typings.oracleOraclejet.ojpopupMod.ojPopup.ojOpen,
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
      positionChanged: JetElementCustomEvent[Position],
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
      tailChanged: JetElementCustomEvent[none | simple],
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
    ): ojPopupEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], autoDismissChanged = autoDismissChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], chromeChanged = chromeChanged.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], initialFocusChanged = initialFocusChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], modalityChanged = modalityChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeClose = ojBeforeClose.asInstanceOf[js.Any], ojBeforeOpen = ojBeforeOpen.asInstanceOf[js.Any], ojClose = ojClose.asInstanceOf[js.Any], ojFocus = ojFocus.asInstanceOf[js.Any], ojOpen = ojOpen.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], positionChanged = positionChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], tailChanged = tailChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojPopupEventMap]
    }
    
    @scala.inline
    implicit class ojPopupEventMapMutableBuilder[Self <: ojPopupEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDismissChanged(value: JetElementCustomEvent[none | focusLoss]): Self = StObject.set(x, "autoDismissChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeChanged(value: JetElementCustomEvent[default | none]): Self = StObject.set(x, "chromeChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialFocusChanged(value: JetElementCustomEvent[auto | none | firstFocusable | popup]): Self = StObject.set(x, "initialFocusChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalityChanged(value: JetElementCustomEvent[modeless | modal]): Self = StObject.set(x, "modalityChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateEnd(value: typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateStart(value: typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeClose(value: typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeClose): Self = StObject.set(x, "ojBeforeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeOpen(value: typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeOpen): Self = StObject.set(x, "ojBeforeOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjClose(value: typings.oracleOraclejet.ojpopupMod.ojPopup.ojClose): Self = StObject.set(x, "ojClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjFocus(value: typings.oracleOraclejet.ojpopupMod.ojPopup.ojFocus): Self = StObject.set(x, "ojFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjOpen(value: typings.oracleOraclejet.ojpopupMod.ojPopup.ojOpen): Self = StObject.set(x, "ojOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionChanged(value: JetElementCustomEvent[Position]): Self = StObject.set(x, "positionChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailChanged(value: JetElementCustomEvent[none | simple]): Self = StObject.set(x, "tailChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojPopupSettableProperties extends baseComponentSettableProperties {
    
    var autoDismiss: none | focusLoss = js.native
    
    var chrome: default | none = js.native
    
    var initialFocus: auto | none | firstFocusable | popup = js.native
    
    var modality: modeless | modal = js.native
    
    var position: Position = js.native
    
    var tail: none | simple = js.native
    
    @JSName("translations")
    var translations_ojPopupSettableProperties: AriaCloseSkipLink = js.native
  }
  object ojPopupSettableProperties {
    
    @scala.inline
    def apply(
      autoDismiss: none | focusLoss,
      chrome: default | none,
      initialFocus: auto | none | firstFocusable | popup,
      modality: modeless | modal,
      position: Position,
      tail: none | simple,
      translations: AriaCloseSkipLink
    ): ojPopupSettableProperties = {
      val __obj = js.Dynamic.literal(autoDismiss = autoDismiss.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojPopupSettableProperties]
    }
    
    @scala.inline
    implicit class ojPopupSettablePropertiesMutableBuilder[Self <: ojPopupSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDismiss(value: none | focusLoss): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChrome(value: default | none): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialFocus(value: auto | none | firstFocusable | popup): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModality(value: modeless | modal): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTail(value: none | simple): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslations(value: AriaCloseSkipLink): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojpopup.ojPopupSettableProperties> */
  @js.native
  trait ojPopupSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var autoDismiss: js.UndefOr[none | focusLoss] = js.native
    
    var chrome: js.UndefOr[default | none] = js.native
    
    var initialFocus: js.UndefOr[auto | none | firstFocusable | popup] = js.native
    
    var modality: js.UndefOr[modeless | modal] = js.native
    
    var position: js.UndefOr[Position] = js.native
    
    var tail: js.UndefOr[none | simple] = js.native
    
    var translations: js.UndefOr[AriaCloseSkipLink] = js.native
  }
  object ojPopupSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojPopupSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojPopupSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojPopupSettablePropertiesLenientMutableBuilder[Self <: ojPopupSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDismiss(value: none | focusLoss): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
      
      @scala.inline
      def setChrome(value: default | none): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      @scala.inline
      def setInitialFocus(value: auto | none | firstFocusable | popup): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      @scala.inline
      def setModality(value: modeless | modal): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalityUndefined: Self = StObject.set(x, "modality", js.undefined)
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTail(value: none | simple): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
      
      @scala.inline
      def setTranslations(value: AriaCloseSkipLink): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
