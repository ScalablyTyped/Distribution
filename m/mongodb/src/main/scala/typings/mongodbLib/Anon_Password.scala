package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  /**
    * The password for auth
    */
  var password: java.lang.String
  /**
    * The username for auth
    */
  var user: java.lang.String
}

object Anon_Password {
  @scala.inline
  def apply(password: java.lang.String, user: java.lang.String): Anon_Password = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_Password]
  }
}

