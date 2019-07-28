package typings.memjs.memjsMod

import typings.memjs.Anon_Args
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
  var logger: js.UndefOr[Anon_Args] = js.undefined
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
    expires: Int | Double = null,
    failoverTime: Int | Double = null,
    logger: Anon_Args = null,
    retries: Int | Double = null,
    retry_delay: Int | Double = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (failoverTime != null) __obj.updateDynamic("failoverTime")(failoverTime.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (retry_delay != null) __obj.updateDynamic("retry_delay")(retry_delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

