package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostmarkError extends js.Object {
  var code: scala.Double
  var message: java.lang.String
  var status: scala.Double
}

object PostmarkError {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String, status: scala.Double): PostmarkError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[PostmarkError]
  }
}

