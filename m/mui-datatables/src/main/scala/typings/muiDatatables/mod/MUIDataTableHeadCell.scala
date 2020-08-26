package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableHeadCell extends js.Object {
  var children: js.UndefOr[js.Any] = js.native
  var classes: js.UndefOr[js.Object] = js.native
  var hint: String = js.native
  var options: js.Object = js.native
  var sort: Boolean = js.native
  var sortOrder: js.UndefOr[MUISortOptions] = js.native
  def toggleSort(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}

object MUIDataTableHeadCell {
  @scala.inline
  def apply(hint: String, options: js.Object, sort: Boolean, toggleSort: js.Any => js.Any): MUIDataTableHeadCell = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], toggleSort = js.Any.fromFunction1(toggleSort))
    __obj.asInstanceOf[MUIDataTableHeadCell]
  }
  @scala.inline
  implicit class MUIDataTableHeadCellOps[Self <: MUIDataTableHeadCell] (val x: Self) extends AnyVal {
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
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggleSort(value: js.Any => js.Any): Self = this.set("toggleSort", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setSortOrder(value: MUISortOptions): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

