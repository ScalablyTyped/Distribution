package typings.mongoose.mongooseMod.SchemaNs.TypesNs

import typings.mongoose.mongooseMod.MongooseDocument
import typings.mongoose.mongooseMod.NativeDate
import typings.mongoose.mongooseMod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schema/date.js
  * http://mongoosejs.com/docs/api.html#schema-date-js
  */
@js.native
trait Date extends SchemaType {
  /**
    * Check if the given value satisfies a required validator. To satisfy
    * a required validator, the given value must be an instance of Date.
    */
  def checkRequired(value: js.Any, doc: MongooseDocument): scala.Boolean = js.native
  def expires(when: java.lang.String): this.type = js.native
  /** Declares a TTL index (rounded to the nearest second) for Date types only. */
  def expires(when: Double): this.type = js.native
  /**
    * Sets a maximum date validator.
    * @param maximum date
    * @param message optional custom error message
    */
  def max(maximum: NativeDate): this.type = js.native
  def max(maximum: NativeDate, message: java.lang.String): this.type = js.native
  /**
    * Sets a minimum date validator.
    * @param value minimum date
    * @param message optional custom error message
    */
  def min(value: NativeDate): this.type = js.native
  def min(value: NativeDate, message: java.lang.String): this.type = js.native
}

