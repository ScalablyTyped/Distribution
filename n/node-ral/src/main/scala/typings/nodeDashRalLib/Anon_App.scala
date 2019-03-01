package typings
package nodeDashRalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var app: java.lang.String
  var format_wf: java.lang.String
  var logInstance: nodeDashRalLib.nodeDashRalMod.RalLogger
  var log_path: java.lang.String
}

object Anon_App {
  @scala.inline
  def apply(
    app: java.lang.String,
    format_wf: java.lang.String,
    logInstance: nodeDashRalLib.nodeDashRalMod.RalLogger,
    log_path: java.lang.String
  ): Anon_App = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("format_wf")(format_wf)
    __obj.updateDynamic("logInstance")(logInstance)
    __obj.updateDynamic("log_path")(log_path)
    __obj.asInstanceOf[Anon_App]
  }
}

