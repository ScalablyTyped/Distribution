package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Changes
import typings.octokitTypes.anon.Commentsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseData extends js.Object {
  var ahead_by: Double
  var base_commit: Commentsurl
  var behind_by: Double
  var commits: js.Array[Commentsurl]
  var diff_url: String
  var files: js.Array[Changes]
  var html_url: String
  var merge_base_commit: Commentsurl
  var patch_url: String
  var permalink_url: String
  var status: String
  var total_commits: Double
  var url: String
}

object ReposCompareCommitsResponseData {
  @scala.inline
  def apply(
    ahead_by: Double,
    base_commit: Commentsurl,
    behind_by: Double,
    commits: js.Array[Commentsurl],
    diff_url: String,
    files: js.Array[Changes],
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
}

