package typings
package nanoLib.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// Document
// -------------------------------------
trait MaybeIdentifiedDocument extends js.Object {
  var _id: js.UndefOr[java.lang.String] = js.undefined
}

object MaybeIdentifiedDocument {
  @scala.inline
  def apply(_id: java.lang.String = null): MaybeIdentifiedDocument = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    __obj.asInstanceOf[MaybeIdentifiedDocument]
  }
}

