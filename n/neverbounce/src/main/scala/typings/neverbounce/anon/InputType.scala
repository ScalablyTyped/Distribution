package typings.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputType extends js.Object {
  var inputType: Remote = js.native
  var status: Complete = js.native
}

object InputType {
  @scala.inline
  def apply(inputType: Remote, status: Complete): InputType = {
    val __obj = js.Dynamic.literal(inputType = inputType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputType]
  }
  @scala.inline
  implicit class InputTypeOps[Self <: InputType] (val x: Self) extends AnyVal {
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
    def setInputType(value: Remote): Self = this.set("inputType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Complete): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

