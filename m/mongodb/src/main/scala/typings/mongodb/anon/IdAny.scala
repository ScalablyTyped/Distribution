package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdAny extends js.Object {
  var _id: js.UndefOr[js.Any] = js.undefined
}

object IdAny {
  @scala.inline
  def apply(_id: js.Any = null): IdAny = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAny]
  }
}

