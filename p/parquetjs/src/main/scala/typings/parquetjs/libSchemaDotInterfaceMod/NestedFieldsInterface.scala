package typings.parquetjs.libSchemaDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedFieldsInterface extends SchemaInterfaceField {
  var fields: SchemaInterface
  var optional: js.UndefOr[Boolean] = js.undefined
  var repeated: js.UndefOr[Boolean] = js.undefined
}

object NestedFieldsInterface {
  @scala.inline
  def apply(
    fields: SchemaInterface,
    optional: js.UndefOr[Boolean] = js.undefined,
    repeated: js.UndefOr[Boolean] = js.undefined
  ): NestedFieldsInterface = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(repeated)) __obj.updateDynamic("repeated")(repeated.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedFieldsInterface]
  }
}

