package typings.playable

import typings.playable.anon.Screen
import typings.playable.mainUiBlockTypesMod.IMainUIBlock
import typings.playable.mainUiBlockTypesMod.IMainUIBlockViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainUiBlockMod {
  
  @JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with MainUIBlock {
    def this(dependencies: Screen) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def disableShowingContent(): Unit = js.native
    
    /* CompleteClass */
    override def enableShowingContent(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def setShouldAlwaysShow(flag: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof MainUIBlockView` */
    @JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block", "default.View")
    @js.native
    class View protected ()
      extends typings.playable.mainUiBlockViewMod.default {
      def this(config: IMainUIBlockViewConfig) = this()
    }
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait MainUIBlock
    extends StObject
       with IMainUIBlock {
    
    /* private */ var _bindEvents: js.Any = js.native
    
    /* private */ var _bindViewCallbacks: js.Any = js.native
    
    /* private */ var _bottomBlock: js.Any = js.native
    
    /* private */ var _eventEmitter: js.Any = js.native
    
    /* private */ var _hideContent: js.Any = js.native
    
    /* private */ var _hideTimeout: js.Any = js.native
    
    /* private */ var _initUI: js.Any = js.native
    
    /* private */ def _isBlockFocused: js.Any = js.native
    
    /* private */ var _isContentShowingEnabled: js.Any = js.native
    
    /* private */ var _isContentShown: js.Any = js.native
    
    /* private */ var _isDragging: js.Any = js.native
    
    /* private */ var _onControlDragEnd: js.Any = js.native
    
    /* private */ var _onControlDragStart: js.Any = js.native
    
    /* private */ var _screen: js.Any = js.native
    
    /* private */ var _shouldAlwaysShow: js.Any = js.native
    
    /* private */ var _shouldShowContent: js.Any = js.native
    
    /* private */ var _showContent: js.Any = js.native
    
    /* private */ var _startHideBlockTimeout: js.Any = js.native
    
    /* private */ var _stopHideBlockTimeout: js.Any = js.native
    
    /* private */ var _tooltipService: js.Any = js.native
    
    /* private */ var _topBlock: js.Any = js.native
    
    /* private */ var _tryHideContent: js.Any = js.native
    
    /* private */ var _tryShowContent: js.Any = js.native
    
    /* private */ var _unbindEvents: js.Any = js.native
    
    /* private */ var _updatePlayingState: js.Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typings.playable.mainUiBlockViewMod.default = js.native
  }
  object MainUIBlock {
    
    /* was `typeof MainUIBlockView` */
    type View = typings.playable.mainUiBlockViewMod.default
  }
}
