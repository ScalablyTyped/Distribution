package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListArtifactsForRepoResponse extends js.Object {
  var artifacts: js.Array[ActionsListArtifactsForRepoResponseArtifactsItem]
  var total_count: Double
}

object ActionsListArtifactsForRepoResponse {
  @scala.inline
  def apply(artifacts: js.Array[ActionsListArtifactsForRepoResponseArtifactsItem], total_count: Double): ActionsListArtifactsForRepoResponse = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListArtifactsForRepoResponse]
  }
}

