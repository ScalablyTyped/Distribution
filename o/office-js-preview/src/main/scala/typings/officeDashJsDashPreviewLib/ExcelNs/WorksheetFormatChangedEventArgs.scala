package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Provides information about the worksheet format change event.
     *
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */

trait WorksheetFormatChangedEventArgs extends js.Object {
  /**
           *
           * Gets the range address that represents the changed area of a specific worksheet.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var address: java.lang.String
  /**
           *
           * Gets the source of the event. See Excel.EventSource for details.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var source: EventSource | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Local | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Remote
  /**
           *
           * Gets the type of the event. See Excel.EventType for details.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetFormatChanged
  /**
           *
           * Gets the id of the worksheet in which the data changed.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var worksheetId: java.lang.String
  /**
           *
           * Gets the range that represents the changed area of a specific worksheet.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           */
  def getRange(ctx: RequestContext): Range
  /**
           *
           * Gets the range that represents the changed area of a specific worksheet. It might return null object.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           */
  def getRangeOrNullObject(ctx: RequestContext): Range
}

