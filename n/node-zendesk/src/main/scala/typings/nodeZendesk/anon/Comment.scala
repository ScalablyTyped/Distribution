package typings.nodeZendesk.anon

import typings.nodeZendesk.mod.Tickets.CreateModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  var comment: Body = js.native
  var ticket: CreateModel = js.native
}

object Comment {
  @scala.inline
  def apply(comment: Body, ticket: CreateModel): Comment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def setComment(value: Body): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicket(value: CreateModel): Self = this.set("ticket", value.asInstanceOf[js.Any])
  }
  
}

