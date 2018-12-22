package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotTable object, for use in "pivotTable.set({ ... })". */

trait PivotTableUpdateData extends js.Object {
  /**
               *
               * Name of the PivotTable.
               *
               * [Api set: ExcelApi 1.3]
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * True if the PivotTable should use custom lists when sorting.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var useCustomSortLists: js.UndefOr[scala.Boolean] = js.undefined
}

