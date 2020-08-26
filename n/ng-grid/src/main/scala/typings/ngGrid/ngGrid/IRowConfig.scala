package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowConfig extends js.Object {
  var enableCellSelection: Boolean = js.native
  var enableRowSelection: Boolean = js.native
  var jqueryUITheme: Boolean = js.native
  var rowClasses: js.Array[String] = js.native
  var rowHeight: Double = js.native
  var selectWithCheckboxOnly: Boolean = js.native
  var selectedItems: js.Array[_] = js.native
  def afterSelectionChangeCallback(): Unit = js.native
  def beforeSelectionChangeCallback(): Unit = js.native
}

object IRowConfig {
  @scala.inline
  def apply(
    afterSelectionChangeCallback: () => Unit,
    beforeSelectionChangeCallback: () => Unit,
    enableCellSelection: Boolean,
    enableRowSelection: Boolean,
    jqueryUITheme: Boolean,
    rowClasses: js.Array[String],
    rowHeight: Double,
    selectWithCheckboxOnly: Boolean,
    selectedItems: js.Array[_]
  ): IRowConfig = {
    val __obj = js.Dynamic.literal(afterSelectionChangeCallback = js.Any.fromFunction0(afterSelectionChangeCallback), beforeSelectionChangeCallback = js.Any.fromFunction0(beforeSelectionChangeCallback), enableCellSelection = enableCellSelection.asInstanceOf[js.Any], enableRowSelection = enableRowSelection.asInstanceOf[js.Any], jqueryUITheme = jqueryUITheme.asInstanceOf[js.Any], rowClasses = rowClasses.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectWithCheckboxOnly = selectWithCheckboxOnly.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowConfig]
  }
  @scala.inline
  implicit class IRowConfigOps[Self <: IRowConfig] (val x: Self) extends AnyVal {
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
    def setAfterSelectionChangeCallback(value: () => Unit): Self = this.set("afterSelectionChangeCallback", js.Any.fromFunction0(value))
    @scala.inline
    def setBeforeSelectionChangeCallback(value: () => Unit): Self = this.set("beforeSelectionChangeCallback", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableCellSelection(value: Boolean): Self = this.set("enableCellSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableRowSelection(value: Boolean): Self = this.set("enableRowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setJqueryUITheme(value: Boolean): Self = this.set("jqueryUITheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowClassesVarargs(value: String*): Self = this.set("rowClasses", js.Array(value :_*))
    @scala.inline
    def setRowClasses(value: js.Array[String]): Self = this.set("rowClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectWithCheckboxOnly(value: Boolean): Self = this.set("selectWithCheckboxOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: js.Array[_]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
  }
  
}

