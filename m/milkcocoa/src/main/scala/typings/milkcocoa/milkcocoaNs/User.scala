package typings.milkcocoa.milkcocoaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var email: String
  var id: String
}

object User {
  @scala.inline
  def apply(email: String, id: String): User = {
    val __obj = js.Dynamic.literal(email = email, id = id)
  
    __obj.asInstanceOf[User]
  }
}

