package typings.multiaddr.multiaddrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var family: String
  var host: String
  var port: String
  var transport: String
}

object Options {
  @scala.inline
  def apply(family: String, host: String, port: String, transport: String): Options = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

