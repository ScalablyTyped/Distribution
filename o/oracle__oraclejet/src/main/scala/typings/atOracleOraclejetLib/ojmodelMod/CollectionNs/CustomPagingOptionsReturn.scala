package typings
package atOracleOraclejetLib.ojmodelMod.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CustomPagingOptionsReturn extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var hasMore: js.UndefOr[scala.Boolean] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var totalResults: js.UndefOr[scala.Double] = js.undefined
}

object CustomPagingOptionsReturn {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    hasMore: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    totalResults: scala.Int | scala.Double = null
  ): CustomPagingOptionsReturn = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMore)) __obj.updateDynamic("hasMore")(hasMore)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPagingOptionsReturn]
  }
}

