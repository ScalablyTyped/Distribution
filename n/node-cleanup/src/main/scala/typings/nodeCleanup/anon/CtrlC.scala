package typings.nodeCleanup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CtrlC extends js.Object {
  var ctrl_C: String
  var uncaughtException: String
}

object CtrlC {
  @scala.inline
  def apply(ctrl_C: String, uncaughtException: String): CtrlC = {
    val __obj = js.Dynamic.literal(ctrl_C = ctrl_C.asInstanceOf[js.Any], uncaughtException = uncaughtException.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtrlC]
  }
}

