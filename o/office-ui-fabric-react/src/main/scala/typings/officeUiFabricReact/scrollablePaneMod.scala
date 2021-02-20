package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactStrings.always
import typings.officeUiFabricReact.officeUiFabricReactStrings.auto
import typings.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typings.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneProps
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollablePaneMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollablePane")
  @js.native
  val ScrollablePane: FunctionComponent[IScrollablePaneProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollablePaneBase")
  @js.native
  class ScrollablePaneBase protected ()
    extends typings.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase {
    def this(props: IScrollablePaneProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollablePaneContext")
  @js.native
  val ScrollablePaneContext: Context[IScrollablePaneContext] = js.native
  
  object ScrollbarVisibility {
    
    @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollbarVisibility")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollbarVisibility.always")
    @js.native
    def always: typings.officeUiFabricReact.officeUiFabricReactStrings.always = js.native
    @scala.inline
    def always_=(x: always): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("always")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollbarVisibility.auto")
    @js.native
    def auto: typings.officeUiFabricReact.officeUiFabricReactStrings.auto = js.native
    @scala.inline
    def auto_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto")(x.asInstanceOf[js.Any])
  }
}
