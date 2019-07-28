package typings.mongoose.mongooseMod.SchemaNs.TypesNs

import typings.mongoose.mongooseMod.MongooseDocument
import typings.mongoose.mongooseMod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schema/decimal128.js
  * http://mongoosejs.com/docs/api.html#schema-decimal128-js
  */
@js.native
trait Decimal128 extends SchemaType {
  /** Check if the given value satisfies a required validator. */
  def checkRequired(value: js.Any, doc: MongooseDocument): scala.Boolean = js.native
}

