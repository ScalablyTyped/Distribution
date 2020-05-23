package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchSize extends js.Object {
  var fetchSize: js.UndefOr[Double] = js.undefined
  var maxCount: js.UndefOr[Double] = js.undefined
  var scroller: js.UndefOr[typings.std.Element] = js.undefined
}

object FetchSize {
  @scala.inline
  def apply(
    fetchSize: js.UndefOr[Double] = js.undefined,
    maxCount: js.UndefOr[Double] = js.undefined,
    scroller: typings.std.Element = null
  ): FetchSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchSize)) __obj.updateDynamic("fetchSize")(fetchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxCount)) __obj.updateDynamic("maxCount")(maxCount.get.asInstanceOf[js.Any])
    if (scroller != null) __obj.updateDynamic("scroller")(scroller.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchSize]
  }
}

