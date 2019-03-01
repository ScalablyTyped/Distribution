package typings
package neo4jLib.neo4jMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePasswordOptions extends js.Object {
  var password: java.lang.String
}

object ChangePasswordOptions {
  @scala.inline
  def apply(password: java.lang.String): ChangePasswordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[ChangePasswordOptions]
  }
}

