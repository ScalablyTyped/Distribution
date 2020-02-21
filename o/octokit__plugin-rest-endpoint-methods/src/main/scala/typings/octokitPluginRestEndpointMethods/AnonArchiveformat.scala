package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArchiveformat extends js.Object {
  var archive_format: AnonRequired
  var artifact_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonArchiveformat {
  @scala.inline
  def apply(archive_format: AnonRequired, artifact_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonArchiveformat = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArchiveformat]
  }
}

