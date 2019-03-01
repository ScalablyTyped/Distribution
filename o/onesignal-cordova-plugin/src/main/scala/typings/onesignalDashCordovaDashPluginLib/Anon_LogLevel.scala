package typings
package onesignalDashCordovaDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LogLevel extends js.Object {
  var logLevel: scala.Double
  var visualLevel: scala.Double
}

object Anon_LogLevel {
  @scala.inline
  def apply(logLevel: scala.Double, visualLevel: scala.Double): Anon_LogLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logLevel")(logLevel)
    __obj.updateDynamic("visualLevel")(visualLevel)
    __obj.asInstanceOf[Anon_LogLevel]
  }
}

