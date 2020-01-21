package typings.node.perfHooksMod

import typings.node.AnonBuffered
import typings.node.asyncHooksMod.AsyncResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("perf_hooks", "PerformanceObserver")
@js.native
class PerformanceObserver protected () extends AsyncResource {
  def this(callback: PerformanceObserverCallback) = this()
  /**
    * Disconnects the PerformanceObserver instance from all notifications.
    */
  def disconnect(): Unit = js.native
  /**
    * Subscribes the PerformanceObserver instance to notifications of new PerformanceEntry instances identified by options.entryTypes.
    * When options.buffered is false, the callback will be invoked once for every PerformanceEntry instance.
    * Property buffered defaults to false.
    * @param options
    */
  def observe(options: AnonBuffered): Unit = js.native
}

