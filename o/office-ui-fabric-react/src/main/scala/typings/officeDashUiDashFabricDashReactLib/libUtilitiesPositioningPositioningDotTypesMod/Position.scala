package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait bottom
    extends officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.Position
  
  @js.native
  sealed trait end
    extends officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.Position
  
  @js.native
  sealed trait start
    extends officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.Position
  
  @js.native
  sealed trait top
    extends officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.Position
  
  /* 1 */ val bottom: bottom with scala.Double = js.native
  /* 3 */ val end: end with scala.Double = js.native
  /* 2 */ val start: start with scala.Double = js.native
  /* 0 */ val top: top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.Position with scala.Double
  ] = js.native
}

