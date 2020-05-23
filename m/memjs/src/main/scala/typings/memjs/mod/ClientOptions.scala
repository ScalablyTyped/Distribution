package typings.memjs.mod

import typings.memjs.anon.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * The default expiration in seconds to use. A `0` means never expire,
    * if it is greater than 30 days (60 x 60 x 24 x 30), it is
    * treated as a UNIX time (number of seconds since January 1, 1970).
    * @default 0
    */
  var expires: js.UndefOr[Double] = js.undefined
  /**
    * How many seconds to wait until retrying a failed server.
    * @default 60
    */
  var failoverTime: js.UndefOr[Double] = js.undefined
  /**
    * A logger object that responds to `log(string)` method calls.
    * @default console
    */
  var logger: js.UndefOr[Log] = js.undefined
  /**
    * The number of times to retry an operation in lieu of failures.
    * @default 2
    */
  var retries: js.UndefOr[Double] = js.undefined
  /**
    * @default 0.2
    */
  var retry_delay: js.UndefOr[Double] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    expires: js.UndefOr[Double] = js.undefined,
    failoverTime: js.UndefOr[Double] = js.undefined,
    logger: Log = null,
    retries: js.UndefOr[Double] = js.undefined,
    retry_delay: js.UndefOr[Double] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failoverTime)) __obj.updateDynamic("failoverTime")(failoverTime.get.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_delay)) __obj.updateDynamic("retry_delay")(retry_delay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

