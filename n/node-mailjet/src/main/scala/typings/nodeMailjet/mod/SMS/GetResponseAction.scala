package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResponseAction extends js.Object {
  val body: GetResponseActionData = js.native
}

object GetResponseAction {
  @scala.inline
  def apply(body: GetResponseActionData): GetResponseAction = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseAction]
  }
  @scala.inline
  implicit class GetResponseActionOps[Self <: GetResponseAction] (val x: Self) extends AnyVal {
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
    def setBody(value: GetResponseActionData): Self = this.set("body", value.asInstanceOf[js.Any])
  }
  
}

