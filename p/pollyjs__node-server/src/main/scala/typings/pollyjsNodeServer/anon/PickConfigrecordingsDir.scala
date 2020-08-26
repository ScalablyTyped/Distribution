package typings.pollyjsNodeServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@pollyjs/node-server.@pollyjs/node-server.Config, 'recordingsDir'> */
@js.native
trait PickConfigrecordingsDir extends js.Object {
  var recordingsDir: String = js.native
}

object PickConfigrecordingsDir {
  @scala.inline
  def apply(recordingsDir: String): PickConfigrecordingsDir = {
    val __obj = js.Dynamic.literal(recordingsDir = recordingsDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickConfigrecordingsDir]
  }
  @scala.inline
  implicit class PickConfigrecordingsDirOps[Self <: PickConfigrecordingsDir] (val x: Self) extends AnyVal {
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
  }
  
}

