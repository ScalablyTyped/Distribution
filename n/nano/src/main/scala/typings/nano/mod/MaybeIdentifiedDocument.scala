package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// Document
// -------------------------------------
trait MaybeIdentifiedDocument extends js.Object {
  var _id: js.UndefOr[String] = js.undefined
}

object MaybeIdentifiedDocument {
  @scala.inline
  def apply(_id: String = null): MaybeIdentifiedDocument = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaybeIdentifiedDocument]
  }
}

