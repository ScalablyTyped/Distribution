package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents an Excel table.
         *
         * [Api set: ExcelApi 1.1]
         */

trait TableLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents the AutoFilter object of the table.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var autoFilter: js.UndefOr[AutoFilterLoadOptions] = js.undefined
  /**
              *
              * Represents a collection of all the columns in the table.
              *
              * [Api set: ExcelApi 1.1]
              */
  var columns: js.UndefOr[TableColumnCollectionLoadOptions] = js.undefined
  /**
               *
               * Indicates whether the first column contains special formatting.
               *
               * [Api set: ExcelApi 1.3]
               */
  var highlightFirstColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates whether the last column contains special formatting.
               *
               * [Api set: ExcelApi 1.3]
               */
  var highlightLastColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns a value that uniquely identifies the table in a given workbook. The value of the identifier remains the same even when the table is renamed. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns a numeric id.
               *
               * [Api set: ExcelApi 1.8]
               */
  var legacyId: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Name of the table.
               *
               * [Api set: ExcelApi 1.1]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents a collection of all the rows in the table.
              *
              * [Api set: ExcelApi 1.1]
              */
  var rows: js.UndefOr[TableRowCollectionLoadOptions] = js.undefined
  /**
               *
               * Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
               *
               * [Api set: ExcelApi 1.3]
               */
  var showBandedColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
               *
               * [Api set: ExcelApi 1.3]
               */
  var showBandedRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
               *
               * [Api set: ExcelApi 1.3]
               */
  var showFilterButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
               *
               * [Api set: ExcelApi 1.1]
               */
  var showHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
               *
               * [Api set: ExcelApi 1.1]
               */
  var showTotals: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents the sorting for the table.
              *
              * [Api set: ExcelApi 1.2]
              */
  var sort: js.UndefOr[TableSortLoadOptions] = js.undefined
  /**
               *
               * Constant value that represents the Table style. Possible values are: TableStyleLight1 thru TableStyleLight21, TableStyleMedium1 thru TableStyleMedium28, TableStyleStyleDark1 thru TableStyleStyleDark11. A custom user-defined style present in the workbook can also be specified.
               *
               * [Api set: ExcelApi 1.1]
               */
  var style: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * The worksheet containing the current table.
              *
              * [Api set: ExcelApi 1.2]
              */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

