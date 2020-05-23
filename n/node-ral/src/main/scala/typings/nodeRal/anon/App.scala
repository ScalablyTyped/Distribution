package typings.nodeRal.anon

import typings.nodeRal.mod.RalLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var app: String
  var format_wf: String
  var logInstance: RalLogger
  var log_path: String
}

object App {
  @scala.inline
  def apply(app: String, format_wf: String, logInstance: RalLogger, log_path: String): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], format_wf = format_wf.asInstanceOf[js.Any], logInstance = logInstance.asInstanceOf[js.Any], log_path = log_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

