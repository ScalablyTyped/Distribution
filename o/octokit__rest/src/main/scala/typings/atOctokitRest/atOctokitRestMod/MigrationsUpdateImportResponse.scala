package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUpdateImportResponse extends js.Object {
  var authors_url: String
  var html_url: String
  var repository_url: String
  var status: String
  var url: String
  var use_lfs: String
  var vcs: String
  var vcs_url: String
}

object MigrationsUpdateImportResponse {
  @scala.inline
  def apply(
    authors_url: String,
    html_url: String,
    repository_url: String,
    status: String,
    url: String,
    use_lfs: String,
    vcs: String,
    vcs_url: String
  ): MigrationsUpdateImportResponse = {
    val __obj = js.Dynamic.literal(authors_url = authors_url, html_url = html_url, repository_url = repository_url, status = status, url = url, use_lfs = use_lfs, vcs = vcs, vcs_url = vcs_url)
  
    __obj.asInstanceOf[MigrationsUpdateImportResponse]
  }
}

