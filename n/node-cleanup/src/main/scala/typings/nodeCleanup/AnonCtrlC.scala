package typings.nodeCleanup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCtrlC extends js.Object {
  var ctrl_C: String
  var uncaughtException: String
}

object AnonCtrlC {
  @scala.inline
  def apply(ctrl_C: String, uncaughtException: String): AnonCtrlC = {
    val __obj = js.Dynamic.literal(ctrl_C = ctrl_C.asInstanceOf[js.Any], uncaughtException = uncaughtException.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCtrlC]
  }
}

