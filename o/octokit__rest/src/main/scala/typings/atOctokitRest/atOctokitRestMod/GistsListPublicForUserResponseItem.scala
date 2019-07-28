package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListPublicForUserResponseItem extends js.Object {
  var comments: Double
  var comments_url: String
  var commits_url: String
  var created_at: String
  var description: String
  var files: GistsListPublicForUserResponseItemFiles
  var forks_url: String
  var git_pull_url: String
  var git_push_url: String
  var html_url: String
  var id: String
  var node_id: String
  var owner: GistsListPublicForUserResponseItemOwner
  var public: Boolean
  var truncated: Boolean
  var updated_at: String
  var url: String
  var user: Null
}

object GistsListPublicForUserResponseItem {
  @scala.inline
  def apply(
    comments: Double,
    comments_url: String,
    commits_url: String,
    created_at: String,
    description: String,
    files: GistsListPublicForUserResponseItemFiles,
    forks_url: String,
    git_pull_url: String,
    git_push_url: String,
    html_url: String,
    id: String,
    node_id: String,
    owner: GistsListPublicForUserResponseItemOwner,
    public: Boolean,
    truncated: Boolean,
    updated_at: String,
    url: String,
    user: Null
  ): GistsListPublicForUserResponseItem = {
    val __obj = js.Dynamic.literal(comments = comments, comments_url = comments_url, commits_url = commits_url, created_at = created_at, description = description, files = files, forks_url = forks_url, git_pull_url = git_pull_url, git_push_url = git_push_url, html_url = html_url, id = id, node_id = node_id, owner = owner, public = public, truncated = truncated, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[GistsListPublicForUserResponseItem]
  }
}

