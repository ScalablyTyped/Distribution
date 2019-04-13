package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateResponseParentPermissions extends js.Object {
  var admin: scala.Boolean
  var pull: scala.Boolean
  var push: scala.Boolean
}

object ReposUpdateResponseParentPermissions {
  @scala.inline
  def apply(admin: scala.Boolean, pull: scala.Boolean, push: scala.Boolean): ReposUpdateResponseParentPermissions = {
    val __obj = js.Dynamic.literal(admin = admin, pull = pull, push = push)
  
    __obj.asInstanceOf[ReposUpdateResponseParentPermissions]
  }
}

