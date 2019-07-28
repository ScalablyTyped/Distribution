package typings.parquetjs.libMetadataDotInterfaceMod

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
    field_id: Int | Double = null,
    num_children: Int | Double = null,
    precision: Int | Double = null,
    repetition_type: String = null,
    scale: Int | Double = null,
    `type`: Int | Double = null,
    type_length: Int | Double = null
  ): MetadataSchemaInterface = {
    val __obj = js.Dynamic.literal(name = name)
    if (converted_type != null) __obj.updateDynamic("converted_type")(converted_type)
    if (field_id != null) __obj.updateDynamic("field_id")(field_id.asInstanceOf[js.Any])
    if (num_children != null) __obj.updateDynamic("num_children")(num_children.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (repetition_type != null) __obj.updateDynamic("repetition_type")(repetition_type)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (type_length != null) __obj.updateDynamic("type_length")(type_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataSchemaInterface]
  }
}

