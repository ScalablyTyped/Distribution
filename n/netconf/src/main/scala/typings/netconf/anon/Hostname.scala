package typings.netconf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hostname extends js.Object {
  var hostname: String
  var module: String
  var serial: String
  var uptime: String
  var version: String
}

object Hostname {
  @scala.inline
  def apply(hostname: String, module: String, serial: String, uptime: String, version: String): Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
}

