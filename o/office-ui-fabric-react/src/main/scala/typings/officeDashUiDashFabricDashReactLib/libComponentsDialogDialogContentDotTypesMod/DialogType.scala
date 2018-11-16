package typings
package officeDashUiDashFabricDashReactLib.libComponentsDialogDialogContentDotTypesMod

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
  sealed trait close
    extends officeDashUiDashFabricDashReactLib.libComponentsDialogDialogContentDotTypesMod.DialogType
  
  /** Dialog with large header banner */
  @js.native
  sealed trait largeHeader
    extends officeDashUiDashFabricDashReactLib.libComponentsDialogDialogContentDotTypesMod.DialogType
  
  /** Standard dialog */
  @js.native
  sealed trait normal
    extends officeDashUiDashFabricDashReactLib.libComponentsDialogDialogContentDotTypesMod.DialogType
  
  /* 2 */ val close: close with scala.Double = js.native
  /* 1 */ val largeHeader: largeHeader with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDialogDialogContentDotTypesMod.DialogType with scala.Double
  ] = js.native
}

