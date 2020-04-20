package typings.netconf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostname extends js.Object {
  var hostname: String
  var module: String
  var serial: String
  var uptime: String
  var version: String
}

object AnonHostname {
  @scala.inline
  def apply(hostname: String, module: String, serial: String, uptime: String, version: String): AnonHostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostname]
  }
}

