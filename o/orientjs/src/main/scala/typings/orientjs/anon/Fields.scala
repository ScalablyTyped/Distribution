package typings.orientjs.anon

import typings.orientjs.mod.CustomField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var fields: js.UndefOr[js.Array[CustomField]] = js.undefined
}

object Fields {
  @scala.inline
  def apply(fields: js.Array[CustomField] = null): Fields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

