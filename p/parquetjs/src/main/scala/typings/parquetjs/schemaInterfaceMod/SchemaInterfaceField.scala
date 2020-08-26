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
  def SingleFieldInterface(`type`: String): SchemaInterfaceField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterfaceField]
  }
  @scala.inline
  def NestedFieldsInterface(fields: SchemaInterface): SchemaInterfaceField = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterfaceField]
  }
}

