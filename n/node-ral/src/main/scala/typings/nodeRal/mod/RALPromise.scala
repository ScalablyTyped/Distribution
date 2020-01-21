package typings.nodeRal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "RALPromise")
@js.native
object RALPromise extends js.Object {
  def apply[T](name: String): js.Promise[T] = js.native
  def apply[T](name: String, options: js.Object): js.Promise[T] = js.native
}

