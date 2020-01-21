package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdAnyOptional extends js.Object {
  var _id: js.UndefOr[js.Any] = js.undefined
}

object AnonIdAnyOptional {
  @scala.inline
  def apply(_id: js.Any = null): AnonIdAnyOptional = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdAnyOptional]
  }
}

