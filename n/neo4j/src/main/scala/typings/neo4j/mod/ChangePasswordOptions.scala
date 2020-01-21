package typings.neo4j.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePasswordOptions extends js.Object {
  var password: String
}

object ChangePasswordOptions {
  @scala.inline
  def apply(password: String): ChangePasswordOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangePasswordOptions]
  }
}

