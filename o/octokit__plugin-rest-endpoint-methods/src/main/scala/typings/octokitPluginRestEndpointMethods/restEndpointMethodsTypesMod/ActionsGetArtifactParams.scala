package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetArtifactParams extends js.Object {
  var artifact_id: Double
  var owner: String
  var repo: String
}

object ActionsGetArtifactParams {
  @scala.inline
  def apply(artifact_id: Double, owner: String, repo: String): ActionsGetArtifactParams = {
    val __obj = js.Dynamic.literal(artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsGetArtifactParams]
  }
}

