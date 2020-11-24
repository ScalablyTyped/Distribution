package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.Screen
import typings.playable.mainUiBlockTypesMod.IMainUIBlock
import typings.playable.mainUiBlockTypesMod.IMainUIBlockViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block", JSImport.Namespace)
@js.native
object mainUiBlockMod extends js.Object {
  
  @js.native
  trait MainUIBlock extends IMainUIBlock {
    
    var _bindEvents: js.Any = js.native
    
    var _bindViewCallbacks: js.Any = js.native
    
    var _bottomBlock: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _hideContent: js.Any = js.native
    
    var _hideTimeout: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    /* private */ def _isBlockFocused: js.Any = js.native
    
    var _isContentShowingEnabled: js.Any = js.native
    
    var _isContentShown: js.Any = js.native
    
    var _isDragging: js.Any = js.native
    
    var _onControlDragEnd: js.Any = js.native
    
    var _onControlDragStart: js.Any = js.native
    
    var _screen: js.Any = js.native
    
    var _shouldAlwaysShow: js.Any = js.native
    
    var _shouldShowContent: js.Any = js.native
    
    var _showContent: js.Any = js.native
    
    var _startHideBlockTimeout: js.Any = js.native
    
    var _stopHideBlockTimeout: js.Any = js.native
    
    var _tooltipService: js.Any = js.native
    
    var _topBlock: js.Any = js.native
    
    var _tryHideContent: js.Any = js.native
    
    var _tryShowContent: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var _updatePlayingState: js.Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typings.playable.mainUiBlockViewMod.default = js.native
  }
  
  @js.native
  class default protected () extends MainUIBlock {
    def this(dependencies: Screen) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var View: Instantiable1[/* config */ IMainUIBlockViewConfig, typings.playable.mainUiBlockViewMod.default] = js.native
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
