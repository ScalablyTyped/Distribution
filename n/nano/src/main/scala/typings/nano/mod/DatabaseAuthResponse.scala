package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
trait DatabaseAuthResponse extends js.Object {
  // Username
  var name: String
  // Operation status
  var ok: Boolean
  // List of user roles
  var roles: js.Array[String]
}

object DatabaseAuthResponse {
  @scala.inline
  def apply(name: String, ok: Boolean, roles: js.Array[String]): DatabaseAuthResponse = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseAuthResponse]
  }
}

