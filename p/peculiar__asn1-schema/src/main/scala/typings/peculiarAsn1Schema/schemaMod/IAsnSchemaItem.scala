package typings.peculiarAsn1Schema.schemaMod

import typings.peculiarAsn1Schema.decoratorsMod.AsnRepeatType
import typings.peculiarAsn1Schema.enumsMod.AsnPropTypes
import typings.peculiarAsn1Schema.typesMod.IAsnConverter
import typings.peculiarAsn1Schema.typesMod.IEmptyConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsnSchemaItem extends js.Object {
  var context: js.UndefOr[Double] = js.undefined
  var converter: js.UndefOr[IAsnConverter[_, _]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var `implicit`: js.UndefOr[Boolean] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var repeated: js.UndefOr[AsnRepeatType] = js.undefined
  var `type`: AsnPropTypes | IEmptyConstructor[_]
}

object IAsnSchemaItem {
  @scala.inline
  def apply(
    `type`: AsnPropTypes | IEmptyConstructor[_],
    context: js.UndefOr[Double] = js.undefined,
    converter: IAsnConverter[_, _] = null,
    defaultValue: js.Any = null,
    `implicit`: js.UndefOr[Boolean] = js.undefined,
    optional: js.UndefOr[Boolean] = js.undefined,
    repeated: AsnRepeatType = null
  ): IAsnSchemaItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.get.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(`implicit`)) __obj.updateDynamic("implicit")(`implicit`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (repeated != null) __obj.updateDynamic("repeated")(repeated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsnSchemaItem]
  }
}

