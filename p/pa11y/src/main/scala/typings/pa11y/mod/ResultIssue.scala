package typings.pa11y.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultIssue extends js.Object {
  var code: String = js.native
  var context: String = js.native
  var message: String = js.native
  var selector: String = js.native
  var `type`: String = js.native
  var typeCode: Double = js.native
}

object ResultIssue {
  @scala.inline
  def apply(code: String, context: String, message: String, selector: String, `type`: String, typeCode: Double): ResultIssue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeCode = typeCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultIssue]
  }
  @scala.inline
  implicit class ResultIssueOps[Self <: ResultIssue] (val x: Self) extends AnyVal {
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeCode(value: Double): Self = this.set("typeCode", value.asInstanceOf[js.Any])
  }
  
}

