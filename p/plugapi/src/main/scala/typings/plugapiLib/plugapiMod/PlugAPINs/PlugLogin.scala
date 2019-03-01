package typings
package plugapiLib.plugapiMod.PlugAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlugLogin extends js.Object {
  var email: java.lang.String
  var password: java.lang.String
}

object PlugLogin {
  @scala.inline
  def apply(email: java.lang.String, password: java.lang.String): PlugLogin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[PlugLogin]
  }
}

