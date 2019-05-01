package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the results from the removeDuplicates method on range
  *
  * [Api set: ExcelApi 1.9]
  */
trait RemoveDuplicatesResultLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Number of duplicated rows removed by the operation.
    *
    * [Api set: ExcelApi 1.9]
    */
  var removed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Number of remaining unique rows present in the resulting range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var uniqueRemaining: js.UndefOr[scala.Boolean] = js.undefined
}

object RemoveDuplicatesResultLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    removed: js.UndefOr[scala.Boolean] = js.undefined,
    uniqueRemaining: js.UndefOr[scala.Boolean] = js.undefined
  ): RemoveDuplicatesResultLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed)
    if (!js.isUndefined(uniqueRemaining)) __obj.updateDynamic("uniqueRemaining")(uniqueRemaining)
    __obj.asInstanceOf[RemoveDuplicatesResultLoadOptions]
  }
}

