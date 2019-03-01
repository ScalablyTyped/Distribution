package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataInput extends js.Object {
  var online: scala.Boolean
  var uuid: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object DataInput {
  @scala.inline
  def apply(online: scala.Boolean, uuid: java.lang.String, x: scala.Double, y: scala.Double): DataInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("online")(online)
    __obj.updateDynamic("uuid")(uuid)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[DataInput]
  }
}

