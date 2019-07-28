package typings.passportDashHttpDashBearer.passportDashHttpDashBearerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVerifyOptions extends js.Object {
  var message: String
  var scope: String | js.Array[String]
}

object IVerifyOptions {
  @scala.inline
  def apply(message: String, scope: String | js.Array[String]): IVerifyOptions = {
    val __obj = js.Dynamic.literal(message = message, scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVerifyOptions]
  }
}

