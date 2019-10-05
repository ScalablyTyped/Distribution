package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.IPivotProps
import typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotItemDotTypesMod.IPivotItemProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Pivot", JSImport.Namespace)
@js.native
object libPivotMod extends js.Object {
  @js.native
  class PivotBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPivotMod.PivotBase {
    def this(props: IPivotProps) = this()
  }
  
  @js.native
  class PivotItem protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPivotMod.PivotItem {
    def this(props: IPivotItemProps) = this()
  }
  
  val Pivot: StatelessComponent[IPivotProps] = js.native
  @js.native
  object PivotLinkFormat extends js.Object {
    /* 0 */ val links: typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkFormat.links with Double = js.native
    /* 1 */ val tabs: typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkFormat.tabs with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkFormat with Double
      ] = js.native
  }
  
  @js.native
  object PivotLinkSize extends js.Object {
    /* 1 */ val large: typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkSize.large with Double = js.native
    /* 0 */ val normal: typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkSize.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod.PivotLinkSize with Double
      ] = js.native
  }
  
}

