package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined paystack.paystack.Response & {  data ? :std.Array<any>,   meta ? :any} */
trait ResponsedataArrayanymetaa
  extends /* others */ StringDictionary[js.Any] {
  var data: js.UndefOr[js.Any with js.Array[_]] = js.undefined
  var message: String
  var meta: js.UndefOr[js.Any] = js.undefined
  var status: Boolean
}

object ResponsedataArrayanymetaa {
  @scala.inline
  def apply(
    message: String,
    status: Boolean,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    data: js.Any with js.Array[_] = null,
    meta: js.Any = null
  ): ResponsedataArrayanymetaa = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsedataArrayanymetaa]
  }
}

