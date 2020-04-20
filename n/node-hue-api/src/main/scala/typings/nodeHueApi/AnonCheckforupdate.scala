package typings.nodeHueApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckforupdate extends js.Object {
  var checkforupdate: Boolean
  var devicetypes: AnonBridge
  @JSName("notify")
  var notify_FAnonCheckforupdate: Boolean
  var text: String
  var updatestate: Double
  var url: String
}

object AnonCheckforupdate {
  @scala.inline
  def apply(
    checkforupdate: Boolean,
    devicetypes: AnonBridge,
    notify: Boolean,
    text: String,
    updatestate: Double,
    url: String
  ): AnonCheckforupdate = {
    val __obj = js.Dynamic.literal(checkforupdate = checkforupdate.asInstanceOf[js.Any], devicetypes = devicetypes.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatestate = updatestate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckforupdate]
  }
}

