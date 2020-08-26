package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDef extends js.Object {
  /** String name for filter to use on the aggregate label ('currency', 'date', etc..) defaults to cellFilter if not set. */
  var aggLabelFilter: js.UndefOr[String] = js.native
  /** User defined CSS class name */
  var cellClass: js.UndefOr[String] = js.native
  /** Controls when to use the edit template on per-row basis using an angular expression (enableCellEdit must also be true for editing)*/
  var cellEditableCondition: js.UndefOr[String] = js.native
  /** string name for filter to use on the cell ('currency', 'date', etc..) */
  var cellFilter: js.UndefOr[String] = js.native
  /** Html template used to render the cell */
  var cellTemplate: js.UndefOr[String] = js.native
  /** What to display in the column header */
  var displayName: js.UndefOr[String] = js.native
  /** The template to use while editing */
  var editableCellTemplate: js.UndefOr[String] = js.native
  /** Allows the cell to use an edit template when focused (grid option enableCellSelection must be enabled)*/
  var enableCellEdit: js.UndefOr[Boolean] = js.native
  /** Can also be a property path on your data model. "foo.bar.myField", "Name.First", etc..*/
  var field: js.UndefOr[String] = js.native
  /** Allows the column to be grouped with drag and drop, but has no effect on gridOptions.groups */
  var groupable: js.UndefOr[Boolean] = js.native
  /** Html template used to render the header cell */
  var headerCellTemplate: js.UndefOr[String] = js.native
  /** User defined CSS class name for the header cell */
  var headerClass: js.UndefOr[String] = js.native
  /** The minum width the column is allowed to be. See width for the different options */
  var minWidth: js.UndefOr[js.Any] = js.native
  /** Allows the column to be pinned when enablePinning is set to true */
  var pinnable: js.UndefOr[Boolean] = js.native
  var pinned: js.UndefOr[Boolean] = js.native
  /** Restrict or allow the column to be resized */
  var resizable: js.UndefOr[Boolean] = js.native
  /** The funtion to use when filtering values in this column */
  var sortFn: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.native
  /** Restrict or allow the column to be sorted */
  var sortable: js.UndefOr[Boolean] = js.native
  /** Set the default visiblity of the column */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * This can be an absolute numberor it can also be defined in percentages (20%, 30%),
    * in weighted *s, or "auto" (which sizes the column based on data length)
    * (much like WPF/Silverlight)/ note: "auto" only works in single page apps currently because the re-size
    * happens on "document.ready
    */
  var width: js.UndefOr[js.Any] = js.native
}

object IColumnDef {
  @scala.inline
  def apply(): IColumnDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef]
  }
  @scala.inline
  implicit class IColumnDefOps[Self <: IColumnDef] (val x: Self) extends AnyVal {
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
    def setAggLabelFilter(value: String): Self = this.set("aggLabelFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggLabelFilter: Self = this.set("aggLabelFilter", js.undefined)
    @scala.inline
    def setCellClass(value: String): Self = this.set("cellClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellClass: Self = this.set("cellClass", js.undefined)
    @scala.inline
    def setCellEditableCondition(value: String): Self = this.set("cellEditableCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellEditableCondition: Self = this.set("cellEditableCondition", js.undefined)
    @scala.inline
    def setCellFilter(value: String): Self = this.set("cellFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellFilter: Self = this.set("cellFilter", js.undefined)
    @scala.inline
    def setCellTemplate(value: String): Self = this.set("cellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellTemplate: Self = this.set("cellTemplate", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEditableCellTemplate(value: String): Self = this.set("editableCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditableCellTemplate: Self = this.set("editableCellTemplate", js.undefined)
    @scala.inline
    def setEnableCellEdit(value: Boolean): Self = this.set("enableCellEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCellEdit: Self = this.set("enableCellEdit", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setGroupable(value: Boolean): Self = this.set("groupable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupable: Self = this.set("groupable", js.undefined)
    @scala.inline
    def setHeaderCellTemplate(value: String): Self = this.set("headerCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCellTemplate: Self = this.set("headerCellTemplate", js.undefined)
    @scala.inline
    def setHeaderClass(value: String): Self = this.set("headerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderClass: Self = this.set("headerClass", js.undefined)
    @scala.inline
    def setMinWidth(value: js.Any): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setPinnable(value: Boolean): Self = this.set("pinnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinnable: Self = this.set("pinnable", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setSortFn(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("sortFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSortFn: Self = this.set("sortFn", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

