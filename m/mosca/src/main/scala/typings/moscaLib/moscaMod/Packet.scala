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

