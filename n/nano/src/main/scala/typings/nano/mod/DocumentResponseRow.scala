package typings.nano.mod

import typings.nano.anon.Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentResponseRow[D] extends DocumentResponseRowMeta {
  var doc: js.UndefOr[D with Document] = js.native
}

object DocumentResponseRow {
  @scala.inline
  def apply[D](id: String, key: String, value: Rev): DocumentResponseRow[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponseRow[D]]
  }
  @scala.inline
  implicit class DocumentResponseRowOps[Self <: DocumentResponseRow[_], D] (val x: Self with DocumentResponseRow[D]) extends AnyVal {
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
    def setDoc(value: D with Document): Self = this.set("doc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
  }
  
}

