package typings.officeDashJs.ExcelNs

import typings.officeDashJs.officeDashJsStrings.Local
import typings.officeDashJs.officeDashJsStrings.Remote
import typings.officeDashJs.officeDashJsStrings.WorksheetFormatChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet format change event.
  *
  * [Api set: ExcelApi 1.9]
  */
trait WorksheetFormatChangedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: String
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: WorksheetFormatChanged
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
  /**
    *
    * Gets the range that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getRange(ctx: RequestContext): Range
  /**
    *
    * Gets the range that represents the changed area of a specific worksheet. It might return null object.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getRangeOrNullObject(ctx: RequestContext): Range
}

object WorksheetFormatChangedEventArgs {
  @scala.inline
  def apply(
    address: String,
    getRange: RequestContext => Range,
    getRangeOrNullObject: RequestContext => Range,
    source: EventSource | Local | Remote,
    `type`: WorksheetFormatChanged,
    worksheetId: String
  ): WorksheetFormatChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, getRange = js.Any.fromFunction1(getRange), getRangeOrNullObject = js.Any.fromFunction1(getRangeOrNullObject), source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetFormatChangedEventArgs]
  }
}

