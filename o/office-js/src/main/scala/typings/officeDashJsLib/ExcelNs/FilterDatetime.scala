package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents how to filter a date when filtering on values.
  *
  * [Api set: ExcelApi 1.2]
  */
trait FilterDatetime extends js.Object {
  /**
    *
    * The date in ISO8601 format used to filter data.
    *
    * [Api set: ExcelApi 1.2]
    */
  var date: java.lang.String
  /**
    *
    * How specific the date should be used to keep data. For example, if the date is 2005-04-02 and the specifity is set to "month", the filter operation will keep all rows with a date in the month of april 2009.
    *
    * [Api set: ExcelApi 1.2]
    */
  var specificity: FilterDatetimeSpecificity | officeDashJsLib.officeDashJsLibStrings.Year | officeDashJsLib.officeDashJsLibStrings.Month | officeDashJsLib.officeDashJsLibStrings.Day | officeDashJsLib.officeDashJsLibStrings.Hour | officeDashJsLib.officeDashJsLibStrings.Minute | officeDashJsLib.officeDashJsLibStrings.Second
}

object FilterDatetime {
  @scala.inline
  def apply(
    date: java.lang.String,
    specificity: FilterDatetimeSpecificity | officeDashJsLib.officeDashJsLibStrings.Year | officeDashJsLib.officeDashJsLibStrings.Month | officeDashJsLib.officeDashJsLibStrings.Day | officeDashJsLib.officeDashJsLibStrings.Hour | officeDashJsLib.officeDashJsLibStrings.Minute | officeDashJsLib.officeDashJsLibStrings.Second
  ): FilterDatetime = {
    val __obj = js.Dynamic.literal(date = date, specificity = specificity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterDatetime]
  }
}

