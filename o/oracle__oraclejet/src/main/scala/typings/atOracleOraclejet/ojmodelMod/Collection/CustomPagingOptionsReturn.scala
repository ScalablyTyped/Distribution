package typings.atOracleOraclejet.ojmodelMod.Collection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CustomPagingOptionsReturn extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var hasMore: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var totalResults: js.UndefOr[Double] = js.undefined
}

object CustomPagingOptionsReturn {
  @scala.inline
  def apply(
    count: Int | Double = null,
    hasMore: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    offset: Int | Double = null,
    totalResults: Int | Double = null
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

