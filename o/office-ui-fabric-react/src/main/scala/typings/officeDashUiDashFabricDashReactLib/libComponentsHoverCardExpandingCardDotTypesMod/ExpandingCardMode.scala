package typings
package officeDashUiDashFabricDashReactLib.libComponentsHoverCardExpandingCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExpandingCardMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.types", "ExpandingCardMode")
@js.native
object ExpandingCardMode extends js.Object {
  /**
    * To have top compact card only
    */
  @js.native
  sealed trait compact
    extends officeDashUiDashFabricDashReactLib.libComponentsHoverCardExpandingCardDotTypesMod.ExpandingCardMode
  
  /**
    * To have both top compact and bottom expanded card
    */
  @js.native
  sealed trait expanded
    extends officeDashUiDashFabricDashReactLib.libComponentsHoverCardExpandingCardDotTypesMod.ExpandingCardMode
  
  /* 0 */ val compact: compact with scala.Double = js.native
  /* 1 */ val expanded: expanded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsHoverCardExpandingCardDotTypesMod.ExpandingCardMode with scala.Double
  ] = js.native
}

