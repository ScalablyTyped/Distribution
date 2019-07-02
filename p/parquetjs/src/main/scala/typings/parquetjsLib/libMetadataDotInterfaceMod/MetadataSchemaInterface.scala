package typings
package parquetjsLib.libMetadataDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataSchemaInterface extends js.Object {
  var converted_type: java.lang.String | scala.Null
  var field_id: scala.Double | scala.Null
  var name: java.lang.String
  var num_children: scala.Double | scala.Null
  var precision: scala.Double | scala.Null
  var repetition_type: java.lang.String | scala.Null
  var scale: scala.Double | scala.Null
  var `type`: scala.Double | scala.Null
  var type_length: scala.Double | scala.Null
}

object MetadataSchemaInterface {
  @scala.inline
  def apply(
    name: java.lang.String,
    converted_type: java.lang.String = null,
    field_id: scala.Int | scala.Double = null,
    num_children: scala.Int | scala.Double = null,
    precision: scala.Int | scala.Double = null,
    repetition_type: java.lang.String = null,
    scale: scala.Int | scala.Double = null,
    `type`: scala.Int | scala.Double = null,
    type_length: scala.Int | scala.Double = null
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

