package typings.mongoose.mongooseMod

import typings.std.RegExp
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
  def index(options: String): this.type = js.native
  /**
    * Declares the index options for this schematype.
    * Indexes are created in the background by default. Specify background: false to override.
    */
  def index(options: js.Any): this.type = js.native
  def index(options: Boolean): this.type = js.native
  /**
    * Adds a required validator to this SchemaType. The validator gets added
    * to the front of this SchemaType's validators array using unshift().
    * @param required enable/disable the validator
    * @param message optional custom error message
    */
  def required(required: Boolean): this.type = js.native
  def required(required: Boolean, message: String): this.type = js.native
  /** Sets default select() behavior for this path. */
  def select(`val`: Boolean): this.type = js.native
  /** Adds a setter to this schematype. */
  def set(fn: js.Function): this.type = js.native
  /** Declares a sparse index. */
  def sparse(bool: Boolean): this.type = js.native
  /** Declares a full text index. */
  def text(bool: Boolean): this.type = js.native
  /** Declares an unique index. */
  def unique(bool: Boolean): this.type = js.native
  def validate(obj: js.Any): this.type = js.native
  def validate(obj: js.Any, errorMsg: String): this.type = js.native
  def validate(obj: js.Any, errorMsg: String, `type`: String): this.type = js.native
  def validate(obj: js.Function): this.type = js.native
  def validate(obj: js.Function, errorMsg: String): this.type = js.native
  def validate(obj: js.Function, errorMsg: String, `type`: String): this.type = js.native
  /**
    * Adds validator(s) for this document path.
    * Validators always receive the value to validate as their first argument
    * and must return Boolean. Returning false means validation failed.
    * @param obj validator
    * @param errorMsg optional error message
    * @param type optional validator type
    */
  def validate(obj: RegExp): this.type = js.native
  def validate(obj: RegExp, errorMsg: String): this.type = js.native
  def validate(obj: RegExp, errorMsg: String, `type`: String): this.type = js.native
}

