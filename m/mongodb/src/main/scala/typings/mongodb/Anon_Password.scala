package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  /**
    * The password for auth
    */
  var password: String
  /**
    * The username for auth
    */
  var user: String
}

object Anon_Password {
  @scala.inline
  def apply(password: String, user: String): Anon_Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Password]
  }
}

