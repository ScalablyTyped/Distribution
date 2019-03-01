package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var uuid: java.lang.String
}

object Device {
  @scala.inline
  def apply(uuid: java.lang.String): Device = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[Device]
  }
}

