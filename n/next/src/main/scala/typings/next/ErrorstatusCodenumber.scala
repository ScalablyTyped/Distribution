package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  statusCode ? :number} */
trait ErrorstatusCodenumber extends js.Object {
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object ErrorstatusCodenumber {
  @scala.inline
  def apply(message: String, name: String, stack: String = null, statusCode: Int | Double = null): ErrorstatusCodenumber = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorstatusCodenumber]
  }
}

