package typings.nodeZendesk.anon

import typings.nodeZendesk.mod.Tickets.CreateModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var comment: Body
  var ticket: CreateModel
}

object Comment {
  @scala.inline
  def apply(comment: Body, ticket: CreateModel): Comment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

