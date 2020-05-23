package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  /**
    * The password for auth
    */
  var password: String
  /**
    * The username for auth
    */
  var user: String
}

object Password {
  @scala.inline
  def apply(password: String, user: String): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
}

