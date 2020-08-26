package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetails extends js.Object {
  val field: String = js.native
  val issue: String = js.native
}

object ErrorDetails {
  @scala.inline
  def apply(field: String, issue: String): ErrorDetails = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
  @scala.inline
  implicit class ErrorDetailsOps[Self <: ErrorDetails] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssue(value: String): Self = this.set("issue", value.asInstanceOf[js.Any])
  }
  
}

