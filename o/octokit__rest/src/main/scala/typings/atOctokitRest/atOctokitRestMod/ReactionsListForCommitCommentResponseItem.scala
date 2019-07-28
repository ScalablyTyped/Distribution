package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForCommitCommentResponseItem extends js.Object {
  var content: String
  var created_at: String
  var id: Double
  var node_id: String
  var user: ReactionsListForCommitCommentResponseItemUser
}

object ReactionsListForCommitCommentResponseItem {
  @scala.inline
  def apply(
    content: String,
    created_at: String,
    id: Double,
    node_id: String,
    user: ReactionsListForCommitCommentResponseItemUser
  ): ReactionsListForCommitCommentResponseItem = {
    val __obj = js.Dynamic.literal(content = content, created_at = created_at, id = id, node_id = node_id, user = user)
  
    __obj.asInstanceOf[ReactionsListForCommitCommentResponseItem]
  }
}

