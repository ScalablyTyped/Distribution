package typings.naverDashWhale.whale.webRequest

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHeader extends js.Object {
  var binaryValue: js.UndefOr[ArrayBuffer] = js.undefined
  var name: String
  var value: js.UndefOr[String] = js.undefined
}

object HttpHeader {
  @scala.inline
  def apply(name: String, binaryValue: ArrayBuffer = null, value: String = null): HttpHeader = {
    val __obj = js.Dynamic.literal(name = name)
    if (binaryValue != null) __obj.updateDynamic("binaryValue")(binaryValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[HttpHeader]
  }
}

