package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the Date data validation criteria.
     *
     * [Api set: ExcelApi 1.8]
     */

trait DateTimeDataValidation extends js.Object {
  /**
           *
           * Gets or sets the Formula1, i.e. minimum value or value depending of the operator.
              When setting the value, it can be passed in as a Date, a Range object, or a string formula (where the string is either a stringified date/time in ISO8601 format, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
              When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
           *
           * [Api set: ExcelApi 1.8]
           */
  var formula1: java.lang.String | stdLib.Date | Range
  /**
           *
           * Gets or sets the Formula2, i.e. maximum value or value depending of the operator.
              When setting the value, it can be passed in as a Date, a Range object, or a string (where the string is either a stringified date/time in ISO8601 format, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
              When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
           *
           * [Api set: ExcelApi 1.8]
           */
  var formula2: js.UndefOr[java.lang.String | stdLib.Date | Range] = js.undefined
  /**
           *
           * The operator to use for validating the data.
           *
           * [Api set: ExcelApi 1.8]
           */
  var operator: DataValidationOperator | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Between | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotBetween | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EqualTo | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotEqualTo | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GreaterThan | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LessThan | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GreaterThanOrEqualTo | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LessThanOrEqualTo
}

