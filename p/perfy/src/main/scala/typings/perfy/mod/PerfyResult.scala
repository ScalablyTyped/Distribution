package typings.perfy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfyResult extends js.Object {
  /** UTC end time of the execution (low-resolution). e.g. 1533302466486 */
  val endTime: Double
  /** Float representation of full elapsed time in milliseconds. e.g. 1235.125 */
  val fullMilliseconds: Double
  /** Float representation of full elapsed time in nanoseconds. e.g. 1235125283 */
  val fullNanoseconds: Double
  /** Alias of `time` */
  val fullSeconds: Double
  /** Nanoseconds portion converted to milliseconds. 235.125283 */
  val milliseconds: Double
  /** Initialized name of the performance instance */
  val name: String
  /** Nanoseconds portion of the elapsed time. e.g. 235125283 */
  val nanoseconds: Double
  /** Seconds portion of the elapsed time. e.g. 1 */
  val seconds: Double
  /** UTC start time of the execution (low-resolution). e.g. 1533302465251 */
  val startTime: Double
  /** Text summary shorthand for elapsed time */
  val summary: String
  /** Number — Float representation of full elapsed time in seconds. e.g. 1.235 */
  val time: Double
}

object PerfyResult {
  @scala.inline
  def apply(
    endTime: Double,
    fullMilliseconds: Double,
    fullNanoseconds: Double,
    fullSeconds: Double,
    milliseconds: Double,
    name: String,
    nanoseconds: Double,
    seconds: Double,
    startTime: Double,
    summary: String,
    time: Double
  ): PerfyResult = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], fullMilliseconds = fullMilliseconds.asInstanceOf[js.Any], fullNanoseconds = fullNanoseconds.asInstanceOf[js.Any], fullSeconds = fullSeconds.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerfyResult]
  }
}

