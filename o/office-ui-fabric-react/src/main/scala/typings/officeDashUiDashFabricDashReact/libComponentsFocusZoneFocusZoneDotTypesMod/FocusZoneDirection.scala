package typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod

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
  sealed trait bidirectional extends FocusZoneDirection
  
  /**
    * React to all arrows. Navigate next item in DOM on right/down arrow keys and previous - left/up arrow keys.
    * Right and Left arrow keys are swapped in RTL mode.
    */
  @js.native
  sealed trait domOrder extends FocusZoneDirection
  
  /** Only react to left/right arrows. */
  @js.native
  sealed trait horizontal extends FocusZoneDirection
  
  /** Only react to up/down arrows. */
  @js.native
  sealed trait vertical extends FocusZoneDirection
  
  /* 2 */ val bidirectional: typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.bidirectional with Double = js.native
  /* 3 */ val domOrder: typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.domOrder with Double = js.native
  /* 1 */ val horizontal: typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.horizontal with Double = js.native
  /* 0 */ val vertical: typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FocusZoneDirection with Double] = js.native
}

