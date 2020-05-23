package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Eventsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForCommitCommentResponseData extends js.Object {
  var content: String
  var created_at: String
  var id: Double
  var node_id: String
  var user: Eventsurl
}

object ReactionsCreateForCommitCommentResponseData {
  @scala.inline
  def apply(content: String, created_at: String, id: Double, node_id: String, user: Eventsurl): ReactionsCreateForCommitCommentResponseData = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForCommitCommentResponseData]
  }
}

