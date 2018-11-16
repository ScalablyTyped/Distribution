package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Provides information about the chart that raised the Deactivated event.
     *
     * [Api set: ExcelApi 1.8]
     */

trait ChartDeactivatedEventArgs extends js.Object {
  /**
           *
           * Gets the id of the chart that is deactivated.
           *
           * [Api set: ExcelApi 1.8]
           */
  var chartId: java.lang.String
  /**
           *
           * Gets the type of the event. See Excel.EventType for details.
           *
           * [Api set: ExcelApi 1.8]
           */
  var `type`: officeDashJsLib.officeDashJsLibStrings.ChartDeactivated
  /**
           *
           * Gets the id of the worksheet in which the chart is deactivated.
           *
           * [Api set: ExcelApi 1.8]
           */
  var worksheetId: java.lang.String
}

