package typings.node

import typings.node.NodeJS.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setTimeout")
@js.native
object setTimeout extends js.Object {
  def apply(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  @JSName("__promisify__")
  def promisify(ms: Double): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify[T](ms: Double, value: T): js.Promise[T] = js.native
}

