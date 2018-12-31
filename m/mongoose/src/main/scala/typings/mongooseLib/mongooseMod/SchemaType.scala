package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schematype.js
  * http://mongoosejs.com/docs/api.html#schematype-js
  */
@js.native
trait SchemaType extends js.Object {
  /**
    * Sets a default value for this SchemaType.
    * Defaults can be either functions which return the value to use as the
    * default or the literal value itself. Either way, the value will be cast
    * based on its schema type before being set during document creation.
    * @param val the default value
    */
  def default(`val`: js.Any): js.Any = js.native
  /** Adds a getter to this schematype. */
  def get(fn: js.Function): this.type = js.native
  def index(options: java.lang.String): this.type = js.native
  /**
    * Declares the index options for this schematype.
    * Indexes are created in the background by default. Specify background: false to override.
    */
  def index(options: js.Any): this.type = js.native
  def index(options: scala.Boolean): this.type = js.native
  /**
    * Adds a required validator to this SchemaType. The validator gets added
    * to the front of this SchemaType's validators array using unshift().
    * @param required enable/disable the validator
    * @param message optional custom error message
    */
  def required(required: scala.Boolean): this.type = js.native
  def required(required: scala.Boolean, message: java.lang.String): this.type = js.native
  /** Sets default select() behavior for this path. */
  def select(`val`: scala.Boolean): this.type = js.native
  /** Adds a setter to this schematype. */
  def set(fn: js.Function): this.type = js.native
  /** Declares a sparse index. */
  def sparse(bool: scala.Boolean): this.type = js.native
  /** Declares a full text index. */
  def text(bool: scala.Boolean): this.type = js.native
  /** Declares an unique index. */
  def unique(bool: scala.Boolean): this.type = js.native
  def validate(obj: js.Any): this.type = js.native
  def validate(obj: js.Any, errorMsg: java.lang.String): this.type = js.native
  def validate(obj: js.Any, errorMsg: java.lang.String, `type`: java.lang.String): this.type = js.native
  def validate(obj: js.Function): this.type = js.native
  def validate(obj: js.Function, errorMsg: java.lang.String): this.type = js.native
  def validate(obj: js.Function, errorMsg: java.lang.String, `type`: java.lang.String): this.type = js.native
  /**
    * Adds validator(s) for this document path.
    * Validators always receive the value to validate as their first argument
    * and must return Boolean. Returning false means validation failed.
    * @param obj validator
    * @param errorMsg optional error message
    * @param type optional validator type
    */
  def validate(obj: stdLib.RegExp): this.type = js.native
  def validate(obj: stdLib.RegExp, errorMsg: java.lang.String): this.type = js.native
  def validate(obj: stdLib.RegExp, errorMsg: java.lang.String, `type`: java.lang.String): this.type = js.native
}

