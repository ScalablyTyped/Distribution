package typings.parquetjs.schemaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleFieldInterface extends SchemaInterfaceField {
  var bitWidth: js.UndefOr[Double] = js.native
  var encoding: js.UndefOr[String] = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var repeated: js.UndefOr[Boolean] = js.native
  var `type`: String = js.native
}

object SingleFieldInterface {
  @scala.inline
  def apply(`type`: String): SingleFieldInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleFieldInterface]
  }
  @scala.inline
  implicit class SingleFieldInterfaceOps[Self <: SingleFieldInterface] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitWidth(value: Double): Self = this.set("bitWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitWidth: Self = this.set("bitWidth", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
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

