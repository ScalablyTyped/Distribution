package typings.passportDashLocalDashMongoose.mongooseMod

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
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticationResult]
  }
}

