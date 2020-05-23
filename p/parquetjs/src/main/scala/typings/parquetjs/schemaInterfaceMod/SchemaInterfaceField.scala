package typings.parquetjs.schemaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parquetjs.schemaInterfaceMod.SingleFieldInterface
  - typings.parquetjs.schemaInterfaceMod.NestedFieldsInterface
*/
trait SchemaInterfaceField extends js.Object

object SchemaInterfaceField {
  @scala.inline
  def SingleFieldInterface(
    `type`: String,
    bitWidth: js.UndefOr[Double] = js.undefined,
    encoding: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    repeated: js.UndefOr[Boolean] = js.undefined
  ): SchemaInterfaceField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(bitWidth)) __obj.updateDynamic("bitWidth")(bitWidth.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeated)) __obj.updateDynamic("repeated")(repeated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterfaceField]
  }
  @scala.inline
  def NestedFieldsInterface(
    fields: SchemaInterface,
    optional: js.UndefOr[Boolean] = js.undefined,
    repeated: js.UndefOr[Boolean] = js.undefined
  ): SchemaInterfaceField = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeated)) __obj.updateDynamic("repeated")(repeated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterfaceField]
  }
}

