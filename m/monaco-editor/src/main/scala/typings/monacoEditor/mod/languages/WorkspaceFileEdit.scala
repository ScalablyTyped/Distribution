package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFileEdit extends js.Object {
  var metadata: js.UndefOr[WorkspaceEditMetadata] = js.native
  var newUri: js.UndefOr[Uri] = js.native
  var oldUri: js.UndefOr[Uri] = js.native
  var options: js.UndefOr[WorkspaceFileEditOptions] = js.native
}

object WorkspaceFileEdit {
  @scala.inline
  def apply(): WorkspaceFileEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFileEdit]
  }
  @scala.inline
  implicit class WorkspaceFileEditOps[Self <: WorkspaceFileEdit] (val x: Self) extends AnyVal {
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
    def setMetadata(value: WorkspaceEditMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setNewUri(value: Uri): Self = this.set("newUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewUri: Self = this.set("newUri", js.undefined)
    @scala.inline
    def setOldUri(value: Uri): Self = this.set("oldUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldUri: Self = this.set("oldUri", js.undefined)
    @scala.inline
    def setOptions(value: WorkspaceFileEditOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

