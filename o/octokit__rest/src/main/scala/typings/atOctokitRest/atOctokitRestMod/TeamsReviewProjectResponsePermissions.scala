package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsReviewProjectResponsePermissions extends js.Object {
  var admin: Boolean
  var read: Boolean
  var write: Boolean
}

object TeamsReviewProjectResponsePermissions {
  @scala.inline
  def apply(admin: Boolean, read: Boolean, write: Boolean): TeamsReviewProjectResponsePermissions = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsReviewProjectResponsePermissions]
  }
}

