package typings
package moscaLib.moscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packet extends js.Object {
  var messageId: java.lang.String
  var payload: js.Any
  var qos: scala.Double
  var retain: scala.Boolean
  var topic: java.lang.String
}

object Packet {
  @scala.inline
  def apply(
    messageId: java.lang.String,
    payload: js.Any,
    qos: scala.Double,
    retain: scala.Boolean,
    topic: java.lang.String
  ): Packet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messageId")(messageId)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("qos")(qos)
    __obj.updateDynamic("retain")(retain)
    __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[Packet]
  }
}

