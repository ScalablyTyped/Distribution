package typings
package officeDashUiDashFabricDashReactLib.libComponentsFacepileFacepileDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverflowButtonType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.types", "OverflowButtonType")
@js.native
object OverflowButtonType extends js.Object {
  /** +1 overflow icon */
  @js.native
  sealed trait descriptive
    extends officeDashUiDashFabricDashReactLib.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType
  
  /** Chevron overflow icon */
  @js.native
  sealed trait downArrow
    extends officeDashUiDashFabricDashReactLib.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType
  
  /** More overflow icon */
  @js.native
  sealed trait more
    extends officeDashUiDashFabricDashReactLib.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType
  
  /** No overflow */
  @js.native
  sealed trait none
    extends officeDashUiDashFabricDashReactLib.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType
  
  /* 1 */ val descriptive: descriptive with scala.Double = js.native
  /* 3 */ val downArrow: downArrow with scala.Double = js.native
  /* 2 */ val more: more with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType with scala.Double
  ] = js.native
}

