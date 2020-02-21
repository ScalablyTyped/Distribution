package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsReviewProjectLegacyResponsePermissions extends js.Object {
  var admin: Boolean
  var read: Boolean
  var write: Boolean
}

object TeamsReviewProjectLegacyResponsePermissions {
  @scala.inline
  def apply(admin: Boolean, read: Boolean, write: Boolean): TeamsReviewProjectLegacyResponsePermissions = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsReviewProjectLegacyResponsePermissions]
  }
}

