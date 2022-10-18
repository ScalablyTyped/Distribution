package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.distSrcModulesUiLiveIndicatorTypesMod.ILiveIndicator
import typings.playable.distSrcModulesUiTitleTypesMod.ITitle
import typings.playable.distSrcModulesUiTopBlockTypesMod.ITopBlock
import typings.playable.distSrcModulesUiTopBlockTypesMod.ITopBlockViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiTopBlockTopBlockMod {
  
  @JSImport("playable/dist/src/modules/ui/top-block/top-block", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TopBlock {
    def this(dependencies: IDependencies) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def hideContent(): Unit = js.native
    
    /* CompleteClass */
    override def hideLiveIndicator(): Unit = js.native
    
    /* CompleteClass */
    override def hideTitle(): Unit = js.native
    
    /* CompleteClass */
    var isFocused: Boolean = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def showContent(): Unit = js.native
    
    /* CompleteClass */
    override def showLiveIndicator(): Unit = js.native
    
    /* CompleteClass */
    override def showTitle(): Unit = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/top-block/top-block", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/top-block/top-block", "default.View")
    @js.native
    open class View protected ()
      extends typings.playable.distSrcModulesUiTopBlockTopBlockDotviewMod.default {
      def this(config: ITopBlockViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/top-block/top-block", "default.View")
    @js.native
    def View: Instantiable1[
        /* config */ ITopBlockViewConfig, 
        typings.playable.distSrcModulesUiTopBlockTopBlockDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable1[
          /* config */ ITopBlockViewConfig, 
          typings.playable.distSrcModulesUiTopBlockTopBlockDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/top-block/top-block", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/top-block/top-block", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait IDependencies extends StObject {
    
    var liveIndicator: ILiveIndicator
    
    var title: ITitle
  }
  object IDependencies {
    
    inline def apply(liveIndicator: ILiveIndicator, title: ITitle): IDependencies = {
      val __obj = js.Dynamic.literal(liveIndicator = liveIndicator.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDependencies]
    }
    
    extension [Self <: IDependencies](x: Self) {
      
      inline def setLiveIndicator(value: ILiveIndicator): Self = StObject.set(x, "liveIndicator", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ITitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TopBlock
    extends StObject
       with ITopBlock {
    
    /* private */ var _bindViewCallbacks: Any = js.native
    
    /* private */ var _getElements: Any = js.native
    
    /* private */ var _initUI: Any = js.native
    
    /* private */ var _isBlockFocused: Any = js.native
    
    /* private */ var _removeFocusState: Any = js.native
    
    /* private */ var _setFocusState: Any = js.native
    
    @JSName("isFocused")
    def isFocused_MTopBlock: Boolean = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typings.playable.distSrcModulesUiTopBlockTopBlockDotviewMod.default = js.native
  }
}
