package typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod

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
  sealed trait blocked extends MessageBarType
  
  /** Error styled MessageBar */
  @js.native
  sealed trait error extends MessageBarType
  
  /** Info styled MessageBar */
  @js.native
  sealed trait info extends MessageBarType
  
  /**
    * Deprecated at v0.48.0, to be removed at \>= v1.0.0. Use `blocked` instead.
    * @deprecated Use `blocked` instead.
    */
  @js.native
  sealed trait remove extends MessageBarType
  
  /** SevereWarning styled MessageBar */
  @js.native
  sealed trait severeWarning extends MessageBarType
  
  /** Success styled MessageBar */
  @js.native
  sealed trait success extends MessageBarType
  
  /** Warning styled MessageBar */
  @js.native
  sealed trait warning extends MessageBarType
  
  /* 2 */ val blocked: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.blocked with Double = js.native
  /* 1 */ val error: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.error with Double = js.native
  /* 0 */ val info: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.info with Double = js.native
  /* 90000 */ val remove: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.remove with Double = js.native
  /* 3 */ val severeWarning: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.severeWarning with Double = js.native
  /* 4 */ val success: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.success with Double = js.native
  /* 5 */ val warning: typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageBarType with Double] = js.native
}

