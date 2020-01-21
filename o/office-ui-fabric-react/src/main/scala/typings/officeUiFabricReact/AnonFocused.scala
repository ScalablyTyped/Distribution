package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocused extends js.Object {
  /** Element has focus. */
  var focused: js.UndefOr[Boolean] = js.undefined
  /** Element has an error message. */
  var hasErrorMessage: js.UndefOr[Boolean] = js.undefined
  /** Element has an icon. */
  var hasIcon: js.UndefOr[Boolean] = js.undefined
  /** Element has a label. */
  var hasLabel: js.UndefOr[Boolean] = js.undefined
}

object AnonFocused {
  @scala.inline
  def apply(
    focused: js.UndefOr[Boolean] = js.undefined,
    hasErrorMessage: js.UndefOr[Boolean] = js.undefined,
    hasIcon: js.UndefOr[Boolean] = js.undefined,
    hasLabel: js.UndefOr[Boolean] = js.undefined
  ): AnonFocused = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (!js.isUndefined(hasErrorMessage)) __obj.updateDynamic("hasErrorMessage")(hasErrorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(hasIcon)) __obj.updateDynamic("hasIcon")(hasIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLabel)) __obj.updateDynamic("hasLabel")(hasLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocused]
  }
}

