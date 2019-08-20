package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeletedCount extends js.Object {
  var deletedCount: js.UndefOr[Double] = js.undefined
}

object Anon_DeletedCount {
  @scala.inline
  def apply(deletedCount: Int | Double = null): Anon_DeletedCount = {
    val __obj = js.Dynamic.literal()
    if (deletedCount != null) __obj.updateDynamic("deletedCount")(deletedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeletedCount]
  }
}

