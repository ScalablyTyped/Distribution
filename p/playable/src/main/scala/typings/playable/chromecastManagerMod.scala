package typings.playable

import org.scalablytyped.runtime.NumberDictionary
import typings.playable.anon.Engine
import typings.playable.chromecastManagerTypesMod.IChromecastManager
import typings.playable.playableStrings.MSGestureChange
import typings.playable.playableStrings.MSGestureDoubleTap
import typings.playable.playableStrings.MSGestureEnd
import typings.playable.playableStrings.MSGestureHold
import typings.playable.playableStrings.MSGestureStart
import typings.playable.playableStrings.MSGestureTap
import typings.playable.playableStrings.MSInertiaStart
import typings.playable.playableStrings.MSPointerCancel
import typings.playable.playableStrings.MSPointerDown
import typings.playable.playableStrings.MSPointerEnter
import typings.playable.playableStrings.MSPointerLeave
import typings.playable.playableStrings.MSPointerMove
import typings.playable.playableStrings.MSPointerOut
import typings.playable.playableStrings.MSPointerOver
import typings.playable.playableStrings.MSPointerUp
import typings.playable.playableStrings.abort
import typings.playable.playableStrings.afterprint
import typings.playable.playableStrings.animationcancel
import typings.playable.playableStrings.animationend
import typings.playable.playableStrings.animationiteration
import typings.playable.playableStrings.animationstart
import typings.playable.playableStrings.auxclick
import typings.playable.playableStrings.beforeprint
import typings.playable.playableStrings.beforeunload
import typings.playable.playableStrings.blur
import typings.playable.playableStrings.cancel
import typings.playable.playableStrings.canplay
import typings.playable.playableStrings.canplaythrough
import typings.playable.playableStrings.change
import typings.playable.playableStrings.click
import typings.playable.playableStrings.close
import typings.playable.playableStrings.compassneedscalibration
import typings.playable.playableStrings.contextmenu
import typings.playable.playableStrings.cuechange
import typings.playable.playableStrings.dblclick
import typings.playable.playableStrings.devicelight
import typings.playable.playableStrings.devicemotion
import typings.playable.playableStrings.deviceorientation
import typings.playable.playableStrings.deviceorientationabsolute
import typings.playable.playableStrings.drag
import typings.playable.playableStrings.dragend
import typings.playable.playableStrings.dragenter
import typings.playable.playableStrings.dragexit
import typings.playable.playableStrings.dragleave
import typings.playable.playableStrings.dragover
import typings.playable.playableStrings.dragstart
import typings.playable.playableStrings.drop
import typings.playable.playableStrings.durationchange
import typings.playable.playableStrings.emptied
import typings.playable.playableStrings.ended
import typings.playable.playableStrings.error
import typings.playable.playableStrings.focus
import typings.playable.playableStrings.focusin
import typings.playable.playableStrings.focusout
import typings.playable.playableStrings.gotpointercapture
import typings.playable.playableStrings.hashchange
import typings.playable.playableStrings.input
import typings.playable.playableStrings.invalid
import typings.playable.playableStrings.keydown
import typings.playable.playableStrings.keypress
import typings.playable.playableStrings.keyup
import typings.playable.playableStrings.languagechange
import typings.playable.playableStrings.load
import typings.playable.playableStrings.loadeddata
import typings.playable.playableStrings.loadedmetadata
import typings.playable.playableStrings.loadstart
import typings.playable.playableStrings.lostpointercapture
import typings.playable.playableStrings.message
import typings.playable.playableStrings.messageerror
import typings.playable.playableStrings.mousedown
import typings.playable.playableStrings.mouseenter
import typings.playable.playableStrings.mouseleave
import typings.playable.playableStrings.mousemove
import typings.playable.playableStrings.mouseout
import typings.playable.playableStrings.mouseover
import typings.playable.playableStrings.mouseup
import typings.playable.playableStrings.mousewheel
import typings.playable.playableStrings.offline
import typings.playable.playableStrings.online
import typings.playable.playableStrings.orientationchange
import typings.playable.playableStrings.pagehide
import typings.playable.playableStrings.pageshow
import typings.playable.playableStrings.pause
import typings.playable.playableStrings.play
import typings.playable.playableStrings.playing
import typings.playable.playableStrings.pointercancel
import typings.playable.playableStrings.pointerdown
import typings.playable.playableStrings.pointerenter
import typings.playable.playableStrings.pointerleave
import typings.playable.playableStrings.pointermove
import typings.playable.playableStrings.pointerout
import typings.playable.playableStrings.pointerover
import typings.playable.playableStrings.pointerup
import typings.playable.playableStrings.popstate
import typings.playable.playableStrings.progress
import typings.playable.playableStrings.ratechange
import typings.playable.playableStrings.readystatechange
import typings.playable.playableStrings.rejectionhandled
import typings.playable.playableStrings.reset
import typings.playable.playableStrings.resize
import typings.playable.playableStrings.scroll
import typings.playable.playableStrings.securitypolicyviolation
import typings.playable.playableStrings.seeked
import typings.playable.playableStrings.seeking
import typings.playable.playableStrings.select
import typings.playable.playableStrings.selectionchange
import typings.playable.playableStrings.selectstart
import typings.playable.playableStrings.stalled
import typings.playable.playableStrings.storage
import typings.playable.playableStrings.submit
import typings.playable.playableStrings.suspend
import typings.playable.playableStrings.timeupdate
import typings.playable.playableStrings.toggle
import typings.playable.playableStrings.touchcancel
import typings.playable.playableStrings.touchend
import typings.playable.playableStrings.touchmove
import typings.playable.playableStrings.touchstart
import typings.playable.playableStrings.transitioncancel
import typings.playable.playableStrings.transitionend
import typings.playable.playableStrings.transitionrun
import typings.playable.playableStrings.transitionstart
import typings.playable.playableStrings.unhandledrejection
import typings.playable.playableStrings.unload
import typings.playable.playableStrings.volumechange
import typings.playable.playableStrings.vrdisplayactivate
import typings.playable.playableStrings.vrdisplayblur
import typings.playable.playableStrings.vrdisplayconnect
import typings.playable.playableStrings.vrdisplaydeactivate
import typings.playable.playableStrings.vrdisplaydisconnect
import typings.playable.playableStrings.vrdisplayfocus
import typings.playable.playableStrings.vrdisplaypointerrestricted
import typings.playable.playableStrings.vrdisplaypointerunrestricted
import typings.playable.playableStrings.vrdisplaypresentchange
import typings.playable.playableStrings.waiting
import typings.playable.playableStrings.wheel
import typings.std.AddEventListenerOptions
import typings.std.AnimationEvent
import typings.std.ApplicationCache
import typings.std.BarProp
import typings.std.BeforeUnloadEvent
import typings.std.CSSRuleList
import typings.std.CSSStyleDeclaration
import typings.std.CacheStorage
import typings.std.Crypto
import typings.std.CustomElementRegistry
import typings.std.DeviceLightEvent
import typings.std.DeviceMotionEvent
import typings.std.DeviceOrientationEvent
import typings.std.Document
import typings.std.DragEvent
import typings.std.Element
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.ExtensionScriptApis
import typings.std.External
import typings.std.FocusEvent
import typings.std.FocusNavigationOrigin
import typings.std.FrameRequestCallback
import typings.std.HashChangeEvent
import typings.std.History
import typings.std.IDBFactory
import typings.std.ImageBitmap
import typings.std.ImageBitmapOptions
import typings.std.ImageBitmapSource
import typings.std.KeyboardEvent
import typings.std.Location
import typings.std.MediaQueryList
import typings.std.MessageEvent
import typings.std.MouseEvent
import typings.std.NavigationReason
import typings.std.Navigator
import typings.std.Node
import typings.std.OnErrorEventHandler
import typings.std.PageTransitionEvent
import typings.std.Performance
import typings.std.PointerEvent
import typings.std.PopStateEvent
import typings.std.ProgressEvent
import typings.std.PromiseRejectionEvent
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.Screen
import typings.std.ScrollToOptions
import typings.std.SecurityPolicyViolationEvent
import typings.std.Selection
import typings.std.SpeechSynthesis
import typings.std.Storage
import typings.std.StorageEvent
import typings.std.StyleMedia
import typings.std.TimerHandler
import typings.std.TouchEvent
import typings.std.Transferable
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.VisualViewport
import typings.std.VoidFunction
import typings.std.WebKitPoint
import typings.std.WheelEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromecastManagerMod {
  
  @JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", JSImport.Default)
  @js.native
  class default protected () extends ChromecastManager {
    def this(hasEngineEventEmitter: Engine) = this()
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", "default._chromecastInited")
    @js.native
    def _chromecastInited: Boolean = js.native
    @scala.inline
    def _chromecastInited_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_chromecastInited")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait ChromecastEvents extends StObject
  @JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", "ChromecastEvents")
  @js.native
  object ChromecastEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ChromecastEvents with String] = js.native
    
    @js.native
    sealed trait CHROMECAST_CASTS_RESUMED extends ChromecastEvents
    /* "ui-events/chromecast-resumed" */ val CHROMECAST_CASTS_RESUMED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_CASTS_RESUMED with String = js.native
    
    @js.native
    sealed trait CHROMECAST_CASTS_STARTED extends ChromecastEvents
    /* "ui-events/chromecast-started" */ val CHROMECAST_CASTS_STARTED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_CASTS_STARTED with String = js.native
    
    @js.native
    sealed trait CHROMECAST_CASTS_STOPED extends ChromecastEvents
    /* "ui-events/chromecast-stoped" */ val CHROMECAST_CASTS_STOPED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_CASTS_STOPED with String = js.native
    
    @js.native
    sealed trait CHROMECAST_CONNECTED extends ChromecastEvents
    /* "ui-events/chromecast-connected" */ val CHROMECAST_CONNECTED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_CONNECTED with String = js.native
    
    @js.native
    sealed trait CHROMECAST_CONNECTING extends ChromecastEvents
    /* "ui-events/chromecast-connecting" */ val CHROMECAST_CONNECTING: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_CONNECTING with String = js.native
    
    @js.native
    sealed trait CHROMECAST_INITED extends ChromecastEvents
    /* "ui-events/chromecast-inited" */ val CHROMECAST_INITED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_INITED with String = js.native
    
    @js.native
    sealed trait CHROMECAST_NOT_CONNECTED extends ChromecastEvents
    /* "ui-events/chromecast-not-connected" */ val CHROMECAST_NOT_CONNECTED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_NOT_CONNECTED with String = js.native
    
    @js.native
    sealed trait CHROMECAST_NO_DEVICES_AVAILABLE extends ChromecastEvents
    /* "ui-events/chromecast-not-available" */ val CHROMECAST_NO_DEVICES_AVAILABLE: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_NO_DEVICES_AVAILABLE with String = js.native
  }
  
  @js.native
  trait ChromecastManager extends IChromecastManager {
    
    var _bindToContextEvents: js.Any = js.native
    
    var _context: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _initCastContext: js.Any = js.native
    
    var _insertCastCallback: js.Any = js.native
    
    var _onCastStateChange: js.Any = js.native
    
    var _onSessionStateChange: js.Any = js.native
  }
  object ChromecastManager {
    
    @scala.inline
    def apply(
      _bindToContextEvents: js.Any,
      _context: js.Any,
      _engine: js.Any,
      _eventEmitter: js.Any,
      _initCastContext: js.Any,
      _insertCastCallback: js.Any,
      _onCastStateChange: js.Any,
      _onSessionStateChange: js.Any,
      destroy: () => Unit,
      isCasting: Boolean,
      isEnabled: Boolean
    ): ChromecastManager = {
      val __obj = js.Dynamic.literal(_bindToContextEvents = _bindToContextEvents.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initCastContext = _initCastContext.asInstanceOf[js.Any], _insertCastCallback = _insertCastCallback.asInstanceOf[js.Any], _onCastStateChange = _onCastStateChange.asInstanceOf[js.Any], _onSessionStateChange = _onSessionStateChange.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isCasting = isCasting.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromecastManager]
    }
    
    @scala.inline
    implicit class ChromecastManagerMutableBuilder[Self <: ChromecastManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_bindToContextEvents(value: js.Any): Self = StObject.set(x, "_bindToContextEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_context(value: js.Any): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initCastContext(value: js.Any): Self = StObject.set(x, "_initCastContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_insertCastCallback(value: js.Any): Self = StObject.set(x, "_insertCastCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onCastStateChange(value: js.Any): Self = StObject.set(x, "_onCastStateChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onSessionStateChange(value: js.Any): Self = StObject.set(x, "_onSessionStateChange", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Window & {  __onGCastApiAvailable :std.Function} */
  @js.native
  trait PatchedWindow extends /* index */ NumberDictionary[Window] {
    
    var __onGCastApiAvailable: js.Function = js.native
    
    /**
      * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
      * 
      * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
      * 
      * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
      * 
      * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
      * 
      * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
      * 
      * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
      */
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureChange(`type`: MSGestureChange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureChange(
      `type`: MSGestureChange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureChange(
      `type`: MSGestureChange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureDoubleTap(`type`: MSGestureDoubleTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureDoubleTap(
      `type`: MSGestureDoubleTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureDoubleTap(
      `type`: MSGestureDoubleTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureEnd(`type`: MSGestureEnd, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureEnd(
      `type`: MSGestureEnd,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureEnd(
      `type`: MSGestureEnd,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureHold(`type`: MSGestureHold, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureHold(
      `type`: MSGestureHold,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureHold(
      `type`: MSGestureHold,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureStart(`type`: MSGestureStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureStart(
      `type`: MSGestureStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureStart(
      `type`: MSGestureStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureTap(`type`: MSGestureTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureTap(
      `type`: MSGestureTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureTap(
      `type`: MSGestureTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSInertiaStart(`type`: MSInertiaStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSInertiaStart(
      `type`: MSInertiaStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSInertiaStart(
      `type`: MSInertiaStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerCancel(`type`: MSPointerCancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerCancel(
      `type`: MSPointerCancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerCancel(
      `type`: MSPointerCancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerDown(`type`: MSPointerDown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerDown(
      `type`: MSPointerDown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerDown(
      `type`: MSPointerDown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerEnter(`type`: MSPointerEnter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerEnter(
      `type`: MSPointerEnter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerEnter(
      `type`: MSPointerEnter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerLeave(`type`: MSPointerLeave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerLeave(
      `type`: MSPointerLeave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerLeave(
      `type`: MSPointerLeave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerMove(`type`: MSPointerMove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerMove(
      `type`: MSPointerMove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerMove(
      `type`: MSPointerMove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOut(`type`: MSPointerOut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOut(
      `type`: MSPointerOut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOut(
      `type`: MSPointerOut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOver(`type`: MSPointerOver, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOver(
      `type`: MSPointerOver,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOver(
      `type`: MSPointerOver,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerUp(`type`: MSPointerUp, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerUp(
      `type`: MSPointerUp,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerUp(
      `type`: MSPointerUp,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterprint(
      `type`: afterprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterprint(
      `type`: afterprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(`type`: animationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeprint(
      `type`: beforeprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeprint(
      `type`: beforeprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashchange(`type`: hashchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_languagechange(
      `type`: languagechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_languagechange(
      `type`: languagechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousewheel(`type`: mousewheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousewheel(
      `type`: mousewheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousewheel(
      `type`: mousewheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_offline(
      `type`: offline,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_offline(
      `type`: offline,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_online(
      `type`: online,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_online(
      `type`: online,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(`type`: pointercancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_popstate(
      `type`: popstate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_popstate(
      `type`: popstate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type | EventTarget], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type | EventTarget], _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type | EventTarget], _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_storage(
      `type`: storage,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_storage(
      `type`: storage,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unload(
      `type`: unload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unload(
      `type`: unload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayactivate(`type`: vrdisplayactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayactivate(
      `type`: vrdisplayactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayactivate(
      `type`: vrdisplayactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayblur(`type`: vrdisplayblur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayblur(
      `type`: vrdisplayblur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayblur(
      `type`: vrdisplayblur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayconnect(`type`: vrdisplayconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayconnect(
      `type`: vrdisplayconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayconnect(
      `type`: vrdisplayconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydeactivate(`type`: vrdisplaydeactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydeactivate(
      `type`: vrdisplaydeactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydeactivate(
      `type`: vrdisplaydeactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydisconnect(`type`: vrdisplaydisconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydisconnect(
      `type`: vrdisplaydisconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydisconnect(
      `type`: vrdisplaydisconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayfocus(`type`: vrdisplayfocus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayfocus(
      `type`: vrdisplayfocus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayfocus(
      `type`: vrdisplayfocus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def alert(): Unit = js.native
    def alert(message: js.Any): Unit = js.native
    
    val applicationCache: ApplicationCache = js.native
    
    def atob(data: String): String = js.native
    
    def blur(): Unit = js.native
    
    def btoa(data: String): String = js.native
    
    val caches: CacheStorage = js.native
    
    def cancelAnimationFrame(handle: Double): Unit = js.native
    
    /** @deprecated */
    def captureEvents(): Unit = js.native
    
    def clearInterval(): Unit = js.native
    def clearInterval(handle: Double): Unit = js.native
    
    def clearTimeout(): Unit = js.native
    def clearTimeout(handle: Double): Unit = js.native
    
    val clientInformation: Navigator = js.native
    
    def close(): Unit = js.native
    
    val closed: Boolean = js.native
    
    def confirm(): Boolean = js.native
    def confirm(message: String): Boolean = js.native
    
    def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
    def createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): js.Promise[ImageBitmap] = js.native
    def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
    def createImageBitmap(
      image: ImageBitmapSource,
      sx: Double,
      sy: Double,
      sw: Double,
      sh: Double,
      options: ImageBitmapOptions
    ): js.Promise[ImageBitmap] = js.native
    
    val crypto: Crypto = js.native
    
    var customElements: CustomElementRegistry = js.native
    
    var defaultStatus: String = js.native
    
    def departFocus(navigationReason: NavigationReason, origin: FocusNavigationOrigin): Unit = js.native
    
    val devicePixelRatio: Double = js.native
    
    /**
      * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
      */
    def dispatchEvent(event: Event): Boolean = js.native
    
    val doNotTrack: String = js.native
    
    val document: Document = js.native
    
    /** @deprecated */
    val event: js.UndefOr[Event] = js.native
    
    /** @deprecated */
    val external: External = js.native
    
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    
    def focus(): Unit = js.native
    
    val frameElement: Element = js.native
    
    val frames: Window = js.native
    
    def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
    def getComputedStyle(elt: Element, pseudoElt: String): CSSStyleDeclaration = js.native
    
    def getMatchedCSSRules(elt: Element): CSSRuleList = js.native
    def getMatchedCSSRules(elt: Element, pseudoElt: String): CSSRuleList = js.native
    
    def getSelection(): Selection | Null = js.native
    
    val history: History = js.native
    
    val indexedDB: IDBFactory = js.native
    
    val innerHeight: Double = js.native
    
    val innerWidth: Double = js.native
    
    val isSecureContext: Boolean = js.native
    
    val length: Double = js.native
    
    val localStorage: Storage = js.native
    
    var location: Location = js.native
    
    val locationbar: BarProp = js.native
    
    def matchMedia(query: String): MediaQueryList = js.native
    
    val menubar: BarProp = js.native
    
    def moveBy(x: Double, y: Double): Unit = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    val msContentScript: ExtensionScriptApis = js.native
    
    def msWriteProfilerMark(profilerMarkName: String): Unit = js.native
    
    var name: String = js.native
    
    val navigator: Navigator = js.native
    
    var offscreenBuffering: String | Boolean = js.native
    
    /**
      * Fires when the user aborts the download.
      * @param ev The event.
      */
    var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null = js.native
    
    var onafterprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onanimationcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onauxclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onbeforeprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onbeforeunload: (js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]) | Null = js.native
    
    /**
      * Fires when the object loses the input focus.
      * @param ev The focus event.
      */
    var onblur: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null = js.native
    
    var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when playback is possible, but would require further buffering.
      * @param ev The event.
      */
    var oncanplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oncanplaythrough: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the contents of the object or selection have changed.
      * @param ev The event.
      */
    var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the left mouse button on the object
      * @param ev The mouse event.
      */
    var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oncompassneedscalibration: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the right mouse button in the client area, opening the context menu.
      * @param ev The mouse event.
      */
    var oncontextmenu: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user double-clicks the object.
      * @param ev The mouse event.
      */
    var ondblclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var ondevicelight: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]) | Null = js.native
    
    var ondevicemotion: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]) | Null = js.native
    
    var ondeviceorientation: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]) | Null = js.native
    
    var ondeviceorientationabsolute: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object continuously during a drag operation.
      * @param ev The event.
      */
    var ondrag: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object when the user releases the mouse at the close of a drag operation.
      * @param ev The event.
      */
    var ondragend: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the target element when the user drags the object to a valid drop target.
      * @param ev The drag event.
      */
    var ondragenter: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    var ondragexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
      * @param ev The drag event.
      */
    var ondragleave: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the target element continuously while the user drags the object over a valid drop target.
      * @param ev The event.
      */
    var ondragover: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object when the user starts to drag a text selection or selected object.
      * @param ev The event.
      */
    var ondragstart: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    var ondrop: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Occurs when the duration attribute is updated.
      * @param ev The event.
      */
    var ondurationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the media element is reset to its initial state.
      * @param ev The event.
      */
    var onemptied: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the end of playback is reached.
      * @param ev The event
      */
    var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when an error occurs during object loading.
      * @param ev The event.
      */
    var onerror: OnErrorEventHandler = js.native
    
    /**
      * Fires when the object receives focus.
      * @param ev The event.
      */
    var onfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null = js.native
    
    var ongotpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onhashchange: (js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]) | Null = js.native
    
    var oninput: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oninvalid: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user presses a key.
      * @param ev The keyboard event
      */
    var onkeydown: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    /**
      * Fires when the user presses an alphanumeric key.
      * @param ev The event.
      */
    var onkeypress: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    /**
      * Fires when the user releases a key.
      * @param ev The keyboard event
      */
    var onkeyup: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    var onlanguagechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires immediately after the browser loads the object.
      * @param ev The event.
      */
    var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when media data is loaded at the current playback position.
      * @param ev The event.
      */
    var onloadeddata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the duration and dimensions of the media have been determined.
      * @param ev The event.
      */
    var onloadedmetadata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when Internet Explorer begins looking for media data.
      * @param ev The event.
      */
    var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onlostpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _]) | Null = js.native
    
    var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _]) | Null = js.native
    
    /**
      * Fires when the user clicks the object with either mouse button.
      * @param ev The mouse event.
      */
    var onmousedown: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onmouseenter: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onmouseleave: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse over the object.
      * @param ev The mouse event.
      */
    var onmousemove: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse pointer outside the boundaries of the object.
      * @param ev The mouse event.
      */
    var onmouseout: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse pointer into the object.
      * @param ev The mouse event.
      */
    var onmouseover: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user releases a mouse button while the mouse is over the object.
      * @param ev The mouse event.
      */
    var onmouseup: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onmousewheel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgesturechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgesturedoubletap: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgestureend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgesturehold: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgesturestart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgesturetap: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsinertiastart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onoffline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ononline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /** @deprecated */
    var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onpagehide: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | Null = js.native
    
    var onpageshow: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | Null = js.native
    
    /**
      * Occurs when playback is paused.
      * @param ev The event.
      */
    var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the play method is requested.
      * @param ev The event.
      */
    var onplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the audio or video has started playing.
      * @param ev The event.
      */
    var onplaying: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onpointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpopstate: (js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]) | Null = js.native
    
    /**
      * Occurs to indicate progress while downloading media data.
      * @param ev The event.
      */
    var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], _]) | Null = js.native
    
    /**
      * Occurs when the playback rate is increased or decreased.
      * @param ev The event.
      */
    var onratechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]) | Null = js.native
    
    var onrejectionhandled: (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]) | Null = js.native
    
    /**
      * Fires when the user resets a form.
      * @param ev The event.
      */
    var onreset: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null = js.native
    
    /**
      * Fires when the user repositions the scroll box in the scroll bar on the object.
      * @param ev The event.
      */
    var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]) | Null = js.native
    
    /**
      * Occurs when the seek operation ends.
      * @param ev The event.
      */
    var onseeked: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the current playback position is moved.
      * @param ev The event.
      */
    var onseeking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the current selection changes.
      * @param ev The event.
      */
    var onselect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onselectionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onselectstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the download has stopped.
      * @param ev The event.
      */
    var onstalled: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onstorage: (js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]) | Null = js.native
    
    var onsubmit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs if the load operation has been intentionally halted.
      * @param ev The event.
      */
    var onsuspend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs to indicate the current playback position.
      * @param ev The event.
      */
    var ontimeupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ontoggle: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontransitioncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionrun: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionstart: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var onunhandledrejection: (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]) | Null = js.native
    
    var onunload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the volume is changed, or playback is muted or unmuted.
      * @param ev The event.
      */
    var onvolumechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplayactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplayblur: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplayconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplayfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when playback stops because the next frame of a video resource is not available.
      * @param ev The event.
      */
    var onwaiting: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onwheel: (js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]) | Null = js.native
    
    def open(): Window | Null = js.native
    def open(
      url: js.UndefOr[scala.Nothing],
      target: js.UndefOr[scala.Nothing],
      features: js.UndefOr[scala.Nothing],
      replace: Boolean
    ): Window | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: js.UndefOr[scala.Nothing], features: String): Window | Null = js.native
    def open(
      url: js.UndefOr[scala.Nothing],
      target: js.UndefOr[scala.Nothing],
      features: String,
      replace: Boolean
    ): Window | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: String): Window | Null = js.native
    def open(
      url: js.UndefOr[scala.Nothing],
      target: String,
      features: js.UndefOr[scala.Nothing],
      replace: Boolean
    ): Window | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: String, features: String): Window | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: String, features: String, replace: Boolean): Window | Null = js.native
    def open(url: String): Window | Null = js.native
    def open(
      url: String,
      target: js.UndefOr[scala.Nothing],
      features: js.UndefOr[scala.Nothing],
      replace: Boolean
    ): Window | Null = js.native
    def open(url: String, target: js.UndefOr[scala.Nothing], features: String): Window | Null = js.native
    def open(url: String, target: js.UndefOr[scala.Nothing], features: String, replace: Boolean): Window | Null = js.native
    def open(url: String, target: String): Window | Null = js.native
    def open(url: String, target: String, features: js.UndefOr[scala.Nothing], replace: Boolean): Window | Null = js.native
    def open(url: String, target: String, features: String): Window | Null = js.native
    def open(url: String, target: String, features: String, replace: Boolean): Window | Null = js.native
    
    var opener: js.Any = js.native
    
    /** @deprecated */
    val orientation: String | Double = js.native
    
    val origin: String = js.native
    
    val outerHeight: Double = js.native
    
    val outerWidth: Double = js.native
    
    val pageXOffset: Double = js.native
    
    val pageYOffset: Double = js.native
    
    val parent: Window = js.native
    
    val performance: Performance = js.native
    
    val personalbar: BarProp = js.native
    
    def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
    def postMessage(message: js.Any, targetOrigin: String, transfer: js.Array[Transferable]): Unit = js.native
    
    def print(): Unit = js.native
    
    def prompt(): String | Null = js.native
    def prompt(message: js.UndefOr[scala.Nothing], _default: String): String | Null = js.native
    def prompt(message: String): String | Null = js.native
    def prompt(message: String, _default: String): String | Null = js.native
    
    def queueMicrotask(callback: VoidFunction): Unit = js.native
    
    /** @deprecated */
    def releaseEvents(): Unit = js.native
    
    /**
      * Removes the event listener in target's event listener list with the same type, callback, and options.
      */
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureChange(`type`: MSGestureChange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureChange(
      `type`: MSGestureChange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureChange(
      `type`: MSGestureChange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureDoubleTap(`type`: MSGestureDoubleTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureDoubleTap(
      `type`: MSGestureDoubleTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureDoubleTap(
      `type`: MSGestureDoubleTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureEnd(`type`: MSGestureEnd, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureEnd(
      `type`: MSGestureEnd,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureEnd(
      `type`: MSGestureEnd,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureHold(`type`: MSGestureHold, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureHold(
      `type`: MSGestureHold,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureHold(
      `type`: MSGestureHold,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureStart(`type`: MSGestureStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureStart(
      `type`: MSGestureStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureStart(
      `type`: MSGestureStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureTap(`type`: MSGestureTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureTap(
      `type`: MSGestureTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureTap(
      `type`: MSGestureTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSInertiaStart(`type`: MSInertiaStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSInertiaStart(
      `type`: MSInertiaStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSInertiaStart(
      `type`: MSInertiaStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerCancel(`type`: MSPointerCancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerCancel(
      `type`: MSPointerCancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerCancel(
      `type`: MSPointerCancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerDown(`type`: MSPointerDown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerDown(
      `type`: MSPointerDown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerDown(
      `type`: MSPointerDown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerEnter(`type`: MSPointerEnter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerEnter(
      `type`: MSPointerEnter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerEnter(
      `type`: MSPointerEnter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerLeave(`type`: MSPointerLeave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerLeave(
      `type`: MSPointerLeave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerLeave(
      `type`: MSPointerLeave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerMove(`type`: MSPointerMove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerMove(
      `type`: MSPointerMove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerMove(
      `type`: MSPointerMove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOut(`type`: MSPointerOut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOut(
      `type`: MSPointerOut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOut(
      `type`: MSPointerOut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOver(`type`: MSPointerOver, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOver(
      `type`: MSPointerOver,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOver(
      `type`: MSPointerOver,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerUp(`type`: MSPointerUp, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerUp(
      `type`: MSPointerUp,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerUp(
      `type`: MSPointerUp,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterprint(
      `type`: afterprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterprint(
      `type`: afterprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(`type`: animationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeprint(
      `type`: beforeprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeprint(
      `type`: beforeprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashchange(`type`: hashchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_languagechange(
      `type`: languagechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_languagechange(
      `type`: languagechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[_], _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousewheel(`type`: mousewheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousewheel(
      `type`: mousewheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousewheel(
      `type`: mousewheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_offline(
      `type`: offline,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_offline(
      `type`: offline,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_online(
      `type`: online,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_online(
      `type`: online,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(`type`: pointercancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_popstate(
      `type`: popstate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_popstate(
      `type`: popstate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type | EventTarget], _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type | EventTarget], _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type | EventTarget], _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_storage(
      `type`: storage,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_storage(
      `type`: storage,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unload(
      `type`: unload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unload(
      `type`: unload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayactivate(`type`: vrdisplayactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayactivate(
      `type`: vrdisplayactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayactivate(
      `type`: vrdisplayactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayblur(`type`: vrdisplayblur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayblur(
      `type`: vrdisplayblur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayblur(
      `type`: vrdisplayblur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayconnect(`type`: vrdisplayconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayconnect(
      `type`: vrdisplayconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayconnect(
      `type`: vrdisplayconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydeactivate(`type`: vrdisplaydeactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydeactivate(
      `type`: vrdisplaydeactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydeactivate(
      `type`: vrdisplaydeactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydisconnect(`type`: vrdisplaydisconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydisconnect(
      `type`: vrdisplaydisconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydisconnect(
      `type`: vrdisplaydisconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayfocus(`type`: vrdisplayfocus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayfocus(
      `type`: vrdisplayfocus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayfocus(
      `type`: vrdisplayfocus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    
    def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
    
    def resizeBy(x: Double, y: Double): Unit = js.native
    
    def resizeTo(width: Double, height: Double): Unit = js.native
    
    val screen: Screen = js.native
    
    val screenLeft: Double = js.native
    
    val screenTop: Double = js.native
    
    val screenX: Double = js.native
    
    val screenY: Double = js.native
    
    def scroll(): Unit = js.native
    def scroll(options: ScrollToOptions): Unit = js.native
    def scroll(x: Double, y: Double): Unit = js.native
    
    def scrollBy(): Unit = js.native
    def scrollBy(options: ScrollToOptions): Unit = js.native
    def scrollBy(x: Double, y: Double): Unit = js.native
    
    def scrollTo(): Unit = js.native
    def scrollTo(options: ScrollToOptions): Unit = js.native
    def scrollTo(x: Double, y: Double): Unit = js.native
    
    val scrollX: Double = js.native
    
    val scrollY: Double = js.native
    
    val scrollbars: BarProp = js.native
    
    val self: Window with (/* globalThis */ js.Any) = js.native
    
    val sessionStorage: Storage = js.native
    
    def setInterval(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
    def setInterval(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
    
    def setTimeout(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
    def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
    
    val speechSynthesis: SpeechSynthesis = js.native
    
    var status: String = js.native
    
    val statusbar: BarProp = js.native
    
    def stop(): Unit = js.native
    
    val styleMedia: StyleMedia = js.native
    
    val toolbar: BarProp = js.native
    
    val top: Window = js.native
    
    val visualViewport: VisualViewport = js.native
    
    def webkitCancelAnimationFrame(handle: Double): Unit = js.native
    
    def webkitConvertPointFromNodeToPage(node: Node, pt: WebKitPoint): WebKitPoint = js.native
    
    def webkitConvertPointFromPageToNode(node: Node, pt: WebKitPoint): WebKitPoint = js.native
    
    def webkitRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
    
    val window: Window with (/* globalThis */ js.Any) = js.native
  }
}
