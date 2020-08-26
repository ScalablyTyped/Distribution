package typings.naverWhale.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateType extends js.Object {
  val COMPLETE: String = js.native
  val INTERRUPTED: String = js.native
  val IN_PROGRESS: String = js.native
}

object StateType {
  @scala.inline
  def apply(COMPLETE: String, INTERRUPTED: String, IN_PROGRESS: String): StateType = {
    val __obj = js.Dynamic.literal(COMPLETE = COMPLETE.asInstanceOf[js.Any], INTERRUPTED = INTERRUPTED.asInstanceOf[js.Any], IN_PROGRESS = IN_PROGRESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
  @scala.inline
  implicit class StateTypeOps[Self <: StateType] (val x: Self) extends AnyVal {
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
    def setCOMPLETE(value: String): Self = this.set("COMPLETE", value.asInstanceOf[js.Any])
    @scala.inline
    def setINTERRUPTED(value: String): Self = this.set("INTERRUPTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setIN_PROGRESS(value: String): Self = this.set("IN_PROGRESS", value.asInstanceOf[js.Any])
  }
  
}

