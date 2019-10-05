package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.IFacepileProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Facepile", JSImport.Namespace)
@js.native
object libComponentsFacepileMod extends js.Object {
  @js.native
  class FacepileBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotBaseMod.FacepileBase {
    def this(props: IFacepileProps) = this()
  }
  
  val Facepile: StatelessComponent[IFacepileProps] = js.native
  /* static members */
  @js.native
  object FacepileBase extends js.Object {
    var defaultProps: IFacepileProps = js.native
  }
  
  @js.native
  object OverflowButtonType extends js.Object {
    /* 1 */ val descriptive: typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType.descriptive with Double = js.native
    /* 3 */ val downArrow: typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType.downArrow with Double = js.native
    /* 2 */ val more: typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType.more with Double = js.native
    /* 0 */ val none: typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType with Double
      ] = js.native
  }
  
}

