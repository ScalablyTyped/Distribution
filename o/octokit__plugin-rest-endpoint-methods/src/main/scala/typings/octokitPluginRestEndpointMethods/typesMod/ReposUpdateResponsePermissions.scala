package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateResponsePermissions extends js.Object {
  var admin: Boolean
  var maintain: Boolean
  var pull: Boolean
  var push: Boolean
  var triage: Boolean
}

object ReposUpdateResponsePermissions {
  @scala.inline
  def apply(admin: Boolean, maintain: Boolean, pull: Boolean, push: Boolean, triage: Boolean): ReposUpdateResponsePermissions = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], maintain = maintain.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], triage = triage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateResponsePermissions]
  }
}

