package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focused extends js.Object {
  /** Element has focus. */
  var focused: js.UndefOr[Boolean] = js.undefined
  /** Element has an error message. */
  var hasErrorMessage: js.UndefOr[Boolean] = js.undefined
  /** Element has an icon. */
  var hasIcon: js.UndefOr[Boolean] = js.undefined
  /** Element has a label. */
  var hasLabel: js.UndefOr[Boolean] = js.undefined
}

object Anon_Focused {
  @scala.inline
  def apply(
    focused: js.UndefOr[Boolean] = js.undefined,
    hasErrorMessage: js.UndefOr[Boolean] = js.undefined,
    hasIcon: js.UndefOr[Boolean] = js.undefined,
    hasLabel: js.UndefOr[Boolean] = js.undefined
  ): Anon_Focused = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (!js.isUndefined(hasErrorMessage)) __obj.updateDynamic("hasErrorMessage")(hasErrorMessage)
    if (!js.isUndefined(hasIcon)) __obj.updateDynamic("hasIcon")(hasIcon)
    if (!js.isUndefined(hasLabel)) __obj.updateDynamic("hasLabel")(hasLabel)
    __obj.asInstanceOf[Anon_Focused]
  }
}

