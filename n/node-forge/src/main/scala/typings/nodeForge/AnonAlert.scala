package typings.nodeForge

import typings.nodeForge.mod.tls.Alert.Description
import typings.nodeForge.mod.tls.Verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlert extends Verified {
  var alert: js.UndefOr[Description] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object AnonAlert {
  @scala.inline
  def apply(alert: Description = null, message: String = null): AnonAlert = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlert]
  }
}

