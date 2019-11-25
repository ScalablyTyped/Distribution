package typings.ping.pingMod

import typings.ping.pingStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PingResponse extends js.Object {
  /**
    * `true` for existing host
    */
  var alive: Boolean
  /**
    * Average time for collection records. `unknown` if ping fails.
    */
  var avg: String
  /**
    * The input IP address or host. `unknown` if ping fails.
    */
  var host: String
  /**
    * Maximum time for collection records. `unknown` if ping fails.
    */
  var max: String
  /**
    * Minimum time for collection records. `unknown` if ping fails.
    */
  var min: String
  /**
    * Numeric target IP address
    */
  var numeric_host: js.UndefOr[String] = js.undefined
  /**
    * Raw stdout from system ping
    */
  var output: String
  /**
    * Standard deviation time for collected records. `unknown` if ping fails.
    */
  var stddev: String
  /**
    * Time (float) in ms for first successful ping response. `unknown` if ping fails.
    */
  var time: Double | unknown
}

object PingResponse {
  @scala.inline
  def apply(
    alive: Boolean,
    avg: String,
    host: String,
    max: String,
    min: String,
    output: String,
    stddev: String,
    time: Double | unknown,
    numeric_host: String = null
  ): PingResponse = {
    val __obj = js.Dynamic.literal(alive = alive.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (numeric_host != null) __obj.updateDynamic("numeric_host")(numeric_host.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingResponse]
  }
}

