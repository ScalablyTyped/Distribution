package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFileEditOptions extends js.Object {
  var ignoreIfExists: js.UndefOr[Boolean] = js.native
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.native
  var overwrite: js.UndefOr[Boolean] = js.native
  var recursive: js.UndefOr[Boolean] = js.native
}

object WorkspaceFileEditOptions {
  @scala.inline
  def apply(): WorkspaceFileEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFileEditOptions]
  }
  @scala.inline
  implicit class WorkspaceFileEditOptionsOps[Self <: WorkspaceFileEditOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreIfExists(value: Boolean): Self = this.set("ignoreIfExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreIfExists: Self = this.set("ignoreIfExists", js.undefined)
    @scala.inline
    def setIgnoreIfNotExists(value: Boolean): Self = this.set("ignoreIfNotExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreIfNotExists: Self = this.set("ignoreIfNotExists", js.undefined)
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
  
}

