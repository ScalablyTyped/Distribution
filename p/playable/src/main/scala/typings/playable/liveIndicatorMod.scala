package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.EventEmitterTextMap
import typings.playable.liveIndicatorTypesMod.ILiveIndicator
import typings.playable.liveIndicatorTypesMod.ILiveIndicatorViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/live-indicator/live-indicator", JSImport.Namespace)
@js.native
object liveIndicatorMod extends js.Object {
  
  @js.native
  trait LiveIndicator extends ILiveIndicator {
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _initInterceptor: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _interceptor: js.Any = js.native
    
    var _isActive: js.Any = js.native
    
    var _isEnded: js.Any = js.native
    
    var _isHidden: js.Any = js.native
    
    var _processStateChange: js.Any = js.native
    
    var _syncWithLive: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _toggle: js.Any = js.native
    
    var _toggleActive: js.Any = js.native
    
    var _toggleEnded: js.Any = js.native
    
    var _tooltipService: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    @JSName("isActive")
    def isActive_MLiveIndicator: Boolean = js.native
    
    @JSName("isHidden")
    def isHidden_MLiveIndicator: Boolean = js.native
    
    var view: typings.playable.liveIndicatorViewMod.default = js.native
  }
  
  @js.native
  class default protected () extends LiveIndicator {
    def this(hasEngineEventEmitterTextMapTooltipService: EventEmitterTextMap) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var View: Instantiable1[
        /* config */ ILiveIndicatorViewConfig, 
        typings.playable.liveIndicatorViewMod.default
      ] = js.native
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
