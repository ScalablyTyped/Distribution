package typings.opossum.opossumMod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait index extends js.Object {
  var stats: Transform = js.native
  def apply(action: Action, options: CircuitBreakerOptions): CircuitBreaker = js.native
  def promisify(action: Action): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
}

