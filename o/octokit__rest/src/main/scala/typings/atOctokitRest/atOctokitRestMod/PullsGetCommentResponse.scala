package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetCommentResponse extends js.Object {
  var _links: PullsGetCommentResponseLinks
  var body: String
  var commit_id: String
  var created_at: String
  var diff_hunk: String
  var html_url: String
  var id: Double
  var in_reply_to_id: Double
  var node_id: String
  var original_commit_id: String
  var original_position: Double
  var path: String
  var position: Double
  var pull_request_review_id: Double
  var pull_request_url: String
  var updated_at: String
  var url: String
  var user: PullsGetCommentResponseUser
}

object PullsGetCommentResponse {
  @scala.inline
  def apply(
    _links: PullsGetCommentResponseLinks,
    body: String,
    commit_id: String,
    created_at: String,
    diff_hunk: String,
    html_url: String,
    id: Double,
    in_reply_to_id: Double,
    node_id: String,
    original_commit_id: String,
    original_position: Double,
    path: String,
    position: Double,
    pull_request_review_id: Double,
    pull_request_url: String,
    updated_at: String,
    url: String,
    user: PullsGetCommentResponseUser
  ): PullsGetCommentResponse = {
    val __obj = js.Dynamic.literal(_links = _links, body = body, commit_id = commit_id, created_at = created_at, diff_hunk = diff_hunk, html_url = html_url, id = id, in_reply_to_id = in_reply_to_id, node_id = node_id, original_commit_id = original_commit_id, original_position = original_position, path = path, position = position, pull_request_review_id = pull_request_review_id, pull_request_url = pull_request_url, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[PullsGetCommentResponse]
  }
}

