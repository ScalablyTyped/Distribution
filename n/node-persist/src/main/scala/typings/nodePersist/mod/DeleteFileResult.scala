package typings.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileResult extends js.Object {
  var existed: Boolean = js.native
  var file: String = js.native
  var removed: Boolean = js.native
}

object DeleteFileResult {
  @scala.inline
  def apply(existed: Boolean, file: String, removed: Boolean): DeleteFileResult = {
    val __obj = js.Dynamic.literal(existed = existed.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileResult]
  }
  @scala.inline
  implicit class DeleteFileResultOps[Self <: DeleteFileResult] (val x: Self) extends AnyVal {
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
    def setExisted(value: Boolean): Self = this.set("existed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
  
}

