package typings.nodeHueApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: String
  var body: AnonOn
  var method: String
}

object AnonAddress {
  @scala.inline
  def apply(address: String, body: AnonOn, method: String): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

