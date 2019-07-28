package typings.mongoose.mongooseMod.SchemaNs.TypesNs

import typings.mongoose.mongooseMod.MongooseDocument
import typings.mongoose.mongooseMod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schema/number.js
  * http://mongoosejs.com/docs/api.html#schema-number-js
  */
@js.native
trait Number extends SchemaType {
  /** Check if the given value satisfies a required validator. */
  def checkRequired(value: js.Any, doc: MongooseDocument): scala.Boolean = js.native
  /**
    * Sets a maximum number validator.
    * @param maximum number
    * @param message optional custom error message
    */
  def max(maximum: Double): this.type = js.native
  def max(maximum: Double, message: java.lang.String): this.type = js.native
  /**
    * Sets a minimum number validator.
    * @param value minimum number
    * @param message optional custom error message
    */
  def min(value: Double): this.type = js.native
  def min(value: Double, message: java.lang.String): this.type = js.native
}

