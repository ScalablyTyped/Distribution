package typings.passportDashLocalDashMongoose.mongooseMod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def model[T /* <: Document */](name: String): PassportLocalModel[T] = js.native
  def model[T /* <: Document */](name: String, schema: PassportLocalSchema): PassportLocalModel[T] = js.native
  def model[T /* <: Document */](name: String, schema: PassportLocalSchema, collection: String): PassportLocalModel[T] = js.native
  def model[T /* <: Document */](name: String, schema: PassportLocalSchema, collection: String, skipInit: Boolean): PassportLocalModel[T] = js.native
  @JSName("model")
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String, schema: PassportLocalSchema): U = js.native
  @JSName("model")
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String, schema: PassportLocalSchema, collection: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_PassportLocalModelT_U[T /* <: Document */, U /* <: PassportLocalModel[T] */](name: String, schema: PassportLocalSchema, collection: String, skipInit: Boolean): U = js.native
}

