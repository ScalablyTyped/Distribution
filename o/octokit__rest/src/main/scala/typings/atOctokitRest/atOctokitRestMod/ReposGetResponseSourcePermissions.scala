package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetResponseSourcePermissions extends js.Object {
  var admin: Boolean
  var pull: Boolean
  var push: Boolean
}

object ReposGetResponseSourcePermissions {
  @scala.inline
  def apply(admin: Boolean, pull: Boolean, push: Boolean): ReposGetResponseSourcePermissions = {
    val __obj = js.Dynamic.literal(admin = admin, pull = pull, push = push)
  
    __obj.asInstanceOf[ReposGetResponseSourcePermissions]
  }
}

