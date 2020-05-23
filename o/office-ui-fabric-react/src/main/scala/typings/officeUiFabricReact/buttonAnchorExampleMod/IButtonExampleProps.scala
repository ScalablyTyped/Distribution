package typings.officeUiFabricReact.buttonAnchorExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonExampleProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
}

object IButtonExampleProps {
  @scala.inline
  def apply(checked: js.UndefOr[Boolean] = js.undefined, disabled: js.UndefOr[Boolean] = js.undefined): IButtonExampleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonExampleProps]
  }
}

