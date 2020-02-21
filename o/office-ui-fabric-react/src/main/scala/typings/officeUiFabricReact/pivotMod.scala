package typings.officeUiFabricReact

import typings.officeUiFabricReact.pivotItemTypesMod.IPivotItemProps
import typings.officeUiFabricReact.pivotTypesMod.IPivotProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Pivot", JSImport.Namespace)
@js.native
object pivotMod extends js.Object {
  @js.native
  class PivotBase protected ()
    extends typings.officeUiFabricReact.pivotBaseMod.PivotBase {
    def this(props: IPivotProps) = this()
  }
  
  @js.native
  class PivotItem protected ()
    extends typings.officeUiFabricReact.pivotItemMod.PivotItem {
    def this(props: IPivotItemProps) = this()
  }
  
  val Pivot: FunctionComponent[IPivotProps] = js.native
  @js.native
  object PivotLinkFormat extends js.Object {
    /* 0 */ val links: typings.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.links with Double = js.native
    /* 1 */ val tabs: typings.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.tabs with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.pivotTypesMod.PivotLinkFormat with Double] = js.native
  }
  
  @js.native
  object PivotLinkSize extends js.Object {
    /* 1 */ val large: typings.officeUiFabricReact.pivotTypesMod.PivotLinkSize.large with Double = js.native
    /* 0 */ val normal: typings.officeUiFabricReact.pivotTypesMod.PivotLinkSize.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.pivotTypesMod.PivotLinkSize with Double] = js.native
  }
  
}

