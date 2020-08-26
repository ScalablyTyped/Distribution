package typings.parquetjs.metadataInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataSchemaInterface extends js.Object {
  var converted_type: String | Null = js.native
  var field_id: Double | Null = js.native
  var name: String = js.native
  var num_children: Double | Null = js.native
  var precision: Double | Null = js.native
  var repetition_type: String | Null = js.native
  var scale: Double | Null = js.native
  var `type`: Double | Null = js.native
  var type_length: Double | Null = js.native
}

object MetadataSchemaInterface {
  @scala.inline
  def apply(name: String): MetadataSchemaInterface = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataSchemaInterface]
  }
  @scala.inline
  implicit class MetadataSchemaInterfaceOps[Self <: MetadataSchemaInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setConverted_type(value: String): Self = this.set("converted_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConverted_typeNull: Self = this.set("converted_type", null)
    @scala.inline
    def setField_id(value: Double): Self = this.set("field_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setField_idNull: Self = this.set("field_id", null)
    @scala.inline
    def setNum_children(value: Double): Self = this.set("num_children", value.asInstanceOf[js.Any])
    @scala.inline
    def setNum_childrenNull: Self = this.set("num_children", null)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrecisionNull: Self = this.set("precision", null)
    @scala.inline
    def setRepetition_type(value: String): Self = this.set("repetition_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepetition_typeNull: Self = this.set("repetition_type", null)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleNull: Self = this.set("scale", null)
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    @scala.inline
    def setType_length(value: Double): Self = this.set("type_length", value.asInstanceOf[js.Any])
    @scala.inline
    def setType_lengthNull: Self = this.set("type_length", null)
  }
  
}

