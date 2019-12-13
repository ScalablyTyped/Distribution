package typings.parquetjs.libSchemaDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parquetjs.libSchemaDotInterfaceMod.SingleFieldInterface
  - typings.parquetjs.libSchemaDotInterfaceMod.NestedFieldsInterface
*/
trait SchemaInterfaceField extends js.Object

object SchemaInterfaceField {
  @scala.inline
  def SingleFieldInterface(
    `type`: String,
    bitWidth: Int | Double = null,
    encoding: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    repeated: js.UndefOr[Boolean] = js.undefined
  ): SchemaInterfaceField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bitWidth != null) __obj.updateDynamic("bitWidth")(bitWidth.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(repeated)) __obj.updateDynamic("repeated")(repeated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterfaceField]
  }
  @scala.inline
  def NestedFieldsInterface(
    fields: SchemaInterface,
    optional: js.UndefOr[Boolean] = js.undefined,
    repeated: js.UndefOr[Boolean] = js.undefined
  ): SchemaInterfaceField = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(repeated)) __obj.updateDynamic("repeated")(repeated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterfaceField]
  }
}

