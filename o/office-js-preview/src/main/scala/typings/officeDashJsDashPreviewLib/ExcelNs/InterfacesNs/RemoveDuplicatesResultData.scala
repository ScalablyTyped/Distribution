package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "removeDuplicatesResult.toJSON()". */
trait RemoveDuplicatesResultData extends js.Object {
  /**
    *
    * Number of duplicated rows removed by the operation.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var removed: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Number of remaining unique rows present in the resulting range.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var uniqueRemaining: js.UndefOr[scala.Double] = js.undefined
}

