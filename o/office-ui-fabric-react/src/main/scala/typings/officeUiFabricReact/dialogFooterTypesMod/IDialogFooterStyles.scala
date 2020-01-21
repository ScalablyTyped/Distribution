package typings.officeUiFabricReact.dialogFooterTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogFooterStyles extends js.Object {
  var action: IStyle
  /**
    * Style for the actions element.
    */
  var actions: IStyle
  var actionsRight: IStyle
}

object IDialogFooterStyles {
  @scala.inline
  def apply(action: IStyle = null, actions: IStyle = null, actionsRight: IStyle = null): IDialogFooterStyles = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (actionsRight != null) __obj.updateDynamic("actionsRight")(actionsRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogFooterStyles]
  }
}

