package typings
package mongooseLib.mongooseMod.SchemaNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
        * section schema/date.js
        * http://mongoosejs.com/docs/api.html#schema-date-js
        */
@js.native
trait Date
  extends mongooseLib.mongooseMod.SchemaType {
  /**
           * Check if the given value satisfies a required validator. To satisfy
           * a required validator, the given value must be an instance of Date.
           */
  def checkRequired(value: js.Any, doc: mongooseLib.mongooseMod.MongooseDocument): scala.Boolean = js.native
  /** Declares a TTL index (rounded to the nearest second) for Date types only. */
  def expires(when: java.lang.String): this.type = js.native
  /** Declares a TTL index (rounded to the nearest second) for Date types only. */
  def expires(when: scala.Double): this.type = js.native
  /**
           * Sets a maximum date validator.
           * @param maximum date
           * @param message optional custom error message
           */
  def max(maximum: mongooseLib.mongooseMod.NativeDate): this.type = js.native
  /**
           * Sets a maximum date validator.
           * @param maximum date
           * @param message optional custom error message
           */
  def max(maximum: mongooseLib.mongooseMod.NativeDate, message: java.lang.String): this.type = js.native
  /**
           * Sets a minimum date validator.
           * @param value minimum date
           * @param message optional custom error message
           */
  def min(value: mongooseLib.mongooseMod.NativeDate): this.type = js.native
  /**
           * Sets a minimum date validator.
           * @param value minimum date
           * @param message optional custom error message
           */
  def min(value: mongooseLib.mongooseMod.NativeDate, message: java.lang.String): this.type = js.native
}

