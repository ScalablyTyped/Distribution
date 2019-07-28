package typings.micro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(
    message: String = null,
    stack: String = null,
    status: Int | Double = null,
    statusCode: Int | Double = null
  ): Anon_Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Message]
  }
}

