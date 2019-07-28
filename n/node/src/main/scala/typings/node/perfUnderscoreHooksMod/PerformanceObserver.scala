package typings.node.perfUnderscoreHooksMod

import typings.node.Anon_Buffered
import typings.node.asyncUnderscoreHooksMod.AsyncResource
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
  def observe(options: Anon_Buffered): Unit = js.native
}

