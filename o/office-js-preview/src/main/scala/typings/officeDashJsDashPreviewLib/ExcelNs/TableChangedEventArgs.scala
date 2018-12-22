package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Provides information about the table that raised the Changed event.
     *
     * [Api set: ExcelApi 1.7]
     */

trait TableChangedEventArgs extends js.Object {
  /**
           *
           * Gets the address that represents the changed area of a table on a specific worksheet.
           *
           * [Api set: ExcelApi 1.7]
           */
  var address: java.lang.String
  /**
           *
           * Gets the change type that represents how the Changed event is triggered. See Excel.DataChangeType for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var changeType: DataChangeType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RangeEdited | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RowInserted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RowDeleted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColumnInserted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColumnDeleted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CellInserted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CellDeleted
  /**
           *
           * Gets the source of the event. See Excel.EventSource for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var source: EventSource | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Local | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Remote
  /**
           *
           * Gets the id of the table in which the data changed.
           *
           * [Api set: ExcelApi 1.7]
           */
  var tableId: java.lang.String
  /**
           *
           * Gets the type of the event. See Excel.EventType for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TableChanged
  /**
           *
           * Gets the id of the worksheet in which the data changed.
           *
           * [Api set: ExcelApi 1.7]
           */
  var worksheetId: java.lang.String
  /**
           *
           * Gets the range that represents the changed area of a table on a specific worksheet.
           *
           * [Api set: ExcelApi 1.8]
           */
  def getRange(ctx: RequestContext): Range
  /**
           *
           * Gets the range that represents the changed area of a table on a specific worksheet. It might return null object.
           *
           * [Api set: ExcelApi 1.8]
           */
  def getRangeOrNullObject(ctx: RequestContext): Range
}

