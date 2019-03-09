package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceObserverInit extends js.Object {
  var buffered: js.UndefOr[scala.Boolean] = js.undefined
  var entryTypes: js.Array[java.lang.String]
}

object PerformanceObserverInit {
  @scala.inline
  def apply(entryTypes: js.Array[java.lang.String], buffered: js.UndefOr[scala.Boolean] = js.undefined): PerformanceObserverInit = {
    val __obj = js.Dynamic.literal(entryTypes = entryTypes)
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered)
    __obj.asInstanceOf[PerformanceObserverInit]
  }
}

