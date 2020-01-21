package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "model")
@js.native
object model extends js.Object {
  def apply[T /* <: Document */](name: String): Model_[T, js.Object] = js.native
  def apply[T /* <: Document */](name: String, schema: Schema[_]): Model_[T, js.Object] = js.native
  def apply[T /* <: Document */](name: String, schema: Schema[_], collection: String): Model_[T, js.Object] = js.native
  def apply[T /* <: Document */](name: String, schema: Schema[_], collection: String, skipInit: Boolean): Model_[T, js.Object] = js.native
}

