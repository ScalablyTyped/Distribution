package typings
package pingLib.pingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PingResponse extends js.Object {
  /**
    * `true` for existing host
    */
  var alive: scala.Boolean
  /**
    * Average time for collection records. `unknown` if ping fails.
    */
  var avg: java.lang.String
  /**
    * The input IP address or host. `unknown` if ping fails.
    */
  var host: java.lang.String
  /**
    * Maximum time for collection records. `unknown` if ping fails.
    */
  var max: java.lang.String
  /**
    * Minimum time for collection records. `unknown` if ping fails.
    */
  var min: java.lang.String
  /**
    * Numeric target IP address
    */
  var numeric_host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Raw stdout from system ping
    */
  var output: java.lang.String
  /**
    * Standard deviation time for collected records. `unknown` if ping fails.
    */
  var stddev: java.lang.String
  /**
    * Time (float) in ms for first successful ping response. `unknown` if ping fails.
    */
  var time: scala.Double | pingLib.pingLibStrings.unknown
}

object PingResponse {
  @scala.inline
  def apply(
    alive: scala.Boolean,
    avg: java.lang.String,
    host: java.lang.String,
    max: java.lang.String,
    min: java.lang.String,
    output: java.lang.String,
    stddev: java.lang.String,
    time: scala.Double | pingLib.pingLibStrings.unknown,
    numeric_host: java.lang.String = null
  ): PingResponse = {
    val __obj = js.Dynamic.literal(alive = alive, avg = avg, host = host, max = max, min = min, output = output, stddev = stddev, time = time.asInstanceOf[js.Any])
    if (numeric_host != null) __obj.updateDynamic("numeric_host")(numeric_host)
    __obj.asInstanceOf[PingResponse]
  }
}

