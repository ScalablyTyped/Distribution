package typings.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-persist", "values")
@js.native
object values extends js.Object {
  def apply(): js.Promise[js.Array[_]] = js.native
  def apply(filter: FilterFunction[Datum]): js.Promise[js.Array[_]] = js.native
}

