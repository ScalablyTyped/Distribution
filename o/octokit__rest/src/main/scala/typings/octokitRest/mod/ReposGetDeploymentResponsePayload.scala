package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDeploymentResponsePayload extends js.Object {
  var deploy: String
}

object ReposGetDeploymentResponsePayload {
  @scala.inline
  def apply(deploy: String): ReposGetDeploymentResponsePayload = {
    val __obj = js.Dynamic.literal(deploy = deploy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetDeploymentResponsePayload]
  }
}

