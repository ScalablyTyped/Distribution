package typings.paystack.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Transactions initialization success object
trait Response
  extends /* others */ StringDictionary[js.Any] {
  var data: js.UndefOr[js.Any] = js.undefined
  var message: String
  var status: Boolean
}

object Response {
  @scala.inline
  def apply(
    message: String,
    status: Boolean,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    data: js.Any = null
  ): Response = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

