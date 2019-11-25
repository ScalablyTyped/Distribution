package typings.nodeDashHueDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var body: Anon_On
  var method: String
}

object Anon_Address {
  @scala.inline
  def apply(address: String, body: Anon_On, method: String): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Address]
  }
}

