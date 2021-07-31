package typings.playable

import typings.playable.anon.Engine
import typings.playable.chromecastManagerTypesMod.IChromecastManager
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromecastManagerMod {
  
  @JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ChromecastManager {
    def this(hasEngineEventEmitter: Engine) = this()
    
    /* CompleteClass */
    var _bindToContextEvents: js.Any = js.native
    
    /* CompleteClass */
    var _context: js.Any = js.native
    
    /* CompleteClass */
    var _engine: js.Any = js.native
    
    /* CompleteClass */
    var _eventEmitter: js.Any = js.native
    
    /* CompleteClass */
    var _initCastContext: js.Any = js.native
    
    /* CompleteClass */
    var _insertCastCallback: js.Any = js.native
    
    /* CompleteClass */
    var _onCastStateChange: js.Any = js.native
    
    /* CompleteClass */
    var _onSessionStateChange: js.Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    var isCasting: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
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
    def apply(value: String): js.UndefOr[ChromecastEvents & String] = js.native
    
    @js.native
    sealed trait CHROMECAST_CASTS_RESUMED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-resumed" */ val CHROMECAST_CASTS_RESUMED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_CASTS_RESUMED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_CASTS_STARTED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-started" */ val CHROMECAST_CASTS_STARTED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_CASTS_STARTED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_CASTS_STOPED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-stoped" */ val CHROMECAST_CASTS_STOPED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_CASTS_STOPED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_CONNECTED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-connected" */ val CHROMECAST_CONNECTED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_CONNECTED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_CONNECTING
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-connecting" */ val CHROMECAST_CONNECTING: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_CONNECTING & String = js.native
    
    @js.native
    sealed trait CHROMECAST_INITED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-inited" */ val CHROMECAST_INITED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_INITED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_NOT_CONNECTED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-not-connected" */ val CHROMECAST_NOT_CONNECTED: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_NOT_CONNECTED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_NO_DEVICES_AVAILABLE
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-not-available" */ val CHROMECAST_NO_DEVICES_AVAILABLE: typings.playable.chromecastManagerMod.ChromecastEvents.CHROMECAST_NO_DEVICES_AVAILABLE & String = js.native
  }
  
  trait ChromecastManager
    extends StObject
       with IChromecastManager {
    
    var _bindToContextEvents: js.Any
    
    var _context: js.Any
    
    var _engine: js.Any
    
    var _eventEmitter: js.Any
    
    var _initCastContext: js.Any
    
    var _insertCastCallback: js.Any
    
    var _onCastStateChange: js.Any
    
    var _onSessionStateChange: js.Any
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
  
  @js.native
  trait PatchedWindow
    extends StObject
       with Window {
    
    var __onGCastApiAvailable: js.Function = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
