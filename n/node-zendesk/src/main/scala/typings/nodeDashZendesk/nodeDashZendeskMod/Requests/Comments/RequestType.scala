package typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZendesk.nodeDashZendeskStrings.Comment
  - typings.nodeDashZendesk.nodeDashZendeskStrings.VoiceComment
*/
trait RequestType extends js.Object

object RequestType {
  @scala.inline
  def Comment: typings.nodeDashZendesk.nodeDashZendeskStrings.Comment = this.cast("Comment")
  @scala.inline
  def VoiceComment: typings.nodeDashZendesk.nodeDashZendeskStrings.VoiceComment = this.cast("VoiceComment")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

