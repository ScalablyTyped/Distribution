package typings.meteorDashRoles.RolesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  var name: String
}

object Role {
  @scala.inline
  def apply(name: String): Role = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[Role]
  }
}

