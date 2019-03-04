package typings
package nodeLib.perfUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLoopDelayMonitor extends js.Object {
  /**
    * The number of times the event loop delay exceeded the maximum 1 hour eventloop delay threshold.
    */
  val exceeds: scala.Double
  /**
    * The maximum recorded event loop delay.
    */
  val max: scala.Double
  /**
    * The mean of the recorded event loop delays.
    */
  val mean: scala.Double
  /**
    * The minimum recorded event loop delay.
    */
  val min: scala.Double
  /**
    * A `Map` object detailing the accumulated percentile distribution.
    */
  val percentiles: stdLib.Map[scala.Double, scala.Double]
  /**
    * The standard deviation of the recorded event loop delays.
    */
  val stddev: scala.Double
  /**
    * Disables the event loop delay sample timer. Returns `true` if the timer was stopped, `false` if it was already stopped.
    */
  def disable(): scala.Boolean
  /**
    * Enables the event loop delay sample timer. Returns `true` if the timer was started, `false` if it was already started.
    */
  def enable(): scala.Boolean
  /**
    * Returns the value at the given percentile.
    * @param percentile A percentile value between 1 and 100.
    */
  def percentile(percentile: scala.Double): scala.Double
  /**
    * Resets the collected histogram data.
    */
  def reset(): scala.Unit
}

object EventLoopDelayMonitor {
  @scala.inline
  def apply(
    disable: js.Function0[scala.Boolean],
    enable: js.Function0[scala.Boolean],
    exceeds: scala.Double,
    max: scala.Double,
    mean: scala.Double,
    min: scala.Double,
    percentile: js.Function1[scala.Double, scala.Double],
    percentiles: stdLib.Map[scala.Double, scala.Double],
    reset: js.Function0[scala.Unit],
    stddev: scala.Double
  ): EventLoopDelayMonitor = {
    val __obj = js.Dynamic.literal(disable = disable, enable = enable, exceeds = exceeds, max = max, mean = mean, min = min, percentile = percentile, percentiles = percentiles, reset = reset, stddev = stddev)
  
    __obj.asInstanceOf[EventLoopDelayMonitor]
  }
}

