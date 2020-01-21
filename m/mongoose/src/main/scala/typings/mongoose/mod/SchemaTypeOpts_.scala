package typings.mongoose.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongoose.mod.SchemaTypeOpts.AsyncPromiseValidationFn
import typings.mongoose.mod.SchemaTypeOpts.AsyncPromiseValidationOpts
import typings.mongoose.mod.SchemaTypeOpts.AsyncValidateOpts
import typings.mongoose.mod.SchemaTypeOpts.DefaultFn
import typings.mongoose.mod.SchemaTypeOpts.EnumOpts
import typings.mongoose.mod.SchemaTypeOpts.IndexOpts
import typings.mongoose.mod.SchemaTypeOpts.RequiredFn
import typings.mongoose.mod.SchemaTypeOpts.ValidateFn
import typings.mongoose.mod.SchemaTypeOpts.ValidateOpts
import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * The standard options available when configuring a schema type:
  * new Schema({
  *   name: {
  *     type: String,
  *     required: true,
  *     ...
  *   }
  * });
  *
  * Note: the properties have Object as a fallback type: | Object
  *   because this interface does not apply to a schematype that
  *   does not have a type property. Ex:
  * new Schema({
  *   name: {
  *     first: String,    // since name does not have a "type" property
  *     last: String      //   first and last can have any valid type
  *     ...
  *   }
  * });
  *
  * References:
  * - http://mongoosejs.com/docs/schematypes.html
  * - http://mongoosejs.com/docs/api.html#schema_Schema.Types
  */
trait SchemaTypeOpts_[T]
  extends /* other */ StringDictionary[js.Any] {
  var alias: js.UndefOr[String] = js.undefined
  /** ObjectId only - Adds an auto-generated ObjectId default if turnOn is true. */
  var auto: js.UndefOr[Boolean | js.Any] = js.undefined
  /** Sets a default value for this SchemaType. */
  var default: js.UndefOr[DefaultFn[T] | T] = js.undefined
  /* Options for specific schema types (String, Number, Date, etc.) */
  /** String only - Adds an enum validator */
  var enum: js.UndefOr[js.Array[T] | EnumOpts[T] | js.Any] = js.undefined
  /**
    * Date only - Declares a TTL index (rounded to the nearest second)
    * for Date types only.
    */
  var expires: js.UndefOr[Double | String | js.Any] = js.undefined
  /**
    * Getters allow you to transform the representation of the data as it travels
    * from the raw mongodb document to the value that you see.
    */
  var get: js.UndefOr[js.Function2[/* value */ T, /* schematype */ js.UndefOr[this.type], T | _]] = js.undefined
  /** Declares the index options for this schematype. */
  var index: js.UndefOr[IndexOpts | Boolean | String] = js.undefined
  /** String only - Adds a lowercase setter. */
  var lowercase: js.UndefOr[Boolean | js.Any] = js.undefined
  /** String only - Sets a regexp validator. */
  var `match`: js.UndefOr[RegExp | (js.Tuple2[RegExp, String]) | js.Any] = js.undefined
  /**
    * Date, Number only - Sets a maximum number validator.
    * Sets a maximum date validator.
    */
  var max: js.UndefOr[Double | (js.Tuple2[Date | Double, String]) | Date | js.Any] = js.undefined
  /** String only - Sets a maximum length validator. */
  var maxlength: js.UndefOr[Double | (js.Tuple2[Double, String]) | js.Any] = js.undefined
  /**
    * Date, Number only - Sets a minimum number validator.
    * Sets a minimum date validator.
    */
  var min: js.UndefOr[Double | (js.Tuple2[Date | Double, String]) | Date | js.Any] = js.undefined
  /** String only - Sets a minimum length validator. */
  var minlength: js.UndefOr[Double | (js.Tuple2[Double, String]) | js.Any] = js.undefined
  /** Map only - Specifies the type of the map's attributes */
  var of: js.UndefOr[js.Any] = js.undefined
  /**
    * Adds a required validator to this SchemaType. The validator gets added
    * to the front of this SchemaType's validators array using unshift().
    */
  var required: js.UndefOr[
    RequiredFn[T] | Boolean | (js.Tuple2[Boolean | String, String]) | String | js.Any
  ] = js.undefined
  /**
    * Sets default select() behavior for this path.
    * Set to true if this path should always be included in the results, false
    * if it should be excluded by default. This setting can be overridden at
    * the query level.
    */
  var select: js.UndefOr[Boolean | js.Any] = js.undefined
  /**
    * Setters allow you to transform the data before it gets to the raw mongodb
    * document and is set as a value on an actual key.
    */
  var set: js.UndefOr[js.Function2[/* value */ T, /* schematype */ js.UndefOr[this.type], T | _]] = js.undefined
  /** Declares a sparse index. */
  var sparse: js.UndefOr[Boolean | js.Any] = js.undefined
  /** Declares a full text index. */
  var text: js.UndefOr[Boolean | js.Any] = js.undefined
  /** String only - Adds a trim setter. */
  var trim: js.UndefOr[Boolean | js.Any] = js.undefined
  /* Common Options for all schema types */
  var `type`: js.UndefOr[T] = js.undefined
  /** Declares an unique index. */
  var unique: js.UndefOr[Boolean | js.Any] = js.undefined
  /** String only - Adds an uppercase setter. */
  var uppercase: js.UndefOr[Boolean | js.Any] = js.undefined
  /**
    * Adds validator(s) for this document path.
    * Validators always receive the value to validate as their first argument
    * and must return Boolean. Returning false means validation failed.
    */
  var validate: js.UndefOr[
    RegExp | (js.Tuple2[AsyncPromiseValidationFn[T] | RegExp | ValidateFn[T], String]) | ValidateFn[T] | ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts | (js.Array[
      ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts
    ])
  ] = js.undefined
}

object SchemaTypeOpts_ {
  @scala.inline
  def apply[T](
    StringDictionary: /* other */ StringDictionary[js.Any] = null,
    alias: String = null,
    auto: Boolean | js.Any = null,
    default: DefaultFn[T] | T = null,
    enum: js.Array[T] | EnumOpts[T] | js.Any = null,
    expires: Double | String | js.Any = null,
    get: (/* value */ T, /* schematype */ js.UndefOr[SchemaTypeOpts_[T]]) => T | _ = null,
    index: IndexOpts | Boolean | String = null,
    lowercase: Boolean | js.Any = null,
    `match`: RegExp | (js.Tuple2[RegExp, String]) | js.Any = null,
    max: Double | (js.Tuple2[Date | Double, String]) | Date | js.Any = null,
    maxlength: Double | (js.Tuple2[Double, String]) | js.Any = null,
    min: Double | (js.Tuple2[Date | Double, String]) | Date | js.Any = null,
    minlength: Double | (js.Tuple2[Double, String]) | js.Any = null,
    of: js.Any = null,
    required: RequiredFn[T] | Boolean | (js.Tuple2[Boolean | String, String]) | String | js.Any = null,
    select: Boolean | js.Any = null,
    set: (/* value */ T, /* schematype */ js.UndefOr[SchemaTypeOpts_[T]]) => T | _ = null,
    sparse: Boolean | js.Any = null,
    text: Boolean | js.Any = null,
    trim: Boolean | js.Any = null,
    `type`: T = null,
    unique: Boolean | js.Any = null,
    uppercase: Boolean | js.Any = null,
    validate: RegExp | (js.Tuple2[AsyncPromiseValidationFn[T] | RegExp | ValidateFn[T], String]) | ValidateFn[T] | ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts | (js.Array[
      ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts
    ]) = null
  ): SchemaTypeOpts_[T] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (auto != null) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction2(get))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (lowercase != null) __obj.updateDynamic("lowercase")(lowercase.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (of != null) __obj.updateDynamic("of")(of.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2(set))
    if (sparse != null) __obj.updateDynamic("sparse")(sparse.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unique != null) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (uppercase != null) __obj.updateDynamic("uppercase")(uppercase.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTypeOpts_[T]]
  }
}

