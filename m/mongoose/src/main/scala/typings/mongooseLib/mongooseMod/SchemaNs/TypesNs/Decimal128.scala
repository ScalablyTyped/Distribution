package typings
package mongooseLib.mongooseMod.SchemaNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
        * section schema/decimal128.js
        * http://mongoosejs.com/docs/api.html#schema-decimal128-js
        */
@js.native
trait Decimal128
  extends mongooseLib.mongooseMod.SchemaType {
  /** Check if the given value satisfies a required validator. */
  def checkRequired(value: js.Any, doc: mongooseLib.mongooseMod.MongooseDocument): scala.Boolean = js.native
}

