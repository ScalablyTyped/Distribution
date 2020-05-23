package typings.pkijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  var password: String
}

object Password {
  @scala.inline
  def apply(password: String): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
}

