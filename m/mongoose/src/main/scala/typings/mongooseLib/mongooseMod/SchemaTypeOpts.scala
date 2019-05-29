package typings
package mongooseLib.mongooseMod

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
trait SchemaTypeOpts[T]
  extends /* other */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  /** ObjectId only - Adds an auto-generated ObjectId default if turnOn is true. */
  var auto: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  /** Sets a default value for this SchemaType. */
  var default: js.UndefOr[mongooseLib.mongooseMod.SchemaTypeOptsNs.DefaultFn[T] | T] = js.undefined
  /* Options for specific schema types (String, Number, Date, etc.) */
  /** String only - Adds an enum validator */
  var enum: js.UndefOr[js.Array[T] | mongooseLib.mongooseMod.SchemaTypeOptsNs.EnumOpts[T] | js.Any] = js.undefined
  /**
    * Date only - Declares a TTL index (rounded to the nearest second)
    * for Date types only.
    */
  var expires: js.UndefOr[scala.Double | java.lang.String | js.Any] = js.undefined
  /**
    * Getters allow you to transform the representation of the data as it travels
    * from the raw mongodb document to the value that you see.
    */
  var get: js.UndefOr[js.Function2[/* value */ T, /* schematype */ js.UndefOr[this.type], T | _]] = js.undefined
  /** Declares the index options for this schematype. */
  var index: js.UndefOr[
    mongooseLib.mongooseMod.SchemaTypeOptsNs.IndexOpts | scala.Boolean | java.lang.String
  ] = js.undefined
  /** String only - Adds a lowercase setter. */
  var lowercase: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  /** String only - Sets a regexp validator. */
  var `match`: js.UndefOr[stdLib.RegExp | (js.Tuple2[stdLib.RegExp, java.lang.String]) | js.Any] = js.undefined
  /**
    * Date, Number only - Sets a maximum number validator.
    * Sets a maximum date validator.
    */
  var max: js.UndefOr[
    scala.Double | (js.Tuple2[stdLib.Date | scala.Double, java.lang.String]) | stdLib.Date | js.Any
  ] = js.undefined
  /** String only - Sets a maximum length validator. */
  var maxlength: js.UndefOr[scala.Double | (js.Tuple2[scala.Double, java.lang.String]) | js.Any] = js.undefined
  /**
    * Date, Number only - Sets a minimum number validator.
    * Sets a minimum date validator.
    */
  var min: js.UndefOr[
    scala.Double | (js.Tuple2[stdLib.Date | scala.Double, java.lang.String]) | stdLib.Date | js.Any
  ] = js.undefined
  /** String only - Sets a minimum length validator. */
  var minlength: js.UndefOr[scala.Double | (js.Tuple2[scala.Double, java.lang.String]) | js.Any] = js.undefined
  /**
    * Adds a required validator to this SchemaType. The validator gets added
    * to the front of this SchemaType's validators array using unshift().
    */
  var required: js.UndefOr[
    mongooseLib.mongooseMod.SchemaTypeOptsNs.RequiredFn[T] | scala.Boolean | (js.Tuple2[scala.Boolean | java.lang.String, java.lang.String]) | java.lang.String | js.Any
  ] = js.undefined
  /**
    * Sets default select() behavior for this path.
    * Set to true if this path should always be included in the results, false
    * if it should be excluded by default. This setting can be overridden at
    * the query level.
    */
  var select: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  /**
    * Setters allow you to transform the data before it gets to the raw mongodb
    * document and is set as a value on an actual key.
    */
  var set: js.UndefOr[js.Function2[/* value */ T, /* schematype */ js.UndefOr[this.type], T | _]] = js.undefined
  /** Declares a sparse index. */
  var sparse: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  /** Declares a full text index. */
  var text: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  /** String only - Adds a trim setter. */
  var trim: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  /* Common Options for all schema types */
  var `type`: js.UndefOr[T] = js.undefined
  /** Declares an unique index. */
  var unique: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  /** String only - Adds an uppercase setter. */
  var uppercase: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  /**
    * Adds validator(s) for this document path.
    * Validators always receive the value to validate as their first argument
    * and must return Boolean. Returning false means validation failed.
    */
  var validate: js.UndefOr[
    stdLib.RegExp | (js.Tuple2[
      stdLib.RegExp | mongooseLib.mongooseMod.SchemaTypeOptsNs.ValidateFn[T], 
      java.lang.String
    ]) | mongooseLib.mongooseMod.SchemaTypeOptsNs.ValidateFn[T] | mongooseLib.mongooseMod.SchemaTypeOptsNs.ValidateOpts | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncValidateOpts | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncPromiseValidationFn[T] | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncPromiseValidationOpts | (js.Array[
      mongooseLib.mongooseMod.SchemaTypeOptsNs.ValidateOpts | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncValidateOpts | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncPromiseValidationFn[T] | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncPromiseValidationOpts
    ])
  ] = js.undefined
}

object SchemaTypeOpts {
  @scala.inline
  def apply[T](
    StringDictionary: /* other */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    alias: java.lang.String = null,
    auto: scala.Boolean | js.Any = null,
    default: mongooseLib.mongooseMod.SchemaTypeOptsNs.DefaultFn[T] | T = null,
    enum: js.Array[T] | mongooseLib.mongooseMod.SchemaTypeOptsNs.EnumOpts[T] | js.Any = null,
    expires: scala.Double | java.lang.String | js.Any = null,
    get: (/* value */ T, /* schematype */ js.UndefOr[SchemaTypeOpts[T]]) => T | _ = null,
    index: mongooseLib.mongooseMod.SchemaTypeOptsNs.IndexOpts | scala.Boolean | java.lang.String = null,
    lowercase: scala.Boolean | js.Any = null,
    `match`: stdLib.RegExp | (js.Tuple2[stdLib.RegExp, java.lang.String]) | js.Any = null,
    max: scala.Double | (js.Tuple2[stdLib.Date | scala.Double, java.lang.String]) | stdLib.Date | js.Any = null,
    maxlength: scala.Double | (js.Tuple2[scala.Double, java.lang.String]) | js.Any = null,
    min: scala.Double | (js.Tuple2[stdLib.Date | scala.Double, java.lang.String]) | stdLib.Date | js.Any = null,
    minlength: scala.Double | (js.Tuple2[scala.Double, java.lang.String]) | js.Any = null,
    required: mongooseLib.mongooseMod.SchemaTypeOptsNs.RequiredFn[T] | scala.Boolean | (js.Tuple2[scala.Boolean | java.lang.String, java.lang.String]) | java.lang.String | js.Any = null,
    select: scala.Boolean | js.Any = null,
    set: (/* value */ T, /* schematype */ js.UndefOr[SchemaTypeOpts[T]]) => T | _ = null,
    sparse: scala.Boolean | js.Any = null,
    text: scala.Boolean | js.Any = null,
    trim: scala.Boolean | js.Any = null,
    `type`: T = null,
    unique: scala.Boolean | js.Any = null,
    uppercase: scala.Boolean | js.Any = null,
    validate: stdLib.RegExp | (js.Tuple2[
      stdLib.RegExp | mongooseLib.mongooseMod.SchemaTypeOptsNs.ValidateFn[T], 
      java.lang.String
    ]) | mongooseLib.mongooseMod.SchemaTypeOptsNs.ValidateFn[T] | mongooseLib.mongooseMod.SchemaTypeOptsNs.ValidateOpts | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncValidateOpts | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncPromiseValidationFn[T] | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncPromiseValidationOpts | (js.Array[
      mongooseLib.mongooseMod.SchemaTypeOptsNs.ValidateOpts | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncValidateOpts | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncPromiseValidationFn[T] | mongooseLib.mongooseMod.SchemaTypeOptsNs.AsyncPromiseValidationOpts
    ]) = null
  ): SchemaTypeOpts[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alias != null) __obj.updateDynamic("alias")(alias)
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
    __obj.asInstanceOf[SchemaTypeOpts[T]]
  }
}

