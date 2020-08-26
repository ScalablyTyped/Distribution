package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebouncedMUIDataTableSearch extends MUIDataTableSearch {
  var debounceWait: Double = js.native
}

object DebouncedMUIDataTableSearch {
  @scala.inline
  def apply(debounceWait: Double): DebouncedMUIDataTableSearch = {
    val __obj = js.Dynamic.literal(debounceWait = debounceWait.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebouncedMUIDataTableSearch]
  }
  @scala.inline
  implicit class DebouncedMUIDataTableSearchOps[Self <: DebouncedMUIDataTableSearch] (val x: Self) extends AnyVal {
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
    def setDebounceWait(value: Double): Self = this.set("debounceWait", value.asInstanceOf[js.Any])
  }
  
}

