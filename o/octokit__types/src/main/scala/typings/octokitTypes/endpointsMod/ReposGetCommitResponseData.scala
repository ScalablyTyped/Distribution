package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Bloburl
import typings.octokitTypes.anon.Commentcount
import typings.octokitTypes.anon.Deletions
import typings.octokitTypes.anon.Eventsurl
import typings.octokitTypes.anon.ShaUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseData extends js.Object {
  var author: Eventsurl
  var comments_url: String
  var commit: Commentcount
  var committer: Eventsurl
  var files: js.Array[Bloburl]
  var html_url: String
  var node_id: String
  var parents: js.Array[ShaUrl]
  var sha: String
  var stats: Deletions
  var url: String
}

object ReposGetCommitResponseData {
  @scala.inline
  def apply(
    author: Eventsurl,
    comments_url: String,
    commit: Commentcount,
    committer: Eventsurl,
    files: js.Array[Bloburl],
    html_url: String,
    node_id: String,
    parents: js.Array[ShaUrl],
    sha: String,
    stats: Deletions,
    url: String
  ): ReposGetCommitResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommitResponseData]
  }
}

