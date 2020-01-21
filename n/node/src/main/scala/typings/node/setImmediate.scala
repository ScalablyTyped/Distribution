package typings.node

import typings.node.NodeJS.Immediate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setImmediate")
@js.native
object setImmediate extends js.Object {
  def apply(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  @JSName("__promisify__")
  def promisify(): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify[T](value: T): js.Promise[T] = js.native
}

