package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUpdateImportResponse extends js.Object {
  var authors_url: java.lang.String
  var html_url: java.lang.String
  var repository_url: java.lang.String
  var status: java.lang.String
  var url: java.lang.String
  var use_lfs: java.lang.String
  var vcs: java.lang.String
  var vcs_url: java.lang.String
}

object MigrationsUpdateImportResponse {
  @scala.inline
  def apply(
    authors_url: java.lang.String,
    html_url: java.lang.String,
    repository_url: java.lang.String,
    status: java.lang.String,
    url: java.lang.String,
    use_lfs: java.lang.String,
    vcs: java.lang.String,
    vcs_url: java.lang.String
  ): MigrationsUpdateImportResponse = {
    val __obj = js.Dynamic.literal(authors_url = authors_url, html_url = html_url, repository_url = repository_url, status = status, url = url, use_lfs = use_lfs, vcs = vcs, vcs_url = vcs_url)
  
    __obj.asInstanceOf[MigrationsUpdateImportResponse]
  }
}

