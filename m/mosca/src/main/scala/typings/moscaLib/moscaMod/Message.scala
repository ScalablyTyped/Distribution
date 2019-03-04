package typings
package moscaLib.moscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var payload: js.Any
  var qos: scala.Double
  var retain: scala.Boolean
  var topic: java.lang.String
}

object Message {
  @scala.inline
  def apply(payload: js.Any, qos: scala.Double, retain: scala.Boolean, topic: java.lang.String): Message = {
    val __obj = js.Dynamic.literal(payload = payload, qos = qos, retain = retain, topic = topic)
  
    __obj.asInstanceOf[Message]
  }
}

