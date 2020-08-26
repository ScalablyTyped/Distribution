package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAppContent extends Entity {
  // The list of files for this app content version.
  var files: js.UndefOr[js.Array[MobileAppContentFile]] = js.native
}

object MobileAppContent {
  @scala.inline
  def apply(): MobileAppContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppContent]
  }
  @scala.inline
  implicit class MobileAppContentOps[Self <: MobileAppContent] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: MobileAppContentFile*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[MobileAppContentFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
  }
  
}

