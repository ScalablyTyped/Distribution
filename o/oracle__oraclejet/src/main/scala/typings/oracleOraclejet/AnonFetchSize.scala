package typings.oracleOraclejet

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetchSize extends js.Object {
  var fetchSize: js.UndefOr[Double] = js.undefined
  var maxCount: js.UndefOr[Double] = js.undefined
  var scroller: js.UndefOr[Element] = js.undefined
}

object AnonFetchSize {
  @scala.inline
  def apply(fetchSize: Int | Double = null, maxCount: Int | Double = null, scroller: Element = null): AnonFetchSize = {
    val __obj = js.Dynamic.literal()
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    if (scroller != null) __obj.updateDynamic("scroller")(scroller.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetchSize]
  }
}

