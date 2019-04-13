package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsSetLfsPreferenceResponse extends js.Object {
  var authors_count: scala.Double
  var authors_url: java.lang.String
  var has_large_files: scala.Boolean
  var html_url: java.lang.String
  var large_files_count: scala.Double
  var large_files_size: scala.Double
  var repository_url: java.lang.String
  var status: java.lang.String
  var status_text: java.lang.String
  var url: java.lang.String
  var use_lfs: java.lang.String
  var vcs: java.lang.String
  var vcs_url: java.lang.String
}

object MigrationsSetLfsPreferenceResponse {
  @scala.inline
  def apply(
    authors_count: scala.Double,
    authors_url: java.lang.String,
    has_large_files: scala.Boolean,
    html_url: java.lang.String,
    large_files_count: scala.Double,
    large_files_size: scala.Double,
    repository_url: java.lang.String,
    status: java.lang.String,
    status_text: java.lang.String,
    url: java.lang.String,
    use_lfs: java.lang.String,
    vcs: java.lang.String,
    vcs_url: java.lang.String
  ): MigrationsSetLfsPreferenceResponse = {
    val __obj = js.Dynamic.literal(authors_count = authors_count, authors_url = authors_url, has_large_files = has_large_files, html_url = html_url, large_files_count = large_files_count, large_files_size = large_files_size, repository_url = repository_url, status = status, status_text = status_text, url = url, use_lfs = use_lfs, vcs = vcs, vcs_url = vcs_url)
  
    __obj.asInstanceOf[MigrationsSetLfsPreferenceResponse]
  }
}

