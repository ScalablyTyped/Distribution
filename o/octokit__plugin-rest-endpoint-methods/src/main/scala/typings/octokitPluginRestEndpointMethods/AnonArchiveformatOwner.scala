package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArchiveformatOwner extends js.Object {
  var archive_format: AnonRequired
  var owner: AnonRequired
  var ref: AnonRequired
  var repo: AnonRequired
}

object AnonArchiveformatOwner {
  @scala.inline
  def apply(archive_format: AnonRequired, owner: AnonRequired, ref: AnonRequired, repo: AnonRequired): AnonArchiveformatOwner = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArchiveformatOwner]
  }
}

