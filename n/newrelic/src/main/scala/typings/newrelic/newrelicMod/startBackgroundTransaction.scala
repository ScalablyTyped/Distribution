package typings.newrelic.newrelicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newrelic", "startBackgroundTransaction")
@js.native
object startBackgroundTransaction extends js.Object {
  def apply[T](name: String, group: String, handle: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def apply[T](name: String, group: String, handle: js.Promise[T]): js.Promise[T] = js.native
  def apply[T](name: String, handle: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def apply[T](name: String, handle: js.Promise[T]): js.Promise[T] = js.native
}

