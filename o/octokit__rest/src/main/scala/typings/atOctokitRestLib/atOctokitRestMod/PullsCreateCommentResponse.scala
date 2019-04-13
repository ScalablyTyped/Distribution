package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentResponse extends js.Object {
  var _links: PullsCreateCommentResponseLinks
  var body: java.lang.String
  var commit_id: java.lang.String
  var created_at: java.lang.String
  var diff_hunk: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var in_reply_to_id: scala.Double
  var node_id: java.lang.String
  var original_commit_id: java.lang.String
  var original_position: scala.Double
  var path: java.lang.String
  var position: scala.Double
  var pull_request_review_id: scala.Double
  var pull_request_url: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
  var user: PullsCreateCommentResponseUser
}

object PullsCreateCommentResponse {
  @scala.inline
  def apply(
    _links: PullsCreateCommentResponseLinks,
    body: java.lang.String,
    commit_id: java.lang.String,
    created_at: java.lang.String,
    diff_hunk: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    in_reply_to_id: scala.Double,
    node_id: java.lang.String,
    original_commit_id: java.lang.String,
    original_position: scala.Double,
    path: java.lang.String,
    position: scala.Double,
    pull_request_review_id: scala.Double,
    pull_request_url: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String,
    user: PullsCreateCommentResponseUser
  ): PullsCreateCommentResponse = {
    val __obj = js.Dynamic.literal(_links = _links, body = body, commit_id = commit_id, created_at = created_at, diff_hunk = diff_hunk, html_url = html_url, id = id, in_reply_to_id = in_reply_to_id, node_id = node_id, original_commit_id = original_commit_id, original_position = original_position, path = path, position = position, pull_request_review_id = pull_request_review_id, pull_request_url = pull_request_url, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[PullsCreateCommentResponse]
  }
}

