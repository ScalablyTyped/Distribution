package typings
package parquetjsLib.libSchemaDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedFieldsInterface extends js.Object {
  var fields: SchemaInterface
  var repeated: scala.Boolean
}

object NestedFieldsInterface {
  @scala.inline
  def apply(fields: SchemaInterface, repeated: scala.Boolean): NestedFieldsInterface = {
    val __obj = js.Dynamic.literal(fields = fields, repeated = repeated)
  
    __obj.asInstanceOf[NestedFieldsInterface]
  }
}

