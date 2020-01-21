package typings.nodeHueApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: String
  var name: String
  var number: String
  var serial: String
  var udn: String
}

object AnonDescription {
  @scala.inline
  def apply(description: String, name: String, number: String, serial: String, udn: String): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], udn = udn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescription]
  }
}

