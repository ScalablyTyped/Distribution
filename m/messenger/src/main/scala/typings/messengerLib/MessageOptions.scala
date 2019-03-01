package typings
package messengerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  /**
    * Hide the message after the provided number of seconds.
    */
  var hideAfter: js.UndefOr[scala.Double] = js.undefined
  /**
    * Hide the message if Backbone client-side navigation occurs.
    */
  var hideOnNavigate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A unique id. If supplied, only one message with that ID will be shown at a time.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text of the message.
    */
  var message: java.lang.String
  /**
    * Should a close button be added to the message?
    */
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hide the newer message if there is an id collision, as opposed to the older message.
    */
  var singleton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * What theme class should be applied to the message? Defaults to the theme set for Messenger in general.
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * "info", "error" or "success" are understood by the provided themes. You can also pass your own string, and that class will be added.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(
    message: java.lang.String,
    hideAfter: scala.Int | scala.Double = null,
    hideOnNavigate: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null,
    `type`: java.lang.String = null
  ): MessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (hideAfter != null) __obj.updateDynamic("hideAfter")(hideAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnNavigate)) __obj.updateDynamic("hideOnNavigate")(hideOnNavigate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MessageOptions]
  }
}

