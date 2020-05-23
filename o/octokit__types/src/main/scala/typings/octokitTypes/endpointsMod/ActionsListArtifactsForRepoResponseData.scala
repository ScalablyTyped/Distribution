package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archivedownloadurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListArtifactsForRepoResponseData extends js.Object {
  var artifacts: js.Array[Archivedownloadurl]
  var total_count: Double
}

object ActionsListArtifactsForRepoResponseData {
  @scala.inline
  def apply(artifacts: js.Array[Archivedownloadurl], total_count: Double): ActionsListArtifactsForRepoResponseData = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListArtifactsForRepoResponseData]
  }
}

