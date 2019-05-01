package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provide information about the detail of WorksheetChangedEvent/TableChangedEvent
  *
  * [Api set: ExcelApi 1.9]
  */
trait ChangedEventDetail extends js.Object {
  /**
    *
    * Represents the value after changed. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueAfter: js.Any
  /**
    *
    * Represents the value before changed. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueBefore: js.Any
  /**
    *
    * Represents the type of value after changed
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeAfter: RangeValueType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Empty | officeDashJsLib.officeDashJsLibStrings.String | officeDashJsLib.officeDashJsLibStrings.Integer | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.Boolean | officeDashJsLib.officeDashJsLibStrings.Error | officeDashJsLib.officeDashJsLibStrings.RichValue
  /**
    *
    * Represents the type of value before changed
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeBefore: RangeValueType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Empty | officeDashJsLib.officeDashJsLibStrings.String | officeDashJsLib.officeDashJsLibStrings.Integer | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.Boolean | officeDashJsLib.officeDashJsLibStrings.Error | officeDashJsLib.officeDashJsLibStrings.RichValue
}

object ChangedEventDetail {
  @scala.inline
  def apply(
    valueAfter: js.Any,
    valueBefore: js.Any,
    valueTypeAfter: RangeValueType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Empty | officeDashJsLib.officeDashJsLibStrings.String | officeDashJsLib.officeDashJsLibStrings.Integer | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.Boolean | officeDashJsLib.officeDashJsLibStrings.Error | officeDashJsLib.officeDashJsLibStrings.RichValue,
    valueTypeBefore: RangeValueType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Empty | officeDashJsLib.officeDashJsLibStrings.String | officeDashJsLib.officeDashJsLibStrings.Integer | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.Boolean | officeDashJsLib.officeDashJsLibStrings.Error | officeDashJsLib.officeDashJsLibStrings.RichValue
  ): ChangedEventDetail = {
    val __obj = js.Dynamic.literal(valueAfter = valueAfter, valueBefore = valueBefore, valueTypeAfter = valueTypeAfter.asInstanceOf[js.Any], valueTypeBefore = valueTypeBefore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangedEventDetail]
  }
}

