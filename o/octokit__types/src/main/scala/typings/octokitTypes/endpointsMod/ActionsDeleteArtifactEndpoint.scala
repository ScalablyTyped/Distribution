package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsDeleteArtifactEndpoint extends js.Object {
  var artifact_id: Double
  var owner: String
  var repo: String
}

object ActionsDeleteArtifactEndpoint {
  @scala.inline
  def apply(artifact_id: Double, owner: String, repo: String): ActionsDeleteArtifactEndpoint = {
    val __obj = js.Dynamic.literal(artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteArtifactEndpoint]
  }
}

