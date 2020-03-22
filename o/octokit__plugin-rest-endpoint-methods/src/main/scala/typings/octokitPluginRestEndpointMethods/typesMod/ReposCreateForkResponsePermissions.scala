package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateForkResponsePermissions extends js.Object {
  var admin: Boolean
  var pull: Boolean
  var push: Boolean
}

object ReposCreateForkResponsePermissions {
  @scala.inline
  def apply(admin: Boolean, pull: Boolean, push: Boolean): ReposCreateForkResponsePermissions = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCreateForkResponsePermissions]
  }
}

