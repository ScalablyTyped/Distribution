package typings.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newrelic", "startWebTransaction")
@js.native
object startWebTransaction extends js.Object {
  def apply[T](url: String, handle: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def apply[T](url: String, handle: js.Promise[T]): js.Promise[T] = js.native
}

