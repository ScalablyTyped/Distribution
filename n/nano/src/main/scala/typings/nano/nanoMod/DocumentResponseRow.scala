package typings.nano.nanoMod

import typings.nano.Anon_Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentResponseRow[D] extends DocumentResponseRowMeta {
  var doc: js.UndefOr[D with Document] = js.undefined
}

object DocumentResponseRow {
  @scala.inline
  def apply[D](id: String, key: String, value: Anon_Rev, doc: D with Document = null): DocumentResponseRow[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponseRow[D]]
  }
}

