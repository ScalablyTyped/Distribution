package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePayload extends js.Object {
  var devices: js.Array[java.lang.String]
  var payload: js.Any
  var qos: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
}

object MessagePayload {
  @scala.inline
  def apply(
    devices: js.Array[java.lang.String],
    payload: js.Any,
    topic: java.lang.String,
    qos: scala.Int | scala.Double = null
  ): MessagePayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("devices")(devices)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("topic")(topic)
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
}

