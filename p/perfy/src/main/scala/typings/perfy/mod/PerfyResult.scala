package typings.perfy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerfyResult extends js.Object {
  /** UTC end time of the execution (low-resolution). e.g. 1533302466486 */
  val endTime: Double = js.native
  /** Float representation of full elapsed time in milliseconds. e.g. 1235.125 */
  val fullMilliseconds: Double = js.native
  /** Float representation of full elapsed time in nanoseconds. e.g. 1235125283 */
  val fullNanoseconds: Double = js.native
  /** Alias of `time` */
  val fullSeconds: Double = js.native
  /** Nanoseconds portion converted to milliseconds. 235.125283 */
  val milliseconds: Double = js.native
  /** Initialized name of the performance instance */
  val name: String = js.native
  /** Nanoseconds portion of the elapsed time. e.g. 235125283 */
  val nanoseconds: Double = js.native
  /** Seconds portion of the elapsed time. e.g. 1 */
  val seconds: Double = js.native
  /** UTC start time of the execution (low-resolution). e.g. 1533302465251 */
  val startTime: Double = js.native
  /** Text summary shorthand for elapsed time */
  val summary: String = js.native
  /** Number — Float representation of full elapsed time in seconds. e.g. 1.235 */
  val time: Double = js.native
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
  @scala.inline
  implicit class PerfyResultOps[Self <: PerfyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullMilliseconds(value: Double): Self = this.set("fullMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullNanoseconds(value: Double): Self = this.set("fullNanoseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullSeconds(value: Double): Self = this.set("fullSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMilliseconds(value: Double): Self = this.set("milliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNanoseconds(value: Double): Self = this.set("nanoseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

