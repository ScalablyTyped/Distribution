package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeBorderCollection object, for use in "rangeBorderCollection.set({ ... })". */

trait RangeBorderCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[RangeBorderData]] = js.undefined
  /**
               *
               * Returns or sets a double that lightens or darkens a color for Range Borders, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
              A null value indicates that the entire border collections don't have uniform tintAndShade setting.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
}

