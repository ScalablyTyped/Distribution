package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFSBucketReadStreamOptions extends js.Object {
  var end: js.UndefOr[scala.Double] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object GridFSBucketReadStreamOptions {
  @scala.inline
  def apply(
    end: js.UndefOr[scala.Double] = js.undefined,
    skip: js.UndefOr[scala.Double] = js.undefined,
    sort: js.UndefOr[scala.Double] = js.undefined,
    start: js.UndefOr[scala.Double] = js.undefined
  ): GridFSBucketReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSBucketReadStreamOptions]
  }
}

