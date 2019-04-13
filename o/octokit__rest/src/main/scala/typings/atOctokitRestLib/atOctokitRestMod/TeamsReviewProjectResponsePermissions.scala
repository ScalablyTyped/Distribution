package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsReviewProjectResponsePermissions extends js.Object {
  var admin: scala.Boolean
  var read: scala.Boolean
  var write: scala.Boolean
}

object TeamsReviewProjectResponsePermissions {
  @scala.inline
  def apply(admin: scala.Boolean, read: scala.Boolean, write: scala.Boolean): TeamsReviewProjectResponsePermissions = {
    val __obj = js.Dynamic.literal(admin = admin, read = read, write = write)
  
    __obj.asInstanceOf[TeamsReviewProjectResponsePermissions]
  }
}

