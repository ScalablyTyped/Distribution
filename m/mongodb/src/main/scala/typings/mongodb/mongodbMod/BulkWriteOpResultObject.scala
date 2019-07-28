package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteOpResultObject extends js.Object {
  var deletedCount: js.UndefOr[scala.Double] = js.undefined
  var insertedCount: js.UndefOr[scala.Double] = js.undefined
  var insertedIds: js.UndefOr[js.Any] = js.undefined
  var matchedCount: js.UndefOr[scala.Double] = js.undefined
  var modifiedCount: js.UndefOr[scala.Double] = js.undefined
  var result: js.UndefOr[js.Any] = js.undefined
  var upsertedCount: js.UndefOr[scala.Double] = js.undefined
  var upsertedIds: js.UndefOr[js.Any] = js.undefined
}

object BulkWriteOpResultObject {
  @scala.inline
  def apply(
    deletedCount: Int | scala.Double = null,
    insertedCount: Int | scala.Double = null,
    insertedIds: js.Any = null,
    matchedCount: Int | scala.Double = null,
    modifiedCount: Int | scala.Double = null,
    result: js.Any = null,
    upsertedCount: Int | scala.Double = null,
    upsertedIds: js.Any = null
  ): BulkWriteOpResultObject = {
    val __obj = js.Dynamic.literal()
    if (deletedCount != null) __obj.updateDynamic("deletedCount")(deletedCount.asInstanceOf[js.Any])
    if (insertedCount != null) __obj.updateDynamic("insertedCount")(insertedCount.asInstanceOf[js.Any])
    if (insertedIds != null) __obj.updateDynamic("insertedIds")(insertedIds)
    if (matchedCount != null) __obj.updateDynamic("matchedCount")(matchedCount.asInstanceOf[js.Any])
    if (modifiedCount != null) __obj.updateDynamic("modifiedCount")(modifiedCount.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result)
    if (upsertedCount != null) __obj.updateDynamic("upsertedCount")(upsertedCount.asInstanceOf[js.Any])
    if (upsertedIds != null) __obj.updateDynamic("upsertedIds")(upsertedIds)
    __obj.asInstanceOf[BulkWriteOpResultObject]
  }
}

