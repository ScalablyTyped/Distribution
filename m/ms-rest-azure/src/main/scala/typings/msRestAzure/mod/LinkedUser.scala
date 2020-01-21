package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedUser extends js.Object {
  /**
    * The user name. This could be a display name or a GUID.
    */
  var name: String
  /**
    * The user type: 'user', 'servicePrincipal'.
    */
  var `type`: UserType
}

object LinkedUser {
  @scala.inline
  def apply(name: String, `type`: UserType): LinkedUser = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedUser]
  }
}

