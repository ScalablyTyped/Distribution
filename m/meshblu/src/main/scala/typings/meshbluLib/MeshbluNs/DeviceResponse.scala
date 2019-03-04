package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceResponse extends js.Object {
  var color: java.lang.String
  var online: scala.Boolean
  var uuid: java.lang.String
}

object DeviceResponse {
  @scala.inline
  def apply(color: java.lang.String, online: scala.Boolean, uuid: java.lang.String): DeviceResponse = {
    val __obj = js.Dynamic.literal(color = color, online = online, uuid = uuid)
  
    __obj.asInstanceOf[DeviceResponse]
  }
}

