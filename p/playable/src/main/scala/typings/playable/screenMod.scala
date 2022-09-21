package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.InteractionIndicator
import typings.playable.screenTypesMod.IScreen
import typings.playable.screenTypesMod.IScreenViewConfig
import typings.playable.screenTypesMod.VideoViewMode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenMod {
  
  @JSImport("playable/dist/src/modules/ui/screen/screen", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Screen {
    def this(hasConfigEventEmitterEngineFullScreenManagerInteractionIndicatorRootContainer: InteractionIndicator) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def hideCursor(): Unit = js.native
    
    /* CompleteClass */
    override def setVideoViewMode(viewMode: VideoViewMode): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def showCursor(): Unit = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/screen/screen", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/screen/screen", "default.View")
    @js.native
    open class View protected ()
      extends typings.playable.screenViewMod.default {
      def this(config: IScreenViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/screen/screen", "default.View")
    @js.native
    def View: Instantiable1[/* config */ IScreenViewConfig, typings.playable.screenViewMod.default] = js.native
    inline def View_=(x: Instantiable1[/* config */ IScreenViewConfig, typings.playable.screenViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/screen/screen", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/screen/screen", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Screen
    extends StObject
       with IScreen {
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _clearDelayedPlaybackToggle: Any = js.native
    
    /* private */ var _delayedToggleVideoPlaybackTimeout: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _fullScreenManager: Any = js.native
    
    /* private */ var _hideDelayedPlaybackChangeIndicator: Any = js.native
    
    /* private */ var _initUI: Any = js.native
    
    /* private */ var _interactionIndicator: Any = js.native
    
    /* private */ var _isClickProcessingDisabled: Any = js.native
    
    /* private */ def _isDelayedPlaybackToggleExist: Any = js.native
    
    /* private */ var _processClick: Any = js.native
    
    /* private */ var _processDblClick: Any = js.native
    
    /* private */ var _setDelayedPlaybackToggle: Any = js.native
    
    /* private */ var _showPlaybackChangeIndicator: Any = js.native
    
    /* private */ var _toggleFullScreen: Any = js.native
    
    /* private */ var _toggleVideoPlayback: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    /* private */ var _updateSizes: Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typings.playable.screenViewMod.default = js.native
  }
}
