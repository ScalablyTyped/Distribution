package typings.peculiarJsonSchema.decoratorsMod

import typings.peculiarJsonSchema.propTypesMod.JsonPropTypes
import typings.peculiarJsonSchema.typesMod.IEmptyConstructor
import typings.peculiarJsonSchema.typesMod.IJsonConverter
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonPropOptions extends js.Object {
  var converter: js.UndefOr[IJsonConverter[_, _]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * Defines a list of acceptable values
    */
  var enumeration: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specifies the exact number of characters or list items allowed. Must be equal to or greater than zero
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the upper bounds for numeric values (the value must be less than this value)
    */
  var maxExclusive: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the upper bounds for numeric values (the value must be less than or equal to this value)
    */
  var maxInclusive: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the maximum number of characters or list items allowed. Must be equal to or greater than zero
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the lower bounds for numeric values (the value must be greater than this value)
    */
  var minExclusive: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the lower bounds for numeric values (the value must be greater than or equal to this value)
    */
  var minInclusive: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the minimum number of characters or list items allowed. Must be equal to or greater than zero
    */
  var minLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines regular expression for text
    */
  var pattern: js.UndefOr[String | RegExp] = js.undefined
  var repeated: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines name of schema
    */
  var schema: js.UndefOr[String | js.Array[String]] = js.undefined
  var `type`: js.UndefOr[JsonPropTypes | IEmptyConstructor[_]] = js.undefined
}

object IJsonPropOptions {
  @scala.inline
  def apply(
    converter: IJsonConverter[_, _] = null,
    defaultValue: js.Any = null,
    enumeration: js.Array[String] = null,
    length: js.UndefOr[Double] = js.undefined,
    maxExclusive: js.UndefOr[Double] = js.undefined,
    maxInclusive: js.UndefOr[Double] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    minExclusive: js.UndefOr[Double] = js.undefined,
    minInclusive: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    name: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    pattern: String | RegExp = null,
    repeated: js.UndefOr[Boolean] = js.undefined,
    schema: String | js.Array[String] = null,
    `type`: JsonPropTypes | IEmptyConstructor[_] = null
  ): IJsonPropOptions = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (enumeration != null) __obj.updateDynamic("enumeration")(enumeration.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxExclusive)) __obj.updateDynamic("maxExclusive")(maxExclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInclusive)) __obj.updateDynamic("maxInclusive")(maxInclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minExclusive)) __obj.updateDynamic("minExclusive")(minExclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minInclusive)) __obj.updateDynamic("minInclusive")(minInclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(repeated)) __obj.updateDynamic("repeated")(repeated.get.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonPropOptions]
  }
}

