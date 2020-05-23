package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined paystack.paystack.Response & {  data  :std.Array<any>,   meta  :any} */
trait ResponsedataArrayanymetaaDictothers
  extends /* others */ StringDictionary[js.Any] {
  var data: js.UndefOr[js.Any with js.Array[_]] = js.undefined
  var message: String
  var meta: js.Any
  var status: Boolean
}

object ResponsedataArrayanymetaaDictothers {
  @scala.inline
  def apply(
    message: String,
    meta: js.Any,
    status: Boolean,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    data: js.Any with js.Array[_] = null
  ): ResponsedataArrayanymetaaDictothers = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsedataArrayanymetaaDictothers]
  }
}

