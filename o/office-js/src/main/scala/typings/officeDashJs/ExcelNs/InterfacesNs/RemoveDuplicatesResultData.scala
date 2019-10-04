package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `removeDuplicatesResult.toJSON()`. */
trait RemoveDuplicatesResultData extends js.Object {
  /**
    *
    * Number of duplicated rows removed by the operation.
    *
    * [Api set: ExcelApi 1.9]
    */
  var removed: js.UndefOr[Double] = js.undefined
  /**
    *
    * Number of remaining unique rows present in the resulting range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var uniqueRemaining: js.UndefOr[Double] = js.undefined
}

object RemoveDuplicatesResultData {
  @scala.inline
  def apply(removed: Int | Double = null, uniqueRemaining: Int | Double = null): RemoveDuplicatesResultData = {
    val __obj = js.Dynamic.literal()
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    if (uniqueRemaining != null) __obj.updateDynamic("uniqueRemaining")(uniqueRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveDuplicatesResultData]
  }
}

