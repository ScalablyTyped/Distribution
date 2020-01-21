package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeletedCount extends js.Object {
  var deletedCount: js.UndefOr[Double] = js.undefined
}

object AnonDeletedCount {
  @scala.inline
  def apply(deletedCount: Int | Double = null): AnonDeletedCount = {
    val __obj = js.Dynamic.literal()
    if (deletedCount != null) __obj.updateDynamic("deletedCount")(deletedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeletedCount]
  }
}

