package typings.ono.esmTypesMod

import typings.ono.onoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnoOptions extends js.Object {
  /**
    * When `Ono` is used to wrap an error, this setting determines whether the inner error's message
    * is appended to the new error message.
    *
    * Defaults to `true`.
    */
  var concatMessages: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that replaces placeholders like "%s" or "%d" in error messages with values.
    * If set to `false`, then error messages will be treated as literals and no placeholder replacement will occur.
    *
    * Defaults to `utils.inspect()` in Node.js.  Defaults to `Array.join()` in browsers.
    */
  var format: js.UndefOr[MessageFormatter | `false`] = js.undefined
}

object OnoOptions {
  @scala.inline
  def apply(concatMessages: js.UndefOr[Boolean] = js.undefined, format: MessageFormatter | `false` = null): OnoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concatMessages)) __obj.updateDynamic("concatMessages")(concatMessages.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnoOptions]
  }
}

