package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShowTransitions extends js.Object {
  var showTransitions: js.UndefOr[Boolean] = js.undefined
  var showValue: js.UndefOr[Boolean] = js.undefined
  var titleLabelClassName: js.UndefOr[String] = js.undefined
}

object AnonShowTransitions {
  @scala.inline
  def apply(
    showTransitions: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    titleLabelClassName: String = null
  ): AnonShowTransitions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showTransitions)) __obj.updateDynamic("showTransitions")(showTransitions.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.asInstanceOf[js.Any])
    if (titleLabelClassName != null) __obj.updateDynamic("titleLabelClassName")(titleLabelClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShowTransitions]
  }
}

