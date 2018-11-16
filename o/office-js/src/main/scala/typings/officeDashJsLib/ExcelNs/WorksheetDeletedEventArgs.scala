package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Provides information about the worksheet that raised the Deleted event.
     *
     * [Api set: ExcelApi 1.7]
     */

trait WorksheetDeletedEventArgs extends js.Object {
  /**
           *
           * Gets the source of the event. See Excel.EventSource for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var source: EventSource | officeDashJsLib.officeDashJsLibStrings.Local | officeDashJsLib.officeDashJsLibStrings.Remote
  /**
           *
           * Gets the type of the event. See Excel.EventType for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var `type`: officeDashJsLib.officeDashJsLibStrings.WorksheetDeleted
  /**
           *
           * Gets the id of the worksheet that is deleted from the workbook.
           *
           * [Api set: ExcelApi 1.7]
           */
  var worksheetId: java.lang.String
}

