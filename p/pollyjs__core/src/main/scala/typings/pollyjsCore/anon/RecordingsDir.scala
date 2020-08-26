package typings.pollyjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordingsDir extends js.Object {
  var recordingsDir: js.UndefOr[String] = js.native
}

object RecordingsDir {
  @scala.inline
  def apply(): RecordingsDir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingsDir]
  }
  @scala.inline
  implicit class RecordingsDirOps[Self <: RecordingsDir] (val x: Self) extends AnyVal {
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
    def setRecordingsDir(value: String): Self = this.set("recordingsDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordingsDir: Self = this.set("recordingsDir", js.undefined)
  }
  
}

