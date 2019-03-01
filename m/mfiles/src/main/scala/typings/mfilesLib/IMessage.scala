package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessage extends js.Object {
  var button1_enabled: js.UndefOr[scala.Boolean] = js.undefined
  var button1_title: js.UndefOr[java.lang.String] = js.undefined
  var button2_enabled: js.UndefOr[scala.Boolean] = js.undefined
  var button2_title: js.UndefOr[java.lang.String] = js.undefined
  var button3_enabled: js.UndefOr[scala.Boolean] = js.undefined
  var button3_title: js.UndefOr[java.lang.String] = js.undefined
  var button4_enabled: js.UndefOr[scala.Boolean] = js.undefined
  var button4_title: js.UndefOr[java.lang.String] = js.undefined
  var cancelButton: js.UndefOr[
    mfilesLib.mfilesLibNumbers.`1` | mfilesLib.mfilesLibNumbers.`2` | mfilesLib.mfilesLibNumbers.`3` | mfilesLib.mfilesLibNumbers.`4`
  ] = js.undefined
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var checkbox_checked: js.UndefOr[scala.Boolean] = js.undefined
  var checkbox_enabled: js.UndefOr[scala.Boolean] = js.undefined
  var checkbox_title: js.UndefOr[java.lang.String] = js.undefined
  var defaultButton: js.UndefOr[
    mfilesLib.mfilesLibNumbers.`1` | mfilesLib.mfilesLibNumbers.`2` | mfilesLib.mfilesLibNumbers.`3` | mfilesLib.mfilesLibNumbers.`4`
  ] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var timeOut: js.UndefOr[scala.Double] = js.undefined
  var timeOutButton: js.UndefOr[
    mfilesLib.mfilesLibNumbers.`1` | mfilesLib.mfilesLibNumbers.`2` | mfilesLib.mfilesLibNumbers.`3` | mfilesLib.mfilesLibNumbers.`4`
  ] = js.undefined
  var timeout_deactivateOnFocusChange: js.UndefOr[scala.Boolean] = js.undefined
}

object IMessage {
  @scala.inline
  def apply(
    button1_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    button1_title: java.lang.String = null,
    button2_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    button2_title: java.lang.String = null,
    button3_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    button3_title: java.lang.String = null,
    button4_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    button4_title: java.lang.String = null,
    cancelButton: mfilesLib.mfilesLibNumbers.`1` | mfilesLib.mfilesLibNumbers.`2` | mfilesLib.mfilesLibNumbers.`3` | mfilesLib.mfilesLibNumbers.`4` = null,
    caption: java.lang.String = null,
    checkbox_checked: js.UndefOr[scala.Boolean] = js.undefined,
    checkbox_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    checkbox_title: java.lang.String = null,
    defaultButton: mfilesLib.mfilesLibNumbers.`1` | mfilesLib.mfilesLibNumbers.`2` | mfilesLib.mfilesLibNumbers.`3` | mfilesLib.mfilesLibNumbers.`4` = null,
    icon: java.lang.String = null,
    message: java.lang.String = null,
    timeOut: scala.Int | scala.Double = null,
    timeOutButton: mfilesLib.mfilesLibNumbers.`1` | mfilesLib.mfilesLibNumbers.`2` | mfilesLib.mfilesLibNumbers.`3` | mfilesLib.mfilesLibNumbers.`4` = null,
    timeout_deactivateOnFocusChange: js.UndefOr[scala.Boolean] = js.undefined
  ): IMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(button1_enabled)) __obj.updateDynamic("button1_enabled")(button1_enabled)
    if (button1_title != null) __obj.updateDynamic("button1_title")(button1_title)
    if (!js.isUndefined(button2_enabled)) __obj.updateDynamic("button2_enabled")(button2_enabled)
    if (button2_title != null) __obj.updateDynamic("button2_title")(button2_title)
    if (!js.isUndefined(button3_enabled)) __obj.updateDynamic("button3_enabled")(button3_enabled)
    if (button3_title != null) __obj.updateDynamic("button3_title")(button3_title)
    if (!js.isUndefined(button4_enabled)) __obj.updateDynamic("button4_enabled")(button4_enabled)
    if (button4_title != null) __obj.updateDynamic("button4_title")(button4_title)
    if (cancelButton != null) __obj.updateDynamic("cancelButton")(cancelButton.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (!js.isUndefined(checkbox_checked)) __obj.updateDynamic("checkbox_checked")(checkbox_checked)
    if (!js.isUndefined(checkbox_enabled)) __obj.updateDynamic("checkbox_enabled")(checkbox_enabled)
    if (checkbox_title != null) __obj.updateDynamic("checkbox_title")(checkbox_title)
    if (defaultButton != null) __obj.updateDynamic("defaultButton")(defaultButton.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (message != null) __obj.updateDynamic("message")(message)
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (timeOutButton != null) __obj.updateDynamic("timeOutButton")(timeOutButton.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout_deactivateOnFocusChange)) __obj.updateDynamic("timeout_deactivateOnFocusChange")(timeout_deactivateOnFocusChange)
    __obj.asInstanceOf[IMessage]
  }
}

