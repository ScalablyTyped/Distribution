package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "rangeView.toJSON()". */

trait RangeViewData extends js.Object {
  /**
               *
               * Represents the cell addresses of the RangeView. Read-only.
               *
               * [Api set: ExcelApi 1.3]
               */
  var cellAddresses: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
               *
               * Returns the number of visible columns. Read-only.
               *
               * [Api set: ExcelApi 1.3]
               */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the formula in A1-style notation.
               *
               * [Api set: ExcelApi 1.3]
               */
  var formulas: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
               *
               * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
               *
               * [Api set: ExcelApi 1.3]
               */
  var formulasLocal: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
               *
               * Represents the formula in R1C1-style notation.
               *
               * [Api set: ExcelApi 1.3]
               */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
               *
               * Returns a value that represents the index of the RangeView. Read-only.
               *
               * [Api set: ExcelApi 1.3]
               */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents Excel's number format code for the given cell.
               *
               * [Api set: ExcelApi 1.3]
               */
  var numberFormat: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
               *
               * Returns the number of visible rows. Read-only.
               *
               * [Api set: ExcelApi 1.3]
               */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Represents a collection of range views associated with the range. Read-only.
              *
              * [Api set: ExcelApi 1.3]
              */
  var rows: js.UndefOr[js.Array[RangeViewData]] = js.undefined
  /**
               *
               * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
               *
               * [Api set: ExcelApi 1.3]
               */
  var text: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
               *
               * Represents the type of data of each cell. Read-only.
               *
               * [Api set: ExcelApi 1.3]
               */
  var valueTypes: js.UndefOr[js.Array[js.Array[officeDashJsLib.ExcelNs.RangeValueType]]] = js.undefined
  /**
               *
               * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
               *
               * [Api set: ExcelApi 1.3]
               */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

