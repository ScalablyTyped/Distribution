package typings.ngDashGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef extends js.Object {
  /** String name for filter to use on the aggregate label ('currency', 'date', etc..) defaults to cellFilter if not set. */
  var aggLabelFilter: js.UndefOr[String] = js.undefined
  /** User defined CSS class name */
  var cellClass: js.UndefOr[String] = js.undefined
  /** Controls when to use the edit template on per-row basis using an angular expression (enableCellEdit must also be true for editing)*/
  var cellEditableCondition: js.UndefOr[String] = js.undefined
  /** string name for filter to use on the cell ('currency', 'date', etc..) */
  var cellFilter: js.UndefOr[String] = js.undefined
  /** Html template used to render the cell */
  var cellTemplate: js.UndefOr[String] = js.undefined
  /** What to display in the column header */
  var displayName: js.UndefOr[String] = js.undefined
  /** The template to use while editing */
  var editableCellTemplate: js.UndefOr[String] = js.undefined
  /** Allows the cell to use an edit template when focused (grid option enableCellSelection must be enabled)*/
  var enableCellEdit: js.UndefOr[Boolean] = js.undefined
  /** Can also be a property path on your data model. "foo.bar.myField", "Name.First", etc..*/
  var field: js.UndefOr[String] = js.undefined
  /** Allows the column to be grouped with drag and drop, but has no effect on gridOptions.groups */
  var groupable: js.UndefOr[Boolean] = js.undefined
  /** Html template used to render the header cell */
  var headerCellTemplate: js.UndefOr[String] = js.undefined
  /** User defined CSS class name for the header cell */
  var headerClass: js.UndefOr[String] = js.undefined
  /** The minum width the column is allowed to be. See width for the different options */
  var minWidth: js.UndefOr[js.Any] = js.undefined
  /** Allows the column to be pinned when enablePinning is set to true */
  var pinnable: js.UndefOr[Boolean] = js.undefined
  var pinned: js.UndefOr[Boolean] = js.undefined
  /** Restrict or allow the column to be resized */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /** The funtion to use when filtering values in this column */
  var sortFn: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.undefined
  /** Restrict or allow the column to be sorted */
  var sortable: js.UndefOr[Boolean] = js.undefined
  /** Set the default visiblity of the column */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * This can be an absolute numberor it can also be defined in percentages (20%, 30%),
    * in weighted *s, or "auto" (which sizes the column based on data length)
    * (much like WPF/Silverlight)/ note: "auto" only works in single page apps currently because the re-size
    * happens on "document.ready
    */
  var width: js.UndefOr[js.Any] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply(
    aggLabelFilter: String = null,
    cellClass: String = null,
    cellEditableCondition: String = null,
    cellFilter: String = null,
    cellTemplate: String = null,
    displayName: String = null,
    editableCellTemplate: String = null,
    enableCellEdit: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    groupable: js.UndefOr[Boolean] = js.undefined,
    headerCellTemplate: String = null,
    headerClass: String = null,
    minWidth: js.Any = null,
    pinnable: js.UndefOr[Boolean] = js.undefined,
    pinned: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    sortFn: (/* a */ js.Any, /* b */ js.Any) => Double = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.Any = null
  ): IColumnDef = {
    val __obj = js.Dynamic.literal()
    if (aggLabelFilter != null) __obj.updateDynamic("aggLabelFilter")(aggLabelFilter)
    if (cellClass != null) __obj.updateDynamic("cellClass")(cellClass)
    if (cellEditableCondition != null) __obj.updateDynamic("cellEditableCondition")(cellEditableCondition)
    if (cellFilter != null) __obj.updateDynamic("cellFilter")(cellFilter)
    if (cellTemplate != null) __obj.updateDynamic("cellTemplate")(cellTemplate)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (editableCellTemplate != null) __obj.updateDynamic("editableCellTemplate")(editableCellTemplate)
    if (!js.isUndefined(enableCellEdit)) __obj.updateDynamic("enableCellEdit")(enableCellEdit)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(groupable)) __obj.updateDynamic("groupable")(groupable)
    if (headerCellTemplate != null) __obj.updateDynamic("headerCellTemplate")(headerCellTemplate)
    if (headerClass != null) __obj.updateDynamic("headerClass")(headerClass)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth)
    if (!js.isUndefined(pinnable)) __obj.updateDynamic("pinnable")(pinnable)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (sortFn != null) __obj.updateDynamic("sortFn")(js.Any.fromFunction2(sortFn))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IColumnDef]
  }
}

