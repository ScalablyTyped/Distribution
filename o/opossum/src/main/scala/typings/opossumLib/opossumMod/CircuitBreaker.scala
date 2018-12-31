package typings
package opossumLib.opossumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opossum", "CircuitBreaker")
@js.native
class CircuitBreaker ()
  extends nodeLib.eventsMod.EventEmitter {
  def clearCache(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def fallback(): this.type = js.native
  def fallback(func: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def fire(args: js.Any*): js.Promise[_] = js.native
  def healthCheck(func: js.Function1[/* repeated */ js.Any, js.Promise[_]]): js.Promise[_] = js.native
  def healthCheck(func: js.Function1[/* repeated */ js.Any, js.Promise[_]], interval: scala.Double): js.Promise[_] = js.native
  def open(): scala.Unit = js.native
  def promisify(action: Action): js.Promise[Action] = js.native
  def stats(): nodeLib.streamMod.Transform = js.native
}

@JSImport("opossum", "CircuitBreaker")
@js.native
object CircuitBreaker extends js.Object {
  val closed: js.Symbol = js.native
  val enabled: js.Symbol = js.native
  val group: js.Symbol = js.native
  val halfOpen: js.Symbol = js.native
  val hystrixStats: js.Symbol = js.native
  val name: js.Symbol = js.native
  val opened: js.Symbol = js.native
  val pendingClose: js.Symbol = js.native
  val status: js.Symbol = js.native
  val volumeThreshold: js.Symbol = js.native
  val warmUp: js.Symbol = js.native
}

