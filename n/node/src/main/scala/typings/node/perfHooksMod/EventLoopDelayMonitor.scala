package typings.node.perfHooksMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventLoopDelayMonitor extends js.Object {
  
  /**
    * Disables the event loop delay sample timer. Returns `true` if the timer was stopped, `false` if it was already stopped.
    */
  def disable(): Boolean = js.native
  
  /**
    * Enables the event loop delay sample timer. Returns `true` if the timer was started, `false` if it was already started.
    */
  def enable(): Boolean = js.native
  
  /**
    * The number of times the event loop delay exceeded the maximum 1 hour eventloop delay threshold.
    */
  val exceeds: Double = js.native
  
  /**
    * The maximum recorded event loop delay.
    */
  val max: Double = js.native
  
  /**
    * The mean of the recorded event loop delays.
    */
  val mean: Double = js.native
  
  /**
    * The minimum recorded event loop delay.
    */
  val min: Double = js.native
  
  /**
    * Returns the value at the given percentile.
    * @param percentile A percentile value between 1 and 100.
    */
  def percentile(percentile: Double): Double = js.native
  
  /**
    * A `Map` object detailing the accumulated percentile distribution.
    */
  val percentiles: Map[Double, Double] = js.native
  
  /**
    * Resets the collected histogram data.
    */
  def reset(): Unit = js.native
  
  /**
    * The standard deviation of the recorded event loop delays.
    */
  val stddev: Double = js.native
}
object EventLoopDelayMonitor {
  
  @scala.inline
  def apply(
    disable: () => Boolean,
    enable: () => Boolean,
    exceeds: Double,
    max: Double,
    mean: Double,
    min: Double,
    percentile: Double => Double,
    percentiles: Map[Double, Double],
    reset: () => Unit,
    stddev: Double
  ): EventLoopDelayMonitor = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), exceeds = exceeds.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], percentile = js.Any.fromFunction1(percentile), percentiles = percentiles.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stddev = stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLoopDelayMonitor]
  }
  
  @scala.inline
  implicit class EventLoopDelayMonitorOps[Self <: EventLoopDelayMonitor] (val x: Self) extends AnyVal {
    
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
    def setDisable(value: () => Boolean): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => Boolean): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExceeds(value: Double): Self = this.set("exceeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double): Self = this.set("mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentile(value: Double => Double): Self = this.set("percentile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentiles(value: Map[Double, Double]): Self = this.set("percentiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStddev(value: Double): Self = this.set("stddev", value.asInstanceOf[js.Any])
  }
}
