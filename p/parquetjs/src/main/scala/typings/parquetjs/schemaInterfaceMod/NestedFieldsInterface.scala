package typings.parquetjs.schemaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedFieldsInterface extends SchemaInterfaceField {
  var fields: SchemaInterface = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var repeated: js.UndefOr[Boolean] = js.native
}

object NestedFieldsInterface {
  @scala.inline
  def apply(fields: SchemaInterface): NestedFieldsInterface = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedFieldsInterface]
  }
  @scala.inline
  implicit class NestedFieldsInterfaceOps[Self <: NestedFieldsInterface] (val x: Self) extends AnyVal {
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
    def setFields(value: SchemaInterface): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setRepeated(value: Boolean): Self = this.set("repeated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeated: Self = this.set("repeated", js.undefined)
  }
  
}

