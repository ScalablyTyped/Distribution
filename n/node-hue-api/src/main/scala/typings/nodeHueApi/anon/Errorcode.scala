package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.BackupStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errorcode extends js.Object {
  var errorcode: Double = js.native
  var status: BackupStatus = js.native
}

object Errorcode {
  @scala.inline
  def apply(errorcode: Double, status: BackupStatus): Errorcode = {
    val __obj = js.Dynamic.literal(errorcode = errorcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcode]
  }
  @scala.inline
  implicit class ErrorcodeOps[Self <: Errorcode] (val x: Self) extends AnyVal {
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
    def setErrorcode(value: Double): Self = this.set("errorcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: BackupStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

