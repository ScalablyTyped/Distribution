package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parents extends js.Object {
  var author: Avatarurl = js.native
  var comments_url: String = js.native
  var commit: AuthorCommentcount = js.native
  var committer: Avatarurl = js.native
  var html_url: String = js.native
  var parents: js.Array[HtmlurlSha] = js.native
  var repository: Branchesurl = js.native
  var score: Double = js.native
  var sha: String = js.native
  var url: String = js.native
}

object Parents {
  @scala.inline
  def apply(
    author: Avatarurl,
    comments_url: String,
    commit: AuthorCommentcount,
    committer: Avatarurl,
    html_url: String,
    parents: js.Array[HtmlurlSha],
    repository: Branchesurl,
    score: Double,
    sha: String,
    url: String
  ): Parents = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parents]
  }
  @scala.inline
  implicit class ParentsOps[Self <: Parents] (val x: Self) extends AnyVal {
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
    def setCommit(value: AuthorCommentcount): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitter(value: Avatarurl): Self = this.set("committer", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentsVarargs(value: HtmlurlSha*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[HtmlurlSha]): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: Branchesurl): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

