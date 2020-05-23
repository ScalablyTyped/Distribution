package typings.peculiarJsonSchema.schemaMod

import typings.peculiarJsonSchema.propTypesMod.JsonPropTypes
import typings.peculiarJsonSchema.typesMod.IEmptyConstructor
import typings.peculiarJsonSchema.typesMod.IJsonConverter
import typings.peculiarJsonSchema.typesMod.IValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonSchemaItem extends js.Object {
  var converter: js.UndefOr[IJsonConverter[_, _]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var repeated: js.UndefOr[Boolean] = js.undefined
  var `type`: JsonPropTypes | IEmptyConstructor[_]
  var validations: js.Array[IValidation]
}

object IJsonSchemaItem {
  @scala.inline
  def apply(
    `type`: JsonPropTypes | IEmptyConstructor[_],
    validations: js.Array[IValidation],
    converter: IJsonConverter[_, _] = null,
    defaultValue: js.Any = null,
    name: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    repeated: js.UndefOr[Boolean] = js.undefined
  ): IJsonSchemaItem = {
    val __obj = js.Dynamic.literal(validations = validations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeated)) __obj.updateDynamic("repeated")(repeated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonSchemaItem]
  }
}

