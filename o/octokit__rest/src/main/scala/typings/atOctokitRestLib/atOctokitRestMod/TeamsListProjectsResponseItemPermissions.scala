package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListProjectsResponseItemPermissions extends js.Object {
  var admin: scala.Boolean
  var read: scala.Boolean
  var write: scala.Boolean
}

object TeamsListProjectsResponseItemPermissions {
  @scala.inline
  def apply(admin: scala.Boolean, read: scala.Boolean, write: scala.Boolean): TeamsListProjectsResponseItemPermissions = {
    val __obj = js.Dynamic.literal(admin = admin, read = read, write = write)
  
    __obj.asInstanceOf[TeamsListProjectsResponseItemPermissions]
  }
}

