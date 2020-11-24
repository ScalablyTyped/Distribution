package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.InteractionIndicator
import typings.playable.screenTypesMod.IScreen
import typings.playable.screenTypesMod.IScreenViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/screen/screen", JSImport.Namespace)
@js.native
object screenMod extends js.Object {
  
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
  
  @js.native
  class default protected () extends Screen {
    def this(hasConfigEventEmitterEngineFullScreenManagerInteractionIndicatorRootContainer: InteractionIndicator) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var View: Instantiable1[/* config */ IScreenViewConfig, typings.playable.screenViewMod.default] = js.native
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
