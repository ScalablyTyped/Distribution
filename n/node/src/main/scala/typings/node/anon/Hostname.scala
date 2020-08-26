package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hostname extends js.Object {
  var hostname: String = js.native
  var service: String = js.native
}

object Hostname {
  @scala.inline
  def apply(hostname: String, service: String): Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
  @scala.inline
  implicit class HostnameOps[Self <: Hostname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
  }
  
}

