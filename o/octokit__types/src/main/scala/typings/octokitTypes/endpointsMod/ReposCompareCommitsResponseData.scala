package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Bloburl
import typings.octokitTypes.anon.Commentsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCompareCommitsResponseData extends js.Object {
  var ahead_by: Double = js.native
  var base_commit: Commentsurl = js.native
  var behind_by: Double = js.native
  var commits: js.Array[Commentsurl] = js.native
  var diff_url: String = js.native
  var files: js.Array[Bloburl] = js.native
  var html_url: String = js.native
  var merge_base_commit: Commentsurl = js.native
  var patch_url: String = js.native
  var permalink_url: String = js.native
  var status: String = js.native
  var total_commits: Double = js.native
  var url: String = js.native
}

object ReposCompareCommitsResponseData {
  @scala.inline
  def apply(
    ahead_by: Double,
    base_commit: Commentsurl,
    behind_by: Double,
    commits: js.Array[Commentsurl],
    diff_url: String,
    files: js.Array[Bloburl],
    html_url: String,
    merge_base_commit: Commentsurl,
    patch_url: String,
    permalink_url: String,
    status: String,
    total_commits: Double,
    url: String
  ): ReposCompareCommitsResponseData = {
    val __obj = js.Dynamic.literal(ahead_by = ahead_by.asInstanceOf[js.Any], base_commit = base_commit.asInstanceOf[js.Any], behind_by = behind_by.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], merge_base_commit = merge_base_commit.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], permalink_url = permalink_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_commits = total_commits.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCompareCommitsResponseData]
  }
  @scala.inline
  implicit class ReposCompareCommitsResponseDataOps[Self <: ReposCompareCommitsResponseData] (val x: Self) extends AnyVal {
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
    def setAhead_by(value: Double): Self = this.set("ahead_by", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase_commit(value: Commentsurl): Self = this.set("base_commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setBehind_by(value: Double): Self = this.set("behind_by", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitsVarargs(value: Commentsurl*): Self = this.set("commits", js.Array(value :_*))
    @scala.inline
    def setCommits(value: js.Array[Commentsurl]): Self = this.set("commits", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiff_url(value: String): Self = this.set("diff_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: Bloburl*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[Bloburl]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerge_base_commit(value: Commentsurl): Self = this.set("merge_base_commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatch_url(value: String): Self = this.set("patch_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermalink_url(value: String): Self = this.set("permalink_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_commits(value: Double): Self = this.set("total_commits", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

