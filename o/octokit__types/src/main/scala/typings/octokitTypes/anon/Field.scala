package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  var code: String = js.native
  var field: String = js.native
  var resource: String = js.native
}

object Field {
  @scala.inline
  def apply(code: String, field: String, resource: String): Field = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
  
}

