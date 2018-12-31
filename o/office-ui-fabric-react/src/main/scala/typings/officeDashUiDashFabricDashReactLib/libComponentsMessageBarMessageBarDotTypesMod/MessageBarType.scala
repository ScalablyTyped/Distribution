package typings
package officeDashUiDashFabricDashReactLib.libComponentsMessageBarMessageBarDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageBarType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.types", "MessageBarType")
@js.native
object MessageBarType extends js.Object {
  /** Blocked styled MessageBar */
  @js.native
  sealed trait blocked
    extends officeDashUiDashFabricDashReactLib.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType
  
  /** Error styled MessageBar */
  @js.native
  sealed trait error
    extends officeDashUiDashFabricDashReactLib.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType
  
  /** Info styled MessageBar */
  @js.native
  sealed trait info
    extends officeDashUiDashFabricDashReactLib.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType
  
  /**
    * Deprecated at v0.48.0, to be removed at \>= v1.0.0. Use `blocked` instead.
    * @deprecated Use `blocked` instead.
    */
  @js.native
  sealed trait remove
    extends officeDashUiDashFabricDashReactLib.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType
  
  /** SevereWarning styled MessageBar */
  @js.native
  sealed trait severeWarning
    extends officeDashUiDashFabricDashReactLib.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType
  
  /** Success styled MessageBar */
  @js.native
  sealed trait success
    extends officeDashUiDashFabricDashReactLib.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType
  
  /** Warning styled MessageBar */
  @js.native
  sealed trait warning
    extends officeDashUiDashFabricDashReactLib.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType
  
  /* 2 */ val blocked: blocked with scala.Double = js.native
  /* 1 */ val error: error with scala.Double = js.native
  /* 0 */ val info: info with scala.Double = js.native
  /* 90000 */ val remove: remove with scala.Double = js.native
  /* 3 */ val severeWarning: severeWarning with scala.Double = js.native
  /* 4 */ val success: success with scala.Double = js.native
  /* 5 */ val warning: warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType with scala.Double
  ] = js.native
}

