package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeploymentid extends js.Object {
  var deployment_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonDeploymentid {
  @scala.inline
  def apply(deployment_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonDeploymentid = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeploymentid]
  }
}

