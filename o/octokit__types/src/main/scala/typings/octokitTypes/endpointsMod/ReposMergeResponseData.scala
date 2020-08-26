package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.ShaUrl
import typings.octokitTypes.anon.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposMergeResponseData extends js.Object {
  var author: Avatarurl = js.native
  var comments_url: String = js.native
  var commit: Tree = js.native
  var committer: Avatarurl = js.native
  var html_url: String = js.native
  var node_id: String = js.native
  var parents: js.Array[ShaUrl] = js.native
  var sha: String = js.native
  var url: String = js.native
}

object ReposMergeResponseData {
  @scala.inline
  def apply(
    author: Avatarurl,
    comments_url: String,
    commit: Tree,
    committer: Avatarurl,
    html_url: String,
    node_id: String,
    parents: js.Array[ShaUrl],
    sha: String,
    url: String
  ): ReposMergeResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposMergeResponseData]
  }
  @scala.inline
  implicit class ReposMergeResponseDataOps[Self <: ReposMergeResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthor(value: Avatarurl): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments_url(value: String): Self = this.set("comments_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: Tree): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitter(value: Avatarurl): Self = this.set("committer", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentsVarargs(value: ShaUrl*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[ShaUrl]): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

