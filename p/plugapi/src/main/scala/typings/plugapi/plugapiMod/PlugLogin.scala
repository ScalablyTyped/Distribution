package typings.plugapi.plugapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlugLogin extends js.Object {
  var email: String
  var password: String
}

object PlugLogin {
  @scala.inline
  def apply(email: String, password: String): PlugLogin = {
    val __obj = js.Dynamic.literal(email = email, password = password)
  
    __obj.asInstanceOf[PlugLogin]
  }
}

