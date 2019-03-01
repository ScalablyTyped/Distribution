package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchSize extends js.Object {
  var fetchSize: js.UndefOr[scala.Double] = js.undefined
  var maxCount: js.UndefOr[scala.Double] = js.undefined
  var scroller: js.UndefOr[stdLib.Element] = js.undefined
}

object Anon_FetchSize {
  @scala.inline
  def apply(
    fetchSize: scala.Int | scala.Double = null,
    maxCount: scala.Int | scala.Double = null,
    scroller: stdLib.Element = null
  ): Anon_FetchSize = {
    val __obj = js.Dynamic.literal()
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    if (scroller != null) __obj.updateDynamic("scroller")(scroller)
    __obj.asInstanceOf[Anon_FetchSize]
  }
}

