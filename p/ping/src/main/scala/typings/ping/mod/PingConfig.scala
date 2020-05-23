package typings.ping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PingConfig extends js.Object {
  /**
    * Additional arguments. Default `[]`
    */
  var extra: js.UndefOr[js.Array[String]] = js.undefined
  /**
    *  Exit after sending number of `ECHO_REQUEST`. Default `1`
    */
  var min_reply: js.UndefOr[Double] = js.undefined
  /**
    * Map IP address to hostname or not. Default `true`
    */
  var numeric: js.UndefOr[Boolean] = js.undefined
  /**
    * Source address for sending the ping.
    */
  var sourceAddr: js.UndefOr[String] = js.undefined
  /**
    * Time duration, in seconds, for ping command to exit. Default `2` on Mac/Linux, `5` on Windows.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Ping via ipv6 or not. Default `false`
    */
  var v6: js.UndefOr[Boolean] = js.undefined
}

object PingConfig {
  @scala.inline
  def apply(
    extra: js.Array[String] = null,
    min_reply: js.UndefOr[Double] = js.undefined,
    numeric: js.UndefOr[Boolean] = js.undefined,
    sourceAddr: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    v6: js.UndefOr[Boolean] = js.undefined
  ): PingConfig = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(min_reply)) __obj.updateDynamic("min_reply")(min_reply.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.get.asInstanceOf[js.Any])
    if (sourceAddr != null) __obj.updateDynamic("sourceAddr")(sourceAddr.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(v6)) __obj.updateDynamic("v6")(v6.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingConfig]
  }
}

