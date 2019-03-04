package typings
package officeDashJsLib.ExcelNs

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
  var inCellDropDown: scala.Boolean
  /**
    *
    * The source of the list for data validation. The value is a string, which can either be a range reference (e.g. `"=Names!$A$1:$A$3"`) or a comma-separated list of the values themselves.
    *
    * [Api set: ExcelApi 1.8]
    */
  var source: java.lang.String
}

object ListDataValidation {
  @scala.inline
  def apply(inCellDropDown: scala.Boolean, source: java.lang.String): ListDataValidation = {
    val __obj = js.Dynamic.literal(inCellDropDown = inCellDropDown, source = source)
  
    __obj.asInstanceOf[ListDataValidation]
  }
}

