package typings
package passportDashLocalDashMongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def model[T /* <: stdLib.Document */](name: java.lang.String): passportDashLocalDashMongooseLib.mongooseMod.PassportLocalModel[T] = js.native
  def model[T /* <: stdLib.Document */](name: java.lang.String, schema: passportDashLocalDashMongooseLib.mongooseMod.PassportLocalSchema): passportDashLocalDashMongooseLib.mongooseMod.PassportLocalModel[T] = js.native
  def model[T /* <: stdLib.Document */](
    name: java.lang.String,
    schema: passportDashLocalDashMongooseLib.mongooseMod.PassportLocalSchema,
    collection: java.lang.String
  ): passportDashLocalDashMongooseLib.mongooseMod.PassportLocalModel[T] = js.native
  def model[T /* <: stdLib.Document */](
    name: java.lang.String,
    schema: passportDashLocalDashMongooseLib.mongooseMod.PassportLocalSchema,
    collection: java.lang.String,
    skipInit: scala.Boolean
  ): passportDashLocalDashMongooseLib.mongooseMod.PassportLocalModel[T] = js.native
  @JSName("model")
  def model_TDocumentUPassportLocalModelU[T /* <: stdLib.Document */, U /* <: passportDashLocalDashMongooseLib.mongooseMod.PassportLocalModel[T] */](name: java.lang.String): U = js.native
  @JSName("model")
  def model_TDocumentUPassportLocalModelU[T /* <: stdLib.Document */, U /* <: passportDashLocalDashMongooseLib.mongooseMod.PassportLocalModel[T] */](name: java.lang.String, schema: passportDashLocalDashMongooseLib.mongooseMod.PassportLocalSchema): U = js.native
  @JSName("model")
  def model_TDocumentUPassportLocalModelU[T /* <: stdLib.Document */, U /* <: passportDashLocalDashMongooseLib.mongooseMod.PassportLocalModel[T] */](
    name: java.lang.String,
    schema: passportDashLocalDashMongooseLib.mongooseMod.PassportLocalSchema,
    collection: java.lang.String
  ): U = js.native
  @JSName("model")
  def model_TDocumentUPassportLocalModelU[T /* <: stdLib.Document */, U /* <: passportDashLocalDashMongooseLib.mongooseMod.PassportLocalModel[T] */](
    name: java.lang.String,
    schema: passportDashLocalDashMongooseLib.mongooseMod.PassportLocalSchema,
    collection: java.lang.String,
    skipInit: scala.Boolean
  ): U = js.native
}

