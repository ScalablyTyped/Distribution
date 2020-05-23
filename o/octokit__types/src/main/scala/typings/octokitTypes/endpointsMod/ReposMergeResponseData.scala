package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Eventsurl
import typings.octokitTypes.anon.Sha
import typings.octokitTypes.anon.Verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposMergeResponseData extends js.Object {
  var author: Eventsurl
  var comments_url: String
  var commit: Verification
  var committer: Eventsurl
  var html_url: String
  var node_id: String
  var parents: js.Array[Sha]
  var sha: String
  var url: String
}

object ReposMergeResponseData {
  @scala.inline
  def apply(
    author: Eventsurl,
    comments_url: String,
    commit: Verification,
    committer: Eventsurl,
    html_url: String,
    node_id: String,
    parents: js.Array[Sha],
    sha: String,
    url: String
  ): ReposMergeResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposMergeResponseData]
  }
}

