package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkforupdate extends js.Object {
  var checkforupdate: Boolean
  var devicetypes: Bridge
  @JSName("notify")
  var notify_FCheckforupdate: Boolean
  var text: String
  var updatestate: Double
  var url: String
}

object Checkforupdate {
  @scala.inline
  def apply(
    checkforupdate: Boolean,
    devicetypes: Bridge,
    notify: Boolean,
    text: String,
    updatestate: Double,
    url: String
  ): Checkforupdate = {
    val __obj = js.Dynamic.literal(checkforupdate = checkforupdate.asInstanceOf[js.Any], devicetypes = devicetypes.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatestate = updatestate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkforupdate]
  }
}

