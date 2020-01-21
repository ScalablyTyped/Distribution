package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the List data validation criteria.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ListDataValidation extends js.Object {
  /**
    *
    * Displays the list in cell drop down or not, it defaults to true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var inCellDropDown: Boolean
  /**
    *
    * Source of the list for data validation
    When setting the value, it can be passed in as a Excel Range object, or a string that contains comma separated number, boolean or date.
    *
    * [Api set: ExcelApi 1.8]
    */
  var source: String | Range
}

object ListDataValidation {
  @scala.inline
  def apply(inCellDropDown: Boolean, source: String | Range): ListDataValidation = {
    val __obj = js.Dynamic.literal(inCellDropDown = inCellDropDown.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListDataValidation]
  }
}

