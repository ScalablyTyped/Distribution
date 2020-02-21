package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsDownloadArtifactParams extends js.Object {
  var archive_format: String
  var artifact_id: Double
  var owner: String
  var repo: String
}

object ActionsDownloadArtifactParams {
  @scala.inline
  def apply(archive_format: String, artifact_id: Double, owner: String, repo: String): ActionsDownloadArtifactParams = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsDownloadArtifactParams]
  }
}

