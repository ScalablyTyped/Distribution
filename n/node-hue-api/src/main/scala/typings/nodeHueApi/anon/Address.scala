package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: String
  var body: On
  var method: String
}

object Address {
  @scala.inline
  def apply(address: String, body: On, method: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

