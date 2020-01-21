package typings.orientjs

import typings.orientjs.mod.CustomField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  var fields: js.UndefOr[js.Array[CustomField]] = js.undefined
}

object AnonFields {
  @scala.inline
  def apply(fields: js.Array[CustomField] = null): AnonFields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}

