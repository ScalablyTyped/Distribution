package typings.mongooseDelete.mod

import typings.mongoose.mod.Document
import typings.mongoose.mod.Types.ObjectId
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftDeleteInterface extends js.Object {
  var deleteAt: js.UndefOr[Date] = js.undefined
  /** Soft deleted ? */
  var deleted: js.UndefOr[Boolean] = js.undefined
  var deletedBy: js.UndefOr[ObjectId | String | Document] = js.undefined
}

object SoftDeleteInterface {
  @scala.inline
  def apply(
    deleteAt: Date = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    deletedBy: ObjectId | String | Document = null
  ): SoftDeleteInterface = {
    val __obj = js.Dynamic.literal()
    if (deleteAt != null) __obj.updateDynamic("deleteAt")(deleteAt.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (deletedBy != null) __obj.updateDynamic("deletedBy")(deletedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftDeleteInterface]
  }
}

