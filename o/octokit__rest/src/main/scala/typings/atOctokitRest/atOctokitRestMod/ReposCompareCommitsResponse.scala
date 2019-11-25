package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponse extends js.Object {
  var ahead_by: Double
  var base_commit: ReposCompareCommitsResponseBaseCommit
  var behind_by: Double
  var commits: js.Array[ReposCompareCommitsResponseCommitsItem]
  var diff_url: String
  var files: js.Array[ReposCompareCommitsResponseFilesItem]
  var html_url: String
  var merge_base_commit: ReposCompareCommitsResponseMergeBaseCommit
  var patch_url: String
  var permalink_url: String
  var status: String
  var total_commits: Double
  var url: String
}

object ReposCompareCommitsResponse {
  @scala.inline
  def apply(
    ahead_by: Double,
    base_commit: ReposCompareCommitsResponseBaseCommit,
    behind_by: Double,
    commits: js.Array[ReposCompareCommitsResponseCommitsItem],
    diff_url: String,
    files: js.Array[ReposCompareCommitsResponseFilesItem],
    html_url: String,
    merge_base_commit: ReposCompareCommitsResponseMergeBaseCommit,
    patch_url: String,
    permalink_url: String,
    status: String,
    total_commits: Double,
    url: String
  ): ReposCompareCommitsResponse = {
    val __obj = js.Dynamic.literal(ahead_by = ahead_by.asInstanceOf[js.Any], base_commit = base_commit.asInstanceOf[js.Any], behind_by = behind_by.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], merge_base_commit = merge_base_commit.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], permalink_url = permalink_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_commits = total_commits.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsResponse]
  }
}

