package typings.netconf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hostname extends js.Object {
  var hostname: String
  var module: String
  var serial: String
  var uptime: String
  var version: String
}

object Anon_Hostname {
  @scala.inline
  def apply(hostname: String, module: String, serial: String, uptime: String, version: String): Anon_Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hostname]
  }
}

