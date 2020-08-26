package typings.moduleDeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
  var entry: js.UndefOr[Boolean] = js.native
  var expose: js.UndefOr[String] = js.native
  var file: String = js.native
  var id: String = js.native
  var noparse: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[String] = js.native
}

object Entry {
  @scala.inline
  def apply(file: String, id: String): Entry = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntry(value: Boolean): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    @scala.inline
    def setExpose(value: String): Self = this.set("expose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpose: Self = this.set("expose", js.undefined)
    @scala.inline
    def setNoparse(value: Boolean): Self = this.set("noparse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoparse: Self = this.set("noparse", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

