package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Provides information about the chart that raised the Added event.
     *
     * [Api set: ExcelApi 1.8]
     */

trait ChartAddedEventArgs extends js.Object {
  /**
           *
           * Gets the id of the chart that is added to the worksheet.
           *
           * [Api set: ExcelApi 1.8]
           */
  var chartId: java.lang.String
  /**
           *
           * Gets the source of the event. See Excel.EventSource for details.
           *
           * [Api set: ExcelApi 1.8]
           */
  var source: EventSource | officeDashJsLib.officeDashJsLibStrings.Local | officeDashJsLib.officeDashJsLibStrings.Remote
  /**
           *
           * Gets the type of the event. See Excel.EventType for details.
           *
           * [Api set: ExcelApi 1.8]
           */
  var `type`: officeDashJsLib.officeDashJsLibStrings.ChartAdded
  /**
           *
           * Gets the id of the worksheet in which the chart is added.
           *
           * [Api set: ExcelApi 1.8]
           */
  var worksheetId: java.lang.String
}

