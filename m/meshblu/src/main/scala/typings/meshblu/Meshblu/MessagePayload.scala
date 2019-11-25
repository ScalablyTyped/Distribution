package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePayload extends js.Object {
  var devices: js.Array[String]
  var payload: js.Any
  var qos: js.UndefOr[Double] = js.undefined
  var topic: String
}

object MessagePayload {
  @scala.inline
  def apply(devices: js.Array[String], payload: js.Any, topic: String, qos: Int | Double = null): MessagePayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
}

