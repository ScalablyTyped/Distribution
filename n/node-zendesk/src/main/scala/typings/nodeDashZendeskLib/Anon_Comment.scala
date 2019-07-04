package typings
package nodeDashZendeskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  var comment: Anon_Body
  var ticket: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CreateModel
}

object Anon_Comment {
  @scala.inline
  def apply(comment: Anon_Body, ticket: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CreateModel): Anon_Comment = {
    val __obj = js.Dynamic.literal(comment = comment, ticket = ticket)
  
    __obj.asInstanceOf[Anon_Comment]
  }
}

