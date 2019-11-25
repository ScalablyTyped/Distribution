package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdAny extends js.Object {
  var _id: js.UndefOr[js.Any] = js.undefined
}

object Anon_IdAny {
  @scala.inline
  def apply(_id: js.Any = null): Anon_IdAny = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdAny]
  }
}

