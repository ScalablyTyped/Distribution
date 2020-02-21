package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerPermission extends js.Object {
  var owner: AnonRequired
  var permission: AnonEnum
  var repo: AnonRequired
  var username: AnonRequired
}

object AnonOwnerPermission {
  @scala.inline
  def apply(owner: AnonRequired, permission: AnonEnum, repo: AnonRequired, username: AnonRequired): AnonOwnerPermission = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerPermission]
  }
}

