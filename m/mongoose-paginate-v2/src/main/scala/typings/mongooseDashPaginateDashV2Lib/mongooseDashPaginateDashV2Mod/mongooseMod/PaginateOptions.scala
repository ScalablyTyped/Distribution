package typings
package mongooseDashPaginateDashV2Lib.mongooseDashPaginateDashV2Mod.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateOptions extends js.Object {
  var collation: js.UndefOr[mongooseLib.mongooseMod.CollationOptions] = js.undefined
  var customLabels: js.UndefOr[CustomLabels] = js.undefined
  var lean: js.UndefOr[scala.Boolean] = js.undefined
  var leanWithId: js.UndefOr[scala.Boolean] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  /* tslint:disable-next-line: ban-types */
  var populate: js.UndefOr[(js.Array[js.Object | java.lang.String]) | js.Object | java.lang.String] = js.undefined
  /* tslint:disable-next-line: ban-types */
  var select: js.UndefOr[js.Object | java.lang.String] = js.undefined
  /* tslint:disable-next-line: ban-types */
  var sort: js.UndefOr[js.Object | java.lang.String] = js.undefined
}

object PaginateOptions {
  @scala.inline
  def apply(
    collation: mongooseLib.mongooseMod.CollationOptions = null,
    customLabels: CustomLabels = null,
    lean: js.UndefOr[scala.Boolean] = js.undefined,
    leanWithId: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    populate: (js.Array[js.Object | java.lang.String]) | js.Object | java.lang.String = null,
    select: js.Object | java.lang.String = null,
    sort: js.Object | java.lang.String = null
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

