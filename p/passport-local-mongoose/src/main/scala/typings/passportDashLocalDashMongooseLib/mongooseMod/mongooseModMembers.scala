package typings
package passportDashLocalDashMongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", JSImport.Namespace)
@js.native
object mongooseModMembers extends js.Object {
  def model[T /* <: stdLib.Document */](name: java.lang.String): PassportLocalModel[T] = js.native
  def model[T /* <: stdLib.Document */](name: java.lang.String, schema: PassportLocalSchema): PassportLocalModel[T] = js.native
  def model[T /* <: stdLib.Document */](name: java.lang.String, schema: PassportLocalSchema, collection: java.lang.String): PassportLocalModel[T] = js.native
  def model[T /* <: stdLib.Document */](
    name: java.lang.String,
    schema: PassportLocalSchema,
    collection: java.lang.String,
    skipInit: scala.Boolean
  ): PassportLocalModel[T] = js.native
  @JSName("model")
  def model_TDocumentUPassportLocalModelU[T /* <: stdLib.Document */, U /* <: PassportLocalModel[T] */](name: java.lang.String): U = js.native
  @JSName("model")
  def model_TDocumentUPassportLocalModelU[T /* <: stdLib.Document */, U /* <: PassportLocalModel[T] */](name: java.lang.String, schema: PassportLocalSchema): U = js.native
  @JSName("model")
  def model_TDocumentUPassportLocalModelU[T /* <: stdLib.Document */, U /* <: PassportLocalModel[T] */](name: java.lang.String, schema: PassportLocalSchema, collection: java.lang.String): U = js.native
  @JSName("model")
  def model_TDocumentUPassportLocalModelU[T /* <: stdLib.Document */, U /* <: PassportLocalModel[T] */](
    name: java.lang.String,
    schema: PassportLocalSchema,
    collection: java.lang.String,
    skipInit: scala.Boolean
  ): U = js.native
}

