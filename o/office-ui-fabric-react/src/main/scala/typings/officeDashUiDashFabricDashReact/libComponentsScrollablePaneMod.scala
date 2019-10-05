package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePaneContext
import typings.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePaneProps
import typings.react.reactMod.Context
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ScrollablePane", JSImport.Namespace)
@js.native
object libComponentsScrollablePaneMod extends js.Object {
  @js.native
  class ScrollablePaneBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotBaseMod.ScrollablePaneBase {
    def this(props: IScrollablePaneProps) = this()
  }
  
  val ScrollablePane: StatelessComponent[IScrollablePaneProps] = js.native
  val ScrollablePaneContext: Context[IScrollablePaneContext] = js.native
  @js.native
  object ScrollbarVisibility extends js.Object {
    var always: typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.always = js.native
    var auto: typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.auto = js.native
  }
  
}

