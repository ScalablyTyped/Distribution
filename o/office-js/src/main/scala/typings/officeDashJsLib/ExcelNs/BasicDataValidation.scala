package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the Basic Type data validation criteria.
     *
     * [Api set: ExcelApi 1.8]
     */

trait BasicDataValidation extends js.Object {
  /**
           *
           * Gets or sets the Formula1, i.e. minimum value or value depending of the operator.
              When setting the value, it can be passed in as a number, a range object, or a string formula (where the string is either a stringified number, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
              When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
           *
           * [Api set: ExcelApi 1.8]
           */
  var formula1: java.lang.String | scala.Double | Range
  /**
           *
           * Gets or sets the Formula2, i.e. maximum value or value depending of the operator.
              When setting the value, it can be passed in as a number, a range object, or a string formula (where the string is either a stringified number, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
              When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
           *
           * [Api set: ExcelApi 1.8]
           */
  var formula2: js.UndefOr[java.lang.String | scala.Double | Range] = js.undefined
  /**
           *
           * The operator to use for validating the data.
           *
           * [Api set: ExcelApi 1.8]
           */
  var operator: DataValidationOperator | officeDashJsLib.officeDashJsLibStrings.Between | officeDashJsLib.officeDashJsLibStrings.NotBetween | officeDashJsLib.officeDashJsLibStrings.EqualTo | officeDashJsLib.officeDashJsLibStrings.NotEqualTo | officeDashJsLib.officeDashJsLibStrings.GreaterThan | officeDashJsLib.officeDashJsLibStrings.LessThan | officeDashJsLib.officeDashJsLibStrings.GreaterThanOrEqualTo | officeDashJsLib.officeDashJsLibStrings.LessThanOrEqualTo
}

