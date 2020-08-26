package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mapper extends BaseMapperType {
  var isConstant: js.UndefOr[Boolean] = js.native
  var nullable: js.UndefOr[Boolean] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var required: Boolean = js.native
  var serializedName: String = js.native
  var `type`: BaseMapperType = js.native
}

object Mapper {
  @scala.inline
  def apply(name: MapperType, required: Boolean, serializedName: String, `type`: BaseMapperType): Mapper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], serializedName = serializedName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapper]
  }
  @scala.inline
  implicit class MapperOps[Self <: Mapper] (val x: Self) extends AnyVal {
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
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerializedName(value: String): Self = this.set("serializedName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BaseMapperType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsConstant(value: Boolean): Self = this.set("isConstant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConstant: Self = this.set("isConstant", js.undefined)
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
  
}

