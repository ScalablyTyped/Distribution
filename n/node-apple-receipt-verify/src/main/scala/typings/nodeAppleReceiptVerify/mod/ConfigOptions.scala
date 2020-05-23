package typings.nodeAppleReceiptVerify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var environment: js.UndefOr[js.Array[String]] = js.undefined
  var excludeOldTransactions: js.UndefOr[Boolean] = js.undefined
  var extended: js.UndefOr[Boolean] = js.undefined
  var ignoreExpired: js.UndefOr[Boolean] = js.undefined
  var ignoreExpiredError: js.UndefOr[Boolean] = js.undefined
  var secret: String
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    secret: String,
    environment: js.Array[String] = null,
    excludeOldTransactions: js.UndefOr[Boolean] = js.undefined,
    extended: js.UndefOr[Boolean] = js.undefined,
    ignoreExpired: js.UndefOr[Boolean] = js.undefined,
    ignoreExpiredError: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeOldTransactions)) __obj.updateDynamic("excludeOldTransactions")(excludeOldTransactions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExpired)) __obj.updateDynamic("ignoreExpired")(ignoreExpired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExpiredError)) __obj.updateDynamic("ignoreExpiredError")(ignoreExpiredError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

