package typings
package opossumLib.opossumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait index extends js.Object {
  var stats: nodeLib.streamMod.Transform = js.native
  def apply(action: Action, options: CircuitBreakerOptions): CircuitBreaker = js.native
  def promisify(action: Action): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
}

