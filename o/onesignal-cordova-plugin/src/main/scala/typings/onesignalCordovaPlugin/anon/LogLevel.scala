package typings.onesignalCordovaPlugin.anon

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSLogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogLevel extends js.Object {
  var logLevel: OSLogLevel = js.native
  var visualLevel: OSLogLevel = js.native
}

object LogLevel {
  @scala.inline
  def apply(logLevel: OSLogLevel, visualLevel: OSLogLevel): LogLevel = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], visualLevel = visualLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevel]
  }
  @scala.inline
  implicit class LogLevelOps[Self <: LogLevel] (val x: Self) extends AnyVal {
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
    def setLogLevel(value: OSLogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualLevel(value: OSLogLevel): Self = this.set("visualLevel", value.asInstanceOf[js.Any])
  }
  
}

