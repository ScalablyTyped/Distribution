package typings.nodeRal.anon

import typings.nodeRal.mod.RalLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var app: String = js.native
  var format_wf: String = js.native
  var logInstance: RalLogger = js.native
  var log_path: String = js.native
}

object App {
  @scala.inline
  def apply(app: String, format_wf: String, logInstance: RalLogger, log_path: String): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], format_wf = format_wf.asInstanceOf[js.Any], logInstance = logInstance.asInstanceOf[js.Any], log_path = log_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat_wf(value: String): Self = this.set("format_wf", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogInstance(value: RalLogger): Self = this.set("logInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog_path(value: String): Self = this.set("log_path", value.asInstanceOf[js.Any])
  }
  
}

