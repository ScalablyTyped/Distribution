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
  def apply(
    action: js.UndefOr[Null | IStyle] = js.undefined,
    actions: js.UndefOr[Null | IStyle] = js.undefined,
    actionsRight: js.UndefOr[Null | IStyle] = js.undefined
  ): IDialogFooterStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(action)) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(actions)) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(actionsRight)) __obj.updateDynamic("actionsRight")(actionsRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogFooterStyles]
  }
}

