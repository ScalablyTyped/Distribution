package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArtifactid extends js.Object {
  var artifact_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonArtifactid {
  @scala.inline
  def apply(artifact_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonArtifactid = {
    val __obj = js.Dynamic.literal(artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArtifactid]
  }
}

