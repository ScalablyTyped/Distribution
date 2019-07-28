package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setTimeout")
@js.native
object setTimeoutNs extends js.Object {
  def __promisify__(ms: Double): js.Promise[Unit] = js.native
  def __promisify__[T](ms: Double, value: T): js.Promise[T] = js.native
}

