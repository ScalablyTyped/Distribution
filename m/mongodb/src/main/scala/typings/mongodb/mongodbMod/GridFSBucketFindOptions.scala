package typings.mongodb.mongodbMod

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
    batchSize: Int | scala.Double = null,
    limit: Int | scala.Double = null,
    maxTimeMS: Int | scala.Double = null,
    noCursorTimeout: js.UndefOr[Boolean] = js.undefined,
    skip: Int | scala.Double = null,
    sort: js.Object = null
  ): GridFSBucketFindOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (!js.isUndefined(noCursorTimeout)) __obj.updateDynamic("noCursorTimeout")(noCursorTimeout.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSBucketFindOptions]
  }
}

