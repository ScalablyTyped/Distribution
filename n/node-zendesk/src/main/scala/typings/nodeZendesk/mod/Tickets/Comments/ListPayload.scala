package typings.nodeZendesk.mod.Tickets.Comments

import typings.nodeZendesk.mod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPayload extends PaginablePayload {
  var comments: js.Array[ResponseModel] = js.native
}

object ListPayload {
  @scala.inline
  def apply(comments: js.Array[ResponseModel], count: Double): ListPayload = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
  @scala.inline
  implicit class ListPayloadOps[Self <: ListPayload] (val x: Self) extends AnyVal {
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
    def setCommentsVarargs(value: ResponseModel*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[ResponseModel]): Self = this.set("comments", value.asInstanceOf[js.Any])
  }
  
}

