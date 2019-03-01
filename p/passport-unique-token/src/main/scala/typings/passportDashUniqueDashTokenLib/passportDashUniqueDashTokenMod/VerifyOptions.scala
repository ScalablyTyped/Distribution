package typings
package passportDashUniqueDashTokenLib.passportDashUniqueDashTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var message: java.lang.String
}

object VerifyOptions {
  @scala.inline
  def apply(message: java.lang.String): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[VerifyOptions]
  }
}

