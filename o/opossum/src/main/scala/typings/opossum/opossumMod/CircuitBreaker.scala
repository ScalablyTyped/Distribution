package typings.opossum.opossumMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opossum", "CircuitBreaker")
@js.native
class CircuitBreaker protected () extends EventEmitter {
  def this(action: Action, options: CircuitBreakerOptions) = this()
  val closed: Boolean = js.native
  val enabled: Boolean = js.native
  val group: String = js.native
  val halfOpen: Boolean = js.native
  val hystrixStats: HystrixStats = js.native
  val isShutdown: Boolean = js.native
  val name: String = js.native
  val opened: Boolean = js.native
  val pendingClose: Boolean = js.native
  val stats: Stats = js.native
  val status: Status = js.native
  val volumeThreshold: Double = js.native
  val warmUp: Boolean = js.native
  def clearCache(): Unit = js.native
  def close(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def fallback(func: Action): this.type = js.native
  def fallback(func: CircuitBreaker): this.type = js.native
  def fire(args: js.Any*): js.Promise[_] = js.native
  def healthCheck(func: js.Function1[/* repeated */ js.Any, js.Promise[_]]): Unit = js.native
  def healthCheck(func: js.Function1[/* repeated */ js.Any, js.Promise[_]], interval: Double): Unit = js.native
  def open(): Unit = js.native
  def shutdown(): Unit = js.native
}

