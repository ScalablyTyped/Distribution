package typings
package officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenCardMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.types", "OpenCardMode")
@js.native
object OpenCardMode extends js.Object {
  /**
    * Open card by hot key
    */
  @js.native
  sealed trait hotKey
    extends officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode
  
  /**
    * Open card by hover
    */
  @js.native
  sealed trait hover
    extends officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode
  
  /* 1 */ val hotKey: hotKey with scala.Double = js.native
  /* 0 */ val hover: hover with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode with scala.Double
  ] = js.native
}

