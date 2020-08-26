package typings.nano.mod

import typings.nano.anon.Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// Document scope request and response
// -------------------------------------
@js.native
trait DocumentResponseRowMeta extends js.Object {
  var id: String = js.native
  var key: String = js.native
  var value: Rev = js.native
}

object DocumentResponseRowMeta {
  @scala.inline
  def apply(id: String, key: String, value: Rev): DocumentResponseRowMeta = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponseRowMeta]
  }
  @scala.inline
  implicit class DocumentResponseRowMetaOps[Self <: DocumentResponseRowMeta] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Rev): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

