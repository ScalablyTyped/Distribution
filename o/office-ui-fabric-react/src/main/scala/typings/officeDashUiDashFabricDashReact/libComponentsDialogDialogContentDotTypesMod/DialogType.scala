package typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialogType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Dialog/DialogContent.types", "DialogType")
@js.native
object DialogType extends js.Object {
  /** Dialog with an 'x' close button in the upper-right corner */
  @js.native
  sealed trait close extends DialogType
  
  /** Dialog with large header banner */
  @js.native
  sealed trait largeHeader extends DialogType
  
  /** Standard dialog */
  @js.native
  sealed trait normal extends DialogType
  
  /* 2 */ val close: typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType.close with Double = js.native
  /* 1 */ val largeHeader: typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType.largeHeader with Double = js.native
  /* 0 */ val normal: typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialogType with Double] = js.native
}

