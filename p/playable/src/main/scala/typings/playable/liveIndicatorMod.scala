package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.EventEmitterTextMap
import typings.playable.liveIndicatorTypesMod.ILiveIndicator
import typings.playable.liveIndicatorTypesMod.ILiveIndicatorViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveIndicatorMod {
  
  @JSImport("playable/dist/src/modules/ui/live-indicator/live-indicator", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with LiveIndicator {
    def this(hasEngineEventEmitterTextMapTooltipService: EventEmitterTextMap) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/live-indicator/live-indicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/live-indicator/live-indicator", "default.View")
    @js.native
    def View: Instantiable1[
        /* config */ ILiveIndicatorViewConfig, 
        typings.playable.liveIndicatorViewMod.default
      ] = js.native
    @scala.inline
    def View_=(
      x: Instantiable1[
          /* config */ ILiveIndicatorViewConfig, 
          typings.playable.liveIndicatorViewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/live-indicator/live-indicator", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/live-indicator/live-indicator", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LiveIndicator
    extends StObject
       with ILiveIndicator {
    
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
}
