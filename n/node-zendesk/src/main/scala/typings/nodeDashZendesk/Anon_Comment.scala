package typings.nodeDashZendesk

import typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.CreateModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  var comment: Anon_Body
  var ticket: CreateModel
}

object Anon_Comment {
  @scala.inline
  def apply(comment: Anon_Body, ticket: CreateModel): Anon_Comment = {
    val __obj = js.Dynamic.literal(comment = comment, ticket = ticket)
  
    __obj.asInstanceOf[Anon_Comment]
  }
}

