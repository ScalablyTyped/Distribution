package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RectangleEdge extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "RectangleEdge")
@js.native
object RectangleEdge extends js.Object {
  @js.native
  sealed trait bottom extends RectangleEdge
  
  @js.native
  sealed trait left extends RectangleEdge
  
  @js.native
  sealed trait right extends RectangleEdge
  
  @js.native
  sealed trait top extends RectangleEdge
  
  /* -1 */ val bottom: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.bottom with Double = js.native
  /* 2 */ val left: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.left with Double = js.native
  /* -2 */ val right: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.right with Double = js.native
  /* 1 */ val top: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RectangleEdge with Double] = js.native
}

