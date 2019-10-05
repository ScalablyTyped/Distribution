package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`0`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`1`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FocusZone", JSImport.Namespace)
@js.native
object libComponentsFocusZoneMod extends js.Object {
  @js.native
  class FocusZone protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneMod.FocusZone {
    def this(props: IFocusZoneProps) = this()
  }
  
  /* static members */
  @js.native
  object FocusZone extends js.Object {
    var defaultProps: IFocusZoneProps = js.native
    /** Used for testing purposes only. */
    def getOuterZones(): Double = js.native
  }
  
  @js.native
  object FocusZoneDirection extends js.Object {
    /* 2 */ val bidirectional: typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.bidirectional with Double = js.native
    /* 3 */ val domOrder: typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.domOrder with Double = js.native
    /* 1 */ val horizontal: typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.horizontal with Double = js.native
    /* 0 */ val vertical: typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection with Double
      ] = js.native
  }
  
  @js.native
  object FocusZoneTabbableElements extends js.Object {
    /** All tabbing action is allowed */
    var all: `1` = js.native
    /** Tabbing is allowed only on input elements */
    var inputOnly: `2` = js.native
    /** Tabbing is not allowed */
    var none: `0` = js.native
  }
  
}

