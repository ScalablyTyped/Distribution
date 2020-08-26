package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressUpdateEvent extends js.Object {
  var progress: Double = js.native
  var totalBytesExpectedToWrite: Double = js.native
  var totalBytesWritten: Double = js.native
}

object IProgressUpdateEvent {
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToWrite: Double, totalBytesWritten: Double): IProgressUpdateEvent = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressUpdateEvent]
  }
  @scala.inline
  implicit class IProgressUpdateEventOps[Self <: IProgressUpdateEvent] (val x: Self) extends AnyVal {
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
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytesExpectedToWrite(value: Double): Self = this.set("totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytesWritten(value: Double): Self = this.set("totalBytesWritten", value.asInstanceOf[js.Any])
  }
  
}

