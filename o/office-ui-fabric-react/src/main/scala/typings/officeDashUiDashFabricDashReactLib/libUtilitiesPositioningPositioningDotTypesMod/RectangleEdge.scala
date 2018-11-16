package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RectangleEdge extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "RectangleEdge")
@js.native
object RectangleEdge extends js.Object {
  @js.native
  sealed trait bottom
    extends officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
  
  @js.native
  sealed trait left
    extends officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
  
  @js.native
  sealed trait right
    extends officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
  
  @js.native
  sealed trait top
    extends officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
  
  /* -1 */ val bottom: bottom with scala.Double = js.native
  /* 2 */ val left: left with scala.Double = js.native
  /* -2 */ val right: right with scala.Double = js.native
  /* 1 */ val top: top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge with scala.Double
  ] = js.native
}

