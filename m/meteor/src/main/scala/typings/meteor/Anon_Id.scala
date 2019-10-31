package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var _id: js.UndefOr[js.Any] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(_id: js.Any = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    __obj.asInstanceOf[Anon_Id]
  }
}

