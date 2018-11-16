package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Provides information about the worksheet that raised the Activated event.
     *
     * [Api set: ExcelApi 1.7]
     */

trait WorksheetActivatedEventArgs extends js.Object {
  /**
           *
           * Gets the type of the event. See Excel.EventType for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var `type`: officeDashJsLib.officeDashJsLibStrings.WorksheetActivated
  /**
           *
           * Gets the id of the worksheet that is activated.
           *
           * [Api set: ExcelApi 1.7]
           */
  var worksheetId: java.lang.String
}

