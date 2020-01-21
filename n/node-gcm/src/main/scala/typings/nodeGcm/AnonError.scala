package typings.nodeGcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var message_id: js.UndefOr[String] = js.undefined
  var registration_id: js.UndefOr[String] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(error: String = null, message_id: String = null, registration_id: String = null): AnonError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (message_id != null) __obj.updateDynamic("message_id")(message_id.asInstanceOf[js.Any])
    if (registration_id != null) __obj.updateDynamic("registration_id")(registration_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

