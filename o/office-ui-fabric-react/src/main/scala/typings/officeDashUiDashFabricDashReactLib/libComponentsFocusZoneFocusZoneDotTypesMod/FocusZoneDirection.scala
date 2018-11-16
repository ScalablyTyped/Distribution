package typings
package officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FocusZoneDirection extends js.Object

@JSImport("office-ui-fabric-react/lib/components/FocusZone/FocusZone.types", "FocusZoneDirection")
@js.native
object FocusZoneDirection extends js.Object {
  /** React to all arrows. */
  @js.native
  sealed trait bidirectional
    extends officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection
  
  /** Only react to left/right arrows. */
  @js.native
  sealed trait horizontal
    extends officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection
  
  /** Only react to up/down arrows. */
  @js.native
  sealed trait vertical
    extends officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection
  
  /* 2 */ val bidirectional: bidirectional with scala.Double = js.native
  /* 1 */ val horizontal: horizontal with scala.Double = js.native
  /* 0 */ val vertical: vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection with scala.Double
  ] = js.native
}

