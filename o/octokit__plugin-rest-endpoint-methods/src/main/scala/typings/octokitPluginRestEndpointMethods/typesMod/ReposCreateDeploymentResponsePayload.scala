package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentResponsePayload extends js.Object {
  var deploy: String
}

object ReposCreateDeploymentResponsePayload {
  @scala.inline
  def apply(deploy: String): ReposCreateDeploymentResponsePayload = {
    val __obj = js.Dynamic.literal(deploy = deploy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentResponsePayload]
  }
}

