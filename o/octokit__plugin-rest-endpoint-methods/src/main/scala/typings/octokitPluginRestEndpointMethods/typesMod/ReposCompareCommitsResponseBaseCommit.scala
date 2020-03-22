package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseBaseCommit extends js.Object {
  var author: ReposCompareCommitsResponseBaseCommitAuthor
  var comments_url: String
  var commit: ReposCompareCommitsResponseBaseCommitCommit
  var committer: ReposCompareCommitsResponseBaseCommitCommitter
  var html_url: String
  var node_id: String
  var parents: js.Array[ReposCompareCommitsResponseBaseCommitParentsItem]
  var sha: String
  var url: String
}

object ReposCompareCommitsResponseBaseCommit {
  @scala.inline
  def apply(
    author: ReposCompareCommitsResponseBaseCommitAuthor,
    comments_url: String,
    commit: ReposCompareCommitsResponseBaseCommitCommit,
    committer: ReposCompareCommitsResponseBaseCommitCommitter,
    html_url: String,
    node_id: String,
    parents: js.Array[ReposCompareCommitsResponseBaseCommitParentsItem],
    sha: String,
    url: String
  ): ReposCompareCommitsResponseBaseCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsResponseBaseCommit]
  }
}

