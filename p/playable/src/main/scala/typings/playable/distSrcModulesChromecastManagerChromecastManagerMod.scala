package typings.playable

import typings.playable.anon.Engine
import typings.playable.distSrcModulesChromecastManagerTypesMod.IChromecastManager
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesChromecastManagerChromecastManagerMod {
  
  @JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ChromecastManager {
    def this(param0: Engine) = this()
    
    /* private */ /* CompleteClass */
    var _bindToContextEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _context: Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initCastContext: Any = js.native
    
    /* private */ /* CompleteClass */
    var _insertCastCallback: Any = js.native
    
    /* private */ /* CompleteClass */
    var _onCastStateChange: Any = js.native
    
    /* private */ /* CompleteClass */
    var _onSessionStateChange: Any = js.native
    
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
    inline def _chromecastInited_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_chromecastInited")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
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
    /* "ui-events/chromecast-resumed" */ val CHROMECAST_CASTS_RESUMED: typings.playable.distSrcModulesChromecastManagerChromecastManagerMod.ChromecastEvents.CHROMECAST_CASTS_RESUMED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_CASTS_STARTED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-started" */ val CHROMECAST_CASTS_STARTED: typings.playable.distSrcModulesChromecastManagerChromecastManagerMod.ChromecastEvents.CHROMECAST_CASTS_STARTED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_CASTS_STOPED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-stoped" */ val CHROMECAST_CASTS_STOPED: typings.playable.distSrcModulesChromecastManagerChromecastManagerMod.ChromecastEvents.CHROMECAST_CASTS_STOPED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_CONNECTED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-connected" */ val CHROMECAST_CONNECTED: typings.playable.distSrcModulesChromecastManagerChromecastManagerMod.ChromecastEvents.CHROMECAST_CONNECTED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_CONNECTING
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-connecting" */ val CHROMECAST_CONNECTING: typings.playable.distSrcModulesChromecastManagerChromecastManagerMod.ChromecastEvents.CHROMECAST_CONNECTING & String = js.native
    
    @js.native
    sealed trait CHROMECAST_INITED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-inited" */ val CHROMECAST_INITED: typings.playable.distSrcModulesChromecastManagerChromecastManagerMod.ChromecastEvents.CHROMECAST_INITED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_NOT_CONNECTED
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-not-connected" */ val CHROMECAST_NOT_CONNECTED: typings.playable.distSrcModulesChromecastManagerChromecastManagerMod.ChromecastEvents.CHROMECAST_NOT_CONNECTED & String = js.native
    
    @js.native
    sealed trait CHROMECAST_NO_DEVICES_AVAILABLE
      extends StObject
         with ChromecastEvents
    /* "ui-events/chromecast-not-available" */ val CHROMECAST_NO_DEVICES_AVAILABLE: typings.playable.distSrcModulesChromecastManagerChromecastManagerMod.ChromecastEvents.CHROMECAST_NO_DEVICES_AVAILABLE & String = js.native
  }
  
  trait ChromecastManager
    extends StObject
       with IChromecastManager {
    
    /* private */ var _bindToContextEvents: Any
    
    /* private */ var _context: Any
    
    /* private */ var _engine: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _initCastContext: Any
    
    /* private */ var _insertCastCallback: Any
    
    /* private */ var _onCastStateChange: Any
    
    /* private */ var _onSessionStateChange: Any
  }
  object ChromecastManager {
    
    inline def apply(
      _bindToContextEvents: Any,
      _context: Any,
      _engine: Any,
      _eventEmitter: Any,
      _initCastContext: Any,
      _insertCastCallback: Any,
      _onCastStateChange: Any,
      _onSessionStateChange: Any,
      destroy: () => Unit,
      isCasting: Boolean,
      isEnabled: Boolean
    ): ChromecastManager = {
      val __obj = js.Dynamic.literal(_bindToContextEvents = _bindToContextEvents.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initCastContext = _initCastContext.asInstanceOf[js.Any], _insertCastCallback = _insertCastCallback.asInstanceOf[js.Any], _onCastStateChange = _onCastStateChange.asInstanceOf[js.Any], _onSessionStateChange = _onSessionStateChange.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isCasting = isCasting.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromecastManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChromecastManager] (val x: Self) extends AnyVal {
      
      inline def set_bindToContextEvents(value: Any): Self = StObject.set(x, "_bindToContextEvents", value.asInstanceOf[js.Any])
      
      inline def set_context(value: Any): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_initCastContext(value: Any): Self = StObject.set(x, "_initCastContext", value.asInstanceOf[js.Any])
      
      inline def set_insertCastCallback(value: Any): Self = StObject.set(x, "_insertCastCallback", value.asInstanceOf[js.Any])
      
      inline def set_onCastStateChange(value: Any): Self = StObject.set(x, "_onCastStateChange", value.asInstanceOf[js.Any])
      
      inline def set_onSessionStateChange(value: Any): Self = StObject.set(x, "_onSessionStateChange", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PatchedWindow
    extends StObject
       with Window {
    
    var __onGCastApiAvailable: js.Function = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
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
