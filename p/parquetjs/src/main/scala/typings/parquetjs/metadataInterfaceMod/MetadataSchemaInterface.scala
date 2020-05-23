package typings.parquetjs.metadataInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataSchemaInterface extends js.Object {
  var converted_type: String | Null
  var field_id: Double | Null
  var name: String
  var num_children: Double | Null
  var precision: Double | Null
  var repetition_type: String | Null
  var scale: Double | Null
  var `type`: Double | Null
  var type_length: Double | Null
}

object MetadataSchemaInterface {
  @scala.inline
  def apply(
    name: String,
    converted_type: String = null,
    field_id: Double = null.asInstanceOf[Double],
    num_children: Double = null.asInstanceOf[Double],
    precision: Double = null.asInstanceOf[Double],
    repetition_type: String = null,
    scale: Double = null.asInstanceOf[Double],
    `type`: Double = null.asInstanceOf[Double],
    type_length: Double = null.asInstanceOf[Double]
  ): MetadataSchemaInterface = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], converted_type = converted_type.asInstanceOf[js.Any], field_id = field_id.asInstanceOf[js.Any], num_children = num_children.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], repetition_type = repetition_type.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], type_length = type_length.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataSchemaInterface]
  }
}

