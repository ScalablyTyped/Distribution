package typings.musicmatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Available extends js.Object {
  var available: Double = js.native
  var execute_time: Double = js.native
  var status_code: Double = js.native
}

object Available {
  @scala.inline
  def apply(available: Double, execute_time: Double, status_code: Double): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], execute_time = execute_time.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  @scala.inline
  implicit class AvailableOps[Self <: Available] (val x: Self) extends AnyVal {
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
    def setAvailable(value: Double): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecute_time(value: Double): Self = this.set("execute_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus_code(value: Double): Self = this.set("status_code", value.asInstanceOf[js.Any])
  }
  
}

