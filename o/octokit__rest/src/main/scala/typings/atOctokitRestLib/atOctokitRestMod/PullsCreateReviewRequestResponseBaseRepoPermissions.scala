package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestResponseBaseRepoPermissions extends js.Object {
  var admin: scala.Boolean
  var pull: scala.Boolean
  var push: scala.Boolean
}

object PullsCreateReviewRequestResponseBaseRepoPermissions {
  @scala.inline
  def apply(admin: scala.Boolean, pull: scala.Boolean, push: scala.Boolean): PullsCreateReviewRequestResponseBaseRepoPermissions = {
    val __obj = js.Dynamic.literal(admin = admin, pull = pull, push = push)
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponseBaseRepoPermissions]
  }
}

