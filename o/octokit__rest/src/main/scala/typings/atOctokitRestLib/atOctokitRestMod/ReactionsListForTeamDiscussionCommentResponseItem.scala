package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForTeamDiscussionCommentResponseItem extends js.Object {
  var content: java.lang.String
  var created_at: java.lang.String
  var id: scala.Double
  var node_id: java.lang.String
  var user: ReactionsListForTeamDiscussionCommentResponseItemUser
}

object ReactionsListForTeamDiscussionCommentResponseItem {
  @scala.inline
  def apply(
    content: java.lang.String,
    created_at: java.lang.String,
    id: scala.Double,
    node_id: java.lang.String,
    user: ReactionsListForTeamDiscussionCommentResponseItemUser
  ): ReactionsListForTeamDiscussionCommentResponseItem = {
    val __obj = js.Dynamic.literal(content = content, created_at = created_at, id = id, node_id = node_id, user = user)
  
    __obj.asInstanceOf[ReactionsListForTeamDiscussionCommentResponseItem]
  }
}

