package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.InteractionIndicator
import typings.playable.screenTypesMod.IScreen
import typings.playable.screenTypesMod.IScreenViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenMod {
  
  @JSImport("playable/dist/src/modules/ui/screen/screen", JSImport.Default)
  @js.native
  class default protected () extends Screen {
    def this(hasConfigEventEmitterEngineFullScreenManagerInteractionIndicatorRootContainer: InteractionIndicator) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/screen/screen", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/screen/screen", "default.View")
    @js.native
    class View protected ()
      extends typings.playable.screenViewMod.default {
      def this(config: IScreenViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/screen/screen", "default.View")
    @js.native
    def View: Instantiable1[/* config */ IScreenViewConfig, typings.playable.screenViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable1[/* config */ IScreenViewConfig, typings.playable.screenViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/screen/screen", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/screen/screen", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Screen extends IScreen {
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _clearDelayedPlaybackToggle: js.Any = js.native
    
    var _delayedToggleVideoPlaybackTimeout: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _fullScreenManager: js.Any = js.native
    
    var _hideDelayedPlaybackChangeIndicator: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _interactionIndicator: js.Any = js.native
    
    var _isClickProcessingDisabled: js.Any = js.native
    
    /* private */ def _isDelayedPlaybackToggleExist: js.Any = js.native
    
    var _processClick: js.Any = js.native
    
    var _processDblClick: js.Any = js.native
    
    var _setDelayedPlaybackToggle: js.Any = js.native
    
    var _showPlaybackChangeIndicator: js.Any = js.native
    
    var _toggleFullScreen: js.Any = js.native
    
    var _toggleVideoPlayback: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var _updateSizes: js.Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typings.playable.screenViewMod.default = js.native
  }
}
