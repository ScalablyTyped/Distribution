package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod.ExpandingCardMode.compact
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod.ExpandingCardMode.expanded
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
  sealed trait compact extends ExpandingCardMode
  
  /**
    * To have both top compact and bottom expanded card
    */
  @js.native
  sealed trait expanded extends ExpandingCardMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExpandingCardMode with Double] = js.native
  /* 0 */ @js.native
  object compact extends TopLevel[compact with Double]
  
  /* 1 */ @js.native
  object expanded extends TopLevel[expanded with Double]
  
}

