package typings
package officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FocusZoneTabbableElements extends js.Object

@JSImport("office-ui-fabric-react/lib/components/FocusZone/FocusZone.types", "FocusZoneTabbableElements")
@js.native
object FocusZoneTabbableElements extends js.Object {
  /** All tabbing action is allowed */
  @js.native
  sealed trait all
    extends officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneTabbableElements
  
  /** Tabbing is allowed only on input elements */
  @js.native
  sealed trait inputOnly
    extends officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneTabbableElements
  
  /** Tabbing is not allowed */
  @js.native
  sealed trait none
    extends officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneTabbableElements
  
  /* 1 */ val all: all with scala.Double = js.native
  /* 2 */ val inputOnly: inputOnly with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneTabbableElements with scala.Double
  ] = js.native
}

