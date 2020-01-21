package typings.passportLocalMongoose.mod

import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "model")
@js.native
object model extends js.Object {
  def apply[T /* <: Document_ */](name: String): PassportLocalModel[T] = js.native
  def apply[T /* <: Document_ */](name: String, schema: PassportLocalSchema): PassportLocalModel[T] = js.native
  def apply[T /* <: Document_ */](name: String, schema: PassportLocalSchema, collection: String): PassportLocalModel[T] = js.native
  def apply[T /* <: Document_ */](name: String, schema: PassportLocalSchema, collection: String, skipInit: Boolean): PassportLocalModel[T] = js.native
}

