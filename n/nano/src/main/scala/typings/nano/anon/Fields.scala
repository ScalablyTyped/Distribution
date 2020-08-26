package typings.nano.anon

import typings.nano.mod.MangoSelector
import typings.nano.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  // Array of field names following the sort syntax.
  var fields: js.Array[SortOrder] = js.native
  // A selector to apply to documents at indexing time, creating a partial index.
  var partial_filter_selector: js.UndefOr[MangoSelector] = js.native
}

object Fields {
  @scala.inline
  def apply(fields: js.Array[SortOrder]): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: SortOrder*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[SortOrder]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartial_filter_selector(value: MangoSelector): Self = this.set("partial_filter_selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartial_filter_selector: Self = this.set("partial_filter_selector", js.undefined)
  }
  
}

