package typings.onsenui.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var buttonLabel: js.UndefOr[String] = js.undefined
  var buttonLabels: js.UndefOr[js.Array[String]] = js.undefined
  var callback: js.UndefOr[js.Any] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var messageHTML: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var primaryButtonIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(
    animation: String = null,
    buttonLabel: String = null,
    buttonLabels: js.Array[String] = null,
    callback: js.Any = null,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    message: String = null,
    messageHTML: String = null,
    modifier: String = null,
    primaryButtonIndex: Int | Double = null,
    title: String = null
  ): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel.asInstanceOf[js.Any])
    if (buttonLabels != null) __obj.updateDynamic("buttonLabels")(buttonLabels.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (messageHTML != null) __obj.updateDynamic("messageHTML")(messageHTML.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (primaryButtonIndex != null) __obj.updateDynamic("primaryButtonIndex")(primaryButtonIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertOptions]
  }
}

