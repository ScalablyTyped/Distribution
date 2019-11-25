package typings.parquetjs.libSchemaDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedFieldsInterface extends js.Object {
  var fields: SchemaInterface
  var repeated: Boolean
}

object NestedFieldsInterface {
  @scala.inline
  def apply(fields: SchemaInterface, repeated: Boolean): NestedFieldsInterface = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NestedFieldsInterface]
  }
}

