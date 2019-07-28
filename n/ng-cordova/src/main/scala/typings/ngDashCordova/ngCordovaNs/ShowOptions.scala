package typings.ngDashCordova.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowOptions extends js.Object {
  var addCancelButtonWithLabel: js.UndefOr[String] = js.undefined
  var addDestructiveButtonWithLabel: js.UndefOr[String] = js.undefined
  var androidEnableCancelButton: js.UndefOr[Boolean] = js.undefined
  var buttonLabels: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var winphoneEnableCancelButton: js.UndefOr[Boolean] = js.undefined
}

object ShowOptions {
  @scala.inline
  def apply(
    addCancelButtonWithLabel: String = null,
    addDestructiveButtonWithLabel: String = null,
    androidEnableCancelButton: js.UndefOr[Boolean] = js.undefined,
    buttonLabels: js.Array[String] = null,
    title: String = null,
    winphoneEnableCancelButton: js.UndefOr[Boolean] = js.undefined
  ): ShowOptions = {
    val __obj = js.Dynamic.literal()
    if (addCancelButtonWithLabel != null) __obj.updateDynamic("addCancelButtonWithLabel")(addCancelButtonWithLabel)
    if (addDestructiveButtonWithLabel != null) __obj.updateDynamic("addDestructiveButtonWithLabel")(addDestructiveButtonWithLabel)
    if (!js.isUndefined(androidEnableCancelButton)) __obj.updateDynamic("androidEnableCancelButton")(androidEnableCancelButton)
    if (buttonLabels != null) __obj.updateDynamic("buttonLabels")(buttonLabels)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(winphoneEnableCancelButton)) __obj.updateDynamic("winphoneEnableCancelButton")(winphoneEnableCancelButton)
    __obj.asInstanceOf[ShowOptions]
  }
}

