package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Data validation rule contains different types of data validation. You can only use one of them at a time according the Excel.DataValidationType.
  *
  * [Api set: ExcelApi 1.8]
  */
trait DataValidationRule extends js.Object {
  /**
    *
    * Custom data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var custom: js.UndefOr[CustomDataValidation] = js.undefined
  /**
    *
    * Date data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var date: js.UndefOr[DateTimeDataValidation] = js.undefined
  /**
    *
    * Decimal data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var decimal: js.UndefOr[BasicDataValidation] = js.undefined
  /**
    *
    * List data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var list: js.UndefOr[ListDataValidation] = js.undefined
  /**
    *
    * TextLength data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textLength: js.UndefOr[BasicDataValidation] = js.undefined
  /**
    *
    * Time data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var time: js.UndefOr[DateTimeDataValidation] = js.undefined
  /**
    *
    * WholeNumber data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var wholeNumber: js.UndefOr[BasicDataValidation] = js.undefined
}

