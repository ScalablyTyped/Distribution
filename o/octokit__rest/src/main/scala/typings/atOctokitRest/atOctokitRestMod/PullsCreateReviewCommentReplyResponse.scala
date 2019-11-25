package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewCommentReplyResponse extends js.Object {
  var _links: PullsCreateReviewCommentReplyResponseLinks
  var author_association: String
  var body: String
  var commit_id: String
  var created_at: String
  var diff_hunk: String
  var html_url: String
  var id: Double
  var node_id: String
  var original_commit_id: String
  var original_position: Double
  var path: String
  var position: Double
  var pull_request_review_id: Double
  var pull_request_url: String
  var updated_at: String
  var url: String
  var user: PullsCreateReviewCommentReplyResponseUser
}

object PullsCreateReviewCommentReplyResponse {
  @scala.inline
  def apply(
    _links: PullsCreateReviewCommentReplyResponseLinks,
    author_association: String,
    body: String,
    commit_id: String,
    created_at: String,
    diff_hunk: String,
    html_url: String,
    id: Double,
    node_id: String,
    original_commit_id: String,
    original_position: Double,
    path: String,
    position: Double,
    pull_request_review_id: Double,
    pull_request_url: String,
    updated_at: String,
    url: String,
    user: PullsCreateReviewCommentReplyResponseUser
  ): PullsCreateReviewCommentReplyResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_hunk = diff_hunk.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], original_commit_id = original_commit_id.asInstanceOf[js.Any], original_position = original_position.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pull_request_review_id = pull_request_review_id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateReviewCommentReplyResponse]
  }
}

