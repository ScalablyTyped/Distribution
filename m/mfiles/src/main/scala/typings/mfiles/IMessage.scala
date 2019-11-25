package typings.mfiles

import typings.mfiles.mfilesNumbers.`1`
import typings.mfiles.mfilesNumbers.`2`
import typings.mfiles.mfilesNumbers.`3`
import typings.mfiles.mfilesNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessage extends js.Object {
  var button1_enabled: js.UndefOr[Boolean] = js.undefined
  var button1_title: js.UndefOr[String] = js.undefined
  var button2_enabled: js.UndefOr[Boolean] = js.undefined
  var button2_title: js.UndefOr[String] = js.undefined
  var button3_enabled: js.UndefOr[Boolean] = js.undefined
  var button3_title: js.UndefOr[String] = js.undefined
  var button4_enabled: js.UndefOr[Boolean] = js.undefined
  var button4_title: js.UndefOr[String] = js.undefined
  var cancelButton: js.UndefOr[`1` | `2` | `3` | `4`] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var checkbox_checked: js.UndefOr[Boolean] = js.undefined
  var checkbox_enabled: js.UndefOr[Boolean] = js.undefined
  var checkbox_title: js.UndefOr[String] = js.undefined
  var defaultButton: js.UndefOr[`1` | `2` | `3` | `4`] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var timeOut: js.UndefOr[Double] = js.undefined
  var timeOutButton: js.UndefOr[`1` | `2` | `3` | `4`] = js.undefined
  var timeout_deactivateOnFocusChange: js.UndefOr[Boolean] = js.undefined
}

object IMessage {
  @scala.inline
  def apply(
    button1_enabled: js.UndefOr[Boolean] = js.undefined,
    button1_title: String = null,
    button2_enabled: js.UndefOr[Boolean] = js.undefined,
    button2_title: String = null,
    button3_enabled: js.UndefOr[Boolean] = js.undefined,
    button3_title: String = null,
    button4_enabled: js.UndefOr[Boolean] = js.undefined,
    button4_title: String = null,
    cancelButton: `1` | `2` | `3` | `4` = null,
    caption: String = null,
    checkbox_checked: js.UndefOr[Boolean] = js.undefined,
    checkbox_enabled: js.UndefOr[Boolean] = js.undefined,
    checkbox_title: String = null,
    defaultButton: `1` | `2` | `3` | `4` = null,
    icon: String = null,
    message: String = null,
    timeOut: Int | Double = null,
    timeOutButton: `1` | `2` | `3` | `4` = null,
    timeout_deactivateOnFocusChange: js.UndefOr[Boolean] = js.undefined
  ): IMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(button1_enabled)) __obj.updateDynamic("button1_enabled")(button1_enabled.asInstanceOf[js.Any])
    if (button1_title != null) __obj.updateDynamic("button1_title")(button1_title.asInstanceOf[js.Any])
    if (!js.isUndefined(button2_enabled)) __obj.updateDynamic("button2_enabled")(button2_enabled.asInstanceOf[js.Any])
    if (button2_title != null) __obj.updateDynamic("button2_title")(button2_title.asInstanceOf[js.Any])
    if (!js.isUndefined(button3_enabled)) __obj.updateDynamic("button3_enabled")(button3_enabled.asInstanceOf[js.Any])
    if (button3_title != null) __obj.updateDynamic("button3_title")(button3_title.asInstanceOf[js.Any])
    if (!js.isUndefined(button4_enabled)) __obj.updateDynamic("button4_enabled")(button4_enabled.asInstanceOf[js.Any])
    if (button4_title != null) __obj.updateDynamic("button4_title")(button4_title.asInstanceOf[js.Any])
    if (cancelButton != null) __obj.updateDynamic("cancelButton")(cancelButton.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (!js.isUndefined(checkbox_checked)) __obj.updateDynamic("checkbox_checked")(checkbox_checked.asInstanceOf[js.Any])
    if (!js.isUndefined(checkbox_enabled)) __obj.updateDynamic("checkbox_enabled")(checkbox_enabled.asInstanceOf[js.Any])
    if (checkbox_title != null) __obj.updateDynamic("checkbox_title")(checkbox_title.asInstanceOf[js.Any])
    if (defaultButton != null) __obj.updateDynamic("defaultButton")(defaultButton.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (timeOutButton != null) __obj.updateDynamic("timeOutButton")(timeOutButton.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout_deactivateOnFocusChange)) __obj.updateDynamic("timeout_deactivateOnFocusChange")(timeout_deactivateOnFocusChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
}

