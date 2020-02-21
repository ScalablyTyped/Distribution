package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRepoTfvcproject extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var tfvc_project: AnonType
  var vcs: AnonEnum
  var vcs_password: AnonType
  var vcs_url: AnonRequired
  var vcs_username: AnonType
}

object AnonOwnerRepoTfvcproject {
  @scala.inline
  def apply(
    owner: AnonRequired,
    repo: AnonRequired,
    tfvc_project: AnonType,
    vcs: AnonEnum,
    vcs_password: AnonType,
    vcs_url: AnonRequired,
    vcs_username: AnonType
  ): AnonOwnerRepoTfvcproject = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tfvc_project = tfvc_project.asInstanceOf[js.Any], vcs = vcs.asInstanceOf[js.Any], vcs_password = vcs_password.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any], vcs_username = vcs_username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRepoTfvcproject]
  }
}

