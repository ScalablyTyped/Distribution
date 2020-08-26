package typings.moduleDeps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputRow extends js.Object {
  var entry: js.UndefOr[Boolean] = js.native
  var expose: String = js.native
  var file: String = js.native
  var id: String = js.native
  var noparse: js.UndefOr[Boolean] = js.native
}

object InputRow {
  @scala.inline
  def apply(expose: String, file: String, id: String): InputRow = {
    val __obj = js.Dynamic.literal(expose = expose.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputRow]
  }
  @scala.inline
  implicit class InputRowOps[Self <: InputRow] (val x: Self) extends AnyVal {
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
    def setExpose(value: String): Self = this.set("expose", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntry(value: Boolean): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    @scala.inline
    def setNoparse(value: Boolean): Self = this.set("noparse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoparse: Self = this.set("noparse", js.undefined)
  }
  
}

