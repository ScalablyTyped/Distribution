package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.EventEmitterTextMap
import typings.playable.distSrcModulesUiLiveIndicatorTypesMod.ILiveIndicator
import typings.playable.distSrcModulesUiLiveIndicatorTypesMod.ILiveIndicatorViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiLiveIndicatorLiveIndicatorMod {
  
  @JSImport("playable/dist/src/modules/ui/live-indicator/live-indicator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LiveIndicator {
    def this(param0: EventEmitterTextMap) = this()
    
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
        typings.playable.distSrcModulesUiLiveIndicatorLiveIndicatorDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable1[
          /* config */ ILiveIndicatorViewConfig, 
          typings.playable.distSrcModulesUiLiveIndicatorLiveIndicatorDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/live-indicator/live-indicator", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/live-indicator/live-indicator", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LiveIndicator
    extends StObject
       with ILiveIndicator {
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _initInterceptor: Any = js.native
    
    /* private */ var _initUI: Any = js.native
    
    /* private */ var _interceptor: Any = js.native
    
    /* private */ var _isActive: Any = js.native
    
    /* private */ var _isEnded: Any = js.native
    
    /* private */ var _isHidden: Any = js.native
    
    /* private */ var _processStateChange: Any = js.native
    
    /* private */ var _syncWithLive: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _toggle: Any = js.native
    
    /* private */ var _toggleActive: Any = js.native
    
    /* private */ var _toggleEnded: Any = js.native
    
    /* private */ var _tooltipService: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    @JSName("isActive")
    def isActive_MLiveIndicator: Boolean = js.native
    
    @JSName("isHidden")
    def isHidden_MLiveIndicator: Boolean = js.native
    
    var view: typings.playable.distSrcModulesUiLiveIndicatorLiveIndicatorDotviewMod.default = js.native
  }
}
