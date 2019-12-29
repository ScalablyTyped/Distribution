package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Boolean
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Double
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Empty
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Error
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Integer
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RichValue
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.String
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown_
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
  var valueTypeAfter: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue
  /**
    *
    * Represents the type of value before changed
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeBefore: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue
}

object ChangedEventDetail {
  @scala.inline
  def apply(
    valueAfter: js.Any,
    valueBefore: js.Any,
    valueTypeAfter: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue,
    valueTypeBefore: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue
  ): ChangedEventDetail = {
    val __obj = js.Dynamic.literal(valueAfter = valueAfter.asInstanceOf[js.Any], valueBefore = valueBefore.asInstanceOf[js.Any], valueTypeAfter = valueTypeAfter.asInstanceOf[js.Any], valueTypeBefore = valueTypeBefore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangedEventDetail]
  }
}

