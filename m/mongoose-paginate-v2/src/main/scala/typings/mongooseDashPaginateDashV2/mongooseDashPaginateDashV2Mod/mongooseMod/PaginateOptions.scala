package typings.mongooseDashPaginateDashV2.mongooseDashPaginateDashV2Mod.mongooseMod

import typings.mongoose.mongooseMod.CollationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateOptions extends js.Object {
  var collation: js.UndefOr[CollationOptions] = js.undefined
  var customLabels: js.UndefOr[CustomLabels] = js.undefined
  var lean: js.UndefOr[Boolean] = js.undefined
  var leanWithId: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  /* tslint:disable-next-line: ban-types */
  var populate: js.UndefOr[(js.Array[js.Object | String]) | js.Object | String] = js.undefined
  /* tslint:disable-next-line: ban-types */
  var select: js.UndefOr[js.Object | String] = js.undefined
  /* tslint:disable-next-line: ban-types */
  var sort: js.UndefOr[js.Object | String] = js.undefined
}

object PaginateOptions {
  @scala.inline
  def apply(
    collation: CollationOptions = null,
    customLabels: CustomLabels = null,
    lean: js.UndefOr[Boolean] = js.undefined,
    leanWithId: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    offset: Int | Double = null,
    page: Int | Double = null,
    populate: (js.Array[js.Object | String]) | js.Object | String = null,
    select: js.Object | String = null,
    sort: js.Object | String = null
  ): PaginateOptions = {
    val __obj = js.Dynamic.literal()
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (customLabels != null) __obj.updateDynamic("customLabels")(customLabels)
    if (!js.isUndefined(lean)) __obj.updateDynamic("lean")(lean)
    if (!js.isUndefined(leanWithId)) __obj.updateDynamic("leanWithId")(leanWithId)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateOptions]
  }
}

