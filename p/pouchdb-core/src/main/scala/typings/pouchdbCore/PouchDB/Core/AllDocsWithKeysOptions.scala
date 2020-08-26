package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllDocsWithKeysOptions extends AllDocsOptions {
  /** Constrains results to documents matching any of these keys. */
  var keys: js.Array[DocumentId] = js.native
}

object AllDocsWithKeysOptions {
  @scala.inline
  def apply(keys: js.Array[DocumentId]): AllDocsWithKeysOptions = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsWithKeysOptions]
  }
  @scala.inline
  implicit class AllDocsWithKeysOptionsOps[Self <: AllDocsWithKeysOptions] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: DocumentId*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[DocumentId]): Self = this.set("keys", value.asInstanceOf[js.Any])
  }
  
}

