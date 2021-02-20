package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.liveIndicatorTypesMod.ILiveIndicator
import typings.playable.titleTypesMod.ITitle
import typings.playable.topBlockTypesMod.ITopBlock
import typings.playable.topBlockTypesMod.ITopBlockViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topBlockMod {
  
  @JSImport("playable/dist/src/modules/ui/top-block/top-block", JSImport.Default)
  @js.native
  class default protected () extends TopBlock {
    def this(dependencies: IDependencies) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/top-block/top-block", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/top-block/top-block", "default.View")
    @js.native
    class View protected ()
      extends typings.playable.topBlockViewMod.default {
      def this(config: ITopBlockViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/top-block/top-block", "default.View")
    @js.native
    def View: Instantiable1[/* config */ ITopBlockViewConfig, typings.playable.topBlockViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable1[/* config */ ITopBlockViewConfig, typings.playable.topBlockViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/top-block/top-block", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/top-block/top-block", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDependencies extends StObject {
    
    var liveIndicator: ILiveIndicator = js.native
    
    var title: ITitle = js.native
  }
  object IDependencies {
    
    @scala.inline
    def apply(liveIndicator: ILiveIndicator, title: ITitle): IDependencies = {
      val __obj = js.Dynamic.literal(liveIndicator = liveIndicator.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDependencies]
    }
    
    @scala.inline
    implicit class IDependenciesMutableBuilder[Self <: IDependencies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLiveIndicator(value: ILiveIndicator): Self = StObject.set(x, "liveIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ITitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TopBlock extends ITopBlock {
    
    var _bindViewCallbacks: js.Any = js.native
    
    var _getElements: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _isBlockFocused: js.Any = js.native
    
    var _removeFocusState: js.Any = js.native
    
    var _setFocusState: js.Any = js.native
    
    @JSName("isFocused")
    def isFocused_MTopBlock: Boolean = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typings.playable.topBlockViewMod.default = js.native
  }
}
