package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartImportResponse extends js.Object {
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

object MigrationsStartImportResponse {
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
  ): MigrationsStartImportResponse = {
    val __obj = js.Dynamic.literal(authors_count = authors_count, authors_url = authors_url, commit_count = commit_count, has_large_files = has_large_files, html_url = html_url, large_files_count = large_files_count, large_files_size = large_files_size, percent = percent, repository_url = repository_url, status = status, status_text = status_text, url = url, use_lfs = use_lfs, vcs = vcs, vcs_url = vcs_url)
  
    __obj.asInstanceOf[MigrationsStartImportResponse]
  }
}

