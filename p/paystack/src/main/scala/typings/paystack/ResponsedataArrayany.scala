package typings.paystack

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined paystack.paystack.Response & {  data  :std.Array<any>} */
trait ResponsedataArrayany
  extends /* others */ StringDictionary[js.Any] {
  var data: js.UndefOr[js.Any with js.Array[_]] = js.undefined
  var message: String
  var status: Boolean
}

object ResponsedataArrayany {
  @scala.inline
  def apply(
    message: String,
    status: Boolean,
    StringDictionary: /* others */ StringDictionary[js.Any] = null,
    data: js.Any with js.Array[_] = null
  ): ResponsedataArrayany = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsedataArrayany]
  }
}

