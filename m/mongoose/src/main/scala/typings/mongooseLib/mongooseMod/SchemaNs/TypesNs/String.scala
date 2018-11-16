package typings
package mongooseLib.mongooseMod.SchemaNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
        * section schema/string.js
        * http://mongoosejs.com/docs/api.html#schema-string-js
        */
@js.native
trait String
  extends mongooseLib.mongooseMod.SchemaType {
  /** Check if the given value satisfies a required validator. */
  def checkRequired(value: js.Any, doc: mongooseLib.mongooseMod.MongooseDocument): scala.Boolean = js.native
  /**
           * Adds an enum validator
           * @param args enumeration values
           */
  def enum(args: java.lang.String): this.type = js.native
  /**
           * Adds an enum validator
           * @param args enumeration values
           */
  def enum(args: js.Any): this.type = js.native
  /**
           * Adds an enum validator
           * @param args enumeration values
           */
  def enum(args: Array): this.type = js.native
  /** Adds a lowercase setter. */
  def lowercase(): this.type = js.native
  /**
           * Sets a regexp validator. Any value that does not pass regExp.test(val) will fail validation.
           * @param regExp regular expression to test against
           * @param message optional custom error message
           */
  def `match`(regExp: stdLib.RegExp): this.type = js.native
  /**
           * Sets a regexp validator. Any value that does not pass regExp.test(val) will fail validation.
           * @param regExp regular expression to test against
           * @param message optional custom error message
           */
  def `match`(regExp: stdLib.RegExp, message: java.lang.String): this.type = js.native
  /**
           * Sets a maximum length validator.
           * @param value maximum string length
           * @param message optional custom error message
           */
  def maxlength(value: scala.Double): this.type = js.native
  /**
           * Sets a maximum length validator.
           * @param value maximum string length
           * @param message optional custom error message
           */
  def maxlength(value: scala.Double, message: java.lang.String): this.type = js.native
  /**
           * Sets a minimum length validator.
           * @param value minimum string length
           * @param message optional custom error message
           */
  def minlength(value: scala.Double): this.type = js.native
  /**
           * Sets a minimum length validator.
           * @param value minimum string length
           * @param message optional custom error message
           */
  def minlength(value: scala.Double, message: java.lang.String): this.type = js.native
  /** Adds a trim setter. The string value will be trimmed when set. */
  def trim(): this.type = js.native
  /** Adds an uppercase setter. */
  def uppercase(): this.type = js.native
}

