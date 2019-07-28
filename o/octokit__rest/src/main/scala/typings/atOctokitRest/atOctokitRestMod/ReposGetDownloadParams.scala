package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDownloadParams extends js.Object {
  var download_id: Double
  var owner: String
  var repo: String
}

object ReposGetDownloadParams {
  @scala.inline
  def apply(download_id: Double, owner: String, repo: String): ReposGetDownloadParams = {
    val __obj = js.Dynamic.literal(download_id = download_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetDownloadParams]
  }
}

