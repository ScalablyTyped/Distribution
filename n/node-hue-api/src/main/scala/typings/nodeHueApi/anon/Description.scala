package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: String
  var name: String
  var number: String
  var serial: String
  var udn: String
}

object Description {
  @scala.inline
  def apply(description: String, name: String, number: String, serial: String, udn: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], udn = udn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

