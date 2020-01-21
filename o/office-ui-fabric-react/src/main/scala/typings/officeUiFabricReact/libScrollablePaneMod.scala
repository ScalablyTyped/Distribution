package typings.officeUiFabricReact

import typings.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typings.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneProps
import typings.react.mod.Context
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ScrollablePane", JSImport.Namespace)
@js.native
object libScrollablePaneMod extends js.Object {
  @js.native
  class ScrollablePaneBase protected ()
    extends typings.officeUiFabricReact.scrollablePaneMod.ScrollablePaneBase {
    def this(props: IScrollablePaneProps) = this()
  }
  
  val ScrollablePane: StatelessComponent[IScrollablePaneProps] = js.native
  val ScrollablePaneContext: Context[IScrollablePaneContext] = js.native
  @js.native
  object ScrollbarVisibility extends js.Object {
    var always: typings.officeUiFabricReact.officeUiFabricReactStrings.always = js.native
    var auto: typings.officeUiFabricReact.officeUiFabricReactStrings.auto = js.native
  }
  
}

