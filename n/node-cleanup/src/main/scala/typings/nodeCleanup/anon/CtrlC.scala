package typings.nodeCleanup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CtrlC extends js.Object {
  var ctrl_C: String = js.native
  var uncaughtException: String = js.native
}

object CtrlC {
  @scala.inline
  def apply(ctrl_C: String, uncaughtException: String): CtrlC = {
    val __obj = js.Dynamic.literal(ctrl_C = ctrl_C.asInstanceOf[js.Any], uncaughtException = uncaughtException.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtrlC]
  }
  @scala.inline
  implicit class CtrlCOps[Self <: CtrlC] (val x: Self) extends AnyVal {
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
    def setCtrl_C(value: String): Self = this.set("ctrl_C", value.asInstanceOf[js.Any])
    @scala.inline
    def setUncaughtException(value: String): Self = this.set("uncaughtException", value.asInstanceOf[js.Any])
  }
  
}

