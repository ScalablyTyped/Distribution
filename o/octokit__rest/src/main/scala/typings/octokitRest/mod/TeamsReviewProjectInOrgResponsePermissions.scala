package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsReviewProjectInOrgResponsePermissions extends js.Object {
  var admin: Boolean
  var read: Boolean
  var write: Boolean
}

object TeamsReviewProjectInOrgResponsePermissions {
  @scala.inline
  def apply(admin: Boolean, read: Boolean, write: Boolean): TeamsReviewProjectInOrgResponsePermissions = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsReviewProjectInOrgResponsePermissions]
  }
}

