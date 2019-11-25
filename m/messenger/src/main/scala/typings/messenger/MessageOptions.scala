package typings.messenger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  /**
    * Hide the message after the provided number of seconds.
    */
  var hideAfter: js.UndefOr[Double] = js.undefined
  /**
    * Hide the message if Backbone client-side navigation occurs.
    */
  var hideOnNavigate: js.UndefOr[Boolean] = js.undefined
  /**
    * A unique id. If supplied, only one message with that ID will be shown at a time.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The text of the message.
    */
  var message: String
  /**
    * Should a close button be added to the message?
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Hide the newer message if there is an id collision, as opposed to the older message.
    */
  var singleton: js.UndefOr[Boolean] = js.undefined
  /**
    * What theme class should be applied to the message? Defaults to the theme set for Messenger in general.
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * "info", "error" or "success" are understood by the provided themes. You can also pass your own string, and that class will be added.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(
    message: String,
    hideAfter: Int | Double = null,
    hideOnNavigate: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    `type`: String = null
  ): MessageOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (hideAfter != null) __obj.updateDynamic("hideAfter")(hideAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnNavigate)) __obj.updateDynamic("hideOnNavigate")(hideOnNavigate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
}

