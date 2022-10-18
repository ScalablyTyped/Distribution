package typings.playable

import typings.playable.anon.Screen
import typings.playable.distSrcModulesUiMainUiBlockTypesMod.IMainUIBlock
import typings.playable.distSrcModulesUiMainUiBlockTypesMod.IMainUIBlockViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiMainUiBlockMainUiBlockMod {
  
  @JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block", JSImport.Default)
  @js.native
  open class default protected ()
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
    open class View protected ()
      extends typings.playable.distSrcModulesUiMainUiBlockMainUiBlockDotviewMod.default {
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
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _bindViewCallbacks: Any = js.native
    
    /* private */ var _bottomBlock: Any = js.native
    
    /* private */ var _config: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _hideContent: Any = js.native
    
    /* private */ var _hideTimeout: Any = js.native
    
    /* private */ var _initUI: Any = js.native
    
    /* private */ def _isBlockFocused: Any = js.native
    
    /* private */ var _isContentShowingEnabled: Any = js.native
    
    /* private */ var _isContentShown: Any = js.native
    
    /* private */ var _isDragging: Any = js.native
    
    /* private */ var _onControlDragEnd: Any = js.native
    
    /* private */ var _onControlDragStart: Any = js.native
    
    /* private */ var _screen: Any = js.native
    
    /* private */ var _shouldAlwaysShow: Any = js.native
    
    /* private */ var _shouldShowContent: Any = js.native
    
    /* private */ var _showContent: Any = js.native
    
    /* private */ var _startHideBlockTimeout: Any = js.native
    
    /* private */ var _stopHideBlockTimeout: Any = js.native
    
    /* private */ var _tooltipService: Any = js.native
    
    /* private */ var _topBlock: Any = js.native
    
    /* private */ var _tryHideContent: Any = js.native
    
    /* private */ var _tryShowContent: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    /* private */ var _updatePlayingState: Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typings.playable.distSrcModulesUiMainUiBlockMainUiBlockDotviewMod.default = js.native
  }
  object MainUIBlock {
    
    /* was `typeof MainUIBlockView` */
    type View = typings.playable.distSrcModulesUiMainUiBlockMainUiBlockDotviewMod.default
  }
}
