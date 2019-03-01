package typings
package passportDashHttpDashBearerLib.passportDashHttpDashBearerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVerifyOptions extends js.Object {
  var message: java.lang.String
  var scope: java.lang.String | js.Array[java.lang.String]
}

object IVerifyOptions {
  @scala.inline
  def apply(message: java.lang.String, scope: java.lang.String | js.Array[java.lang.String]): IVerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerifyOptions]
  }
}

