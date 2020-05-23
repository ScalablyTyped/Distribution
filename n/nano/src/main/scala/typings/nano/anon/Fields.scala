package typings.nano.anon

import typings.nano.mod.MangoSelector
import typings.nano.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  // Array of field names following the sort syntax.
  var fields: js.Array[SortOrder]
  // A selector to apply to documents at indexing time, creating a partial index.
  var partial_filter_selector: js.UndefOr[MangoSelector] = js.undefined
}

object Fields {
  @scala.inline
  def apply(fields: js.Array[SortOrder], partial_filter_selector: MangoSelector = null): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (partial_filter_selector != null) __obj.updateDynamic("partial_filter_selector")(partial_filter_selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

