package typings
package passportDashLocalDashMongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationResult extends js.Object {
  var error: js.Any
  var user: js.Any
}

object AuthenticationResult {
  @scala.inline
  def apply(error: js.Any, user: js.Any): AuthenticationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[AuthenticationResult]
  }
}

