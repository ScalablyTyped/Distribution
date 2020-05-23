package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  installation_id  :number,   repository_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
trait AppsAddRepoToInstallationEndpoint extends js.Object {
  var installation_id: Double
  var mediaType: `2`
  var repository_id: Double
}

object AppsAddRepoToInstallationEndpoint {
  @scala.inline
  def apply(installation_id: Double, mediaType: `2`, repository_id: Double): AppsAddRepoToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsAddRepoToInstallationEndpoint]
  }
}

