package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateCommitCommentResponse extends js.Object {
  var body: String
  var commit_id: String
  var created_at: String
  var html_url: String
  var id: Double
  var line: Double
  var node_id: String
  var path: String
  var position: Double
  var updated_at: String
  var url: String
  var user: ReposUpdateCommitCommentResponseUser
}

object ReposUpdateCommitCommentResponse {
  @scala.inline
  def apply(
    body: String,
    commit_id: String,
    created_at: String,
    html_url: String,
    id: Double,
    line: Double,
    node_id: String,
    path: String,
    position: Double,
    updated_at: String,
    url: String,
    user: ReposUpdateCommitCommentResponseUser
  ): ReposUpdateCommitCommentResponse = {
    val __obj = js.Dynamic.literal(body = body, commit_id = commit_id, created_at = created_at, html_url = html_url, id = id, line = line, node_id = node_id, path = path, position = position, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[ReposUpdateCommitCommentResponse]
  }
}

