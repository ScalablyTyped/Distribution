package typings
package mongooseLib.mongooseMod.SchemaNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schema/number.js
  * http://mongoosejs.com/docs/api.html#schema-number-js
  */
@js.native
trait Number
  extends mongooseLib.mongooseMod.SchemaType {
  /** Check if the given value satisfies a required validator. */
  def checkRequired(value: js.Any, doc: mongooseLib.mongooseMod.MongooseDocument): scala.Boolean = js.native
  /**
    * Sets a maximum number validator.
    * @param maximum number
    * @param message optional custom error message
    */
  def max(maximum: scala.Double): this.type = js.native
  def max(maximum: scala.Double, message: java.lang.String): this.type = js.native
  /**
    * Sets a minimum number validator.
    * @param value minimum number
    * @param message optional custom error message
    */
  def min(value: scala.Double): this.type = js.native
  def min(value: scala.Double, message: java.lang.String): this.type = js.native
}

