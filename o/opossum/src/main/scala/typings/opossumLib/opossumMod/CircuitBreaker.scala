package typings
package opossumLib.opossumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opossum", "CircuitBreaker")
@js.native
class CircuitBreaker protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(action: Action, options: CircuitBreakerOptions) = this()
  val closed: scala.Boolean = js.native
  val enabled: scala.Boolean = js.native
  val group: java.lang.String = js.native
  val halfOpen: scala.Boolean = js.native
  val hystrixStats: HystrixStats = js.native
  val name: java.lang.String = js.native
  val opened: scala.Boolean = js.native
  val pendingClose: scala.Boolean = js.native
  val stats: Stats = js.native
  val status: Status = js.native
  val volumeThreshold: scala.Double = js.native
  val warmUp: scala.Boolean = js.native
  def clearCache(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def fallback(func: Action): this.type = js.native
  def fallback(func: CircuitBreaker): this.type = js.native
  def fire(args: js.Any*): js.Promise[_] = js.native
  def healthCheck(func: js.Function1[/* repeated */ js.Any, js.Promise[_]]): scala.Unit = js.native
  def healthCheck(func: js.Function1[/* repeated */ js.Any, js.Promise[_]], interval: scala.Double): scala.Unit = js.native
  def open(): scala.Unit = js.native
}

