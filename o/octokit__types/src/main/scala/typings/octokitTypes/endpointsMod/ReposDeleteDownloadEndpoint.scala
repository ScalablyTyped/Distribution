package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteDownloadEndpoint extends js.Object {
  var download_id: Double
  var owner: String
  var repo: String
}

object ReposDeleteDownloadEndpoint {
  @scala.inline
  def apply(download_id: Double, owner: String, repo: String): ReposDeleteDownloadEndpoint = {
    val __obj = js.Dynamic.literal(download_id = download_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteDownloadEndpoint]
  }
}

