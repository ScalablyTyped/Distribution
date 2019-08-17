package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod

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
  sealed trait hotKey extends OpenCardMode
  
  /**
    * Open card by hover
    */
  @js.native
  sealed trait hover extends OpenCardMode
  
  /* 1 */ val hotKey: typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode.hotKey with Double = js.native
  /* 0 */ val hover: typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode.hover with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OpenCardMode with Double] = js.native
}

