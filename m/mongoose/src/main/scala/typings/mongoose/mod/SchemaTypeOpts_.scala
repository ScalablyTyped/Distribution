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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait SchemaTypeOpts_[T]
  extends /* other */ StringDictionary[js.Any] {
  
  var alias: js.UndefOr[String] = js.native
  
  /** ObjectId only - Adds an auto-generated ObjectId default if turnOn is true. */
  var auto: js.UndefOr[Boolean | js.Any] = js.native
  
  /** Sets a default value for this SchemaType. */
  var default: js.UndefOr[DefaultFn[T] | T] = js.native
  
  /* Options for specific schema types (String, Number, Date, etc.) */
  /** String only - Adds an enum validator */
  var enum: js.UndefOr[js.Array[T] | EnumOpts[T] | js.Any] = js.native
  
  /**
    * Date only - Declares a TTL index (rounded to the nearest second)
    * for Date types only.
    */
  var expires: js.UndefOr[Double | String | js.Any] = js.native
  
  /**
    * Getters allow you to transform the representation of the data as it travels
    * from the raw mongodb document to the value that you see.
    */
  var get: js.UndefOr[js.Function2[/* value */ T, /* schematype */ js.UndefOr[this.type], T | _]] = js.native
  
  /** Declares the index options for this schematype. */
  var index: js.UndefOr[IndexOpts | Boolean | String] = js.native
  
  /** String only - Adds a lowercase setter. */
  var lowercase: js.UndefOr[Boolean | js.Any] = js.native
  
  /** String only - Sets a regexp validator. */
  var `match`: js.UndefOr[RegExp | (js.Tuple2[RegExp, String]) | js.Any] = js.native
  
  /**
    * Date, Number only - Sets a maximum number validator.
    * Sets a maximum date validator.
    */
  var max: js.UndefOr[Double | (js.Tuple2[Date | Double, String]) | Date | js.Any] = js.native
  
  /** String only - Sets a maximum length validator. */
  var maxlength: js.UndefOr[Double | (js.Tuple2[Double, String]) | js.Any] = js.native
  
  /**
    * Date, Number only - Sets a minimum number validator.
    * Sets a minimum date validator.
    */
  var min: js.UndefOr[Double | (js.Tuple2[Date | Double, String]) | Date | js.Any] = js.native
  
  /** String only - Sets a minimum length validator. */
  var minlength: js.UndefOr[Double | (js.Tuple2[Double, String]) | js.Any] = js.native
  
  /** Map only - Specifies the type of the map's attributes */
  var of: js.UndefOr[js.Any] = js.native
  
  /**
    * Adds a required validator to this SchemaType. The validator gets added
    * to the front of this SchemaType's validators array using unshift().
    */
  var required: js.UndefOr[
    RequiredFn[T] | Boolean | (js.Tuple2[Boolean | String, String]) | String | js.Any
  ] = js.native
  
  /**
    * Sets default select() behavior for this path.
    * Set to true if this path should always be included in the results, false
    * if it should be excluded by default. This setting can be overridden at
    * the query level.
    */
  var select: js.UndefOr[Boolean | js.Any] = js.native
  
  /**
    * Setters allow you to transform the data before it gets to the raw mongodb
    * document and is set as a value on an actual key.
    */
  var set: js.UndefOr[js.Function2[/* value */ T, /* schematype */ js.UndefOr[this.type], T | _]] = js.native
  
  /** Declares a sparse index. */
  var sparse: js.UndefOr[Boolean | js.Any] = js.native
  
  /** Declares a full text index. */
  var text: js.UndefOr[Boolean | js.Any] = js.native
  
  /** String only - Adds a trim setter. */
  var trim: js.UndefOr[Boolean | js.Any] = js.native
  
  /* Common Options for all schema types */
  var `type`: js.UndefOr[T] = js.native
  
  /** Declares an unique index. */
  var unique: js.UndefOr[Boolean | js.Any] = js.native
  
  /** String only - Adds an uppercase setter. */
  var uppercase: js.UndefOr[Boolean | js.Any] = js.native
  
  /**
    * Adds validator(s) for this document path.
    * Validators always receive the value to validate as their first argument
    * and must return Boolean. Returning false means validation failed.
    */
  var validate: js.UndefOr[
    RegExp | (js.Tuple2[AsyncPromiseValidationFn[T] | RegExp | ValidateFn[T], String]) | ValidateFn[T] | ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts | (js.Array[
      ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts
    ])
  ] = js.native
}
object SchemaTypeOpts_ {
  
  @scala.inline
  def apply[T](): SchemaTypeOpts_[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeOpts_[T]]
  }
  
  @scala.inline
  implicit class SchemaTypeOpts_Ops[Self <: SchemaTypeOpts_[_], T] (val x: Self with SchemaTypeOpts_[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAuto(value: Boolean | js.Any): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    
    @scala.inline
    def setDefaultFunction1(value: /* repeated */ js.Any => T): Self = this.set("default", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefault(value: DefaultFn[T] | T): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: T*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[T] | EnumOpts[T] | js.Any): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setExpires(value: Double | String | js.Any): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setGet(value: (/* value */ T, /* schematype */ js.UndefOr[SchemaTypeOpts_[T]]) => T | _): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setIndex(value: IndexOpts | Boolean | String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLowercase(value: Boolean | js.Any): Self = this.set("lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowercase: Self = this.set("lowercase", js.undefined)
    
    @scala.inline
    def setMatch(value: RegExp | (js.Tuple2[RegExp, String]) | js.Any): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setMax(value: Double | (js.Tuple2[Date | Double, String]) | Date | js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxlength(value: Double | (js.Tuple2[Double, String]) | js.Any): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    
    @scala.inline
    def setMin(value: Double | (js.Tuple2[Date | Double, String]) | Date | js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinlength(value: Double | (js.Tuple2[Double, String]) | js.Any): Self = this.set("minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinlength: Self = this.set("minlength", js.undefined)
    
    @scala.inline
    def setOf(value: js.Any): Self = this.set("of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOf: Self = this.set("of", js.undefined)
    
    @scala.inline
    def setRequiredFunction2(value: (/* required */ Boolean, /* message */ js.UndefOr[String]) => T): Self = this.set("required", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequired(value: RequiredFn[T] | Boolean | (js.Tuple2[Boolean | String, String]) | String | js.Any): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean | js.Any): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSet(value: (/* value */ T, /* schematype */ js.UndefOr[SchemaTypeOpts_[T]]) => T | _): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setSparse(value: Boolean | js.Any): Self = this.set("sparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSparse: Self = this.set("sparse", js.undefined)
    
    @scala.inline
    def setText(value: Boolean | js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean | js.Any): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean | js.Any): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setUppercase(value: Boolean | js.Any): Self = this.set("uppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUppercase: Self = this.set("uppercase", js.undefined)
    
    @scala.inline
    def setValidateVarargs(
      value: (ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts)*
    ): Self = this.set("validate", js.Array(value :_*))
    
    @scala.inline
    def setValidateFunction1(value: T => Boolean | js.Promise[Boolean]): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(
      value: RegExp | (js.Tuple2[AsyncPromiseValidationFn[T] | RegExp | ValidateFn[T], String]) | ValidateFn[T] | ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts | (js.Array[
          ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts
        ])
    ): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
