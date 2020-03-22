package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveOutsideCollaboratorParams extends js.Object {
  var org: String
  var username: String
}

object OrgsRemoveOutsideCollaboratorParams {
  @scala.inline
  def apply(org: String, username: String): OrgsRemoveOutsideCollaboratorParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsRemoveOutsideCollaboratorParams]
  }
}

