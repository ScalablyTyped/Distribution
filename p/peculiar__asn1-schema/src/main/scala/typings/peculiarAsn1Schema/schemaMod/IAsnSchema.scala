package typings.peculiarAsn1Schema.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.peculiarAsn1Schema.enumsMod.AsnPropTypes
import typings.peculiarAsn1Schema.enumsMod.AsnTypeTypes
import typings.peculiarAsn1Schema.typesMod.IEmptyConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsnSchema extends js.Object {
  var itemType: AsnPropTypes | IEmptyConstructor[_]
  var items: StringDictionary[IAsnSchemaItem]
  var schema: js.UndefOr[js.Any] = js.undefined
  var `type`: AsnTypeTypes
}

object IAsnSchema {
  @scala.inline
  def apply(
    itemType: AsnPropTypes | IEmptyConstructor[_],
    items: StringDictionary[IAsnSchemaItem],
    `type`: AsnTypeTypes,
    schema: js.Any = null
  ): IAsnSchema = {
    val __obj = js.Dynamic.literal(itemType = itemType.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsnSchema]
  }
}

