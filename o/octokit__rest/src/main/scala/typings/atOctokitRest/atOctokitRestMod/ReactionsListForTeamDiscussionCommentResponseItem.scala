package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForTeamDiscussionCommentResponseItem extends js.Object {
  var content: String
  var created_at: String
  var id: Double
  var node_id: String
  var user: ReactionsListForTeamDiscussionCommentResponseItemUser
}

object ReactionsListForTeamDiscussionCommentResponseItem {
  @scala.inline
  def apply(
    content: String,
    created_at: String,
    id: Double,
    node_id: String,
    user: ReactionsListForTeamDiscussionCommentResponseItemUser
  ): ReactionsListForTeamDiscussionCommentResponseItem = {
    val __obj = js.Dynamic.literal(content = content, created_at = created_at, id = id, node_id = node_id, user = user)
  
    __obj.asInstanceOf[ReactionsListForTeamDiscussionCommentResponseItem]
  }
}

