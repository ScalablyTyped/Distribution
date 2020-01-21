package typings.nodeZendesk

import typings.nodeZendesk.mod.Tickets.CreateModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComment extends js.Object {
  var comment: AnonBody
  var ticket: CreateModel
}

object AnonComment {
  @scala.inline
  def apply(comment: AnonBody, ticket: CreateModel): AnonComment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComment]
  }
}

