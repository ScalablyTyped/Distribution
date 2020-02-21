package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitCommentResponse extends js.Object {
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
  var user: ReposGetCommitCommentResponseUser
}

object ReposGetCommitCommentResponse {
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
    user: ReposGetCommitCommentResponseUser
  ): ReposGetCommitCommentResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetCommitCommentResponse]
  }
}

