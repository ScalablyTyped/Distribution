package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletedCount extends js.Object {
  var deletedCount: js.UndefOr[Double] = js.undefined
}

object DeletedCount {
  @scala.inline
  def apply(deletedCount: js.UndefOr[Double] = js.undefined): DeletedCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deletedCount)) __obj.updateDynamic("deletedCount")(deletedCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedCount]
  }
}

