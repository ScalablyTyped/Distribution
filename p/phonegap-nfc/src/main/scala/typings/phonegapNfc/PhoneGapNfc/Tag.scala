package typings.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  var date: String = js.native
  var id: js.Array[Double] = js.native
  var techTypes: js.Array[String] = js.native
  var `type`: String = js.native
}

object Tag {
  @scala.inline
  def apply(date: String, id: js.Array[Double], techTypes: js.Array[String], `type`: String): Tag = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], techTypes = techTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdVarargs(value: Double*): Self = this.set("id", js.Array(value :_*))
    @scala.inline
    def setId(value: js.Array[Double]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTechTypesVarargs(value: String*): Self = this.set("techTypes", js.Array(value :_*))
    @scala.inline
    def setTechTypes(value: js.Array[String]): Self = this.set("techTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

