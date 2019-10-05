package typings.passportDashLocalDashMongoose.mongooseMod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "model")
@js.native
object model extends js.Object {
  def apply[T /* <: Document */](name: String): PassportLocalModel[T] = js.native
  def apply[T /* <: Document */](name: String, schema: PassportLocalSchema): PassportLocalModel[T] = js.native
  def apply[T /* <: Document */](name: String, schema: PassportLocalSchema, collection: String): PassportLocalModel[T] = js.native
  def apply[T /* <: Document */](name: String, schema: PassportLocalSchema, collection: String, skipInit: Boolean): PassportLocalModel[T] = js.native
}

