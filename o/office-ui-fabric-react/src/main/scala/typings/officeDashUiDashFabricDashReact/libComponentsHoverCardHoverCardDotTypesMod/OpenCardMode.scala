package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode.hotKey
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode.hover
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OpenCardMode with Double] = js.native
  /* 1 */ @js.native
  object hotKey extends TopLevel[hotKey with Double]
  
  /* 0 */ @js.native
  object hover extends TopLevel[hover with Double]
  
}

