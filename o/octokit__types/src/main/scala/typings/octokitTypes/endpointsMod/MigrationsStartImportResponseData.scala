package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartImportResponseData extends js.Object {
  var authors_count: Double
  var authors_url: String
  var commit_count: Double
  var has_large_files: Boolean
  var html_url: String
  var large_files_count: Double
  var large_files_size: Double
  var percent: Double
  var repository_url: String
  var status: String
  var status_text: String
  var url: String
  var use_lfs: String
  var vcs: String
  var vcs_url: String
}

object MigrationsStartImportResponseData {
  @scala.inline
  def apply(
    authors_count: Double,
    authors_url: String,
    commit_count: Double,
    has_large_files: Boolean,
    html_url: String,
    large_files_count: Double,
    large_files_size: Double,
    percent: Double,
    repository_url: String,
    status: String,
    status_text: String,
    url: String,
    use_lfs: String,
    vcs: String,
    vcs_url: String
  ): MigrationsStartImportResponseData = {
    val __obj = js.Dynamic.literal(authors_count = authors_count.asInstanceOf[js.Any], authors_url = authors_url.asInstanceOf[js.Any], commit_count = commit_count.asInstanceOf[js.Any], has_large_files = has_large_files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], large_files_count = large_files_count.asInstanceOf[js.Any], large_files_size = large_files_size.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_text = status_text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any], vcs = vcs.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartImportResponseData]
  }
}

