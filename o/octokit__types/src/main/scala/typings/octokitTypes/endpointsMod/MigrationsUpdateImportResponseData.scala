package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUpdateImportResponseData extends js.Object {
  var authors_url: String
  var html_url: String
  var repository_url: String
  var status: String
  var url: String
  var use_lfs: String
  var vcs: String
  var vcs_url: String
}

object MigrationsUpdateImportResponseData {
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
  ): MigrationsUpdateImportResponseData = {
    val __obj = js.Dynamic.literal(authors_url = authors_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any], vcs = vcs.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUpdateImportResponseData]
  }
}

