package typings.mongodb.mongodbMod

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
    end: Int | scala.Double = null,
    skip: Int | scala.Double = null,
    sort: Int | scala.Double = null,
    start: Int | scala.Double = null
  ): GridFSBucketReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSBucketReadStreamOptions]
  }
}

