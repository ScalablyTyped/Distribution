package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IColumnDef extends js.Object {
  /** String name for filter to use on the aggregate label ('currency', 'date', etc..) defaults to cellFilter if not set. */
  var aggLabelFilter: js.UndefOr[java.lang.String] = js.undefined
  /** User defined CSS class name */
  var cellClass: js.UndefOr[java.lang.String] = js.undefined
  /** Controls when to use the edit template on per-row basis using an angular expression (enableCellEdit must also be true for editing)*/
  var cellEditableCondition: js.UndefOr[java.lang.String] = js.undefined
  /** string name for filter to use on the cell ('currency', 'date', etc..) */
  var cellFilter: js.UndefOr[java.lang.String] = js.undefined
  /** Html template used to render the cell */
  var cellTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** What to display in the column header */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The template to use while editing */
  var editableCellTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Allows the cell to use an edit template when focused (grid option enableCellSelection must be enabled)*/
  var enableCellEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** Can also be a property path on your data model. "foo.bar.myField", "Name.First", etc..*/
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** Allows the column to be grouped with drag and drop, but has no effect on gridOptions.groups */
  var groupable: js.UndefOr[scala.Boolean] = js.undefined
  /** Html template used to render the header cell */
  var headerCellTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** User defined CSS class name for the header cell */
  var headerClass: js.UndefOr[java.lang.String] = js.undefined
  /** The minum width the column is allowed to be. See width for the different options */
  var minWidth: js.UndefOr[js.Any] = js.undefined
  /** Allows the column to be pinned when enablePinning is set to true */
  var pinnable: js.UndefOr[scala.Boolean] = js.undefined
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /** Restrict or allow the column to be resized */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /** The funtion to use when filtering values in this column */
  var sortFn: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]] = js.undefined
  /** Restrict or allow the column to be sorted */
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  /** Set the default visiblity of the column */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * This can be an absolute numberor it can also be defined in percentages (20%, 30%),
           * in weighted *s, or "auto" (which sizes the column based on data length)
           * (much like WPF/Silverlight)/ note: "auto" only works in single page apps currently because the re-size
           * happens on "document.ready
           */
  var width: js.UndefOr[js.Any] = js.undefined
}

