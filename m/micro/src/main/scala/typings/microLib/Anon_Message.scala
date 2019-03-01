package typings
package microLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(
    message: java.lang.String = null,
    stack: java.lang.String = null,
    status: scala.Int | scala.Double = null,
    statusCode: scala.Int | scala.Double = null
  ): Anon_Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Message]
  }
}

