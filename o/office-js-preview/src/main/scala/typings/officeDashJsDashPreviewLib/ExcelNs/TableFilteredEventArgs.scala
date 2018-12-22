package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Provides information about the table that raised the filter applied event.
     *
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */

trait TableFilteredEventArgs extends js.Object {
  /**
           *
           * Represents the id of the table in which the filter is applied..
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var tableId: java.lang.String
  /**
           *
           * Represents the type of the event. See Excel.EventType for details.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TableFiltered
  /**
           *
           * Represents the id of the worksheet which contains the table.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var worksheetId: java.lang.String
}

