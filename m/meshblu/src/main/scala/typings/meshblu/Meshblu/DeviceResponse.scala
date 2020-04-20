package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceResponse extends js.Object {
  var color: String
  var online: Boolean
  var uuid: String
}

object DeviceResponse {
  @scala.inline
  def apply(color: String, online: Boolean, uuid: String): DeviceResponse = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceResponse]
  }
}

