package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var _id: js.UndefOr[js.Any] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(_id: js.Any = null): AnonId = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

