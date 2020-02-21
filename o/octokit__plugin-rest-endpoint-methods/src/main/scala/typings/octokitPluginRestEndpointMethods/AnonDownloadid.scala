package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownloadid extends js.Object {
  var download_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonDownloadid {
  @scala.inline
  def apply(download_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonDownloadid = {
    val __obj = js.Dynamic.literal(download_id = download_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDownloadid]
  }
}

