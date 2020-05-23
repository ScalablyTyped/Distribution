package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFSBucketFindOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var noCursorTimeout: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[js.Object] = js.undefined
}

object GridFSBucketFindOptions {
  @scala.inline
  def apply(
    batchSize: js.UndefOr[scala.Double] = js.undefined,
    limit: js.UndefOr[scala.Double] = js.undefined,
    maxTimeMS: js.UndefOr[scala.Double] = js.undefined,
    noCursorTimeout: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[scala.Double] = js.undefined,
    sort: js.Object = null
  ): GridFSBucketFindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noCursorTimeout)) __obj.updateDynamic("noCursorTimeout")(noCursorTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSBucketFindOptions]
  }
}

