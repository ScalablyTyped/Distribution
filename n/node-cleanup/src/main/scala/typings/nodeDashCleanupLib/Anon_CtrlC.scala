package typings
package nodeDashCleanupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CtrlC extends js.Object {
  var ctrl_C: java.lang.String
  var uncaughtException: java.lang.String
}

object Anon_CtrlC {
  @scala.inline
  def apply(ctrl_C: java.lang.String, uncaughtException: java.lang.String): Anon_CtrlC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ctrl_C")(ctrl_C)
    __obj.updateDynamic("uncaughtException")(uncaughtException)
    __obj.asInstanceOf[Anon_CtrlC]
  }
}

