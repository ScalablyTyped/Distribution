package typings.pino.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogDescriptor
  extends /* key */ StringDictionary[js.Any] {
  var hostname: String = js.native
  var level: Double = js.native
  var msg: String = js.native
  var pid: Double = js.native
  var time: String = js.native
  var v: Double = js.native
}

object LogDescriptor {
  @scala.inline
  def apply(hostname: String, level: Double, msg: String, pid: Double, time: String, v: Double): LogDescriptor = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDescriptor]
  }
  @scala.inline
  implicit class LogDescriptorOps[Self <: LogDescriptor] (val x: Self) extends AnyVal {
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

