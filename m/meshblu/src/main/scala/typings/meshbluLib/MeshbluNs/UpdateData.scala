package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateData extends js.Object {
  var color: java.lang.String
  var uuid: java.lang.String
}

object UpdateData {
  @scala.inline
  def apply(color: java.lang.String, uuid: java.lang.String): UpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[UpdateData]
  }
}

