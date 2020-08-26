package typings.novaEditorNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowDirectories extends js.Object {
  var allowDirectories: js.UndefOr[Boolean] = js.native
  var allowFiles: js.UndefOr[Boolean] = js.native
  var allowMultiple: js.UndefOr[Boolean] = js.native
  var filetype: js.UndefOr[js.Array[String]] = js.native
  var prompt: js.UndefOr[String] = js.native
  var relative: js.UndefOr[Boolean] = js.native
}

object AllowDirectories {
  @scala.inline
  def apply(): AllowDirectories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDirectories]
  }
  @scala.inline
  implicit class AllowDirectoriesOps[Self <: AllowDirectories] (val x: Self) extends AnyVal {
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
    def setAllowDirectories(value: Boolean): Self = this.set("allowDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDirectories: Self = this.set("allowDirectories", js.undefined)
    @scala.inline
    def setAllowFiles(value: Boolean): Self = this.set("allowFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFiles: Self = this.set("allowFiles", js.undefined)
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    @scala.inline
    def setFiletypeVarargs(value: String*): Self = this.set("filetype", js.Array(value :_*))
    @scala.inline
    def setFiletype(value: js.Array[String]): Self = this.set("filetype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiletype: Self = this.set("filetype", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
  }
  
}

