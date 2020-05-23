package typings.mongodb.mod

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
    deletedCount: js.UndefOr[scala.Double] = js.undefined,
    insertedCount: js.UndefOr[scala.Double] = js.undefined,
    insertedIds: js.Any = null,
    matchedCount: js.UndefOr[scala.Double] = js.undefined,
    modifiedCount: js.UndefOr[scala.Double] = js.undefined,
    result: js.Any = null,
    upsertedCount: js.UndefOr[scala.Double] = js.undefined,
    upsertedIds: js.Any = null
  ): BulkWriteOpResultObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deletedCount)) __obj.updateDynamic("deletedCount")(deletedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertedCount)) __obj.updateDynamic("insertedCount")(insertedCount.get.asInstanceOf[js.Any])
    if (insertedIds != null) __obj.updateDynamic("insertedIds")(insertedIds.asInstanceOf[js.Any])
    if (!js.isUndefined(matchedCount)) __obj.updateDynamic("matchedCount")(matchedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifiedCount)) __obj.updateDynamic("modifiedCount")(modifiedCount.get.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(upsertedCount)) __obj.updateDynamic("upsertedCount")(upsertedCount.get.asInstanceOf[js.Any])
    if (upsertedIds != null) __obj.updateDynamic("upsertedIds")(upsertedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOpResultObject]
  }
}

